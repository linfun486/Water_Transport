package com.ruoyi.business.validator.constraint;

import com.ruoyi.business.validator.validator.IdCardVali;
import com.ruoyi.common.utils.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wpp
 * @date 2020/8/22 14:33
 */
public class IdCardConstraint implements ConstraintValidator<IdCardVali, String> {

    //用于存放校验码的键值map
    static Map<Integer,Character> map;

    //类初始化时向map集合添加数据
    static {
        //余数只可能有0 1 2 3 4 5 6 7 8 9 10这11个数字。其分别对应的最后一位身份证的号码为1 0 X 9 8 7 6 5 4 3 2
        //尖括号添加泛型保证一定的向下兼容性
        map = new ConcurrentHashMap</*Integer,Character*/>(11);
        map.put(0,'1');
        map.put(1,'0');
        map.put(2,'X');
        map.put(3,'9');
        map.put(4,'8');
        map.put(5,'7');
        map.put(6,'6');
        map.put(7,'5');
        map.put(8,'4');
        map.put(9,'3');
        map.put(10,'2');
        //作为异常处理的错误码
        map.put(-1,'E');
    }

    @Override
    public void initialize(IdCardVali constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isBlank(value)) {
            return Boolean.FALSE;
        }
        int length = value.length();
        if(length == 18){
            Character code = null;
            try{
                code = map.get(checkTwo(checkOne(value)));
            }catch(Exception e){
                e.printStackTrace();
                return Boolean.FALSE;
            }
            if(code != 'E'){
                if(!(code.equals(value.charAt(17)) || Character.valueOf((char)(code + 32)).equals(value.charAt(17)))){
                    return Boolean.FALSE;
                }
            }else{
                return Boolean.FALSE;
            }
        }else if((length > 14 && length <= 17) || (length > 18 && length <= 21)){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /**
     * 判断输入的身份证号长度与字符输入是否正确
     * @param idNo
     * @return 字符数组
     * @throws Exception
     */
    public static char[] checkOne(String idNo) throws Exception {
        //如果参数字符串长度小于17，直接返回空字符数组，避免接下来字符串转换字符数组出现异常
        //如果参数字符串长度大于18，直接返回空字符数组，属于不合法输入
        if(idNo.length() < 17 || idNo.length() > 18){
            return new char[]{};
        }
        //字符串转为字符数组
        char[] chars = idNo.substring(0,17).toCharArray();
        //首先判断字符串长度是否符合规则
        if(chars.length == 17){
            //判断每个字符是否符合规则
            int num = 0;
            for (int i = 0; i < chars.length; i++) {
                int aChar = chars[i] += 0;
                if(i < 17 && (aChar < 48 || aChar > 57)){
//                throw new Exception("你第" + (i + 1) + "位输错了，你得按规矩来。");
                    System.out.println("你第" + (i + 1) + "位输错了，你得按规矩来。");
                    num++;
                }
            }
            //如果身份证号输入字符存在不合法字符，返回空字符数组。
            if (num != 0) {
                return new char[]{};
            }
            return chars;
        }else{
            System.out.println("你长度不对劲，你得重新输一遍。");
            return new char[]{};
        }
    }

    /**
     * 根据输入的前17位身份证号码生成最后一位校验码
     * @param chars
     * @return map的键
     * @throws Exception
     */
    public static int checkTwo(char[] chars) throws Exception{
        // 将前面的身份证号码17位数分别乘以不同的系数。从第一位到第十七位的系数分别为：7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 ；
        // 将这17位数字和系数相乘的结果相加；
        if(chars.length == 17){
            int sum =
                    (chars[0] - 48 ) * 7 +
                            (chars[1] - 48 ) * 9 +
                            (chars[2] - 48 ) * 10 +
                            (chars[3] - 48 ) * 5 +
                            (chars[4] - 48 ) * 8 +
                            (chars[5] - 48 ) * 4 +
                            (chars[6] - 48 ) * 2 +
                            (chars[7] - 48 ) * 1 +
                            (chars[8] - 48 ) * 6 +
                            (chars[9] - 48 ) * 3 +
                            (chars[10] - 48 ) * 7 +
                            (chars[11] - 48 ) * 9 +
                            (chars[12] - 48 ) * 10 +
                            (chars[13] - 48 ) * 5 +
                            (chars[14] - 48 ) * 8 +
                            (chars[15] - 48 ) * 4 +
                            (chars[16] - 48 ) * 2;
            // 用加出来和除以11，看余数是多少；
            int mod = sum % 11;
            return mod;
        }
        return -1;
    }
}
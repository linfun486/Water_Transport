package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.WtStartRegistration;

/**
 * 开工登记Service接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface IWtStartRegistrationService 
{
    /**
     * 查询开工登记
     * 
     * @param id 开工登记主键
     * @return 开工登记
     */
    public WtStartRegistration selectWtStartRegistrationById(Long id);

    /**
     * 查询开工登记列表
     * 
     * @param wtStartRegistration 开工登记
     * @return 开工登记集合
     */
    public List<WtStartRegistration> selectWtStartRegistrationList(WtStartRegistration wtStartRegistration);

    /**
     * 新增开工登记
     * 
     * @param wtStartRegistration 开工登记
     * @return 结果
     */
    public int insertWtStartRegistration(WtStartRegistration wtStartRegistration);

    /**
     * 修改开工登记
     * 
     * @param wtStartRegistration 开工登记
     * @return 结果
     */
    public int updateWtStartRegistration(WtStartRegistration wtStartRegistration);

    /**
     * 批量删除开工登记
     * 
     * @param ids 需要删除的开工登记主键集合
     * @return 结果
     */
    public int deleteWtStartRegistrationByIds(Long[] ids);

    /**
     * 删除开工登记信息
     * 
     * @param id 开工登记主键
     * @return 结果
     */
    public int deleteWtStartRegistrationById(Long id);
}

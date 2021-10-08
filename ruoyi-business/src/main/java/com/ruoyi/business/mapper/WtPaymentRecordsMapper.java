package com.ruoyi.business.mapper;

import java.util.List;
import com.ruoyi.business.domain.WtPaymentRecords;

/**
 * 付款记录Mapper接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface WtPaymentRecordsMapper 
{
    /**
     * 查询付款记录
     * 
     * @param id 付款记录主键
     * @return 付款记录
     */
    public WtPaymentRecords selectWtPaymentRecordsById(Long id);

    /**
     * 查询付款记录列表
     * 
     * @param wtPaymentRecords 付款记录
     * @return 付款记录集合
     */
    public List<WtPaymentRecords> selectWtPaymentRecordsList(WtPaymentRecords wtPaymentRecords);

    /**
     * 新增付款记录
     * 
     * @param wtPaymentRecords 付款记录
     * @return 结果
     */
    public int insertWtPaymentRecords(WtPaymentRecords wtPaymentRecords);

    /**
     * 修改付款记录
     * 
     * @param wtPaymentRecords 付款记录
     * @return 结果
     */
    public int updateWtPaymentRecords(WtPaymentRecords wtPaymentRecords);

    /**
     * 删除付款记录
     * 
     * @param id 付款记录主键
     * @return 结果
     */
    public int deleteWtPaymentRecordsById(Long id);

    /**
     * 批量删除付款记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWtPaymentRecordsByIds(Long[] ids);
}

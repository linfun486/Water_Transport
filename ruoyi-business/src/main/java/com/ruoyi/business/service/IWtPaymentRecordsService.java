package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.WtPaymentRecords;

/**
 * 付款记录Service接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface IWtPaymentRecordsService 
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
     * 批量删除付款记录
     * 
     * @param ids 需要删除的付款记录主键集合
     * @return 结果
     */
    public int deleteWtPaymentRecordsByIds(Long[] ids);

    /**
     * 删除付款记录信息
     * 
     * @param id 付款记录主键
     * @return 结果
     */
    public int deleteWtPaymentRecordsById(Long id);
}

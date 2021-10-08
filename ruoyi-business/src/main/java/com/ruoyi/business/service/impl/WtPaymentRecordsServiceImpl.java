package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.WtPaymentRecordsMapper;
import com.ruoyi.business.domain.WtPaymentRecords;
import com.ruoyi.business.service.IWtPaymentRecordsService;

/**
 * 付款记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@Service
public class WtPaymentRecordsServiceImpl implements IWtPaymentRecordsService 
{
    @Autowired
    private WtPaymentRecordsMapper wtPaymentRecordsMapper;

    /**
     * 查询付款记录
     * 
     * @param id 付款记录主键
     * @return 付款记录
     */
    @Override
    public WtPaymentRecords selectWtPaymentRecordsById(Long id)
    {
        return wtPaymentRecordsMapper.selectWtPaymentRecordsById(id);
    }

    /**
     * 查询付款记录列表
     * 
     * @param wtPaymentRecords 付款记录
     * @return 付款记录
     */
    @Override
    public List<WtPaymentRecords> selectWtPaymentRecordsList(WtPaymentRecords wtPaymentRecords)
    {
        return wtPaymentRecordsMapper.selectWtPaymentRecordsList(wtPaymentRecords);
    }

    /**
     * 新增付款记录
     * 
     * @param wtPaymentRecords 付款记录
     * @return 结果
     */
    @Override
    public int insertWtPaymentRecords(WtPaymentRecords wtPaymentRecords)
    {
        wtPaymentRecords.setCreateTime(DateUtils.getNowDate());
        return wtPaymentRecordsMapper.insertWtPaymentRecords(wtPaymentRecords);
    }

    /**
     * 修改付款记录
     * 
     * @param wtPaymentRecords 付款记录
     * @return 结果
     */
    @Override
    public int updateWtPaymentRecords(WtPaymentRecords wtPaymentRecords)
    {
        wtPaymentRecords.setUpdateTime(DateUtils.getNowDate());
        return wtPaymentRecordsMapper.updateWtPaymentRecords(wtPaymentRecords);
    }

    /**
     * 批量删除付款记录
     * 
     * @param ids 需要删除的付款记录主键
     * @return 结果
     */
    @Override
    public int deleteWtPaymentRecordsByIds(Long[] ids)
    {
        return wtPaymentRecordsMapper.deleteWtPaymentRecordsByIds(ids);
    }

    /**
     * 删除付款记录信息
     * 
     * @param id 付款记录主键
     * @return 结果
     */
    @Override
    public int deleteWtPaymentRecordsById(Long id)
    {
        return wtPaymentRecordsMapper.deleteWtPaymentRecordsById(id);
    }
}

package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.WtContractFilingMapper;
import com.ruoyi.business.domain.WtContractFiling;
import com.ruoyi.business.service.IWtContractFilingService;

/**
 * 合同备案Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@Service
public class WtContractFilingServiceImpl implements IWtContractFilingService 
{
    @Autowired
    private WtContractFilingMapper wtContractFilingMapper;

    /**
     * 查询合同备案
     * 
     * @param id 合同备案主键
     * @return 合同备案
     */
    @Override
    public WtContractFiling selectWtContractFilingById(Long id)
    {
        return wtContractFilingMapper.selectWtContractFilingById(id);
    }

    /**
     * 查询合同备案列表
     * 
     * @param wtContractFiling 合同备案
     * @return 合同备案
     */
    @Override
    public List<WtContractFiling> selectWtContractFilingList(WtContractFiling wtContractFiling)
    {
        return wtContractFilingMapper.selectWtContractFilingList(wtContractFiling);
    }

    /**
     * 新增合同备案
     * 
     * @param wtContractFiling 合同备案
     * @return 结果
     */
    @Override
    public int insertWtContractFiling(WtContractFiling wtContractFiling)
    {
        wtContractFiling.setCreateTime(DateUtils.getNowDate());
        return wtContractFilingMapper.insertWtContractFiling(wtContractFiling);
    }

    /**
     * 修改合同备案
     * 
     * @param wtContractFiling 合同备案
     * @return 结果
     */
    @Override
    public int updateWtContractFiling(WtContractFiling wtContractFiling)
    {
        wtContractFiling.setUpdateTime(DateUtils.getNowDate());
        return wtContractFilingMapper.updateWtContractFiling(wtContractFiling);
    }

    /**
     * 批量删除合同备案
     * 
     * @param ids 需要删除的合同备案主键
     * @return 结果
     */
    @Override
    public int deleteWtContractFilingByIds(Long[] ids)
    {
        return wtContractFilingMapper.deleteWtContractFilingByIds(ids);
    }

    /**
     * 删除合同备案信息
     * 
     * @param id 合同备案主键
     * @return 结果
     */
    @Override
    public int deleteWtContractFilingById(Long id)
    {
        return wtContractFilingMapper.deleteWtContractFilingById(id);
    }
}

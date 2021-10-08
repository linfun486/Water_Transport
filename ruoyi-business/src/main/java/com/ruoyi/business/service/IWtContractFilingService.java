package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.WtContractFiling;

/**
 * 合同备案Service接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface IWtContractFilingService 
{
    /**
     * 查询合同备案
     * 
     * @param id 合同备案主键
     * @return 合同备案
     */
    public WtContractFiling selectWtContractFilingById(Long id);

    /**
     * 查询合同备案列表
     * 
     * @param wtContractFiling 合同备案
     * @return 合同备案集合
     */
    public List<WtContractFiling> selectWtContractFilingList(WtContractFiling wtContractFiling);

    /**
     * 新增合同备案
     * 
     * @param wtContractFiling 合同备案
     * @return 结果
     */
    public int insertWtContractFiling(WtContractFiling wtContractFiling);

    /**
     * 修改合同备案
     * 
     * @param wtContractFiling 合同备案
     * @return 结果
     */
    public int updateWtContractFiling(WtContractFiling wtContractFiling);

    /**
     * 批量删除合同备案
     * 
     * @param ids 需要删除的合同备案主键集合
     * @return 结果
     */
    public int deleteWtContractFilingByIds(Long[] ids);

    /**
     * 删除合同备案信息
     * 
     * @param id 合同备案主键
     * @return 结果
     */
    public int deleteWtContractFilingById(Long id);
}

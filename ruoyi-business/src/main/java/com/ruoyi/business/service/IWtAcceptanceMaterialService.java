package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.WtAcceptanceMaterial;

/**
 * 交工验收材料Service接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface IWtAcceptanceMaterialService 
{
    /**
     * 查询交工验收材料
     * 
     * @param id 交工验收材料主键
     * @return 交工验收材料
     */
    public WtAcceptanceMaterial selectWtAcceptanceMaterialById(Long id);

    /**
     * 查询交工验收材料列表
     * 
     * @param wtAcceptanceMaterial 交工验收材料
     * @return 交工验收材料集合
     */
    public List<WtAcceptanceMaterial> selectWtAcceptanceMaterialList(WtAcceptanceMaterial wtAcceptanceMaterial);

    /**
     * 新增交工验收材料
     * 
     * @param wtAcceptanceMaterial 交工验收材料
     * @return 结果
     */
    public int insertWtAcceptanceMaterial(WtAcceptanceMaterial wtAcceptanceMaterial);

    /**
     * 修改交工验收材料
     * 
     * @param wtAcceptanceMaterial 交工验收材料
     * @return 结果
     */
    public int updateWtAcceptanceMaterial(WtAcceptanceMaterial wtAcceptanceMaterial);

    /**
     * 批量删除交工验收材料
     * 
     * @param ids 需要删除的交工验收材料主键集合
     * @return 结果
     */
    public int deleteWtAcceptanceMaterialByIds(Long[] ids);

    /**
     * 删除交工验收材料信息
     * 
     * @param id 交工验收材料主键
     * @return 结果
     */
    public int deleteWtAcceptanceMaterialById(Long id);
}

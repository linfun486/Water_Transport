package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.WtAcceptanceMaterialMapper;
import com.ruoyi.business.domain.WtAcceptanceMaterial;
import com.ruoyi.business.service.IWtAcceptanceMaterialService;

/**
 * 交工验收材料Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@Service
public class WtAcceptanceMaterialServiceImpl implements IWtAcceptanceMaterialService 
{
    @Autowired
    private WtAcceptanceMaterialMapper wtAcceptanceMaterialMapper;

    /**
     * 查询交工验收材料
     * 
     * @param id 交工验收材料主键
     * @return 交工验收材料
     */
    @Override
    public WtAcceptanceMaterial selectWtAcceptanceMaterialById(Long id)
    {
        return wtAcceptanceMaterialMapper.selectWtAcceptanceMaterialById(id);
    }

    /**
     * 查询交工验收材料列表
     * 
     * @param wtAcceptanceMaterial 交工验收材料
     * @return 交工验收材料
     */
    @Override
    public List<WtAcceptanceMaterial> selectWtAcceptanceMaterialList(WtAcceptanceMaterial wtAcceptanceMaterial)
    {
        return wtAcceptanceMaterialMapper.selectWtAcceptanceMaterialList(wtAcceptanceMaterial);
    }

    /**
     * 新增交工验收材料
     * 
     * @param wtAcceptanceMaterial 交工验收材料
     * @return 结果
     */
    @Override
    public int insertWtAcceptanceMaterial(WtAcceptanceMaterial wtAcceptanceMaterial)
    {
        wtAcceptanceMaterial.setCreateTime(DateUtils.getNowDate());
        return wtAcceptanceMaterialMapper.insertWtAcceptanceMaterial(wtAcceptanceMaterial);
    }

    /**
     * 修改交工验收材料
     * 
     * @param wtAcceptanceMaterial 交工验收材料
     * @return 结果
     */
    @Override
    public int updateWtAcceptanceMaterial(WtAcceptanceMaterial wtAcceptanceMaterial)
    {
        wtAcceptanceMaterial.setUpdateTime(DateUtils.getNowDate());
        return wtAcceptanceMaterialMapper.updateWtAcceptanceMaterial(wtAcceptanceMaterial);
    }

    /**
     * 批量删除交工验收材料
     * 
     * @param ids 需要删除的交工验收材料主键
     * @return 结果
     */
    @Override
    public int deleteWtAcceptanceMaterialByIds(Long[] ids)
    {
        return wtAcceptanceMaterialMapper.deleteWtAcceptanceMaterialByIds(ids);
    }

    /**
     * 删除交工验收材料信息
     * 
     * @param id 交工验收材料主键
     * @return 结果
     */
    @Override
    public int deleteWtAcceptanceMaterialById(Long id)
    {
        return wtAcceptanceMaterialMapper.deleteWtAcceptanceMaterialById(id);
    }
}

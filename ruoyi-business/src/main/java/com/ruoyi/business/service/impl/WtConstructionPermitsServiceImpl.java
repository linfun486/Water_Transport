package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.WtConstructionPermitsMapper;
import com.ruoyi.business.domain.WtConstructionPermits;
import com.ruoyi.business.service.IWtConstructionPermitsService;

/**
 * 施工许可Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@Service
public class WtConstructionPermitsServiceImpl implements IWtConstructionPermitsService 
{
    @Autowired
    private WtConstructionPermitsMapper wtConstructionPermitsMapper;

    /**
     * 查询施工许可
     * 
     * @param id 施工许可主键
     * @return 施工许可
     */
    @Override
    public WtConstructionPermits selectWtConstructionPermitsById(Long id)
    {
        return wtConstructionPermitsMapper.selectWtConstructionPermitsById(id);
    }

    /**
     * 查询施工许可列表
     * 
     * @param wtConstructionPermits 施工许可
     * @return 施工许可
     */
    @Override
    public List<WtConstructionPermits> selectWtConstructionPermitsList(WtConstructionPermits wtConstructionPermits)
    {
        return wtConstructionPermitsMapper.selectWtConstructionPermitsList(wtConstructionPermits);
    }

    /**
     * 新增施工许可
     * 
     * @param wtConstructionPermits 施工许可
     * @return 结果
     */
    @Override
    public int insertWtConstructionPermits(WtConstructionPermits wtConstructionPermits)
    {
        wtConstructionPermits.setCreateTime(DateUtils.getNowDate());
        return wtConstructionPermitsMapper.insertWtConstructionPermits(wtConstructionPermits);
    }

    /**
     * 修改施工许可
     * 
     * @param wtConstructionPermits 施工许可
     * @return 结果
     */
    @Override
    public int updateWtConstructionPermits(WtConstructionPermits wtConstructionPermits)
    {
        wtConstructionPermits.setUpdateTime(DateUtils.getNowDate());
        return wtConstructionPermitsMapper.updateWtConstructionPermits(wtConstructionPermits);
    }

    /**
     * 批量删除施工许可
     * 
     * @param ids 需要删除的施工许可主键
     * @return 结果
     */
    @Override
    public int deleteWtConstructionPermitsByIds(Long[] ids)
    {
        return wtConstructionPermitsMapper.deleteWtConstructionPermitsByIds(ids);
    }

    /**
     * 删除施工许可信息
     * 
     * @param id 施工许可主键
     * @return 结果
     */
    @Override
    public int deleteWtConstructionPermitsById(Long id)
    {
        return wtConstructionPermitsMapper.deleteWtConstructionPermitsById(id);
    }
}

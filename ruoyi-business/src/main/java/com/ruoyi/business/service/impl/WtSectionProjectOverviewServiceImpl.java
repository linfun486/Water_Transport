package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.WtSectionProjectOverviewMapper;
import com.ruoyi.business.domain.WtSectionProjectOverview;
import com.ruoyi.business.service.IWtSectionProjectOverviewService;

/**
 * 标段工程概况Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@Service
public class WtSectionProjectOverviewServiceImpl implements IWtSectionProjectOverviewService 
{
    @Autowired
    private WtSectionProjectOverviewMapper wtSectionProjectOverviewMapper;

    /**
     * 查询标段工程概况
     * 
     * @param id 标段工程概况主键
     * @return 标段工程概况
     */
    @Override
    public WtSectionProjectOverview selectWtSectionProjectOverviewById(Long id)
    {
        return wtSectionProjectOverviewMapper.selectWtSectionProjectOverviewById(id);
    }

    /**
     * 查询标段工程概况列表
     * 
     * @param wtSectionProjectOverview 标段工程概况
     * @return 标段工程概况
     */
    @Override
    public List<WtSectionProjectOverview> selectWtSectionProjectOverviewList(WtSectionProjectOverview wtSectionProjectOverview)
    {
        return wtSectionProjectOverviewMapper.selectWtSectionProjectOverviewList(wtSectionProjectOverview);
    }

    /**
     * 新增标段工程概况
     * 
     * @param wtSectionProjectOverview 标段工程概况
     * @return 结果
     */
    @Override
    public int insertWtSectionProjectOverview(WtSectionProjectOverview wtSectionProjectOverview)
    {
        wtSectionProjectOverview.setCreateTime(DateUtils.getNowDate());
        return wtSectionProjectOverviewMapper.insertWtSectionProjectOverview(wtSectionProjectOverview);
    }

    /**
     * 修改标段工程概况
     * 
     * @param wtSectionProjectOverview 标段工程概况
     * @return 结果
     */
    @Override
    public int updateWtSectionProjectOverview(WtSectionProjectOverview wtSectionProjectOverview)
    {
        wtSectionProjectOverview.setUpdateTime(DateUtils.getNowDate());
        return wtSectionProjectOverviewMapper.updateWtSectionProjectOverview(wtSectionProjectOverview);
    }

    /**
     * 批量删除标段工程概况
     * 
     * @param ids 需要删除的标段工程概况主键
     * @return 结果
     */
    @Override
    public int deleteWtSectionProjectOverviewByIds(Long[] ids)
    {
        return wtSectionProjectOverviewMapper.deleteWtSectionProjectOverviewByIds(ids);
    }

    /**
     * 删除标段工程概况信息
     * 
     * @param id 标段工程概况主键
     * @return 结果
     */
    @Override
    public int deleteWtSectionProjectOverviewById(Long id)
    {
        return wtSectionProjectOverviewMapper.deleteWtSectionProjectOverviewById(id);
    }
}

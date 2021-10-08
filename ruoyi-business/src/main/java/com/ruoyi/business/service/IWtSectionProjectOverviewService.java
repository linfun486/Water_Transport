package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.WtSectionProjectOverview;

/**
 * 标段工程概况Service接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface IWtSectionProjectOverviewService 
{
    /**
     * 查询标段工程概况
     * 
     * @param id 标段工程概况主键
     * @return 标段工程概况
     */
    public WtSectionProjectOverview selectWtSectionProjectOverviewById(Long id);

    /**
     * 查询标段工程概况列表
     * 
     * @param wtSectionProjectOverview 标段工程概况
     * @return 标段工程概况集合
     */
    public List<WtSectionProjectOverview> selectWtSectionProjectOverviewList(WtSectionProjectOverview wtSectionProjectOverview);

    /**
     * 新增标段工程概况
     * 
     * @param wtSectionProjectOverview 标段工程概况
     * @return 结果
     */
    public int insertWtSectionProjectOverview(WtSectionProjectOverview wtSectionProjectOverview);

    /**
     * 修改标段工程概况
     * 
     * @param wtSectionProjectOverview 标段工程概况
     * @return 结果
     */
    public int updateWtSectionProjectOverview(WtSectionProjectOverview wtSectionProjectOverview);

    /**
     * 批量删除标段工程概况
     * 
     * @param ids 需要删除的标段工程概况主键集合
     * @return 结果
     */
    public int deleteWtSectionProjectOverviewByIds(Long[] ids);

    /**
     * 删除标段工程概况信息
     * 
     * @param id 标段工程概况主键
     * @return 结果
     */
    public int deleteWtSectionProjectOverviewById(Long id);
}

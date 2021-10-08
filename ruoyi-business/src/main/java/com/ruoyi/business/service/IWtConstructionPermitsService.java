package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.WtConstructionPermits;

/**
 * 施工许可Service接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface IWtConstructionPermitsService 
{
    /**
     * 查询施工许可
     * 
     * @param id 施工许可主键
     * @return 施工许可
     */
    public WtConstructionPermits selectWtConstructionPermitsById(Long id);

    /**
     * 查询施工许可列表
     * 
     * @param wtConstructionPermits 施工许可
     * @return 施工许可集合
     */
    public List<WtConstructionPermits> selectWtConstructionPermitsList(WtConstructionPermits wtConstructionPermits);

    /**
     * 新增施工许可
     * 
     * @param wtConstructionPermits 施工许可
     * @return 结果
     */
    public int insertWtConstructionPermits(WtConstructionPermits wtConstructionPermits);

    /**
     * 修改施工许可
     * 
     * @param wtConstructionPermits 施工许可
     * @return 结果
     */
    public int updateWtConstructionPermits(WtConstructionPermits wtConstructionPermits);

    /**
     * 批量删除施工许可
     * 
     * @param ids 需要删除的施工许可主键集合
     * @return 结果
     */
    public int deleteWtConstructionPermitsByIds(Long[] ids);

    /**
     * 删除施工许可信息
     * 
     * @param id 施工许可主键
     * @return 结果
     */
    public int deleteWtConstructionPermitsById(Long id);
}

package com.ruoyi.business.mapper;

import java.util.List;
import com.ruoyi.business.domain.WtConstructionPermits;

/**
 * 施工许可Mapper接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface WtConstructionPermitsMapper 
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
     * 删除施工许可
     * 
     * @param id 施工许可主键
     * @return 结果
     */
    public int deleteWtConstructionPermitsById(Long id);

    /**
     * 批量删除施工许可
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWtConstructionPermitsByIds(Long[] ids);
}

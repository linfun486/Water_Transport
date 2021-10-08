package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.WtUseCreditPointsMapper;
import com.ruoyi.business.domain.WtUseCreditPoints;
import com.ruoyi.business.service.IWtUseCreditPointsService;

/**
 * 信用分使用情况Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@Service
public class WtUseCreditPointsServiceImpl implements IWtUseCreditPointsService 
{
    @Autowired
    private WtUseCreditPointsMapper wtUseCreditPointsMapper;

    /**
     * 查询信用分使用情况
     * 
     * @param id 信用分使用情况主键
     * @return 信用分使用情况
     */
    @Override
    public WtUseCreditPoints selectWtUseCreditPointsById(Long id)
    {
        return wtUseCreditPointsMapper.selectWtUseCreditPointsById(id);
    }

    /**
     * 查询信用分使用情况列表
     * 
     * @param wtUseCreditPoints 信用分使用情况
     * @return 信用分使用情况
     */
    @Override
    public List<WtUseCreditPoints> selectWtUseCreditPointsList(WtUseCreditPoints wtUseCreditPoints)
    {
        return wtUseCreditPointsMapper.selectWtUseCreditPointsList(wtUseCreditPoints);
    }

    /**
     * 新增信用分使用情况
     * 
     * @param wtUseCreditPoints 信用分使用情况
     * @return 结果
     */
    @Override
    public int insertWtUseCreditPoints(WtUseCreditPoints wtUseCreditPoints)
    {
        wtUseCreditPoints.setCreateTime(DateUtils.getNowDate());
        return wtUseCreditPointsMapper.insertWtUseCreditPoints(wtUseCreditPoints);
    }

    /**
     * 修改信用分使用情况
     * 
     * @param wtUseCreditPoints 信用分使用情况
     * @return 结果
     */
    @Override
    public int updateWtUseCreditPoints(WtUseCreditPoints wtUseCreditPoints)
    {
        wtUseCreditPoints.setUpdateTime(DateUtils.getNowDate());
        return wtUseCreditPointsMapper.updateWtUseCreditPoints(wtUseCreditPoints);
    }

    /**
     * 批量删除信用分使用情况
     * 
     * @param ids 需要删除的信用分使用情况主键
     * @return 结果
     */
    @Override
    public int deleteWtUseCreditPointsByIds(Long[] ids)
    {
        return wtUseCreditPointsMapper.deleteWtUseCreditPointsByIds(ids);
    }

    /**
     * 删除信用分使用情况信息
     * 
     * @param id 信用分使用情况主键
     * @return 结果
     */
    @Override
    public int deleteWtUseCreditPointsById(Long id)
    {
        return wtUseCreditPointsMapper.deleteWtUseCreditPointsById(id);
    }
}

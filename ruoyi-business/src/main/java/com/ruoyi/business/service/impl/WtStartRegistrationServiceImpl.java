package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.WtStartRegistrationMapper;
import com.ruoyi.business.domain.WtStartRegistration;
import com.ruoyi.business.service.IWtStartRegistrationService;

/**
 * 开工登记Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@Service
public class WtStartRegistrationServiceImpl implements IWtStartRegistrationService 
{
    @Autowired
    private WtStartRegistrationMapper wtStartRegistrationMapper;

    /**
     * 查询开工登记
     * 
     * @param id 开工登记主键
     * @return 开工登记
     */
    @Override
    public WtStartRegistration selectWtStartRegistrationById(Long id)
    {
        return wtStartRegistrationMapper.selectWtStartRegistrationById(id);
    }

    /**
     * 查询开工登记列表
     * 
     * @param wtStartRegistration 开工登记
     * @return 开工登记
     */
    @Override
    public List<WtStartRegistration> selectWtStartRegistrationList(WtStartRegistration wtStartRegistration)
    {
        return wtStartRegistrationMapper.selectWtStartRegistrationList(wtStartRegistration);
    }

    /**
     * 新增开工登记
     * 
     * @param wtStartRegistration 开工登记
     * @return 结果
     */
    @Override
    public int insertWtStartRegistration(WtStartRegistration wtStartRegistration)
    {
        wtStartRegistration.setCreateTime(DateUtils.getNowDate());
        return wtStartRegistrationMapper.insertWtStartRegistration(wtStartRegistration);
    }

    /**
     * 修改开工登记
     * 
     * @param wtStartRegistration 开工登记
     * @return 结果
     */
    @Override
    public int updateWtStartRegistration(WtStartRegistration wtStartRegistration)
    {
        wtStartRegistration.setUpdateTime(DateUtils.getNowDate());
        return wtStartRegistrationMapper.updateWtStartRegistration(wtStartRegistration);
    }

    /**
     * 批量删除开工登记
     * 
     * @param ids 需要删除的开工登记主键
     * @return 结果
     */
    @Override
    public int deleteWtStartRegistrationByIds(Long[] ids)
    {
        return wtStartRegistrationMapper.deleteWtStartRegistrationByIds(ids);
    }

    /**
     * 删除开工登记信息
     * 
     * @param id 开工登记主键
     * @return 结果
     */
    @Override
    public int deleteWtStartRegistrationById(Long id)
    {
        return wtStartRegistrationMapper.deleteWtStartRegistrationById(id);
    }
}

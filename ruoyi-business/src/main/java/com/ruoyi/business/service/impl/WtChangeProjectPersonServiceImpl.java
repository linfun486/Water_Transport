package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.WtChangeProjectPersonMapper;
import com.ruoyi.business.domain.WtChangeProjectPerson;
import com.ruoyi.business.service.IWtChangeProjectPersonService;

/**
 * 项目人员变更信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@Service
public class WtChangeProjectPersonServiceImpl implements IWtChangeProjectPersonService 
{
    @Autowired
    private WtChangeProjectPersonMapper wtChangeProjectPersonMapper;

    /**
     * 查询项目人员变更信息
     * 
     * @param id 项目人员变更信息主键
     * @return 项目人员变更信息
     */
    @Override
    public WtChangeProjectPerson selectWtChangeProjectPersonById(Long id)
    {
        return wtChangeProjectPersonMapper.selectWtChangeProjectPersonById(id);
    }

    /**
     * 查询项目人员变更信息列表
     * 
     * @param wtChangeProjectPerson 项目人员变更信息
     * @return 项目人员变更信息
     */
    @Override
    public List<WtChangeProjectPerson> selectWtChangeProjectPersonList(WtChangeProjectPerson wtChangeProjectPerson)
    {
        return wtChangeProjectPersonMapper.selectWtChangeProjectPersonList(wtChangeProjectPerson);
    }

    /**
     * 新增项目人员变更信息
     * 
     * @param wtChangeProjectPerson 项目人员变更信息
     * @return 结果
     */
    @Override
    public int insertWtChangeProjectPerson(WtChangeProjectPerson wtChangeProjectPerson)
    {
        wtChangeProjectPerson.setCreateTime(DateUtils.getNowDate());
        return wtChangeProjectPersonMapper.insertWtChangeProjectPerson(wtChangeProjectPerson);
    }

    /**
     * 修改项目人员变更信息
     * 
     * @param wtChangeProjectPerson 项目人员变更信息
     * @return 结果
     */
    @Override
    public int updateWtChangeProjectPerson(WtChangeProjectPerson wtChangeProjectPerson)
    {
        wtChangeProjectPerson.setUpdateTime(DateUtils.getNowDate());
        return wtChangeProjectPersonMapper.updateWtChangeProjectPerson(wtChangeProjectPerson);
    }

    /**
     * 批量删除项目人员变更信息
     * 
     * @param ids 需要删除的项目人员变更信息主键
     * @return 结果
     */
    @Override
    public int deleteWtChangeProjectPersonByIds(Long[] ids)
    {
        return wtChangeProjectPersonMapper.deleteWtChangeProjectPersonByIds(ids);
    }

    /**
     * 删除项目人员变更信息信息
     * 
     * @param id 项目人员变更信息主键
     * @return 结果
     */
    @Override
    public int deleteWtChangeProjectPersonById(Long id)
    {
        return wtChangeProjectPersonMapper.deleteWtChangeProjectPersonById(id);
    }
}

package com.ruoyi.business.service;

import java.util.List;
import com.ruoyi.business.domain.WtChangeProjectPerson;

/**
 * 项目人员变更信息Service接口
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public interface IWtChangeProjectPersonService 
{
    /**
     * 查询项目人员变更信息
     * 
     * @param id 项目人员变更信息主键
     * @return 项目人员变更信息
     */
    public WtChangeProjectPerson selectWtChangeProjectPersonById(Long id);

    /**
     * 查询项目人员变更信息列表
     * 
     * @param wtChangeProjectPerson 项目人员变更信息
     * @return 项目人员变更信息集合
     */
    public List<WtChangeProjectPerson> selectWtChangeProjectPersonList(WtChangeProjectPerson wtChangeProjectPerson);

    /**
     * 新增项目人员变更信息
     * 
     * @param wtChangeProjectPerson 项目人员变更信息
     * @return 结果
     */
    public int insertWtChangeProjectPerson(WtChangeProjectPerson wtChangeProjectPerson);

    /**
     * 修改项目人员变更信息
     * 
     * @param wtChangeProjectPerson 项目人员变更信息
     * @return 结果
     */
    public int updateWtChangeProjectPerson(WtChangeProjectPerson wtChangeProjectPerson);

    /**
     * 批量删除项目人员变更信息
     * 
     * @param ids 需要删除的项目人员变更信息主键集合
     * @return 结果
     */
    public int deleteWtChangeProjectPersonByIds(Long[] ids);

    /**
     * 删除项目人员变更信息信息
     * 
     * @param id 项目人员变更信息主键
     * @return 结果
     */
    public int deleteWtChangeProjectPersonById(Long id);
}

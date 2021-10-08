package com.ruoyi.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 标段工程概况对象 wt_section_project_overview
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public class WtSectionProjectOverview extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 总里程 */
    @Excel(name = "总里程")
    private String totalMileage;

    /** 车道 */
    @Excel(name = "车道")
    private String driveway;

    /** 路面结构形式 */
    @Excel(name = "路面结构形式")
    private String pavementForm;

    /** 路基 */
    @Excel(name = "路基")
    private String subgrade;

    /** 挖方 */
    @Excel(name = "挖方")
    private String excavation;

    /** 填方 */
    @Excel(name = "填方")
    private String fill;

    /** 路面 */
    @Excel(name = "路面")
    private String pavement;

    /** 桥梁 */
    @Excel(name = "桥梁")
    private String bridge;

    /** 隧道 */
    @Excel(name = "隧道")
    private String tunnels;

    /** 删除标识 */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTotalMileage(String totalMileage) 
    {
        this.totalMileage = totalMileage;
    }

    public String getTotalMileage() 
    {
        return totalMileage;
    }
    public void setDriveway(String driveway) 
    {
        this.driveway = driveway;
    }

    public String getDriveway() 
    {
        return driveway;
    }
    public void setPavementForm(String pavementForm) 
    {
        this.pavementForm = pavementForm;
    }

    public String getPavementForm() 
    {
        return pavementForm;
    }
    public void setSubgrade(String subgrade) 
    {
        this.subgrade = subgrade;
    }

    public String getSubgrade() 
    {
        return subgrade;
    }
    public void setExcavation(String excavation) 
    {
        this.excavation = excavation;
    }

    public String getExcavation() 
    {
        return excavation;
    }
    public void setFill(String fill) 
    {
        this.fill = fill;
    }

    public String getFill() 
    {
        return fill;
    }
    public void setPavement(String pavement) 
    {
        this.pavement = pavement;
    }

    public String getPavement() 
    {
        return pavement;
    }
    public void setBridge(String bridge) 
    {
        this.bridge = bridge;
    }

    public String getBridge() 
    {
        return bridge;
    }
    public void setTunnels(String tunnels) 
    {
        this.tunnels = tunnels;
    }

    public String getTunnels() 
    {
        return tunnels;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("totalMileage", getTotalMileage())
            .append("driveway", getDriveway())
            .append("pavementForm", getPavementForm())
            .append("subgrade", getSubgrade())
            .append("excavation", getExcavation())
            .append("fill", getFill())
            .append("pavement", getPavement())
            .append("bridge", getBridge())
            .append("tunnels", getTunnels())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}

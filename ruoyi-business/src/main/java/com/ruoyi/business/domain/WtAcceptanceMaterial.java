package com.ruoyi.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 交工验收材料对象 wt_acceptance_material
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public class WtAcceptanceMaterial extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 交工日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交工日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dueDate;

    /** 工程质量 */
    @Excel(name = "工程质量")
    private String engineeringQuality;

    /** 实际开工日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实际开工日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actualDates;

    /** 实际完工日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实际完工日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actualDatee;

    /** 实际造价 */
    @Excel(name = "实际造价")
    private String actualCost;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String auditStatus;

    /** 审核人 */
    @Excel(name = "审核人")
    private String auditPerson;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

    /** 审核不通过原因 */
    @Excel(name = "审核不通过原因")
    private String auditReason;

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
    public void setDueDate(Date dueDate) 
    {
        this.dueDate = dueDate;
    }

    public Date getDueDate() 
    {
        return dueDate;
    }
    public void setEngineeringQuality(String engineeringQuality) 
    {
        this.engineeringQuality = engineeringQuality;
    }

    public String getEngineeringQuality() 
    {
        return engineeringQuality;
    }
    public void setActualDates(Date actualDates) 
    {
        this.actualDates = actualDates;
    }

    public Date getActualDates() 
    {
        return actualDates;
    }
    public void setActualDatee(Date actualDatee) 
    {
        this.actualDatee = actualDatee;
    }

    public Date getActualDatee() 
    {
        return actualDatee;
    }
    public void setActualCost(String actualCost) 
    {
        this.actualCost = actualCost;
    }

    public String getActualCost() 
    {
        return actualCost;
    }
    public void setAuditStatus(String auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public String getAuditStatus() 
    {
        return auditStatus;
    }
    public void setAuditPerson(String auditPerson) 
    {
        this.auditPerson = auditPerson;
    }

    public String getAuditPerson() 
    {
        return auditPerson;
    }
    public void setAuditTime(Date auditTime) 
    {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() 
    {
        return auditTime;
    }
    public void setAuditReason(String auditReason) 
    {
        this.auditReason = auditReason;
    }

    public String getAuditReason() 
    {
        return auditReason;
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
            .append("dueDate", getDueDate())
            .append("engineeringQuality", getEngineeringQuality())
            .append("actualDates", getActualDates())
            .append("actualDatee", getActualDatee())
            .append("actualCost", getActualCost())
            .append("auditStatus", getAuditStatus())
            .append("auditPerson", getAuditPerson())
            .append("auditTime", getAuditTime())
            .append("auditReason", getAuditReason())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}

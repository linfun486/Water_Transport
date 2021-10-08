package com.ruoyi.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 开工登记对象 wt_start_registration
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public class WtStartRegistration extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 开工工程名称 */
    @Excel(name = "开工工程名称")
    private String projectName;

    /** 开工日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开工日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date commencementDate;

    /** 批准单位 */
    @Excel(name = "批准单位")
    private String approvalUnit;

    /** 批准日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "批准日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date approvalDate;

    /** 投标承诺承诺人 */
    @Excel(name = "投标承诺承诺人")
    private String bidPromisor;

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
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setCommencementDate(Date commencementDate) 
    {
        this.commencementDate = commencementDate;
    }

    public Date getCommencementDate() 
    {
        return commencementDate;
    }
    public void setApprovalUnit(String approvalUnit) 
    {
        this.approvalUnit = approvalUnit;
    }

    public String getApprovalUnit() 
    {
        return approvalUnit;
    }
    public void setApprovalDate(Date approvalDate) 
    {
        this.approvalDate = approvalDate;
    }

    public Date getApprovalDate() 
    {
        return approvalDate;
    }
    public void setBidPromisor(String bidPromisor) 
    {
        this.bidPromisor = bidPromisor;
    }

    public String getBidPromisor() 
    {
        return bidPromisor;
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
            .append("projectName", getProjectName())
            .append("commencementDate", getCommencementDate())
            .append("approvalUnit", getApprovalUnit())
            .append("approvalDate", getApprovalDate())
            .append("bidPromisor", getBidPromisor())
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

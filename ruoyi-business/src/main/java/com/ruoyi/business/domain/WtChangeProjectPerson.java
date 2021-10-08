package com.ruoyi.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目人员变更信息对象 wt_change_project_person
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public class WtChangeProjectPerson extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 岗位类型 */
    @Excel(name = "岗位类型")
    private String postType;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contact;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String documentType;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardno;

    /** 职称 */
    @Excel(name = "职称")
    private String jobTitle;

    /** 证书编号 */
    @Excel(name = "证书编号")
    private String certificateNo;

    /** 证书类型 */
    @Excel(name = "证书类型")
    private String certificateType;

    /** 证书全称 */
    @Excel(name = "证书全称")
    private String certificateFullName;

    /** 证书等级 */
    @Excel(name = "证书等级")
    private String certificateLevel;

    /** 工作年限 */
    @Excel(name = "工作年限")
    private String workingYears;

    /** 登记时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "登记时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registrationTime;

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
    public void setPostType(String postType) 
    {
        this.postType = postType;
    }

    public String getPostType() 
    {
        return postType;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setDocumentType(String documentType) 
    {
        this.documentType = documentType;
    }

    public String getDocumentType() 
    {
        return documentType;
    }
    public void setCardno(String cardno) 
    {
        this.cardno = cardno;
    }

    public String getCardno() 
    {
        return cardno;
    }
    public void setJobTitle(String jobTitle) 
    {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() 
    {
        return jobTitle;
    }
    public void setCertificateNo(String certificateNo) 
    {
        this.certificateNo = certificateNo;
    }

    public String getCertificateNo() 
    {
        return certificateNo;
    }
    public void setCertificateType(String certificateType) 
    {
        this.certificateType = certificateType;
    }

    public String getCertificateType() 
    {
        return certificateType;
    }
    public void setCertificateFullName(String certificateFullName) 
    {
        this.certificateFullName = certificateFullName;
    }

    public String getCertificateFullName() 
    {
        return certificateFullName;
    }
    public void setCertificateLevel(String certificateLevel) 
    {
        this.certificateLevel = certificateLevel;
    }

    public String getCertificateLevel() 
    {
        return certificateLevel;
    }
    public void setWorkingYears(String workingYears) 
    {
        this.workingYears = workingYears;
    }

    public String getWorkingYears() 
    {
        return workingYears;
    }
    public void setRegistrationTime(Date registrationTime) 
    {
        this.registrationTime = registrationTime;
    }

    public Date getRegistrationTime() 
    {
        return registrationTime;
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
            .append("postType", getPostType())
            .append("name", getName())
            .append("contact", getContact())
            .append("documentType", getDocumentType())
            .append("cardno", getCardno())
            .append("jobTitle", getJobTitle())
            .append("certificateNo", getCertificateNo())
            .append("certificateType", getCertificateType())
            .append("certificateFullName", getCertificateFullName())
            .append("certificateLevel", getCertificateLevel())
            .append("workingYears", getWorkingYears())
            .append("registrationTime", getRegistrationTime())
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

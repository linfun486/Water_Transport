package com.ruoyi.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同备案对象 wt_contract_filing
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public class WtContractFiling extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 合同签订日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同签订日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contractDate;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractNo;

    /** 合同类别 */
    @Excel(name = "合同类别")
    private String contractType;

    /** 合同金额 */
    @Excel(name = "合同金额")
    private String contractMoney;

    /** 工期 */
    @Excel(name = "工期")
    private String duration;

    /** 收款账号开户行 */
    @Excel(name = "收款账号开户行")
    private String paymentAccountBank;

    /** 收款账号 */
    @Excel(name = "收款账号")
    private String paymentAccount;

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

    /** 工程名称 */
    @Excel(name = "工程名称")
    private String 工程名称;

    /** 删除标识 */
    @Excel(name = "删除标识")
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setContractDate(Date contractDate) 
    {
        this.contractDate = contractDate;
    }

    public Date getContractDate() 
    {
        return contractDate;
    }
    public void setContractNo(String contractNo) 
    {
        this.contractNo = contractNo;
    }

    public String getContractNo() 
    {
        return contractNo;
    }
    public void setContractType(String contractType) 
    {
        this.contractType = contractType;
    }

    public String getContractType() 
    {
        return contractType;
    }
    public void setContractMoney(String contractMoney) 
    {
        this.contractMoney = contractMoney;
    }

    public String getContractMoney() 
    {
        return contractMoney;
    }
    public void setDuration(String duration) 
    {
        this.duration = duration;
    }

    public String getDuration() 
    {
        return duration;
    }
    public void setPaymentAccountBank(String paymentAccountBank) 
    {
        this.paymentAccountBank = paymentAccountBank;
    }

    public String getPaymentAccountBank() 
    {
        return paymentAccountBank;
    }
    public void setPaymentAccount(String paymentAccount) 
    {
        this.paymentAccount = paymentAccount;
    }

    public String getPaymentAccount() 
    {
        return paymentAccount;
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
    public void set工程名称(String 工程名称) 
    {
        this.工程名称 = 工程名称;
    }

    public String get工程名称() 
    {
        return 工程名称;
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
            .append("contractDate", getContractDate())
            .append("contractNo", getContractNo())
            .append("contractType", getContractType())
            .append("contractMoney", getContractMoney())
            .append("duration", getDuration())
            .append("paymentAccountBank", getPaymentAccountBank())
            .append("paymentAccount", getPaymentAccount())
            .append("auditStatus", getAuditStatus())
            .append("auditPerson", getAuditPerson())
            .append("auditTime", getAuditTime())
            .append("auditReason", getAuditReason())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("工程名称", get工程名称())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}

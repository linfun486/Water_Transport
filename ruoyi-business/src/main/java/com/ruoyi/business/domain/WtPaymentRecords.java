package com.ruoyi.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 付款记录对象 wt_payment_records
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public class WtPaymentRecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "付款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date paymentTime;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private String paymentAmount;

    /** 付款单位名称 */
    @Excel(name = "付款单位名称")
    private String paymentUnit;

    /** 账户名称 */
    @Excel(name = "账户名称")
    private String paymentAccountName;

    /** 付款账号 */
    @Excel(name = "付款账号")
    private String paymentAccount;

    /** 开户行 */
    @Excel(name = "开户行")
    private String paymentBank;

    /** 款项来源 */
    @Excel(name = "款项来源")
    private String sourceFunds;

    /** 收款单位名称 */
    @Excel(name = "收款单位名称")
    private String receivingUnit;

    /** 账户名称 */
    @Excel(name = "账户名称")
    private String receivingAccountName;

    /** 收款账号 */
    @Excel(name = "收款账号")
    private String receivingAccount;

    /** 开户行 */
    @Excel(name = "开户行")
    private String receivingBank;

    /** 用途 */
    @Excel(name = "用途")
    private String purpose;

    /** 其他说明 */
    @Excel(name = "其他说明")
    private String otherNotes;

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
    public void setPaymentTime(Date paymentTime) 
    {
        this.paymentTime = paymentTime;
    }

    public Date getPaymentTime() 
    {
        return paymentTime;
    }
    public void setPaymentAmount(String paymentAmount) 
    {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentAmount() 
    {
        return paymentAmount;
    }
    public void setPaymentUnit(String paymentUnit) 
    {
        this.paymentUnit = paymentUnit;
    }

    public String getPaymentUnit() 
    {
        return paymentUnit;
    }
    public void setPaymentAccountName(String paymentAccountName) 
    {
        this.paymentAccountName = paymentAccountName;
    }

    public String getPaymentAccountName() 
    {
        return paymentAccountName;
    }
    public void setPaymentAccount(String paymentAccount) 
    {
        this.paymentAccount = paymentAccount;
    }

    public String getPaymentAccount() 
    {
        return paymentAccount;
    }
    public void setPaymentBank(String paymentBank) 
    {
        this.paymentBank = paymentBank;
    }

    public String getPaymentBank() 
    {
        return paymentBank;
    }
    public void setSourceFunds(String sourceFunds) 
    {
        this.sourceFunds = sourceFunds;
    }

    public String getSourceFunds() 
    {
        return sourceFunds;
    }
    public void setReceivingUnit(String receivingUnit) 
    {
        this.receivingUnit = receivingUnit;
    }

    public String getReceivingUnit() 
    {
        return receivingUnit;
    }
    public void setReceivingAccountName(String receivingAccountName) 
    {
        this.receivingAccountName = receivingAccountName;
    }

    public String getReceivingAccountName() 
    {
        return receivingAccountName;
    }
    public void setReceivingAccount(String receivingAccount) 
    {
        this.receivingAccount = receivingAccount;
    }

    public String getReceivingAccount() 
    {
        return receivingAccount;
    }
    public void setReceivingBank(String receivingBank) 
    {
        this.receivingBank = receivingBank;
    }

    public String getReceivingBank() 
    {
        return receivingBank;
    }
    public void setPurpose(String purpose) 
    {
        this.purpose = purpose;
    }

    public String getPurpose() 
    {
        return purpose;
    }
    public void setOtherNotes(String otherNotes) 
    {
        this.otherNotes = otherNotes;
    }

    public String getOtherNotes() 
    {
        return otherNotes;
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
            .append("paymentTime", getPaymentTime())
            .append("paymentAmount", getPaymentAmount())
            .append("paymentUnit", getPaymentUnit())
            .append("paymentAccountName", getPaymentAccountName())
            .append("paymentAccount", getPaymentAccount())
            .append("paymentBank", getPaymentBank())
            .append("sourceFunds", getSourceFunds())
            .append("receivingUnit", getReceivingUnit())
            .append("receivingAccountName", getReceivingAccountName())
            .append("receivingAccount", getReceivingAccount())
            .append("receivingBank", getReceivingBank())
            .append("purpose", getPurpose())
            .append("otherNotes", getOtherNotes())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}

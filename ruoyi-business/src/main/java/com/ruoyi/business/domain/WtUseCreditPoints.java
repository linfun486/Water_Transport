package com.ruoyi.business.domain;

import com.ruoyi.business.validator.validator.IdCardVali;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 信用分使用情况对象 wt_use_credit_points
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
public class WtUseCreditPoints extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String cpName;

    /** 企业统一社会信用代码 */
    @Excel(name = "企业统一社会信用代码")
    private String cpCode;

    /** 企业是否使用信用分 */
    @Excel(name = "企业是否使用信用分")
    private String cpUseCreditPoints;

    /** 企业使用等级 */
    @Excel(name = "企业使用等级")
    private String cpUselevel;

    /** 项目经理姓名 */
    @Excel(name = "项目经理姓名")
    private String pmName;

    /** 项目经理身份证号 */
    @Excel(name = "项目经理身份证号")
    private String pmCardno;

    /** 项目经理是否使用信用分 */
    @Excel(name = "项目经理是否使用信用分")
    private String pmUseCreditPoints;

    /** 项目经理使用等级 */
    @Excel(name = "项目经理使用等级")
    private String pmUselevel;

    /** 项目总工姓名 */
    @Excel(name = "项目总工姓名")
    private String pcName;

    /** 项目总工身份证号 */
    @Excel(name = "项目总工身份证号")
    private String pcCardno;

    /** 项目总工是否使用信用分 */
    @Excel(name = "项目总工是否使用信用分")
    private String pcUseCreditPoints;

    /** 项目总工使用等级 */
    @Excel(name = "项目总工使用等级")
    private String pcUselevel;

    /** 项目负责人姓名 */
    @Excel(name = "项目负责人姓名")
    private String plName;

    /** 项目负责人身份证号 */
    @Excel(name = "项目负责人身份证号")
    private String plCardno;

    /** 项目负责人是否使用信用分 */
    @Excel(name = "项目负责人是否使用信用分")
    private String plUseCreditPoints;

    /** 项目负责人使用等级 */
    @Excel(name = "项目负责人使用等级")
    private String plUselevel;

    /** 总监姓名 */
    @Excel(name = "总监姓名")
    private String ciName;

    /** 总监身份证号 */
    @Excel(name = "总监身份证号")
    private String ciCardno;

    /** 总监是否使用信用分 */
    @Excel(name = "总监是否使用信用分")
    private String ciUseCreditPoints;

    /** 总监使用等级 */
    @Excel(name = "总监使用等级")
    private String ciUselevel;

    /** 总监职业资格证书编号 */
    @Excel(name = "总监职业资格证书编号")
    private String ciProfessionalNo;

    /** 总监职称证书编号 */
    @Excel(name = "总监职称证书编号")
    private String ciCertificateNo;

    /** 试验室主任姓名 */
    @Excel(name = "试验室主任姓名")
    private String ldName;

    /** 试验室主任身份证号 */
    @Excel(name = "试验室主任身份证号")
    private String ldCardno;

    /** 试验室主任是否使用信用分 */
    @Excel(name = "试验室主任是否使用信用分")
    private String ldUseCreditPoints;

    /** 试验室主任使用等级 */
    @Excel(name = "试验室主任使用等级")
    private String ldUselevel;

    /** 试验室主任职业资格证书编号 */
    @Excel(name = "试验室主任职业资格证书编号")
    private String ldProfessionalNo;

    /** 试验室主任职称证书编号 */
    @Excel(name = "试验室主任职称证书编号")
    private String ldCertificateNo;

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
    public void setCpName(String cpName) 
    {
        this.cpName = cpName;
    }

    public String getCpName() 
    {
        return cpName;
    }
    public void setCpCode(String cpCode) 
    {
        this.cpCode = cpCode;
    }

    public String getCpCode() 
    {
        return cpCode;
    }
    public void setCpUseCreditPoints(String cpUseCreditPoints) 
    {
        this.cpUseCreditPoints = cpUseCreditPoints;
    }

    public String getCpUseCreditPoints() 
    {
        return cpUseCreditPoints;
    }
    public void setCpUselevel(String cpUselevel) 
    {
        this.cpUselevel = cpUselevel;
    }

    public String getCpUselevel() 
    {
        return cpUselevel;
    }
    public void setPmName(String pmName) 
    {
        this.pmName = pmName;
    }

    public String getPmName() 
    {
        return pmName;
    }
    public void setPmCardno(String pmCardno) 
    {
        this.pmCardno = pmCardno;
    }

    @IdCardVali(message = "项目经理身份证号格式错误！")
    public String getPmCardno() 
    {
        return pmCardno;
    }
    public void setPmUseCreditPoints(String pmUseCreditPoints) 
    {
        this.pmUseCreditPoints = pmUseCreditPoints;
    }

    public String getPmUseCreditPoints() 
    {
        return pmUseCreditPoints;
    }
    public void setPmUselevel(String pmUselevel) 
    {
        this.pmUselevel = pmUselevel;
    }

    public String getPmUselevel() 
    {
        return pmUselevel;
    }
    public void setPcName(String pcName) 
    {
        this.pcName = pcName;
    }

    public String getPcName() 
    {
        return pcName;
    }
    public void setPcCardno(String pcCardno) 
    {
        this.pcCardno = pcCardno;
    }

    public String getPcCardno() 
    {
        return pcCardno;
    }
    public void setPcUseCreditPoints(String pcUseCreditPoints) 
    {
        this.pcUseCreditPoints = pcUseCreditPoints;
    }

    public String getPcUseCreditPoints() 
    {
        return pcUseCreditPoints;
    }
    public void setPcUselevel(String pcUselevel) 
    {
        this.pcUselevel = pcUselevel;
    }

    public String getPcUselevel() 
    {
        return pcUselevel;
    }
    public void setPlName(String plName) 
    {
        this.plName = plName;
    }

    public String getPlName() 
    {
        return plName;
    }
    public void setPlCardno(String plCardno) 
    {
        this.plCardno = plCardno;
    }

    public String getPlCardno() 
    {
        return plCardno;
    }
    public void setPlUseCreditPoints(String plUseCreditPoints) 
    {
        this.plUseCreditPoints = plUseCreditPoints;
    }

    public String getPlUseCreditPoints() 
    {
        return plUseCreditPoints;
    }
    public void setPlUselevel(String plUselevel) 
    {
        this.plUselevel = plUselevel;
    }

    public String getPlUselevel() 
    {
        return plUselevel;
    }
    public void setCiName(String ciName) 
    {
        this.ciName = ciName;
    }

    public String getCiName() 
    {
        return ciName;
    }
    public void setCiCardno(String ciCardno) 
    {
        this.ciCardno = ciCardno;
    }

    public String getCiCardno() 
    {
        return ciCardno;
    }
    public void setCiUseCreditPoints(String ciUseCreditPoints) 
    {
        this.ciUseCreditPoints = ciUseCreditPoints;
    }

    public String getCiUseCreditPoints() 
    {
        return ciUseCreditPoints;
    }
    public void setCiUselevel(String ciUselevel) 
    {
        this.ciUselevel = ciUselevel;
    }

    public String getCiUselevel() 
    {
        return ciUselevel;
    }
    public void setCiProfessionalNo(String ciProfessionalNo) 
    {
        this.ciProfessionalNo = ciProfessionalNo;
    }

    public String getCiProfessionalNo() 
    {
        return ciProfessionalNo;
    }
    public void setCiCertificateNo(String ciCertificateNo) 
    {
        this.ciCertificateNo = ciCertificateNo;
    }

    public String getCiCertificateNo() 
    {
        return ciCertificateNo;
    }
    public void setLdName(String ldName) 
    {
        this.ldName = ldName;
    }

    public String getLdName() 
    {
        return ldName;
    }
    public void setLdCardno(String ldCardno) 
    {
        this.ldCardno = ldCardno;
    }

    public String getLdCardno() 
    {
        return ldCardno;
    }
    public void setLdUseCreditPoints(String ldUseCreditPoints) 
    {
        this.ldUseCreditPoints = ldUseCreditPoints;
    }

    public String getLdUseCreditPoints() 
    {
        return ldUseCreditPoints;
    }
    public void setLdUselevel(String ldUselevel) 
    {
        this.ldUselevel = ldUselevel;
    }

    public String getLdUselevel() 
    {
        return ldUselevel;
    }
    public void setLdProfessionalNo(String ldProfessionalNo) 
    {
        this.ldProfessionalNo = ldProfessionalNo;
    }

    public String getLdProfessionalNo() 
    {
        return ldProfessionalNo;
    }
    public void setLdCertificateNo(String ldCertificateNo) 
    {
        this.ldCertificateNo = ldCertificateNo;
    }

    public String getLdCertificateNo() 
    {
        return ldCertificateNo;
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
            .append("cpName", getCpName())
            .append("cpCode", getCpCode())
            .append("cpUseCreditPoints", getCpUseCreditPoints())
            .append("cpUselevel", getCpUselevel())
            .append("pmName", getPmName())
            .append("pmCardno", getPmCardno())
            .append("pmUseCreditPoints", getPmUseCreditPoints())
            .append("pmUselevel", getPmUselevel())
            .append("pcName", getPcName())
            .append("pcCardno", getPcCardno())
            .append("pcUseCreditPoints", getPcUseCreditPoints())
            .append("pcUselevel", getPcUselevel())
            .append("plName", getPlName())
            .append("plCardno", getPlCardno())
            .append("plUseCreditPoints", getPlUseCreditPoints())
            .append("plUselevel", getPlUselevel())
            .append("ciName", getCiName())
            .append("ciCardno", getCiCardno())
            .append("ciUseCreditPoints", getCiUseCreditPoints())
            .append("ciUselevel", getCiUselevel())
            .append("ciProfessionalNo", getCiProfessionalNo())
            .append("ciCertificateNo", getCiCertificateNo())
            .append("ldName", getLdName())
            .append("ldCardno", getLdCardno())
            .append("ldUseCreditPoints", getLdUseCreditPoints())
            .append("ldUselevel", getLdUselevel())
            .append("ldProfessionalNo", getLdProfessionalNo())
            .append("ldCertificateNo", getLdCertificateNo())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}

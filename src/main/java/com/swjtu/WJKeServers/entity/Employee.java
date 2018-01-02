package com.swjtu.WJKeServers.entity;

import java.util.Date;

public class Employee {
    private String empid;

    private String empno;

    private String positionname;

    private String empname;

    private String empsex;

    private String brief;

    private String tel;

    private String depttel;

    private Date rollin;

    private String empphoto;

    private String passwordweb;

    private Date exdate;

    private Date moddate;

    private Boolean flagtrashed;

    private Boolean flagdeleted;

    private String storeid;

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid == null ? null : empid.trim();
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex == null ? null : empsex.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getDepttel() {
        return depttel;
    }

    public void setDepttel(String depttel) {
        this.depttel = depttel == null ? null : depttel.trim();
    }

    public Date getRollin() {
        return rollin;
    }

    public void setRollin(Date rollin) {
        this.rollin = rollin;
    }

    public String getEmpphoto() {
        return empphoto;
    }

    public void setEmpphoto(String empphoto) {
        this.empphoto = empphoto == null ? null : empphoto.trim();
    }

    public String getPasswordweb() {
        return passwordweb;
    }

    public void setPasswordweb(String passwordweb) {
        this.passwordweb = passwordweb == null ? null : passwordweb.trim();
    }

    public Date getExdate() {
        return exdate;
    }

    public void setExdate(Date exdate) {
        this.exdate = exdate;
    }

    public Date getModdate() {
        return moddate;
    }

    public void setModdate(Date moddate) {
        this.moddate = moddate;
    }

    public Boolean getFlagtrashed() {
        return flagtrashed;
    }

    public void setFlagtrashed(Boolean flagtrashed) {
        this.flagtrashed = flagtrashed;
    }

    public Boolean getFlagdeleted() {
        return flagdeleted;
    }

    public void setFlagdeleted(Boolean flagdeleted) {
        this.flagdeleted = flagdeleted;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid == null ? null : storeid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empid=").append(empid);
        sb.append(", empno=").append(empno);
        sb.append(", positionname=").append(positionname);
        sb.append(", empname=").append(empname);
        sb.append(", empsex=").append(empsex);
        sb.append(", brief=").append(brief);
        sb.append(", tel=").append(tel);
        sb.append(", depttel=").append(depttel);
        sb.append(", rollin=").append(rollin);
        sb.append(", empphoto=").append(empphoto);
        sb.append(", passwordweb=").append(passwordweb);
        sb.append(", exdate=").append(exdate);
        sb.append(", moddate=").append(moddate);
        sb.append(", flagtrashed=").append(flagtrashed);
        sb.append(", flagdeleted=").append(flagdeleted);
        sb.append(", storeid=").append(storeid);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employee other = (Employee) that;
        return (this.getEmpid() == null ? other.getEmpid() == null : this.getEmpid().equals(other.getEmpid()))
            && (this.getEmpno() == null ? other.getEmpno() == null : this.getEmpno().equals(other.getEmpno()))
            && (this.getPositionname() == null ? other.getPositionname() == null : this.getPositionname().equals(other.getPositionname()))
            && (this.getEmpname() == null ? other.getEmpname() == null : this.getEmpname().equals(other.getEmpname()))
            && (this.getEmpsex() == null ? other.getEmpsex() == null : this.getEmpsex().equals(other.getEmpsex()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getDepttel() == null ? other.getDepttel() == null : this.getDepttel().equals(other.getDepttel()))
            && (this.getRollin() == null ? other.getRollin() == null : this.getRollin().equals(other.getRollin()))
            && (this.getEmpphoto() == null ? other.getEmpphoto() == null : this.getEmpphoto().equals(other.getEmpphoto()))
            && (this.getPasswordweb() == null ? other.getPasswordweb() == null : this.getPasswordweb().equals(other.getPasswordweb()))
            && (this.getExdate() == null ? other.getExdate() == null : this.getExdate().equals(other.getExdate()))
            && (this.getModdate() == null ? other.getModdate() == null : this.getModdate().equals(other.getModdate()))
            && (this.getFlagtrashed() == null ? other.getFlagtrashed() == null : this.getFlagtrashed().equals(other.getFlagtrashed()))
            && (this.getFlagdeleted() == null ? other.getFlagdeleted() == null : this.getFlagdeleted().equals(other.getFlagdeleted()))
            && (this.getStoreid() == null ? other.getStoreid() == null : this.getStoreid().equals(other.getStoreid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpid() == null) ? 0 : getEmpid().hashCode());
        result = prime * result + ((getEmpno() == null) ? 0 : getEmpno().hashCode());
        result = prime * result + ((getPositionname() == null) ? 0 : getPositionname().hashCode());
        result = prime * result + ((getEmpname() == null) ? 0 : getEmpname().hashCode());
        result = prime * result + ((getEmpsex() == null) ? 0 : getEmpsex().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getDepttel() == null) ? 0 : getDepttel().hashCode());
        result = prime * result + ((getRollin() == null) ? 0 : getRollin().hashCode());
        result = prime * result + ((getEmpphoto() == null) ? 0 : getEmpphoto().hashCode());
        result = prime * result + ((getPasswordweb() == null) ? 0 : getPasswordweb().hashCode());
        result = prime * result + ((getExdate() == null) ? 0 : getExdate().hashCode());
        result = prime * result + ((getModdate() == null) ? 0 : getModdate().hashCode());
        result = prime * result + ((getFlagtrashed() == null) ? 0 : getFlagtrashed().hashCode());
        result = prime * result + ((getFlagdeleted() == null) ? 0 : getFlagdeleted().hashCode());
        result = prime * result + ((getStoreid() == null) ? 0 : getStoreid().hashCode());
        return result;
    }
}
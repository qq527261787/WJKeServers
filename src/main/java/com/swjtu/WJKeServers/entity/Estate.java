package com.swjtu.WJKeServers.entity;

import java.util.Date;

public class Estate {
    private String estateid;

    private String estatename;

    private String areaid;

    private String cityname;

    private String districtname;

    private String areaname;

    private Double price;

    private String completeyear;

    private String buildtype;

    private String mgtprice;

    private String mgtcompany;

    private String devcompany;

    private Double rpratio;

    private Double greenratio;

    private String buildnum;

    private Integer room;

    private String address;

    private String url;

    private Date moddate;

    private Date exdate;

    private Boolean flagtrashed;

    private Boolean flagdeleted;

    public String getEstateid() {
        return estateid;
    }

    public void setEstateid(String estateid) {
        this.estateid = estateid == null ? null : estateid.trim();
    }

    public String getEstatename() {
        return estatename;
    }

    public void setEstatename(String estatename) {
        this.estatename = estatename == null ? null : estatename.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname == null ? null : districtname.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCompleteyear() {
        return completeyear;
    }

    public void setCompleteyear(String completeyear) {
        this.completeyear = completeyear == null ? null : completeyear.trim();
    }

    public String getBuildtype() {
        return buildtype;
    }

    public void setBuildtype(String buildtype) {
        this.buildtype = buildtype == null ? null : buildtype.trim();
    }

    public String getMgtprice() {
        return mgtprice;
    }

    public void setMgtprice(String mgtprice) {
        this.mgtprice = mgtprice == null ? null : mgtprice.trim();
    }

    public String getMgtcompany() {
        return mgtcompany;
    }

    public void setMgtcompany(String mgtcompany) {
        this.mgtcompany = mgtcompany == null ? null : mgtcompany.trim();
    }

    public String getDevcompany() {
        return devcompany;
    }

    public void setDevcompany(String devcompany) {
        this.devcompany = devcompany == null ? null : devcompany.trim();
    }

    public Double getRpratio() {
        return rpratio;
    }

    public void setRpratio(Double rpratio) {
        this.rpratio = rpratio;
    }

    public Double getGreenratio() {
        return greenratio;
    }

    public void setGreenratio(Double greenratio) {
        this.greenratio = greenratio;
    }

    public String getBuildnum() {
        return buildnum;
    }

    public void setBuildnum(String buildnum) {
        this.buildnum = buildnum == null ? null : buildnum.trim();
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getModdate() {
        return moddate;
    }

    public void setModdate(Date moddate) {
        this.moddate = moddate;
    }

    public Date getExdate() {
        return exdate;
    }

    public void setExdate(Date exdate) {
        this.exdate = exdate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", estateid=").append(estateid);
        sb.append(", estatename=").append(estatename);
        sb.append(", areaid=").append(areaid);
        sb.append(", cityname=").append(cityname);
        sb.append(", districtname=").append(districtname);
        sb.append(", areaname=").append(areaname);
        sb.append(", price=").append(price);
        sb.append(", completeyear=").append(completeyear);
        sb.append(", buildtype=").append(buildtype);
        sb.append(", mgtprice=").append(mgtprice);
        sb.append(", mgtcompany=").append(mgtcompany);
        sb.append(", devcompany=").append(devcompany);
        sb.append(", rpratio=").append(rpratio);
        sb.append(", greenratio=").append(greenratio);
        sb.append(", buildnum=").append(buildnum);
        sb.append(", room=").append(room);
        sb.append(", address=").append(address);
        sb.append(", url=").append(url);
        sb.append(", moddate=").append(moddate);
        sb.append(", exdate=").append(exdate);
        sb.append(", flagtrashed=").append(flagtrashed);
        sb.append(", flagdeleted=").append(flagdeleted);
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
        Estate other = (Estate) that;
        return (this.getEstateid() == null ? other.getEstateid() == null : this.getEstateid().equals(other.getEstateid()))
            && (this.getEstatename() == null ? other.getEstatename() == null : this.getEstatename().equals(other.getEstatename()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getDistrictname() == null ? other.getDistrictname() == null : this.getDistrictname().equals(other.getDistrictname()))
            && (this.getAreaname() == null ? other.getAreaname() == null : this.getAreaname().equals(other.getAreaname()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCompleteyear() == null ? other.getCompleteyear() == null : this.getCompleteyear().equals(other.getCompleteyear()))
            && (this.getBuildtype() == null ? other.getBuildtype() == null : this.getBuildtype().equals(other.getBuildtype()))
            && (this.getMgtprice() == null ? other.getMgtprice() == null : this.getMgtprice().equals(other.getMgtprice()))
            && (this.getMgtcompany() == null ? other.getMgtcompany() == null : this.getMgtcompany().equals(other.getMgtcompany()))
            && (this.getDevcompany() == null ? other.getDevcompany() == null : this.getDevcompany().equals(other.getDevcompany()))
            && (this.getRpratio() == null ? other.getRpratio() == null : this.getRpratio().equals(other.getRpratio()))
            && (this.getGreenratio() == null ? other.getGreenratio() == null : this.getGreenratio().equals(other.getGreenratio()))
            && (this.getBuildnum() == null ? other.getBuildnum() == null : this.getBuildnum().equals(other.getBuildnum()))
            && (this.getRoom() == null ? other.getRoom() == null : this.getRoom().equals(other.getRoom()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getModdate() == null ? other.getModdate() == null : this.getModdate().equals(other.getModdate()))
            && (this.getExdate() == null ? other.getExdate() == null : this.getExdate().equals(other.getExdate()))
            && (this.getFlagtrashed() == null ? other.getFlagtrashed() == null : this.getFlagtrashed().equals(other.getFlagtrashed()))
            && (this.getFlagdeleted() == null ? other.getFlagdeleted() == null : this.getFlagdeleted().equals(other.getFlagdeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEstateid() == null) ? 0 : getEstateid().hashCode());
        result = prime * result + ((getEstatename() == null) ? 0 : getEstatename().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getDistrictname() == null) ? 0 : getDistrictname().hashCode());
        result = prime * result + ((getAreaname() == null) ? 0 : getAreaname().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCompleteyear() == null) ? 0 : getCompleteyear().hashCode());
        result = prime * result + ((getBuildtype() == null) ? 0 : getBuildtype().hashCode());
        result = prime * result + ((getMgtprice() == null) ? 0 : getMgtprice().hashCode());
        result = prime * result + ((getMgtcompany() == null) ? 0 : getMgtcompany().hashCode());
        result = prime * result + ((getDevcompany() == null) ? 0 : getDevcompany().hashCode());
        result = prime * result + ((getRpratio() == null) ? 0 : getRpratio().hashCode());
        result = prime * result + ((getGreenratio() == null) ? 0 : getGreenratio().hashCode());
        result = prime * result + ((getBuildnum() == null) ? 0 : getBuildnum().hashCode());
        result = prime * result + ((getRoom() == null) ? 0 : getRoom().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getModdate() == null) ? 0 : getModdate().hashCode());
        result = prime * result + ((getExdate() == null) ? 0 : getExdate().hashCode());
        result = prime * result + ((getFlagtrashed() == null) ? 0 : getFlagtrashed().hashCode());
        result = prime * result + ((getFlagdeleted() == null) ? 0 : getFlagdeleted().hashCode());
        return result;
    }
}
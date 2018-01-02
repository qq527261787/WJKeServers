package com.swjtu.WJKeServers.entity;

public class District {
    private String districtid;

    private String districtname;

    private String cityname;

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid == null ? null : districtid.trim();
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname == null ? null : districtname.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", districtid=").append(districtid);
        sb.append(", districtname=").append(districtname);
        sb.append(", cityname=").append(cityname);
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
        District other = (District) that;
        return (this.getDistrictid() == null ? other.getDistrictid() == null : this.getDistrictid().equals(other.getDistrictid()))
            && (this.getDistrictname() == null ? other.getDistrictname() == null : this.getDistrictname().equals(other.getDistrictname()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDistrictid() == null) ? 0 : getDistrictid().hashCode());
        result = prime * result + ((getDistrictname() == null) ? 0 : getDistrictname().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        return result;
    }
}
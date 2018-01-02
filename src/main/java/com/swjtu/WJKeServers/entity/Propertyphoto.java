package com.swjtu.WJKeServers.entity;

import java.util.Date;

public class Propertyphoto {
    private String photoid;

    private String propertyid;

    private String photourl;

    private String photoname;

    private String propertyimgtype;

    private Boolean frontcover;

    private Date exdate;

    private Date moddate;

    private Boolean flagtrashed;

    private Boolean flagdeleted;

    public String getPhotoid() {
        return photoid;
    }

    public void setPhotoid(String photoid) {
        this.photoid = photoid == null ? null : photoid.trim();
    }

    public String getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(String propertyid) {
        this.propertyid = propertyid == null ? null : propertyid.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname == null ? null : photoname.trim();
    }

    public String getPropertyimgtype() {
        return propertyimgtype;
    }

    public void setPropertyimgtype(String propertyimgtype) {
        this.propertyimgtype = propertyimgtype == null ? null : propertyimgtype.trim();
    }

    public Boolean getFrontcover() {
        return frontcover;
    }

    public void setFrontcover(Boolean frontcover) {
        this.frontcover = frontcover;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", photoid=").append(photoid);
        sb.append(", propertyid=").append(propertyid);
        sb.append(", photourl=").append(photourl);
        sb.append(", photoname=").append(photoname);
        sb.append(", propertyimgtype=").append(propertyimgtype);
        sb.append(", frontcover=").append(frontcover);
        sb.append(", exdate=").append(exdate);
        sb.append(", moddate=").append(moddate);
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
        Propertyphoto other = (Propertyphoto) that;
        return (this.getPhotoid() == null ? other.getPhotoid() == null : this.getPhotoid().equals(other.getPhotoid()))
            && (this.getPropertyid() == null ? other.getPropertyid() == null : this.getPropertyid().equals(other.getPropertyid()))
            && (this.getPhotourl() == null ? other.getPhotourl() == null : this.getPhotourl().equals(other.getPhotourl()))
            && (this.getPhotoname() == null ? other.getPhotoname() == null : this.getPhotoname().equals(other.getPhotoname()))
            && (this.getPropertyimgtype() == null ? other.getPropertyimgtype() == null : this.getPropertyimgtype().equals(other.getPropertyimgtype()))
            && (this.getFrontcover() == null ? other.getFrontcover() == null : this.getFrontcover().equals(other.getFrontcover()))
            && (this.getExdate() == null ? other.getExdate() == null : this.getExdate().equals(other.getExdate()))
            && (this.getModdate() == null ? other.getModdate() == null : this.getModdate().equals(other.getModdate()))
            && (this.getFlagtrashed() == null ? other.getFlagtrashed() == null : this.getFlagtrashed().equals(other.getFlagtrashed()))
            && (this.getFlagdeleted() == null ? other.getFlagdeleted() == null : this.getFlagdeleted().equals(other.getFlagdeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPhotoid() == null) ? 0 : getPhotoid().hashCode());
        result = prime * result + ((getPropertyid() == null) ? 0 : getPropertyid().hashCode());
        result = prime * result + ((getPhotourl() == null) ? 0 : getPhotourl().hashCode());
        result = prime * result + ((getPhotoname() == null) ? 0 : getPhotoname().hashCode());
        result = prime * result + ((getPropertyimgtype() == null) ? 0 : getPropertyimgtype().hashCode());
        result = prime * result + ((getFrontcover() == null) ? 0 : getFrontcover().hashCode());
        result = prime * result + ((getExdate() == null) ? 0 : getExdate().hashCode());
        result = prime * result + ((getModdate() == null) ? 0 : getModdate().hashCode());
        result = prime * result + ((getFlagtrashed() == null) ? 0 : getFlagtrashed().hashCode());
        result = prime * result + ((getFlagdeleted() == null) ? 0 : getFlagdeleted().hashCode());
        return result;
    }
}
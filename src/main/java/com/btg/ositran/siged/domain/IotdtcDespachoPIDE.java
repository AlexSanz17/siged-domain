package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "IOTDTC_DESPACHO", schema = "IDOSGD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IotdtcDespachoPIDE.findAll", query = "SELECT i FROM IotdtcDespachoPIDE i"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findBySidemiext", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.sidemiext = :sidemiext"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVnumregstd", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vnumregstd = :vnumregstd"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVanioregstd", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vanioregstd = :vanioregstd"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByCtipdociderem", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.ctipdociderem = :ctipdociderem"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVnumdociderem", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vnumdociderem = :vnumdociderem"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVcoduniorgrem", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vcoduniorgrem = :vcoduniorgrem"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVuniorgrem", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vuniorgrem = :vuniorgrem"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVcuo", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vcuo = :vcuo"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVrucentrec", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vrucentrec = :vrucentrec"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVnomentrec", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vnomentrec = :vnomentrec"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVnumregstdrec", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vnumregstdrec = :vnumregstdrec"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVanioregstdrec", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vanioregstdrec = :vanioregstdrec"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByDfecregstdrec", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.dfecregstdrec = :dfecregstdrec"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVusuregstdrec", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vusuregstdrec = :vusuregstdrec"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVuniorgstdrec", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vuniorgstdrec = :vuniorgstdrec"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVobs", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vobs = :vobs"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVcuoref", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vcuoref = :vcuoref"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByCflgest", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.cflgest = :cflgest"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByDfecenv", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.dfecenv = :dfecenv"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVusureg", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vusureg = :vusureg"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByDfecreg", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.dfecreg = :dfecreg"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByVusumod", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.vusumod = :vusumod"),
    @NamedQuery(name = "IotdtcDespachoPIDE.findByDfecmod", query = "SELECT i FROM IotdtcDespachoPIDE i WHERE i.dfecmod = :dfecmod")})
public class IotdtcDespachoPIDE implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SIDEMIEXT")
    private Integer sidemiext;
    @Column(name = "VNUMREGSTD")
    private String vnumregstd;
    @Column(name = "VANIOREGSTD")
    private String vanioregstd;
    @Basic(optional = false)
    @Column(name = "CTIPDOCIDEREM")
    private Character ctipdociderem;
    @Basic(optional = false)
    @Column(name = "VNUMDOCIDEREM")
    private String vnumdociderem;
    @Column(name = "VCODUNIORGREM")
    private String vcoduniorgrem;
    @Column(name = "VUNIORGREM")
    private String vuniorgrem;
    @Column(name = "VCUO")
    private String vcuo;
    @Basic(optional = false)
    @Column(name = "VRUCENTREC")
    private String vrucentrec;
    @Basic(optional = false)
    @Column(name = "VNOMENTREC")
    private String vnomentrec;
    @Column(name = "VNUMREGSTDREC")
    private String vnumregstdrec;
    @Column(name = "VANIOREGSTDREC")
    private String vanioregstdrec;
    @Column(name = "DFECREGSTDREC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfecregstdrec;
    @Column(name = "VUSUREGSTDREC")
    private String vusuregstdrec;
    @Column(name = "VUNIORGSTDREC")
    private String vuniorgstdrec;
    @Column(name = "FLGINSERT")
    private Integer flginsert;
    
  

	@Lob
    @Column(name = "BCARSTDREC")
    private byte[] bcarstdrec;
    @Column(name = "VOBS")
    private String vobs;
    @Column(name = "VDESANXSTDREC")
    private String vdesanxstdrec;
    @Column(name = "VCUOREF")
    private String vcuoref;
    @Basic(optional = false)
    @Column(name = "CFLGEST")
    private Character cflgest;
//    @Basic(optional = false)
//    @Column(name = "CFLGENV")
//    private Character cflgenv;
    @Column(name = "DFECENV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfecenv;
    @Basic(optional = false)
    @Column(name = "VUSUREG")
    private String vusureg;
    @Basic(optional = false)
    @Column(name = "DFECREG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfecreg;
    @Column(name = "VUSUMOD")
    private String vusumod;
    @Column(name = "DFECMOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfecmod;
    @OneToMany(mappedBy = "sidemiext")
    private List<IotdtmDocExternoPIDE> iotdtmDocExternoList;
//    @Basic(optional = false)
//    @Column(name = "IDDOCUMENTO")
//    private Integer iddocumento;
    
    public IotdtcDespachoPIDE() {
    }

    public IotdtcDespachoPIDE(Integer sidemiext) {
        this.sidemiext = sidemiext;
    }

    public IotdtcDespachoPIDE(Integer sidemiext, Character ctipdociderem, String vnumdociderem, String vrucentrec, String vnomentrec, Character cflgest, Character cflgenv, String vusureg, Date dfecreg) {
        this.sidemiext = sidemiext;
        this.ctipdociderem = ctipdociderem;
        this.vnumdociderem = vnumdociderem;
        this.vrucentrec = vrucentrec;
        this.vnomentrec = vnomentrec;
        this.cflgest = cflgest;
        this.vusureg = vusureg;
        this.dfecreg = dfecreg;
    }
    public Integer getFlginsert() {
  		return flginsert;
  	}

  	public void setFlginsert(Integer flginsert) {
  		this.flginsert = flginsert;
  	}
    public Integer getSidemiext() {
        return sidemiext;
    }

    public void setSidemiext(Integer sidemiext) {
        this.sidemiext = sidemiext;
    }

    public String getVnumregstd() {
        return vnumregstd;
    }

    public void setVnumregstd(String vnumregstd) {
        this.vnumregstd = vnumregstd;
    }

    public String getVanioregstd() {
        return vanioregstd;
    }

    public void setVanioregstd(String vanioregstd) {
        this.vanioregstd = vanioregstd;
    }

    public Character getCtipdociderem() {
        return ctipdociderem;
    }

    public void setCtipdociderem(Character ctipdociderem) {
        this.ctipdociderem = ctipdociderem;
    }

    public String getVnumdociderem() {
        return vnumdociderem;
    }

    public void setVnumdociderem(String vnumdociderem) {
        this.vnumdociderem = vnumdociderem;
    }

    public String getVcoduniorgrem() {
        return vcoduniorgrem;
    }

    public void setVcoduniorgrem(String vcoduniorgrem) {
        this.vcoduniorgrem = vcoduniorgrem;
    }

    public String getVuniorgrem() {
        return vuniorgrem;
    }

    public void setVuniorgrem(String vuniorgrem) {
        this.vuniorgrem = vuniorgrem;
    }

    public String getVcuo() {
        return vcuo;
    }

    public void setVcuo(String vcuo) {
        this.vcuo = vcuo;
    }

    public String getVrucentrec() {
        return vrucentrec;
    }

    public void setVrucentrec(String vrucentrec) {
        this.vrucentrec = vrucentrec;
    }

    public String getVnomentrec() {
        return vnomentrec;
    }

    public void setVnomentrec(String vnomentrec) {
        this.vnomentrec = vnomentrec;
    }

    public String getVnumregstdrec() {
        return vnumregstdrec;
    }

    public void setVnumregstdrec(String vnumregstdrec) {
        this.vnumregstdrec = vnumregstdrec;
    }

    public String getVanioregstdrec() {
        return vanioregstdrec;
    }

    public void setVanioregstdrec(String vanioregstdrec) {
        this.vanioregstdrec = vanioregstdrec;
    }

    public Date getDfecregstdrec() {
        return dfecregstdrec;
    }

    public void setDfecregstdrec(Date dfecregstdrec) {
        this.dfecregstdrec = dfecregstdrec;
    }

    public String getVusuregstdrec() {
        return vusuregstdrec;
    }

    public void setVusuregstdrec(String vusuregstdrec) {
        this.vusuregstdrec = vusuregstdrec;
    }

    public String getVuniorgstdrec() {
        return vuniorgstdrec;
    }

    public void setVuniorgstdrec(String vuniorgstdrec) {
        this.vuniorgstdrec = vuniorgstdrec;
    }

    public byte[] getBcarstdrec() {
        return bcarstdrec;
    }

    public void setBcarstdrec(byte[] bcarstdrec) {
        this.bcarstdrec = bcarstdrec;
    }

    public String getVobs() {
        return vobs;
    }

    public void setVobs(String vobs) {
        this.vobs = vobs;
    }

    public String getVcuoref() {
        return vcuoref;
    }

    public void setVcuoref(String vcuoref) {
        this.vcuoref = vcuoref;
    }

    public Character getCflgest() {
        return cflgest;
    }

    public void setCflgest(Character cflgest) {
        this.cflgest = cflgest;
    }

//    public Character getCflgenv() {
//        return cflgenv;
//    }
//
//    public void setCflgenv(Character cflgenv) {
//        this.cflgenv = cflgenv;
//    }

    public Date getDfecenv() {
        return dfecenv;
    }

    public void setDfecenv(Date dfecenv) {
        this.dfecenv = dfecenv;
    }

    public String getVusureg() {
        return vusureg;
    }

    public void setVusureg(String vusureg) {
        this.vusureg = vusureg;
    }

    public Date getDfecreg() {
        return dfecreg;
    }

    public void setDfecreg(Date dfecreg) {
        this.dfecreg = dfecreg;
    }

    public String getVusumod() {
        return vusumod;
    }

    public void setVusumod(String vusumod) {
        this.vusumod = vusumod;
    }

    public Date getDfecmod() {
        return dfecmod;
    }

    public void setDfecmod(Date dfecmod) {
        this.dfecmod = dfecmod;
    }

    @XmlTransient
    public List<IotdtmDocExternoPIDE> getIotdtmDocExternoList() {
        return iotdtmDocExternoList;
    }

    public void setIotdtmDocExternoList(List<IotdtmDocExternoPIDE> iotdtmDocExternoList) {
        this.iotdtmDocExternoList = iotdtmDocExternoList;
    }
    
    public String getVdesanxstdrec() {
        return vdesanxstdrec;
    }

    public void setVdesanxstdrec(String vdesanxstdrec) {
        this.vdesanxstdrec = vdesanxstdrec;
    }

//	public Integer getIddocumento() {
//		return iddocumento;
//	}
//	
//	public void setIddocumento(Integer iddocumento) {
//		this.iddocumento = iddocumento;
//	}
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sidemiext != null ? sidemiext.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof IotdtcDespachoPIDE)) {
            return false;
        }
        IotdtcDespachoPIDE other = (IotdtcDespachoPIDE) object;
        if ((this.sidemiext == null && other.sidemiext != null) || (this.sidemiext != null && !this.sidemiext.equals(other.sidemiext))) {
            return false;
        }
        return true;
    }

    @Override
	public String toString() {
		return "IotdtcDespachoPIDE [sidemiext=" + sidemiext + ", vnumregstd=" + vnumregstd + ", vanioregstd="
			+ vanioregstd + ", ctipdociderem=" + ctipdociderem + ", vnumdociderem=" + vnumdociderem
			+ ", vcoduniorgrem=" + vcoduniorgrem + ", vuniorgrem=" + vuniorgrem + ", vcuo=" + vcuo + ", vrucentrec="
			+ vrucentrec + ", vnomentrec=" + vnomentrec + ", vnumregstdrec=" + vnumregstdrec + ", vanioregstdrec="
			+ vanioregstdrec + ", dfecregstdrec=" + dfecregstdrec + ", vusuregstdrec=" + vusuregstdrec
			+ ", vuniorgstdrec=" + vuniorgstdrec + ", vobs=" + vobs
			+ ", vdesanxstdrec=" + vdesanxstdrec + ", vcuoref=" + vcuoref + ", cflgest=" + cflgest + ", dfecenv="
			+ dfecenv + ", vusureg=" + vusureg + ", dfecreg=" + dfecreg + ", vusumod=" + vusumod + ", dfecmod="
			+ dfecmod + ", iotdtmDocExternoList=" + iotdtmDocExternoList + "]";
	}
    
}
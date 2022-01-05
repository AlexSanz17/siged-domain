package com.btg.ositran.pide.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

/**
 *
 * @author vcupe
 */
@Entity
@Table(name = "IDOSGD.IOTDTC_DESPACHO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PideIotdtcDespacho.findAll", query = "SELECT i FROM PideIotdtcDespacho i"),
    @NamedQuery(name = "PideIotdtcDespacho.findBySidemiext", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.sidemiext = :sidemiext"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVnumregstd", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vnumregstd = :vnumregstd"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVanioregstd", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vanioregstd = :vanioregstd"),
    @NamedQuery(name = "PideIotdtcDespacho.findByCtipdociderem", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.ctipdociderem = :ctipdociderem"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVnumdociderem", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vnumdociderem = :vnumdociderem"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVcoduniorgrem", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vcoduniorgrem = :vcoduniorgrem"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVuniorgrem", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vuniorgrem = :vuniorgrem"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVcuo", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vcuo = :vcuo"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVrucentrec", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vrucentrec = :vrucentrec"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVnomentrec", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vnomentrec = :vnomentrec"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVnumregstdrec", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vnumregstdrec = :vnumregstdrec"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVanioregstdrec", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vanioregstdrec = :vanioregstdrec"),
    @NamedQuery(name = "PideIotdtcDespacho.findByDfecregstdrec", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.dfecregstdrec = :dfecregstdrec"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVusuregstdrec", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vusuregstdrec = :vusuregstdrec"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVuniorgstdrec", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vuniorgstdrec = :vuniorgstdrec"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVobs", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vobs = :vobs"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVcuoref", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vcuoref = :vcuoref"),
    @NamedQuery(name = "PideIotdtcDespacho.findByCflgest", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.cflgest = :cflgest"),
    //@NamedQuery(name = "PideIotdtcDespacho.findByCflgenv", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.cflgenv = :cflgenv"),
    @NamedQuery(name = "PideIotdtcDespacho.findByDfecenv", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.dfecenv = :dfecenv"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVusureg", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vusureg = :vusureg"),
    @NamedQuery(name = "PideIotdtcDespacho.findByDfecreg", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.dfecreg = :dfecreg"),
    @NamedQuery(name = "PideIotdtcDespacho.findByVusumod", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.vusumod = :vusumod"),
    @NamedQuery(name = "PideIotdtcDespacho.findByDfecmod", query = "SELECT i FROM PideIotdtcDespacho i WHERE i.dfecmod = :dfecmod")})
public class PideIotdtcDespacho implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Lob
    @Column(name = "BCARSTDREC")
    private byte[] bcarstdrec;
    @Column(name = "VOBS")
    private String vobs;
    
    @Column(name = "VDESANXSTDREC")
    private String vdesanxstdrec;

    public String getVdesanxstdrec() {
        return vdesanxstdrec;
    }

    public void setVdesanxstdrec(String vdesanxstdrec) {
        this.vdesanxstdrec = vdesanxstdrec;
    }
    
    @Column(name = "VCUOREF")
    private String vcuoref;
    @Basic(optional = false)
    @Column(name = "CFLGEST")
    private Character cflgest;
    @Basic(optional = false)
    //@Column(name = "CFLGENV")
    //private Character cflgenv;
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
    private List<PideIotdtmDocExterno> iotdtmDocExternoList;

    @Basic(optional = false)
    @Column(name = "IDDOCUMENTO")
    private Integer iddocumento;

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }
    
    public PideIotdtcDespacho() {
    }

    public PideIotdtcDespacho(Integer sidemiext) {
        this.sidemiext = sidemiext;
    }

    public PideIotdtcDespacho(Integer sidemiext, Character ctipdociderem, String vnumdociderem, String vrucentrec, String vnomentrec, Character cflgest, String vusureg, Date dfecreg) {
        this.sidemiext = sidemiext;
        this.ctipdociderem = ctipdociderem;
        this.vnumdociderem = vnumdociderem;
        this.vrucentrec = vrucentrec;
        this.vnomentrec = vnomentrec;
        this.cflgest = cflgest;
        //this.cflgenv = cflgenv;
        this.vusureg = vusureg;
        this.dfecreg = dfecreg;
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
    public List<PideIotdtmDocExterno> getIotdtmDocExternoList() {
        return iotdtmDocExternoList;
    }

    public void setIotdtmDocExternoList(List<PideIotdtmDocExterno> iotdtmDocExternoList) {
        this.iotdtmDocExternoList = iotdtmDocExternoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sidemiext != null ? sidemiext.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PideIotdtcDespacho)) {
            return false;
        }
        PideIotdtcDespacho other = (PideIotdtcDespacho) object;
        if ((this.sidemiext == null && other.sidemiext != null) || (this.sidemiext != null && !this.sidemiext.equals(other.sidemiext))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btg.ositran.siged.domain.PideIotdtcDespacho[ sidemiext=" + sidemiext + " ]";
    }
    
}

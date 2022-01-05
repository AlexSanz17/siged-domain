package com.btg.ositran.pide.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
*
* @author vcupe
*/
@Entity
@Table(name = "IDOSGD.IOTDTD_DOC_PRINCIPAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PideIotdtdDocPrincipal.findAll", query = "SELECT i FROM PideIotdtdDocPrincipal i"),
    @NamedQuery(name = "PideIotdtdDocPrincipal.findBySiddocpri", query = "SELECT i FROM PideIotdtdDocPrincipal i WHERE i.siddocpri = :siddocpri"),
    @NamedQuery(name = "PideIotdtdDocPrincipal.findByVnomdoc", query = "SELECT i FROM PideIotdtdDocPrincipal i WHERE i.vnomdoc = :vnomdoc"),
    @NamedQuery(name = "PideIotdtdDocPrincipal.findByCcodest", query = "SELECT i FROM PideIotdtdDocPrincipal i WHERE i.ccodest = :ccodest"),
    @NamedQuery(name = "PideIotdtdDocPrincipal.findByDfecreg", query = "SELECT i FROM PideIotdtdDocPrincipal i WHERE i.dfecreg = :dfecreg")})
public class PideIotdtdDocPrincipal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Basic(optional = false)
    @Column(name = "SIDDOCPRI")
    private Integer siddocpri;
    @Basic(optional = false)
    @Column(name = "VNOMDOC")
    private String vnomdoc;
    @Basic(optional = false)
    @Lob
    @Column(name = "BPDFDOC")
    private byte[] bpdfdoc;
    @Basic(optional = false)
    @Column(name = "CCODEST")
    private Character ccodest;
    @Basic(optional = false)
    @Column(name = "DFECREG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfecreg;
    
    @JoinColumn(name = "SIDDOCEXT", referencedColumnName = "SIDDOCEXT")
    @ManyToOne(optional = false)
    private PideIotdtmDocExterno siddocext;

    public PideIotdtdDocPrincipal() {
    }

    public PideIotdtdDocPrincipal(Integer siddocpri) {
        this.siddocpri = siddocpri;
    }

    public PideIotdtdDocPrincipal(Integer siddocpri, String vnomdoc, byte[] bpdfdoc, Character ccodest, Date dfecreg) {
        this.siddocpri = siddocpri;
        this.vnomdoc = vnomdoc;
        this.bpdfdoc = bpdfdoc;
        this.ccodest = ccodest;
        this.dfecreg = dfecreg;
    }

    public Integer getSiddocpri() {
        return siddocpri;
    }

    public void setSiddocpri(Integer siddocpri) {
        this.siddocpri = siddocpri;
    }

    public String getVnomdoc() {
        return vnomdoc;
    }

    public void setVnomdoc(String vnomdoc) {
        this.vnomdoc = vnomdoc;
    }

    public byte[] getBpdfdoc() {
        return bpdfdoc;
    }

    public void setBpdfdoc(byte[] bpdfdoc) {
        this.bpdfdoc = bpdfdoc;
    }

    public Character getCcodest() {
        return ccodest;
    }

    public void setCcodest(Character ccodest) {
        this.ccodest = ccodest;
    }

    public Date getDfecreg() {
        return dfecreg;
    }

    public void setDfecreg(Date dfecreg) {
        this.dfecreg = dfecreg;
    }

    public PideIotdtmDocExterno getSiddocext() {
        return siddocext;
    }

    public void setSiddocext(PideIotdtmDocExterno siddocext) {
        this.siddocext = siddocext;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siddocpri != null ? siddocpri.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PideIotdtdDocPrincipal)) {
            return false;
        }
        PideIotdtdDocPrincipal other = (PideIotdtdDocPrincipal) object;
        if ((this.siddocpri == null && other.siddocpri != null) || (this.siddocpri != null && !this.siddocpri.equals(other.siddocpri))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btg.ositran.siged.domain.IotdtdDocPrincipal[ siddocpri=" + siddocpri + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity
@Table(name = "IOTDTD_DOC_PRINCIPAL", schema = "IDOSGD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IotdtdDocPrincipalPIDE.findAll", query = "SELECT i FROM IotdtdDocPrincipalPIDE i"),
    @NamedQuery(name = "IotdtdDocPrincipalPIDE.findBySiddocpri", query = "SELECT i FROM IotdtdDocPrincipalPIDE i WHERE i.siddocpri = :siddocpri"),
    @NamedQuery(name = "IotdtdDocPrincipalPIDE.findByVnomdoc", query = "SELECT i FROM IotdtdDocPrincipalPIDE i WHERE i.vnomdoc = :vnomdoc"),
    @NamedQuery(name = "IotdtdDocPrincipalPIDE.findByCcodest", query = "SELECT i FROM IotdtdDocPrincipalPIDE i WHERE i.ccodest = :ccodest"),
    @NamedQuery(name = "IotdtdDocPrincipalPIDE.findByDfecreg", query = "SELECT i FROM IotdtdDocPrincipalPIDE i WHERE i.dfecreg = :dfecreg")})
public class IotdtdDocPrincipalPIDE implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
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
    
    @Column(name = "SIDDOCEXT", insertable=false, updatable=false)
    private Integer ssiddocext;
    
    @JoinColumn(name = "SIDDOCEXT", referencedColumnName = "SIDDOCEXT")
    @ManyToOne(optional = false)
    private IotdtmDocExternoPIDE siddocext;

    public IotdtdDocPrincipalPIDE() {
    }

    public IotdtdDocPrincipalPIDE(Integer siddocpri) {
        this.siddocpri = siddocpri;
    }

    public IotdtdDocPrincipalPIDE(Integer siddocpri, String vnomdoc, byte[] bpdfdoc, Character ccodest, Date dfecreg) {
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

    public Integer getSsiddocext() {
		return ssiddocext;
	}

	public void setSsiddocext(Integer ssiddocext) {
		this.ssiddocext = ssiddocext;
	}
	
    public IotdtmDocExternoPIDE getSiddocext() {
        return siddocext;
    }

    public void setSiddocext(IotdtmDocExternoPIDE siddocext) {
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
        if (!(object instanceof IotdtdDocPrincipalPIDE)) {
            return false;
        }
        IotdtdDocPrincipalPIDE other = (IotdtdDocPrincipalPIDE) object;
        if ((this.siddocpri == null && other.siddocpri != null) || (this.siddocpri != null && !this.siddocpri.equals(other.siddocpri))) {
            return false;
        }
        return true;
    }

    @Override
	public String toString() {
		return "IotdtdDocPrincipalPIDE [siddocpri=" + siddocpri + "]";
	}
    
}

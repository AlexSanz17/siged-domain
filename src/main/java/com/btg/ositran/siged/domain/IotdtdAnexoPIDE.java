/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "IOTDTD_ANEXO", schema = "IDOSGD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IotdtdAnexoPIDE.findAll", query = "SELECT i FROM IotdtdAnexoPIDE i"),
    @NamedQuery(name = "IotdtdAnexoPIDE.findBySiddocanx", query = "SELECT i FROM IotdtdAnexoPIDE i WHERE i.siddocanx = :siddocanx"),
    @NamedQuery(name = "IotdtdAnexoPIDE.findByVnomdoc", query = "SELECT i FROM IotdtdAnexoPIDE i WHERE i.vnomdoc = :vnomdoc"),
    @NamedQuery(name = "IotdtdAnexoPIDE.findByDfecreg", query = "SELECT i FROM IotdtdAnexoPIDE i WHERE i.dfecreg = :dfecreg")})
public class IotdtdAnexoPIDE implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SIDDOCANX")
    private Integer siddocanx;
    @Basic(optional = false)
    @Column(name = "VNOMDOC")
    private String vnomdoc;
    @Basic(optional = false)
    @Column(name = "DFECREG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfecreg;
    
    @Column(name = "SIDDOCEXT", insertable=false, updatable=false)
    private Integer ssiddocext;
    
    @JoinColumn(name = "SIDDOCEXT", referencedColumnName = "SIDDOCEXT")
    @ManyToOne(optional = false)
    private IotdtmDocExternoPIDE siddocext;

    public IotdtdAnexoPIDE() {
    }

    public IotdtdAnexoPIDE(Integer siddocanx) {
        this.siddocanx = siddocanx;
    }

    public IotdtdAnexoPIDE(Integer siddocanx, String vnomdoc, Date dfecreg) {
        this.siddocanx = siddocanx;
        this.vnomdoc = vnomdoc;
        this.dfecreg = dfecreg;
    }

    public Integer getSiddocanx() {
        return siddocanx;
    }

    public void setSiddocanx(Integer siddocanx) {
        this.siddocanx = siddocanx;
    }

    public String getVnomdoc() {
        return vnomdoc;
    }

    public void setVnomdoc(String vnomdoc) {
        this.vnomdoc = vnomdoc;
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
        hash += (siddocanx != null ? siddocanx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IotdtdAnexoPIDE)) {
            return false;
        }
        IotdtdAnexoPIDE other = (IotdtdAnexoPIDE) object;
        if ((this.siddocanx == null && other.siddocanx != null) || (this.siddocanx != null && !this.siddocanx.equals(other.siddocanx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IotdtdAnexoPIDE[ siddocanx=" + siddocanx + " ]";
    }
    
}

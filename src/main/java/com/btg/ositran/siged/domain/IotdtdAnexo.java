package com.btg.ositran.siged.domain;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "IOTDTD_ANEXO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IotdtdAnexo.findAll", query = "SELECT i FROM IotdtdAnexo i"),
    @NamedQuery(name = "IotdtdAnexo.findBySiddocanx", query = "SELECT i FROM IotdtdAnexo i WHERE i.siddocanx = :siddocanx"),
    @NamedQuery(name = "IotdtdAnexo.findByVnomdoc", query = "SELECT i FROM IotdtdAnexo i WHERE i.vnomdoc = :vnomdoc"),
    @NamedQuery(name = "IotdtdAnexo.findByDfecreg", query = "SELECT i FROM IotdtdAnexo i WHERE i.dfecreg = :dfecreg")})
public class IotdtdAnexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SIDDOCANX")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer siddocanx;
    @Basic(optional = false)
    @Column(name = "VNOMDOC")
    private String vnomdoc;
    @Basic(optional = false)
    @Column(name = "DFECREG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfecreg;
    @JoinColumn(name = "SIDDOCEXT", referencedColumnName = "SIDDOCEXT")
    @ManyToOne(optional = false)
    private IotdtmDocExterno siddocext;

    public IotdtdAnexo() {
    }

    public IotdtdAnexo(Integer siddocanx) {
        this.siddocanx = siddocanx;
    }

    public IotdtdAnexo(Integer siddocanx, String vnomdoc, Date dfecreg) {
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
	
    public IotdtmDocExterno getSiddocext() {
        return siddocext;
    }

    public void setSiddocext(IotdtmDocExterno siddocext) {
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
        if (!(object instanceof IotdtdAnexo)) {
            return false;
        }
        IotdtdAnexo other = (IotdtdAnexo) object;
        if ((this.siddocanx == null && other.siddocanx != null) || (this.siddocanx != null && !this.siddocanx.equals(other.siddocanx))) {
            return false;
        }
        return true;
    }

    @Override
	public String toString() {
		return "IotdtdAnexo [siddocanx=" + siddocanx + ", vnomdoc=" + vnomdoc + ", dfecreg=" + dfecreg + ", siddocext="
			+ siddocext + "]";
	}
    
}

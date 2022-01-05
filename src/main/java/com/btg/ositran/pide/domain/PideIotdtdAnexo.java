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
@Table(name = "IDOSGD.IOTDTD_ANEXO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PideIotdtdAnexo.findAll", query = "SELECT i FROM PideIotdtdAnexo i"),
    @NamedQuery(name = "PideIotdtdAnexo.findBySiddocanx", query = "SELECT i FROM PideIotdtdAnexo i WHERE i.siddocanx = :siddocanx"),
    @NamedQuery(name = "PideIotdtdAnexo.findByVnomdoc", query = "SELECT i FROM PideIotdtdAnexo i WHERE i.vnomdoc = :vnomdoc"),
    @NamedQuery(name = "PideIotdtdAnexo.findByDfecreg", query = "SELECT i FROM PideIotdtdAnexo i WHERE i.dfecreg = :dfecreg")})
public class PideIotdtdAnexo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
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
    
    @JoinColumn(name = "SIDDOCEXT", referencedColumnName = "SIDDOCEXT")
    @ManyToOne(optional = false)
    private PideIotdtmDocExterno siddocext;

    public PideIotdtdAnexo() {
    }

    public PideIotdtdAnexo(Integer siddocanx) {
        this.siddocanx = siddocanx;
    }

    public PideIotdtdAnexo(Integer siddocanx, String vnomdoc, Date dfecreg) {
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

    public PideIotdtmDocExterno getSiddocext() {
        return siddocext;
    }

    public void setSiddocext(PideIotdtmDocExterno siddocext) {
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
        if (!(object instanceof PideIotdtdAnexo)) {
            return false;
        }
        PideIotdtdAnexo other = (PideIotdtdAnexo) object;
        if ((this.siddocanx == null && other.siddocanx != null) || (this.siddocanx != null && !this.siddocanx.equals(other.siddocanx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btg.ositran.siged.domain.PideIotdtdAnexo[ siddocanx=" + siddocanx + " ]";
    }
    
}

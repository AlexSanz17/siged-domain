/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "IOTDTM_DOC_EXTERNO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IotdtmDocExterno.findAll", query = "SELECT i FROM IotdtmDocExterno i"),
    @NamedQuery(name = "IotdtmDocExterno.findBySiddocext", query = "SELECT i FROM IotdtmDocExterno i WHERE i.siddocext = :siddocext"),
    @NamedQuery(name = "IotdtmDocExterno.findByVnomentemi", query = "SELECT i FROM IotdtmDocExterno i WHERE i.vnomentemi = :vnomentemi"),
    @NamedQuery(name = "IotdtmDocExterno.findByCcodtipdoc", query = "SELECT i FROM IotdtmDocExterno i WHERE i.ccodtipdoc = :ccodtipdoc"),
    @NamedQuery(name = "IotdtmDocExterno.findByVnumdoc", query = "SELECT i FROM IotdtmDocExterno i WHERE i.vnumdoc = :vnumdoc"),
    @NamedQuery(name = "IotdtmDocExterno.findByDfecdoc", query = "SELECT i FROM IotdtmDocExterno i WHERE i.dfecdoc = :dfecdoc"),
    @NamedQuery(name = "IotdtmDocExterno.findByVuniorgdst", query = "SELECT i FROM IotdtmDocExterno i WHERE i.vuniorgdst = :vuniorgdst"),
    @NamedQuery(name = "IotdtmDocExterno.findByVnomdst", query = "SELECT i FROM IotdtmDocExterno i WHERE i.vnomdst = :vnomdst"),
    @NamedQuery(name = "IotdtmDocExterno.findByVnomcardst", query = "SELECT i FROM IotdtmDocExterno i WHERE i.vnomcardst = :vnomcardst"),
    @NamedQuery(name = "IotdtmDocExterno.findByVasu", query = "SELECT i FROM IotdtmDocExterno i WHERE i.vasu = :vasu"),
    @NamedQuery(name = "IotdtmDocExterno.findByCindtup", query = "SELECT i FROM IotdtmDocExterno i WHERE i.cindtup = :cindtup"),
    @NamedQuery(name = "IotdtmDocExterno.findBySnumanx", query = "SELECT i FROM IotdtmDocExterno i WHERE i.snumanx = :snumanx"),
    @NamedQuery(name = "IotdtmDocExterno.findBySnumfol", query = "SELECT i FROM IotdtmDocExterno i WHERE i.snumfol = :snumfol"),
    @NamedQuery(name = "IotdtmDocExterno.findByVurldocanx", query = "SELECT i FROM IotdtmDocExterno i WHERE i.vurldocanx = :vurldocanx")})
public class IotdtmDocExterno implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="NU_INT_DOC_EXT")
    //@SequenceGenerator(name="NU_INT_DOC_EXT",sequenceName="NU_INT_DOC_EXT",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Basic(optional = false)
    @Column(name = "SIDDOCEXT")
    private Integer siddocext;
    @Basic(optional = false)
    @Column(name = "VNOMENTEMI")
    private String vnomentemi;
    @Basic(optional = false)
    @Column(name = "CCODTIPDOC")
    private String ccodtipdoc;
    @Basic(optional = false)
    @Column(name = "VNUMDOC")
    private String vnumdoc;
    @Basic(optional = false)
    @Column(name = "DFECDOC")
    @Temporal(TemporalType.DATE)
    private Date dfecdoc;
    @Basic(optional = false)
    @Column(name = "VUNIORGDST")
    private String vuniorgdst;
    @Basic(optional = false)
    @Column(name = "VNOMDST")
    private String vnomdst;
    @Basic(optional = false)
    @Column(name = "VNOMCARDST")
    private String vnomcardst;
    @Basic(optional = false)
    @Column(name = "VASU")
    private String vasu;
    @Column(name = "CINDTUP")
    private Character cindtup;
    @Column(name = "SNUMANX")
    private BigInteger snumanx;
    @Basic(optional = false)
    @Column(name = "SNUMFOL")
    private BigInteger snumfol;
    @Column(name = "VURLDOCANX")
    private String vurldocanx;
    
    @OneToMany(mappedBy = "siddocext",fetch=FetchType.LAZY)
    private List<IotdtdDocPrincipal> iotdtdDocPrincipalList;
    @OneToMany(mappedBy = "siddocext" ,fetch=FetchType.LAZY)
    private List<IotdtdAnexo> iotdtdAnexoList;
      
    @JoinColumn(name = "SIDEMIEXT", referencedColumnName = "SIDEMIEXT")
    @ManyToOne
    private IotdtcDespacho sidemiext;
    @JoinColumn(name = "SIDRECEXT", referencedColumnName = "SIDRECEXT")
    @ManyToOne
    private IotdtcRecepcion sidrecext;

    public IotdtmDocExterno() {
    }

    public IotdtmDocExterno(Integer siddocext) {
        this.siddocext = siddocext;
    }

    public IotdtmDocExterno(Integer siddocext, String vnomentemi, String ccodtipdoc, String vnumdoc, Date dfecdoc, String vuniorgdst, String vnomdst, String vnomcardst, String vasu, BigInteger snumfol) {
        this.siddocext = siddocext;
        this.vnomentemi = vnomentemi;
        this.ccodtipdoc = ccodtipdoc;
        this.vnumdoc = vnumdoc;
        this.dfecdoc = dfecdoc;
        this.vuniorgdst = vuniorgdst;
        this.vnomdst = vnomdst;
        this.vnomcardst = vnomcardst;
        this.vasu = vasu;
        this.snumfol = snumfol;
    }

    public Integer getSiddocext() {
        return siddocext;
    }

    public void setSiddocext(Integer siddocext) {
        this.siddocext = siddocext;
    }

    public String getVnomentemi() {
        return vnomentemi;
    }

    public void setVnomentemi(String vnomentemi) {
        this.vnomentemi = vnomentemi;
    }

    public String getCcodtipdoc() {
        return ccodtipdoc;
    }

    public void setCcodtipdoc(String ccodtipdoc) {
        this.ccodtipdoc = ccodtipdoc;
    }

    public String getVnumdoc() {
        return vnumdoc;
    }

    public void setVnumdoc(String vnumdoc) {
        this.vnumdoc = vnumdoc;
    }

    public Date getDfecdoc() {
        return dfecdoc;
    }

    public void setDfecdoc(Date dfecdoc) {
        this.dfecdoc = dfecdoc;
    }

    public String getVuniorgdst() {
        return vuniorgdst;
    }

    public void setVuniorgdst(String vuniorgdst) {
        this.vuniorgdst = vuniorgdst;
    }

    public String getVnomdst() {
        return vnomdst;
    }

    public void setVnomdst(String vnomdst) {
        this.vnomdst = vnomdst;
    }

    public String getVnomcardst() {
        return vnomcardst;
    }

    public void setVnomcardst(String vnomcardst) {
        this.vnomcardst = vnomcardst;
    }

    public String getVasu() {
        return vasu;
    }

    public void setVasu(String vasu) {
        this.vasu = vasu;
    }

    public Character getCindtup() {
        return cindtup;
    }

    public void setCindtup(Character cindtup) {
        this.cindtup = cindtup;
    }

    public BigInteger getSnumanx() {
        return snumanx;
    }

    public void setSnumanx(BigInteger snumanx) {
        this.snumanx = snumanx;
    }

    public BigInteger getSnumfol() {
        return snumfol;
    }

    public void setSnumfol(BigInteger snumfol) {
        this.snumfol = snumfol;
    }

    public String getVurldocanx() {
        return vurldocanx;
    }

    public void setVurldocanx(String vurldocanx) {
        this.vurldocanx = vurldocanx;
    }

    public List<IotdtdDocPrincipal> getIotdtdDocPrincipalList() {
        return iotdtdDocPrincipalList;
    }

    public void setIotdtdDocPrincipalList(List<IotdtdDocPrincipal> iotdtdDocPrincipalList) {
        this.iotdtdDocPrincipalList = iotdtdDocPrincipalList;
    }

    public List<IotdtdAnexo> getIotdtdAnexoList() {
        return iotdtdAnexoList;
    }

    public void setIotdtdAnexoList(List<IotdtdAnexo> iotdtdAnexoList) {
        this.iotdtdAnexoList = iotdtdAnexoList;
    }

    public IotdtcDespacho getSidemiext() {
        return sidemiext;
    }

    public void setSidemiext(IotdtcDespacho sidemiext) {
        this.sidemiext = sidemiext;
    }

    public IotdtcRecepcion getSidrecext() {
        return sidrecext;
    }

    public void setSidrecext(IotdtcRecepcion sidrecext) {
        this.sidrecext = sidrecext;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siddocext != null ? siddocext.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IotdtmDocExterno)) {
            return false;
        }
        IotdtmDocExterno other = (IotdtmDocExterno) object;
        if ((this.siddocext == null && other.siddocext != null) || (this.siddocext != null && !this.siddocext.equals(other.siddocext))) {
            return false;
        }
        return true;
    }

    @Override
	public String toString() {
		return "IotdtmDocExterno [siddocext=" + siddocext + ", vnomentemi=" + vnomentemi + ", ccodtipdoc=" + ccodtipdoc
			+ ", vnumdoc=" + vnumdoc + ", dfecdoc=" + dfecdoc + ", vuniorgdst=" + vuniorgdst + ", vnomdst="
			+ vnomdst + ", vnomcardst=" + vnomcardst + ", vasu=" + vasu + ", cindtup=" + cindtup + ", snumanx="
			+ snumanx + ", snumfol=" + snumfol + ", vurldocanx=" + vurldocanx + ", iotdtdDocPrincipalList="
			+ iotdtdDocPrincipalList + ", iotdtdAnexoList=" + iotdtdAnexoList + ", sidemiext=" + sidemiext
			+ ", sidrecext=" + sidrecext + "]";
	}
    
}

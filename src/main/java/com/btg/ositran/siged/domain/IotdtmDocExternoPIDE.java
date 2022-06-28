package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "IOTDTM_DOC_EXTERNO", schema = "IDOSGD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IotdtmDocExternoPIDE.findAll", query = "SELECT i FROM IotdtmDocExternoPIDE i"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findBySidemiext", query = "SELECT i FROM IotdtmDocExternoPIDE i, IotdtcDespachoPIDE j where i.sidemiext.sidemiext = j.sidemiext and j.sidemiext = :sidemiext"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findAllRecepcion", query = "SELECT i FROM IotdtmDocExternoPIDE i, IotdtcRecepcionPIDE j where i.sidrecext.sidrecext = j.sidrecext"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findBySiddocext", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.siddocext = :siddocext"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByVnomentemi", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.vnomentemi = :vnomentemi"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByCcodtipdoc", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.ccodtipdoc = :ccodtipdoc"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByVnumdoc", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.vnumdoc = :vnumdoc"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByDfecdoc", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.dfecdoc = :dfecdoc"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByVuniorgdst", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.vuniorgdst = :vuniorgdst"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByVnomdst", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.vnomdst = :vnomdst"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByVnomcardst", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.vnomcardst = :vnomcardst"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByVasu", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.vasu = :vasu"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByCindtup", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.cindtup = :cindtup"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findBySnumanx", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.snumanx = :snumanx"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findBySnumfol", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.snumfol = :snumfol"),
    @NamedQuery(name = "IotdtmDocExternoPIDE.findByVurldocanx", query = "SELECT i FROM IotdtmDocExternoPIDE i WHERE i.vurldocanx = :vurldocanx")})
public class IotdtmDocExternoPIDE implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
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
    private List<IotdtdDocPrincipalPIDE> iotdtdDocPrincipalList;
    @OneToMany(mappedBy = "siddocext" ,fetch=FetchType.LAZY)
    private List<IotdtdAnexoPIDE> iotdtdAnexoList;
    @JoinColumn(name = "SIDEMIEXT", referencedColumnName = "SIDEMIEXT")
    @ManyToOne
    private IotdtcDespachoPIDE sidemiext;
    @JoinColumn(name = "SIDRECEXT", referencedColumnName = "SIDRECEXT")
    @ManyToOne
    private IotdtcRecepcionPIDE sidrecext;

    public IotdtmDocExternoPIDE() {
    }

    public IotdtmDocExternoPIDE(Integer siddocext) {
        this.siddocext = siddocext;
    }

    public IotdtmDocExternoPIDE(Integer siddocext, String vnomentemi, String ccodtipdoc, String vnumdoc, Date dfecdoc, String vuniorgdst, String vnomdst, String vnomcardst, String vasu, BigInteger snumfol) {
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
	
    public List<IotdtdDocPrincipalPIDE> getIotdtdDocPrincipalList() {
        return iotdtdDocPrincipalList;
    }

    public void setIotdtdDocPrincipalList(List<IotdtdDocPrincipalPIDE> iotdtdDocPrincipalList) {
        this.iotdtdDocPrincipalList = iotdtdDocPrincipalList;
    }

    public List<IotdtdAnexoPIDE> getIotdtdAnexoList() {
        return iotdtdAnexoList;
    }

    public void setIotdtdAnexoList(List<IotdtdAnexoPIDE> iotdtdAnexoList) {
        this.iotdtdAnexoList = iotdtdAnexoList;
    }

    public IotdtcDespachoPIDE getSidemiext() {
        return sidemiext;
    }

    public void setSidemiext(IotdtcDespachoPIDE sidemiext) {
        this.sidemiext = sidemiext;
    }

    public IotdtcRecepcionPIDE getSidrecext() {
        return sidrecext;
    }

    public void setSidrecext(IotdtcRecepcionPIDE sidrecext) {
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
        if (!(object instanceof IotdtmDocExternoPIDE)) {
            return false;
        }
        IotdtmDocExternoPIDE other = (IotdtmDocExternoPIDE) object;
        if ((this.siddocext == null && other.siddocext != null) || (this.siddocext != null && !this.siddocext.equals(other.siddocext))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
		return "IotdtmDocExternoPIDE [siddocext=" + siddocext + ", vnomentemi=" + vnomentemi + ", ccodtipdoc="
			+ ccodtipdoc + ", vnumdoc=" + vnumdoc + ", dfecdoc=" + dfecdoc + ", vuniorgdst=" + vuniorgdst
			+ ", vnomdst=" + vnomdst + ", vnomcardst=" + vnomcardst + ", vasu=" + vasu + ", cindtup=" + cindtup
			+ ", snumanx=" + snumanx + ", snumfol=" + snumfol + ", vurldocanx=" + vurldocanx + "]";
	}
    
}

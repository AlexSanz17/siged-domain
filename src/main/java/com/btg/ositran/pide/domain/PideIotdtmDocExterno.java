package com.btg.ositran.pide.domain;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
*
* @author vcupe
*/
@Entity
@Table(name = "IDOSGD.IOTDTM_DOC_EXTERNO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PideIotdtmDocExterno.findAll", query = "SELECT i FROM PideIotdtmDocExterno i"),
    @NamedQuery(name = "PideIotdtmDocExterno.findBySiddocext", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.siddocext = :siddocext"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByVnomentemi", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.vnomentemi = :vnomentemi"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByCcodtipdoc", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.ccodtipdoc = :ccodtipdoc"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByVnumdoc", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.vnumdoc = :vnumdoc"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByDfecdoc", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.dfecdoc = :dfecdoc"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByVuniorgdst", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.vuniorgdst = :vuniorgdst"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByVnomdst", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.vnomdst = :vnomdst"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByVnomcardst", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.vnomcardst = :vnomcardst"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByVasu", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.vasu = :vasu"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByCindtup", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.cindtup = :cindtup"),
    @NamedQuery(name = "PideIotdtmDocExterno.findBySnumanx", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.snumanx = :snumanx"),
    @NamedQuery(name = "PideIotdtmDocExterno.findBySnumfol", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.snumfol = :snumfol"),
    @NamedQuery(name = "PideIotdtmDocExterno.findByVurldocanx", query = "SELECT i FROM PideIotdtmDocExterno i WHERE i.vurldocanx = :vurldocanx")})
public class PideIotdtmDocExterno implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
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
    private List<PideIotdtdDocPrincipal> iotdtdDocPrincipalList;
    @OneToMany(mappedBy = "siddocext" ,fetch=FetchType.LAZY)
    private List<PideIotdtdAnexo> iotdtdAnexoList;
    
    
    @JoinColumn(name = "SIDEMIEXT", referencedColumnName = "SIDEMIEXT")
    @ManyToOne
    private PideIotdtcDespacho sidemiext;
    @JoinColumn(name = "SIDRECEXT", referencedColumnName = "SIDRECEXT")
    @ManyToOne
    private PideIotdtcRecepcion sidrecext;

    public PideIotdtmDocExterno() {
    }

    public PideIotdtmDocExterno(Integer siddocext) {
        this.siddocext = siddocext;
    }

    public PideIotdtmDocExterno(Integer siddocext, String vnomentemi, String ccodtipdoc, String vnumdoc, Date dfecdoc, String vuniorgdst, String vnomdst, String vnomcardst, String vasu, BigInteger snumfol) {
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


    public List<PideIotdtdDocPrincipal> getIotdtdDocPrincipalList() {
        return iotdtdDocPrincipalList;
    }

    public void setIotdtdDocPrincipalList(List<PideIotdtdDocPrincipal> iotdtdDocPrincipalList) {
        this.iotdtdDocPrincipalList = iotdtdDocPrincipalList;
    }


    public List<PideIotdtdAnexo> getIotdtdAnexoList() {
        return iotdtdAnexoList;
    }

    public void setIotdtdAnexoList(List<PideIotdtdAnexo> iotdtdAnexoList) {
        this.iotdtdAnexoList = iotdtdAnexoList;
    }

    public PideIotdtcDespacho getSidemiext() {
        return sidemiext;
    }

    public void setSidemiext(PideIotdtcDespacho sidemiext) {
        this.sidemiext = sidemiext;
    }

    public PideIotdtcRecepcion getSidrecext() {
        return sidrecext;
    }

    public void setSidrecext(PideIotdtcRecepcion sidrecext) {
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
        if (!(object instanceof PideIotdtmDocExterno)) {
            return false;
        }
        PideIotdtmDocExterno other = (PideIotdtmDocExterno) object;
        if ((this.siddocext == null && other.siddocext != null) || (this.siddocext != null && !this.siddocext.equals(other.siddocext))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btg.ositran.pide.domain.PideIotdtmDocExterno[ siddocext=" + siddocext + " ]";
    }
    
}

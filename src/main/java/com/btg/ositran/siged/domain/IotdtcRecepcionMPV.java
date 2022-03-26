package com.btg.ositran.siged.domain;

import java.io.Serializable;
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

@Entity
@Table(name = "IOTDTC_RECEPCION_MPV")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "IotdtcRecepcionMPV.findAll", query = "SELECT i FROM IotdtcRecepcionMPV i"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findBySidrecext", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.sidrecext = :sidrecext"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVrucentrem", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vrucentrem = :vrucentrem"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVuniorgrem", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vuniorgrem = :vuniorgrem"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByCtipdociderem", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.ctipdociderem = :ctipdociderem"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVnumdociderem", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vnumdociderem = :vnumdociderem"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVnumregstd", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vnumregstd = :vnumregstd"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVanioregstd", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vanioregstd = :vanioregstd"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVuniorgstd", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vuniorgstd = :vuniorgstd"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByCcoduniorgstd", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.ccoduniorgstd = :ccoduniorgstd"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByDfecregstd", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.dfecregstd = :dfecregstd"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVusuregstd", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vusuregstd = :vusuregstd"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVcuo", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vcuo = :vcuo"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVcuoref", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vcuoref = :vcuoref"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVobs", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vobs = :vobs"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByCflgest", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.cflgest = :cflgest"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByVusumod", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.vusumod = :vusumod"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByDfecmod", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.dfecmod = :dfecmod"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByCflgestobs", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.cflgestobs = :cflgestobs"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByCflgenvcar", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.cflgenvcar = :cflgenvcar"),
	@NamedQuery(name = "IotdtcRecepcionMPV.findByDfecreg", query = "SELECT i FROM IotdtcRecepcionMPV i WHERE i.dfecreg = :dfecreg") })
public class IotdtcRecepcionMPV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "SIDRECEXT")
	private Integer sidrecext;
	@Basic(optional = false)
	@Column(name = "VRUCENTREM")
	private String vrucentrem;
	@Basic(optional = false)
	@Column(name = "VUNIORGREM")
	private String vuniorgrem;
	@Basic(optional = false)
	@Column(name = "CTIPDOCIDEREM")
	private Character ctipdociderem;
	@Basic(optional = false)
	@Column(name = "VNUMDOCIDEREM")
	private String vnumdociderem;
	@Column(name = "VNUMREGSTD")
	private String vnumregstd;
	@Column(name = "VANIOREGSTD")
	private String vanioregstd;
	@Column(name = "VUNIORGSTD")
	private String vuniorgstd;
	@Column(name = "CCODUNIORGSTD")
	private String ccoduniorgstd;
	@Column(name = "DFECREGSTD")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dfecregstd;
	@Column(name = "VUSUREGSTD")
	private String vusuregstd;
	@Lob
	@Column(name = "BCARSTD")
	private byte[] bcarstd;
	@Column(name = "VCUO")
	private String vcuo;
	@Column(name = "VCUOREF")
	private String vcuoref;
	@Column(name = "VOBS")
	private String vobs;
	@Column(name = "VDESANXSTD")
	private String vdesanxstd;
	@Basic(optional = false)
	@Column(name = "CFLGEST")
	private Character cflgest;
	@Column(name = "VUSUMOD")
	private String vusumod;
	@Column(name = "DFECMOD")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dfecmod;
	@Column(name = "CFLGESTOBS")
	private Character cflgestobs;
	@Column(name = "CFLGENVCAR")
	private Character cflgenvcar;
	@Basic(optional = false)
	@Column(name = "DFECREG")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dfecreg;
	
	@Column(name = "DESREMITENTE")
	private String desRemitente;
	
	@Column(name = "DESCARGOREMITENTE")
	private String desCargoRemitente;
	
	@Column(name = "IDDOCUMENTO")
	private Integer iddocumento;
	
	@Basic(optional = false)
	@Column(name = "CODTIPOINSTITUCION")
	private Character codtipoinstitucion;
	
	@Basic(optional = false)
	@Column(name = "TIPODOCUMENTO")
	private String tipodocumento;
	
	@Basic(optional = false)
	@Column(name = "NUMERODOCUMENTO")
	private String numerodocumento;
	
	@Basic(optional = false)
	@Column(name = "FECHADOCUMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechadocumento;
	
	@Column(name = "ASUNTO")
	private String asunto;
	
    @Column(name = "VNOMENTEMI")
    private String vnomentemi;
    
    @Column(name = "FLAGALFRESCO")
    private Character flagalfresco;
    
    @Column(name = "RESULTADOALFRESCO")
    private String resultadoalfresco;
	
	@OneToMany(mappedBy = "recepcion")
	private List<IotdtdAdjuntoMPV> archivos;

	public IotdtcRecepcionMPV() {
	}

	public IotdtcRecepcionMPV(Integer sidrecext) {
		this.sidrecext = sidrecext;
	}

	public IotdtcRecepcionMPV(Integer sidrecext, String vrucentrem, String vuniorgrem, Character ctipdociderem,
			String vnumdociderem, String vcuo, Character cflgest, Date dfecreg) {
		this.sidrecext = sidrecext;
		this.vrucentrem = vrucentrem;
		this.vuniorgrem = vuniorgrem;
		this.ctipdociderem = ctipdociderem;
		this.vnumdociderem = vnumdociderem;
		this.vcuo = vcuo;
		this.cflgest = cflgest;
		this.dfecreg = dfecreg;
	}

	public Integer getSidrecext() {
		return sidrecext;
	}

	public void setSidrecext(Integer sidrecext) {
		this.sidrecext = sidrecext;
	}

	public String getVrucentrem() {
		return vrucentrem;
	}

	public void setVrucentrem(String vrucentrem) {
		this.vrucentrem = vrucentrem;
	}

	public String getVuniorgrem() {
		return vuniorgrem;
	}

	public void setVuniorgrem(String vuniorgrem) {
		this.vuniorgrem = vuniorgrem;
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

	public String getVuniorgstd() {
		return vuniorgstd;
	}

	public void setVuniorgstd(String vuniorgstd) {
		this.vuniorgstd = vuniorgstd;
	}

	public String getCcoduniorgstd() {
		return ccoduniorgstd;
	}

	public void setCcoduniorgstd(String ccoduniorgstd) {
		this.ccoduniorgstd = ccoduniorgstd;
	}

	public Date getDfecregstd() {
		return dfecregstd;
	}

	public void setDfecregstd(Date dfecregstd) {
		this.dfecregstd = dfecregstd;
	}

	public String getVusuregstd() {
		return vusuregstd;
	}

	public void setVusuregstd(String vusuregstd) {
		this.vusuregstd = vusuregstd;
	}

	public byte[] getBcarstd() {
		return bcarstd;
	}

	public void setBcarstd(byte[] bcarstd) {
		this.bcarstd = bcarstd;
	}

	public String getVcuo() {
		return vcuo;
	}

	public void setVcuo(String vcuo) {
		this.vcuo = vcuo;
	}

	public String getVcuoref() {
		return vcuoref;
	}

	public void setVcuoref(String vcuoref) {
		this.vcuoref = vcuoref;
	}

	public String getVobs() {
		return vobs;
	}

	public void setVobs(String vobs) {
		this.vobs = vobs;
	}

	public Character getCflgest() {
		return cflgest;
	}

	public void setCflgest(Character cflgest) {
		this.cflgest = cflgest;
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

	public Character getCflgestobs() {
		return cflgestobs;
	}

	public void setCflgestobs(Character cflgestobs) {
		this.cflgestobs = cflgestobs;
	}

	public Character getCflgenvcar() {
		return cflgenvcar;
	}

	public void setCflgenvcar(Character cflgenvcar) {
		this.cflgenvcar = cflgenvcar;
	}

	public Date getDfecreg() {
		return dfecreg;
	}

	public void setDfecreg(Date dfecreg) {
		this.dfecreg = dfecreg;
	}

	public String getVdesanxstd() {
		return vdesanxstd;
	}

	public void setVdesanxstd(String vdesanxstd) {
		this.vdesanxstd = vdesanxstd;
	}

	public Character getCodtipoinstitucion() {
		return codtipoinstitucion;
	}

	public void setCodtipoinstitucion(Character codtipoinstitucion) {
		this.codtipoinstitucion = codtipoinstitucion;
	}
	
	public String getDesRemitente() {
		return desRemitente;
	}

	public void setDesRemitente(String desRemitente) {
		this.desRemitente = desRemitente;
	}

	public String getDesCargoRemitente() {
		return desCargoRemitente;
	}

	public void setDesCargoRemitente(String desCargoRemitente) {
		this.desCargoRemitente = desCargoRemitente;
	}
	
	public Integer getIddocumento() {
		return iddocumento;
	}

	public void setIddocumento(Integer iddocumento) {
		this.iddocumento = iddocumento;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public Date getFechadocumento() {
		return fechadocumento;
	}

	public void setFechadocumento(Date fechadocumento) {
		this.fechadocumento = fechadocumento;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getVnomentemi() {
		return vnomentemi;
	}

	public void setVnomentemi(String vnomentemi) {
		this.vnomentemi = vnomentemi;
	}

	public Character getFlagalfresco() {
		return flagalfresco;
	}

	public void setFlagalfresco(Character flagalfresco) {
		this.flagalfresco = flagalfresco;
	}

	public String getResultadoalfresco() {
		return resultadoalfresco;
	}

	public void setResultadoalfresco(String resultadoalfresco) {
		this.resultadoalfresco = resultadoalfresco;
	}

	public List<IotdtdAdjuntoMPV> getArchivos() {
		return archivos;
	}

	public void setArchivos(List<IotdtdAdjuntoMPV> archivos) {
		this.archivos = archivos;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sidrecext != null ? sidrecext.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof IotdtcRecepcionMPV)) {
			return false;
		}
		IotdtcRecepcionMPV other = (IotdtcRecepcionMPV) object;
		if ((this.sidrecext == null && other.sidrecext != null)
				|| (this.sidrecext != null && !this.sidrecext.equals(other.sidrecext))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.btg.ositran.siged.domain.IotdtcRecepcionMPV[ sidrecext=" + sidrecext + " ]";
	}
}
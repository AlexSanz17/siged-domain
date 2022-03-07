/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "IOTDTC_RECEPCION", schema = "IDOSGD")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "IotdtcRecepcionPIDE.findAll", query = "SELECT i FROM IotdtcRecepcionPIDE i"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findBySidrecext", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.sidrecext = :sidrecext"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVrucentrem", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vrucentrem = :vrucentrem"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVuniorgrem", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vuniorgrem = :vuniorgrem"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByCtipdociderem", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.ctipdociderem = :ctipdociderem"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVnumdociderem", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vnumdociderem = :vnumdociderem"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVnumregstd", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vnumregstd = :vnumregstd"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVanioregstd", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vanioregstd = :vanioregstd"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVuniorgstd", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vuniorgstd = :vuniorgstd"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByCcoduniorgstd", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.ccoduniorgstd = :ccoduniorgstd"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByDfecregstd", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.dfecregstd = :dfecregstd"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVusuregstd", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vusuregstd = :vusuregstd"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVcuo", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vcuo = :vcuo"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVcuoref", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vcuoref = :vcuoref"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVobs", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vobs = :vobs"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByCflgest", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.cflgest = :cflgest"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByVusumod", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.vusumod = :vusumod"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByDfecmod", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.dfecmod = :dfecmod"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByCflgestobs", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.cflgestobs = :cflgestobs"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByCflgenvcar", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.cflgenvcar = :cflgenvcar"),
		@NamedQuery(name = "IotdtcRecepcionPIDE.findByDfecreg", query = "SELECT i FROM IotdtcRecepcionPIDE i WHERE i.dfecreg = :dfecreg") })
public class IotdtcRecepcionPIDE implements Serializable {
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
	@Basic(optional = false)
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

	@Basic(optional = false)
	@Column(name = "CFLGANU")
	private Character cflganu;

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

	@OneToMany(mappedBy = "sidrecext")
	private List<IotdtmDocExternoPIDE> iotdtmDocExternoList;

	public Character getCflganu() {
		return cflganu;
	}

	public void setCflganu(Character cflganu) {
		this.cflganu = cflganu;
	}

	public IotdtcRecepcionPIDE() {
	}

	public IotdtcRecepcionPIDE(Integer sidrecext) {
		this.sidrecext = sidrecext;
	}

	public IotdtcRecepcionPIDE(Integer sidrecext, String vrucentrem, String vuniorgrem, Character ctipdociderem,
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

	@XmlTransient
	public List<IotdtmDocExternoPIDE> getIotdtmDocExternoList() {
		return iotdtmDocExternoList;
	}

	public void setIotdtmDocExternoList(List<IotdtmDocExternoPIDE> iotdtmDocExternoList) {
		this.iotdtmDocExternoList = iotdtmDocExternoList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sidrecext != null ? sidrecext.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof IotdtcRecepcionPIDE)) {
			return false;
		}
		IotdtcRecepcionPIDE other = (IotdtcRecepcionPIDE) object;
		if ((this.sidrecext == null && other.sidrecext != null)
				|| (this.sidrecext != null && !this.sidrecext.equals(other.sidrecext))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "IotdtcRecepcionPIDE[ sidrecext=" + sidrecext + " ]";
	}

}

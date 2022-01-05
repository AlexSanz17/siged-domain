package com.btg.ositran.mpv.domain;

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

/**
*
* @author vcupe
*/
@Entity
@Table(name = "StvExpMDocumento")
public class MpvStvExpMDocumento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "PK_eDocumento")
    private Integer id;
    
    @Basic(optional = false)
    @Column(name = "FK_eExpediente")
    private Integer eExpediente;
    
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
    

    public MpvStvExpMDocumento() {
    }

    
    
}

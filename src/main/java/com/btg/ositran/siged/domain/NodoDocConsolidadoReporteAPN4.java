package com.btg.ositran.siged.domain;



public class NodoDocConsolidadoReporteAPN4 {

	private Integer id;
	private String anndocumento;
	private String area;
	private Integer codArea;
	private String grupo;
	private Integer cantidad ;
	private Integer nroregorden;
	private Integer minanno;
	private Integer maxanno;

	public Integer getNroregorden() {
		return nroregorden;
	}

	public void setNroregorden(Integer nroregorden) {
		this.nroregorden = nroregorden;
	}

	public Integer getMinanno() {
		return minanno;
	}

	public void setMinanno(Integer minanno) {
		this.minanno = minanno;
	}

	public Integer getMaxanno() {
		return maxanno;
	}

	public void setMaxanno(Integer maxanno) {
		this.maxanno = maxanno;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnndocumento() {
		return anndocumento;
	}

	public void setAnndocumento(String anndocumento) {
		this.anndocumento = anndocumento;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getCodArea() {
		return codArea;
	}

	public void setCodArea(Integer codArea) {
		this.codArea = codArea;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
}

package com.btg.ositran.siged.domain;

public class NotificacionCasilla {
	private int FK_eIdCasilla;
	private int FK_eIdAplicacion;
	private int FK_eIdTipoNotificacion;
	private String uObservacion;
	private int FK_eIdTipoDocNotificacion;
	private String uNumDocNotificacion;
	private int eIdDocumentoSTD;
	private int eIdExpedienteSTD;
	private String eOrden;
	private int eUsuarioRegistro;
	private String rutaArchivoDocumento;
	private String rutaArchivoAdicional;
	
	private String uUnidadOrganica;
	private int eUsuarioActualizacion;
	private String cCodProcesoFirma;
	

	public int getFK_eIdCasilla() {
		return FK_eIdCasilla;
	}

	public void setFK_eIdCasilla(int fK_eIdCasilla) {
		FK_eIdCasilla = fK_eIdCasilla;
	}

	public int getFK_eIdAplicacion() {
		return FK_eIdAplicacion;
	}

	public void setFK_eIdAplicacion(int fK_eIdAplicacion) {
		FK_eIdAplicacion = fK_eIdAplicacion;
	}

	public int getFK_eIdTipoNotificacion() {
		return FK_eIdTipoNotificacion;
	}

	public void setFK_eIdTipoNotificacion(int fK_eIdTipoNotificacion) {
		FK_eIdTipoNotificacion = fK_eIdTipoNotificacion;
	}

	public String getuObservacion() {
		return uObservacion;
	}

	public void setuObservacion(String uObservacion) {
		this.uObservacion = uObservacion;
	}

	public int getFK_eIdTipoDocNotificacion() {
		return FK_eIdTipoDocNotificacion;
	}

	public void setFK_eIdTipoDocNotificacion(int fK_eIdTipoDocNotificacion) {
		FK_eIdTipoDocNotificacion = fK_eIdTipoDocNotificacion;
	}

	public String getuNumDocNotificacion() {
		return uNumDocNotificacion;
	}

	public void setuNumDocNotificacion(String uNumDocNotificacion) {
		this.uNumDocNotificacion = uNumDocNotificacion;
	}

	public int geteIdDocumentoSTD() {
		return eIdDocumentoSTD;
	}

	public void seteIdDocumentoSTD(int eIdDocumentoSTD) {
		this.eIdDocumentoSTD = eIdDocumentoSTD;
	}

	public int geteIdExpedienteSTD() {
		return eIdExpedienteSTD;
	}

	public void seteIdExpedienteSTD(int eIdExpedienteSTD) {
		this.eIdExpedienteSTD = eIdExpedienteSTD;
	}

	public String geteOrden() {
		return eOrden;
	}

	public void seteOrden(String eOrden) {
		this.eOrden = eOrden;
	}

	public int geteUsuarioRegistro() {
		return eUsuarioRegistro;
	}

	public void seteUsuarioRegistro(int eUsuarioRegistro) {
		this.eUsuarioRegistro = eUsuarioRegistro;
	}

	public String getRutaArchivoDocumento() {
		return rutaArchivoDocumento;
	}

	public void setRutaArchivoDocumento(String rutaArchivoDocumento) {
		this.rutaArchivoDocumento = rutaArchivoDocumento;
	}

	public String getRutaArchivoAdicional() {
		return rutaArchivoAdicional;
	}

	public void setRutaArchivoAdicional(String rutaArchivoAdicional) {
		this.rutaArchivoAdicional = rutaArchivoAdicional;
	}

	public String getuUnidadOrganica() {
		return uUnidadOrganica;
	}


	public void setuUnidadOrganica(String uUnidadOrganica) {
		this.uUnidadOrganica = uUnidadOrganica;
	}

	public int geteUsuarioActualizacion() {
		return eUsuarioActualizacion;
	}

	public void seteUsuarioActualizacion(int eUsuarioActualizacion) {
		this.eUsuarioActualizacion = eUsuarioActualizacion;
	}


	public String getcCodProcesoFirma() {
		return cCodProcesoFirma;
	}


	public void setcCodProcesoFirma(String cCodProcesoFirma) {
		this.cCodProcesoFirma = cCodProcesoFirma;
	}
	@Override
	public String toString() {
		return "NotificacionCasilla [FK_eIdCasilla=" + FK_eIdCasilla + ", FK_eIdAplicacion=" + FK_eIdAplicacion
				+ ", FK_eIdTipoNotificacion=" + FK_eIdTipoNotificacion + ", uObservacion=" + uObservacion
				+ ", FK_eIdTipoDocNotificacion=" + FK_eIdTipoDocNotificacion + ", uNumDocNotificacion="
				+ uNumDocNotificacion + ", eIdDocumentoSTD=" + eIdDocumentoSTD + ", eIdExpedienteSTD="
				+ eIdExpedienteSTD + ", eOrden=" + eOrden + ", eUsuarioRegistro=" + eUsuarioRegistro
				+ ", rutaArchivoDocumento=" + rutaArchivoDocumento + ", rutaArchivoAdicional=" + rutaArchivoAdicional
				+ ", uUnidadOrganica=" + uUnidadOrganica + ", eUsuarioActualizacion=" + eUsuarioActualizacion
				+ ", cCodProcesoFirma=" + cCodProcesoFirma + "]";
	}

}

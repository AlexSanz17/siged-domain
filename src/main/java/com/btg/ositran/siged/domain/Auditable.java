package com.btg.ositran.siged.domain;

import java.util.List;

public interface Auditable{

	public List<AuditableCampo> getCamposAuditables();
}

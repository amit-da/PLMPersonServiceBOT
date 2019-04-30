package com.hcl.resource;

import javax.ws.rs.ApplicationPath;

import com.dassault_systemes.platform.restServices.ModelerBase;

@ApplicationPath(ModelerBase.REST_BASE_PATH)
public class Modeler extends ModelerBase {

	@Override
	public Class<?>[] getServices() {
		return new Class<?>[] { PersonResource.class };
	}

}

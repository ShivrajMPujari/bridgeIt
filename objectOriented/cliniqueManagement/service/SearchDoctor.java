package com.bridgeIt.objectOriented.cliniqueManagement.service;

import org.json.simple.JSONObject;

public interface SearchDoctor {

	JSONObject byId(JSONObject jsonObject,Object id);
	JSONObject bySpecilization(JSONObject jsonObject,Object Specilization );
	JSONObject byAvailability(JSONObject jsonObject, Object Availability);
	JSONObject byName(JSONObject jsonObject, Object name);
	
}

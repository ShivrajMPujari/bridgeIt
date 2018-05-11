package com.bridgeIt.objectOriented.cliniqueManagement.service;

import org.json.simple.JSONObject;

public interface PatientSearch {

	JSONObject byName(JSONObject jsonObject,Object name);
	JSONObject byMobNo(JSONObject jsonObject,Object mobNo);
	JSONObject byId(JSONObject jsonObject,Object id);
	
}

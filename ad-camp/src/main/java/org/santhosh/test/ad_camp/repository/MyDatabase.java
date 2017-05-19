package org.santhosh.test.ad_camp.repository;

import java.util.HashMap;
import java.util.Map;

import org.santhosh.test.ad_camp.model.AdCampaignerInfo;

public class MyDatabase {
	
	private static Map<String,AdCampaignerInfo> ads=new HashMap<>(); 
	
	public static Map<String,AdCampaignerInfo> getAllAds()
	{
		return ads;
	}

}

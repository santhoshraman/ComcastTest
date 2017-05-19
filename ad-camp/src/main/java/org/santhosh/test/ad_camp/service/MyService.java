package org.santhosh.test.ad_camp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.santhosh.test.ad_camp.model.AdCampaignerInfo;
import org.santhosh.test.ad_camp.repository.MyDatabase;

public class MyService {
	
	private static Map<String,AdCampaignerInfo> ads=MyDatabase.getAllAds();
	
	public AdCampaignerInfo getAd(String partnerId)
	{
		AdCampaignerInfo activeAd=ads.get(partnerId);
		long diff=new Date().getTime()-activeAd.getCreatedDate().getTime();
		System.out.println("diff-->"+diff);
		boolean flag=diff < activeAd.getDuration()?true:false;
		if(flag)
		{
		return activeAd;
		}
		return null;
	}
	
	public AdCampaignerInfo postAd(AdCampaignerInfo adCamp)
	{
		adCamp.setCreatedDate(new Date());
		ads.put(adCamp.getPartnerId(), adCamp);
		return adCamp;
	}
	
	public List<AdCampaignerInfo> getAllAds()
	{
		return new ArrayList<AdCampaignerInfo>(ads.values());
	}

}

package org.santhosh.test.ad_camp.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AdCampaignerInfo {
	
	private String partnerId;
	private int duration;
	private String adContent;
	private Date createdDate;
	
	public AdCampaignerInfo(String partnerId,int duration,String adContent)
	{
		this.partnerId=partnerId;
		this.duration=duration;
		this.adContent=adContent;
		this.createdDate=new Date();
	}
	
	public AdCampaignerInfo()
	{
		
	}

	
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getAdContent() {
		return adContent;
	}
	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String toString()
	{
		return partnerId+"-"+adContent+"-"+duration;
		
	}

}

package org.santhosh.test.ad_camp.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.santhosh.test.ad_camp.model.AdCampaignerInfo;
import org.santhosh.test.ad_camp.service.MyService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/myresource")
public class MyResource {

     MyService myService=new MyService();
	
	 /**
	     * Method handling HTTP GET requests. The returned object will be sent
	     * to the client as "application/json" media type.
	     *
	     * @return List of all ad-campaigns that will be returned as a application/json response.
	     */
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AdCampaignerInfo> getAllAds() {
     	return myService.getAllAds();
    }
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return AdCampaignInfo of the partnerId that will be returned as a application/json response.
     */
    
    
    @Path("/{partnerId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AdCampaignerInfo getAd(@PathParam("partnerId") String partnerId) {
     	return myService.getAd(partnerId);
    }
    
    /**
     * Used to post new ad campaign
     * Method handling HTTP POST requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return AdCampaignInfo of the new partnerId that will be returned as a application/json response.
     */
    
    
    @Path("/ad")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AdCampaignerInfo postAdCamp(AdCampaignerInfo adCampInfo) {
    	System.out.println(adCampInfo);
    	MyService myService=new MyService();
    	myService.postAd(adCampInfo);
        return myService.getAd(adCampInfo.getPartnerId());
    }
}

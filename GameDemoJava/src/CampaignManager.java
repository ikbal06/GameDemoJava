
public class CampaignManager implements CampainService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya" +campaign.getDiscount()+" indirimle eklenmiþtir");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya silinmiþtir.");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya" +campaign.getDiscount()+" indirimle güncellenmiþtir");
	}

}

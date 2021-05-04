
public class CampaignManager implements CampainService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya" +campaign.getDiscount()+" indirimle eklenmiştir");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya silinmiştir.");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya" +campaign.getDiscount()+" indirimle güncellenmiştir");
	}

}

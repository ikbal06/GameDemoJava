
public class CampaignManager implements CampainService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya" +campaign.getDiscount()+" indirimle eklenmi�tir");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya silinmi�tir.");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"isimli kampanya" +campaign.getDiscount()+" indirimle g�ncellenmi�tir");
	}

}

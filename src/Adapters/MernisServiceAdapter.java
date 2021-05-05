package Adapters;

import Abstract.ValidationService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ValidationService{

	@Override
	public boolean isRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(gamer.getNationalityId(),
					gamer.getFirtName().toUpperCase(),
					gamer.getLastName().toUpperCase(), 
					gamer.getDateOfBirth());
			
		} catch (Exception e) {
			return false;
		}
		
		
	
		
	}

}

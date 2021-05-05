package Concrete;

import Abstract.GamerService;
import Abstract.ValidationService;

import Entities.Gamer;

public class GamerManager implements GamerService {

	private ValidationService _validationService;
	
	public GamerManager(ValidationService validationService) {
		this._validationService=validationService;
	}

	@Override
	public void save(Gamer gamer) {
		boolean result=_validationService.isRealPerson(gamer);
		if(result) {
			save(gamer);
		}else {
			System.out.println("Not a valid person");
		}
	
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirtName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi : " + gamer.getFirtName() );
		
	}


}

package Concrete;

import Abstract.ValidationService;
import Entities.Gamer;

public class ValidationManager implements ValidationService {

	@Override
	public boolean isRealPerson(Gamer gamer) {
		
		return true;
	}

}

package Managers;

import Entities.User;
import Interfaces.PersonVerification;

public class PersonVerificationManager extends PersonVerification {

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		if (user.getFirstName()=="Kubilay" && user.getBirthYear()==1998 && user.getLastName()=="Tuncbas"&& user.getNationalityIdentity()=="12345678901") {
			
			return true;
		}
		return false;
	}

}

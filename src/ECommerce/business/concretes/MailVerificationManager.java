package ECommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerce.business.abstracts.VerificationService;

public class MailVerificationManager implements VerificationService{

	CustomerCheckManager customerCheckManager;

	List<String> verificatedEmails = new ArrayList<String>();
	@Override
	public void sendMail(String email) {
		verificatedEmails.add(email);
		
	}

	@Override
	public void verifyMail(String email) {
		System.out.println("doğrulama e-postası");
		
	}

	@Override
	public boolean isVerificated(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}

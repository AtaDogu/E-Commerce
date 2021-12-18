package ECommerce.core;

public interface GoogleService {

	void sendToVerifyMail(String email);
	boolean checkVerifyAccount(String email);
}

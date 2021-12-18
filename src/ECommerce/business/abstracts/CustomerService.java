package ECommerce.business.abstracts;

import ECommerce.entities.concretes.Customer;

public interface CustomerService {
	void signUp(Customer customer);
	void signIn(Customer customer);
}

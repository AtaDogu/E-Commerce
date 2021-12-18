package ECommerce.dataAccess.abstracts;

import java.util.List;

import ECommerce.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete();
	void update();
	Customer get(int id);
	boolean getEmail(String email);
	boolean getPassword(String password);
	List<Customer> getAll();
	
	
}

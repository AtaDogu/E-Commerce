package ECommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerce.dataAccess.abstracts.CustomerDao;
import ECommerce.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	

	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		System.out.println("hibernate ile eklendi "+customer.getEmail());
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getEmail(String email) {
		for (Customer customer : customers) {
			if(customer.getEmail() == email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for(Customer customer : customers) {
			if(customer.getPassword()==password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

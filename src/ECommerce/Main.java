package ECommerce;

import ECommerce.business.concretes.CustomerCheckManager;
import ECommerce.business.concretes.CustomerManager;
import ECommerce.business.concretes.MailVerificationManager;
import ECommerce.dataAccess.concretes.HibernateCustomerDao;
import ECommerce.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Doğu");
		customer1.setLastName("Besirli");
		customer1.setEmail("Dogu@besirli.com");
		customer1.setPassword("1234567");

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Ata");
		customer2.setLastName("Besirli");
		customer2.setEmail("Ata@besirli.com");
		customer2.setPassword("12345");

		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setFirstName("Doğa");
		customer3.setLastName("Besirli");
		customer3.setEmail("doga@besirli.com");
		customer3.setPassword("123456789");

		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(),new HibernateCustomerDao(),new MailVerificationManager());

		customerManager.signUp(customer1);
		customerManager.signUp(customer2);
		customerManager.signUp(customer3);
		customerManager.signIn(customer1);

	}

}

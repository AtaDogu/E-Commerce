package ECommerce.business.concretes;

import ECommerce.business.abstracts.CustomerCheckService;
import ECommerce.business.abstracts.CustomerService;
import ECommerce.business.abstracts.VerificationService;
import ECommerce.dataAccess.abstracts.CustomerDao;
import ECommerce.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	CustomerCheckService customerCheckService;
	CustomerDao customerDao;
	VerificationService mailVerificationService;
	public CustomerManager(CustomerCheckService customerCheckService, CustomerDao customerDao,
			VerificationService mailVerificationService) {
		super();
		this.customerCheckService = customerCheckService;
		this.customerDao = customerDao;
		this.mailVerificationService = mailVerificationService;
	}

	@Override
	public void signUp(Customer customer) {
			if (customerCheckService.isValid(customer) == true) {
			System.out.print(customer.getFirstName() + " kullanıcısı başarıyla sisteme eklendi.\n");
			mailVerificationService.sendMail(customer.getEmail());
			customerDao.add(customer);}
	}

	@Override
	public void signIn(Customer customer) {
		if (customerDao.getEmail(customer.getEmail()) && customerDao.getPassword(customer.getPassword())
				&& mailVerificationService.isVerificated(customer.getEmail()) == true) {
			System.out.println("Kullanıcı girişi başarıyla yapıldı.");
			
		} else if (mailVerificationService.isVerificated(customer.getEmail()) == false) {
			System.out.println("Email adresi doğrulanmadığı için giriş yapılamıyor.");
		} else {
			System.out.println("Kullanıcı bilgileri yanlış, lütfen kontrol ediniz.");
		}
		
	}

}

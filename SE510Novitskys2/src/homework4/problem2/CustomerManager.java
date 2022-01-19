package homework4.problem2;

//CustomerManager.java
public class CustomerManager {
	private CustomerDao dao;
	public CustomerManager(CustomerDao dAO) {
		this.dao = dAO;
	}
	public void testCase() {
		// use all the methods of CustomerDaoMySql
		dao.getAllCustomers();
		dao.getCustomerById(customerId);
		dao.updateCustomer(customer);
		dao.deleteCustomerById(customerId);
	}
}


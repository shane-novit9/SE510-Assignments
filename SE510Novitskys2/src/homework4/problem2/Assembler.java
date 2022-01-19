package homework4.problem2;

import java.util.ArrayList;
import java.util.List;

public class Assembler {
	CustomerDao d = new MongoDbDao("mongo.com", "Carl", "carlrocks123");
	CustomerManager man = new CustomerManager(d);
	man.testCase();
	CustomerDao dao = new OracleDao("oracle.com", "Bod", "bobrocks123");
	man = new CustomerManager(dao);
	man.testCase();
}

class MySqlDao extends CustomerDao {

	public MySqlDao(String url, String name, String password) {
		super(url, name, password);
	}
	public List<Customer> getAllCustomers() {
		return this.customer;
	}
	public Customer getCustById(int id) {
		Customer result;
		for (Customer temp : customers) {
			if (temp.getId() == id) {
				result = temp;
				this.deleteCustomerById(id);
			}
		}
		return result;
	}
	public void updateCustomer(Customer cust) {
		deleteCustomerById(cust.getId());
		customers.add(cust)
	}
	public boolean deleteCustomerById(int customerId) {
		boolean result = false;
		for(Customer temp : customers) {
			if (temp.getId() == customerId) {
				result = true;
				customers.remove(temp);
			}
		}
		return result;
	}
	public ArrayList<Customer> initCustomerTable() {
		ArrayList<Customer> al = new ArrayList<Customer>();
		return al;
	}
}

class MongoDbDao extends CustomerDao {

	public MongoDbDao(String url, String name, String password) {
		super(url, name, password);
	}
	public List<Customer> getAllCustomers() {
		return this.customer;
	}
	public Customer getCustById(int id) {
		Customer result;
		for (Customer temp : customers) {
			if (temp.getId() == id) {
				result = temp;
				this.deleteCustomerById(id);
			}
		}
		return result;
	}
	public void updateCustomer(Customer cust) {
		deleteCustomerById(cust.getId());
		customers.add(cust)
	}
	public boolean deleteCustomerById(int customerId) {
		boolean result = false;
		for(Customer temp : customers) {
			if (temp.getId() == customerId) {
				result = true;
				customers.remove(temp);
			}
		}
		return result;
	}
	public ArrayList<Customer> initCustomerTable() {
		ArrayList<Customer> al = new ArrayList<Customer>();
		return al;
	}
}

class OracleDao extends CustomerDao {

	public OracleDao(String url, String name, String password) {
		super(url, name, password);
	}
	public List<Customer> getAllCustomers() {
		return this.customer;
	}
	public Customer getCustById(int id) {
		Customer result;
		for (Customer temp : customers) {
			if (temp.getId() == id) {
				result = temp;
				this.deleteCustomerById(id);
			}
		}
		return result;
	}
	public void updateCustomer(Customer cust) {
		deleteCustomerById(cust.getId());
		customers.add(cust)
	}
	public boolean deleteCustomerById(int customerId) {
		boolean result = false;
		for(Customer temp : customers) {
			if (temp.getId() == customerId) {
				result = true;
				customers.remove(temp);
			}
		}
		return result;
	}
	public ArrayList<Customer> initCustomerTable() {
		ArrayList<Customer> al = new ArrayList<Customer>();
		return al;
	}
}

package homework4.problem2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class CustomerDao {
	private ArrayList<Customer> customer;
	private Connection dbConn;
	private String url, name, password;
	
	public CustomerDao(String url, String name, String password) {
		this.customer = initCustomerTable();
		this.url = url;
		this.name = name;
		this.password = password;
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

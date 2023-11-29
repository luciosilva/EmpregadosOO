package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	private Address address;
	private List<Employee> employees;
		
	public Department(String name, int payDay, String email, String phone) {
		this.name = name;
		this.payDay = payDay;		
		this.employees = new ArrayList<Employee>();
		this.address = new Address(email, email);
	}
	
	public void addEmployee(Employee employee)
	{
		this.employees.add(employee);
	}

	public void removeEmployee(Employee employee)
	{
		this.employees.remove(employee);
	}
	
	public double payroll() 
	{
		double total = 0;
		
		for(Employee employee : employees) 
		{
			total += employee.getSalary();
		}
		return total;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
}

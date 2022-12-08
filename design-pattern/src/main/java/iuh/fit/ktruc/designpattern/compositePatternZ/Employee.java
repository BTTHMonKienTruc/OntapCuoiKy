package iuh.fit.ktruc.designpattern.compositePatternZ;

import java.util.ArrayList;
import java.util.List;

/**
 * Create Employee class having list of Employee objects. Tạo lớp Nhân viên có
 * danh sách các đối tượng Nhân viên.
 * 
 * @author Admin
 *
 */
public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;// cấp dưới
	//

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void del(Employee e) {
		subordinates.remove(e);
	}

	//
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates
				+ "]";
	}

	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	//
}

package staff.entity;

/*员工的子类，职员类
 * @author VCEtwp
 * @version 1.8
 * @createTime 2018.10.20
 */ 
public class Employee extends Staff{
	public Staff createEmployee(String name, String sex, String birthTime, int salary) {
		// TODO Auto-generated constructor stub
		Staff Employee=(Staff) new Employee();
		Employee.setName(name);
		Employee.setSex(sex);
		Employee.setBirthTime(birthTime);
		Employee.setSalary(salary);
		Employee.setPosition("Employee");
		return Employee;
	}
}

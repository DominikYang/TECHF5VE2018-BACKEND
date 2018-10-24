package staff.entity;

/* 员工的子类，经理
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
public class Manager extends Staff{
	public Staff createManager(String name, String sex, String birthTime, int salary) {
		// TODO Auto-generated constructor stub
		Staff Manager=(Staff) new Manager();
		Manager.setName(name);
		Manager.setSex(sex);
		Manager.setBirthTime(birthTime);
		Manager.setSalary(salary);
		Manager.setPosition("Manager");
		return Manager;
	}
}

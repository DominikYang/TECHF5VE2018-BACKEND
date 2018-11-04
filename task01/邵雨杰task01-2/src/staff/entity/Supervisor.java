package staff.entity;
/*员工的子类,主管职位类
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
public class Supervisor extends Staff{
	public Staff createSupervisor(String name, String sex, String birthTime, int salary) {
		// TODO Auto-generated constructor stub
		Staff Supervisor=(Staff) new Supervisor();
		Supervisor.setName(name);
		Supervisor.setSex(sex);
		Supervisor.setBirthTime(birthTime);
		Supervisor.setSalary(salary);
		Supervisor.setPosition("Supervisor");
		return Supervisor;
	}
}

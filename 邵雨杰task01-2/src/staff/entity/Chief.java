package staff.entity;

/*员工的子类，总监类
 * @author VCEtwp
 * @version 1.8
 * @createTime 2018.10.20
 */

public class Chief extends Staff{
	public Staff createChief(String name, String sex, String birthTime, int salary) {
		// TODO Auto-generated constructor stub
		Staff chief=(Staff) new Chief();
		chief.setName(name);
		chief.setSex(sex);
		chief.setBirthTime(birthTime);
		chief.setSalary(salary);
		chief.setPosition("chief");
		return chief;
	}
}

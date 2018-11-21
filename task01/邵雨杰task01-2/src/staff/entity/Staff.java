package staff.entity;
/*
 *   总的员工类
 * @author VCEtwp
 * @version 1.8
 * @createTime 2018.10.20
 */
public class Staff {
	private String name; //姓名
	private String sex;	 //性别
	private String birthTime;	//出生日期
	private String position;	//ְ职位
	private int salary;			//薪水
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthTime() {
		return birthTime;
	}
	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

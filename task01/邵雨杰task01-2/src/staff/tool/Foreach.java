package staff.tool;
/*
 * 用来遍历输出所有资料
 * @since 1.8
 * @createTime 2018.10.24
 */
public class Foreach {
	public void each() {
	int num;//遍历staffList的计数器
	for (num = 0; num < controller.Control.staffList.size(); num++) {//先遍历循环输出一遍
		System.out.print("编号："+num+1+"   ");
		System.out.print("姓名："+controller.Control.staffList.get(num).getName()+"   ");
		System.out.print("性别："+controller.Control.staffList.get(num).getSex()+"   ");
		System.out.print("出生日期："+controller.Control.staffList.get(num).getBirthTime()+"   ");
		System.out.print("职位："+controller.Control.staffList.get(num).getPosition()+"   ");
		System.out.println("薪水："+controller.Control.staffList.get(num).getSalary()+"   ");
	}
	}
}

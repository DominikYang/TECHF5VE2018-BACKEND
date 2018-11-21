package controller;
/*负责删除员工数据
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;
public class DeleteStaff {
	public void deleteStaff() {
		int num;//遍历staffList的计数器
		int key;//用来存储要删除的编号
		for (num = 0; num < Control.staffList.size(); num++) {//先遍历循环输出一遍
			System.out.print("编号："+num+1+"   ");
			System.out.print("姓名："+Control.staffList.get(num).getName()+"   ");
			System.out.print("性别："+Control.staffList.get(num).getSex()+"   ");
			System.out.print("出生日期："+Control.staffList.get(num).getBirthTime()+"   ");
			System.out.print("职位："+Control.staffList.get(num).getPosition()+"   ");
			System.out.println("薪水："+Control.staffList.get(num).getSalary()+"   ");
		}
		System.out.println("请选择要删除的编号");
		Scanner in=new Scanner(System.in);
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("输入错误，请重新输入。");
			}
			key=in.nextInt();
			Control.staffList.remove(key-1);
			System.out.println("删除成功");
	}
}

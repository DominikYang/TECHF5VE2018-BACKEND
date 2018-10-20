package controller;
/*程序的入口，获取用户的操作
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import staff.Staff;;
public class Control {
	public static List<Staff> staffList=new ArrayList<Staff>(); //存储员工
public static void main(String[] args) {
	int key;//用于存储选择编号
	System.out.println("员工管理系统");
	for(;;) {
	System.out.println("1.新增员工");
	System.out.println("2.删减员工");
	System.out.println("3.查找员工");
	System.out.println("4.编辑员工");
	System.out.println("5.退出");
	Scanner in=new Scanner(System.in);
	while(!in.hasNextInt()) {
		in.next();
		System.out.println("输入错误，请重新输入。");
	}
	key=in.nextInt();
	switch (key) {
	case 1:
		new CreateStaff().createStaff();
		System.out.println("添加成功");
		break;

	case 2:
		new DeleteStaff().deleteStaff();
		System.out.println("删除成功");
		break;
		
	case 3:
		new FindStaff().findStaff();
		break;
		
	case 4:
		new EditStaff().editStaff();
		System.out.println("修改成功");
		break;
		
	case 5:
		System.exit(0);
		
		default:
			System.out.println("请输入有效数字");
	}
	
	
		
}
}
}
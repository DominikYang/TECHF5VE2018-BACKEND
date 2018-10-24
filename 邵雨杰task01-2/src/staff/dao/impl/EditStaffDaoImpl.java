package staff.dao.impl;
/*负责修改员工数据
* @author VCEtwp
* @since 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;

import staff.tool.Foreach;
public class EditStaffDaoImpl {
	public void editStaff() {
		int key;//用来存储操作编号
		int NO;//用来存储操作员工编号
		Foreach xunhuan=new Foreach();
		xunhuan.each();
		System.out.println("请选择要编辑的编号");
		Scanner in=new Scanner(System.in);
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("输入错误，请重新输入。");
			}
			NO=in.nextInt();
			System.out.println("请选择修改内容：");
			System.out.println("1.姓名");
			System.out.println("2.性别");
			System.out.println("3.出生日期");
			System.out.println("4.职位");
			System.out.println("5.薪水");
			System.out.println("其他数字键取消操作");
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("输入错误，请重新输入。");
			}
			key=in.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输出修改后内容");
				controller.Control.staffList.get(NO-1).setName(in.next());
				break;

			case 2:
				System.out.println("请输出修改后内容");
				controller.Control.staffList.get(NO-1).setSex(in.next());
				break;
				
			case 3:
				System.out.println("请输出修改后内容");
				controller.Control.staffList.get(NO-1).setBirthTime(in.next());
				break;
				
			case 4:
				System.out.println("请输出修改后内容");
				controller.Control.staffList.get(NO-1).setPosition(in.next());
				break;
				
			case 5:
			System.out.println("请输出修改后内容");
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("请输入有效数字");
			}
			controller.Control.staffList.get(NO-1).setSalary(in.nextInt());
			break;
			}
	}
}

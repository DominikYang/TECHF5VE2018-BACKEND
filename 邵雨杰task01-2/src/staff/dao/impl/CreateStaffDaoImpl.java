package staff.dao.impl;
/*负责创建员工，并调用创建方法
* @author VCEtwp
* @since 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;

import controller.Control;
import staff.entity.Staff;
import staff.factory.ConcreteCreator;;;
public class CreateStaffDaoImpl {
	public void createStaff() {
		Staff theNew;
		 String name; 		//姓名
		 String sex;	 	//性别
		 String birthTime;	//生日
		 int salary;		//薪水
		System.out.println("请输入员工姓名");
		Scanner in=new Scanner(System.in);
		name=in.next();
		
		System.out.println("请输入员工性别");
		sex=in.next();
		while(!sex.equals("男")&&!sex.equals("女")) {
			System.out.println("输入错误，请输入男或女。");
			sex=in.next();
		}
		
		System.out.println("请输入员工生日 以19001230格式输入");
		birthTime=in.next();
		while(birthTime.length()!=8) {
			System.out.println(birthTime.length());
			System.out.println("格式错误");
			birthTime=in.next();
		}
		System.out.println("请输入员工薪水");
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("输入错误，请输入一个数字");
			}
			salary=in.nextInt();
			theNew=new ConcreteCreator().createStaff(name,sex,birthTime,salary);
			if(theNew!=null) {
			Control.staffList.add(theNew);
			}
		}
	}


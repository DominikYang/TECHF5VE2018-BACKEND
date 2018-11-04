package staff.dao.impl;
/*负责查找员工数据
* @author VCEtwp
* @since 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;

import controller.Control;
import staff.tool.Foreach;
public class FindStaffDaoImpl {
	public void findStaff() {
		String key;//暂存搜索关键词
		boolean exist=false;//存储是否搜索到内容
		int num;//遍历staffList的计数器
		Scanner in=new Scanner(System.in);
		Foreach xunhuan=new Foreach();
		xunhuan.each();
		System.out.println("请输入搜索关键词");
		key=in.next();
		for (num = 0; num < controller.Control.staffList.size(); num++) {
			if(key.equals(controller.Control.staffList.get(num).getName())||key.equals(Control.staffList.get(num).getSex())||key.equals(Control.staffList.get(num).getBirthTime())||key.equals(controller.Control.staffList.get(num).getPosition()))
			{
			exist=true;
			System.out.print("编号："+num+1+"   ");
			System.out.print("姓名："+controller.Control.staffList.get(num).getName()+"   ");
			System.out.print("性别："+controller.Control.staffList.get(num).getSex()+"   ");
			System.out.print("出生日期："+controller.Control.staffList.get(num).getBirthTime()+"   ");
			System.out.print("职位："+controller.Control.staffList.get(num).getPosition()+"   ");
			System.out.println("薪水："+controller.Control.staffList.get(num).getSalary()+"   ");
			}
		}
		if (!exist) {
			System.out.println("未搜索到相关内容");
		}
	}
}

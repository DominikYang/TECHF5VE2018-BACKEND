package staff.dao.impl;
/*负责删除员工数据
* @author VCEtwp
* @since 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;

import staff.tool.Foreach;
public class DeleteStaffDaoImpl {
	public void deleteStaff() {
		int key;//用来存储要删除的编号
		Foreach xunhuan=new Foreach();
		xunhuan.each();
		System.out.println("请选择要删除的编号");
		Scanner in=new Scanner(System.in);
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("输入错误，请重新输入。");
			}
			key=in.nextInt();
			controller.Control.staffList.remove(key-1);
			System.out.println("删除成功");
	}
}

package action;

import dao.StaffCrud;
import entity.Staff;
import view.StaffView;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
实现操作
 */
public class StaffAction {
    public static void main(String[] args) {
        StaffCrud staffCrud=new StaffCrud();
        StaffView staffView=new StaffView();
        while (true) {                //通过while循环使用户不退出系统
            staffView.View(); //显示操作界面
            Scanner in = new Scanner(System.in);
            try {
                int flag = in.nextInt();        //需要捕获InputMismatchException
                if (flag == 1) {
                    Staff staff = new Staff();
                    staffCrud.addStaff(staff);
                } else if (flag == 2) {
                    System.out.println("请输入要删除的员工的id");
                    String id = in.next();
                    staffCrud.removeStaff(id);
                } else if (flag == 3) {
                    System.out.println("请输入要修改的员工的id");
                    String id = in.next();
                    staffCrud.updateStaff(id);
                } else if (flag == 4) {
                    System.out.println("请输入要查询的员工的id");
                    String id = in.next();
                    staffCrud.searchStaffById(id);
                } else if (flag == 5) {
                    staffCrud.printStaffInformation();
                } else if (flag == 6) {
                    System.out.println("退出成功！");
                    break;            //当用户主动要求退出 再跳出循环
                } else {
                    System.out.println("请输入正确的序号！");
                }
            }catch (InputMismatchException ex){
                System.out.println("请输入正确的数据类型！");
            }
        }
    }
}

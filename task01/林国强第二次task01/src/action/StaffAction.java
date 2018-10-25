package action;

import dao.Impl.StaffDaoImpl;
import entity.Staff;
import view.StaffView;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 *
 * @author linguoqiang
 * @version V1.0
 * @date 2018/10/24  16:30
 * @since 1.8
 */
public class StaffAction {
    public static void main(String[] args) {
        StaffDaoImpl staffCrud=new StaffDaoImpl();
        StaffView staffView=new StaffView();
        Staff staff = new Staff();
        int Flag=1; //设置变量跳出循环
        while (Flag==1) {
            staffView.View(); //显示操作界面
            Scanner in = new Scanner(System.in);
            try {
                int flag = in.nextInt();
                switch (flag){
                    case 1:
                    staffCrud.addStaff(staff); //实现员工增添
                        break;
                    case 2:
                    System.out.println("请输入要删除的员工的id");
                    String id = in.next();
                    staffCrud.removeStaff(id); break;
                    case 3:
                    System.out.println("请输入要修改的员工的id");
                    String updateId = in.next();
                    staffCrud.updateStaff(updateId); break;
                    case 4:
                    System.out.println("请输入要查询的员工的id");
                    String searchId = in.next();
                    staffCrud.searchStaffById(searchId);  break;
                    case 5:
                    staffCrud.printStaffInformation(); //实现员工信息打印
                        break;
                    case 6:
                    System.out.println("退出成功！");      Flag=0;
                    break;
                    default:
                    System.out.println("请输入正确的序号！");
                }
            }catch (InputMismatchException ex){
                System.out.println("请输入正确的数据类型！");
            }
        }
    }
}

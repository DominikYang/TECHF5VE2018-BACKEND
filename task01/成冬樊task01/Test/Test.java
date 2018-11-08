package Test;
import java.util.Scanner;

import dao.StaffDAO;
/**
 *
 * @author chengdongfan;
 * @version V1.0
 * @date 2018/10/24
 * @since 1.8
 */
    public class Test{

    /**
     * 用数组存取数据
     * len表示长度，也就是数据数量
     */


    public static void main(String[] args) {
        StaffDAO t = new StaffDAO();
         Scanner sc = new Scanner(System.in);


        //业务选择
        label : while(true) {
            System.out.println("请选择业务：");
            System.out.println("1. 增加 ");
            System.out.println("2. 删除 ");
            System.out.println("3. 修改 ");
            System.out.println("4. 查询 ");
            System.out.println("0. 退出 ");
            int select = sc.nextInt();
            switch (select) {
                case 1: //添加
                    t.addEmployee();
                    break;
                case 2: //删除
                    t.deleteEmployee();
                    break;
                case 3: //修改
                    t.updateEmployee();
                    break;
                case 4: //查找
                    t.findEmployee();
                    break;
                case 0: //退出
                    System.out.println("退出成功！");
                    break label;

                default:
                    System.out.println("数字不正确！");
                    break;
            }
        }
    }

}

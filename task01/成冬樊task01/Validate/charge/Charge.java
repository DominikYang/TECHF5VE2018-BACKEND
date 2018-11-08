package Validate.charge;
import java.util.Scanner;
import entity.Member;
/**
 *
 * @author chengdongfan;
 * @version V1.0
 * @date 2018/10/24
 * @since 1.8
 */
public class Charge extends Member {
    Scanner inputData = new Scanner(System.in);

    //工资范围
    public void setSalary(double salary) {
        if (salary > 6000 && salary < 8000) {
            super.setSalary(salary);
        } else {
            System.out.println("输入薪水有误,请重新输入薪水:");
            salary = inputData.nextInt();
            super.setSalary(salary);
        }

    }
}
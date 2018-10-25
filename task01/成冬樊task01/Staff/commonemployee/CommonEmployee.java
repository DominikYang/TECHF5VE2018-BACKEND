package Staff.commonemployee;
import Staff.member.Member;

import java.util.Scanner;

public class CommonEmployee extends Member{
    Scanner inputData = new Scanner(System.in);

    //工资范围
    public void setSalary(double salary) {
        if (salary > 4000 && salary < 6000) {
            super.setSalary(salary);
        } else {
            System.out.println("输入薪水有误,请重新输入薪水:");
            salary = inputData.nextInt();
            super.setSalary(salary);
        }

    }
}




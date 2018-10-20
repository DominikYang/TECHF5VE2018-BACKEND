package com.henoylemonade;

import java.util.Scanner;
/**
 * 类属性：无
 * 类方法：设置薪水的方法
 *说明：该类继承了Worker类，并添加了构造方法
 * @auther 许颜鹏
 * @date 2018/10/18 10:30
 */
public class Manager extends Worker {
    Scanner inputData = new Scanner(System.in);

    public Manager(String name, Gender gender, int year, int month, int date, int salary) {//带参数的构造方法
        super(name, gender, year, month, date);
        super.position="manager";
        while (salary < 8000 || salary > 15000) {
            System.out.println("输入薪水有误,请重新输入薪水:");
            salary = inputData.nextInt();
        }
        super.salary = salary;
    }
}
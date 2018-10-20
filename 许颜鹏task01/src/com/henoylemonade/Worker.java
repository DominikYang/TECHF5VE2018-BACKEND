package com.henoylemonade;

import java.util.Calendar;// 导入Calendar类来表示出生日期

/**
 * 类属性：姓名，性别，出生日期，职位，薪水
 * 类方法：设置和获取员工信息
 *
 * @auther 许颜鹏
 * @date 2018/10/18 10:30
 */
enum Gender{MAN,WOMAN}//限定性别只存在 男，女
public class Worker {
    protected String name;//姓名
    protected Gender gender;//性别
    protected Calendar birthday = Calendar.getInstance();//出生日期
    protected String position = "worker";//职位
    protected int salary;//薪水


    public Worker(String name,Gender gender,int year,int month,int date) {//带参数的构造器
        this.name=name;
        this.gender=gender;
        this.birthday.set(year,month-1,date);
    }
    public String getPosition(){  //获取职位
        return this.position;
    }
    public void setName(String name) {//设置名字
        this.name = name;
    }

    public String getName() {//获取名字
        return this.name;
    }

    public void setGender(Gender gender) {//设置性别
        this.gender = gender;
    }

    public Gender getGender() {//获取性别
        return this.gender;
    }

    public void setBirthday(int year, int month, int date) {//设置出生日期，以年月日分别输入
        birthday.set(year, month, date);
    }

    public Calendar getBirthday() {//获取生日
        return this.birthday;
    }

    public void setSalary(int salary) {//设置薪水
        this.salary = salary;
    }

    public int getSalary() {//获取薪水
        return this.salary;
    }

}

/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 *
 *
 *
 *
 *
 *
 */
package com.heneylemonade.task01.entity;

import com.heneylemonade.task01.common.*;
import java.util.Calendar;

/**
 * description:员工类，包括基本信息及其set()与get()方法
 *
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/10/24 19:30
 * @since 1.1
 */

public class Staff {
    /**
     *员工姓名
     */
    private String name;
    /**
     *员工性别
     */
    private Gender gender;
    /**
     *员工出生日期
     */
    private Calendar birthday = Calendar.getInstance();
    /**
     *员工职位
     */
    private Position position;
    /**
     *员工薪水
     */
    private int salary;


    /**
     *带参数的构造方法
     */
    public Staff(String name, Gender gender, int year, int month, int date, Position position, int salary) {
        this.name = name;
        this.gender = gender;
        this.birthday.set(year, month - 1, date);
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(int year, int month, int date) {
        birthday.set(year, month, date);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

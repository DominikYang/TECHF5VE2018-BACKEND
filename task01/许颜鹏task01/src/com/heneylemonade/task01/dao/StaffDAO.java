/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 *
 *
 *
 *
 *
 *
 */
package com.heneylemonade.task01.dao;

import com.heneylemonade.task01.entity.Staff;
import com.heneylemonade.task01.common.*;
import com.heneylemonade.task01.validator.Check;
import java.util.ArrayList;

/**
 * description:改类用来进行数据处理，包括员工的增删改查
 *
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/10/24 19:30
 * @since 1.1
 */
public class StaffDAO {
    Check checker=new Check();
    public ArrayList<Staff> staffs = new ArrayList();
    /**
     * 增加员工
     */
    public void insertStaff(String name, Gender gender, int year, int month, int date, Position position, int salary) {
        if(!checker.staffCheck(position,salary))
            return;
        Staff temp = new Staff(name, gender, year, month, date, position, salary);
        staffs.add(temp);
    }
    /**
     * 删除员工
     */
    public void deleteStaff(int num){
        staffs.remove(num-1);
    }
    /**
     * 修改员工信息
     */
    public void updateStaff(int num,String name, Gender gender, int year, int month, int date, Position position, int salary){
        if(!checker.staffCheck(position,salary))
            return;
        checker.staffCheck(position,salary);
        staffs.get(num-1).setName(name);
        staffs.get(num-1).setGender(gender);
        staffs.get(num-1).setBirthday(year, month, date);
        staffs.get(num-1).setPosition(position);
        staffs.get(num-1).setSalary(salary);
    }
    /**
     * 查找员工信息
     */
    public void searchStaff(int num){
        System.out.println(staffs.get(num-1).getName());
        System.out.println(staffs.get(num-1).getGender().toString());
        System.out.println(staffs.get(num-1).getBirthday().getTime());
        System.out.println(staffs.get(num-1).getPosition().toString());
        System.out.println(staffs.get(num-1).getSalary());

    }

}

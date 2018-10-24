/*
 * Copyright (c) 2018 honeylemonade All Rights Reserved.
 *
 *
 *
 *
 *
 *
 */
package com.heneylemonade.task01.validator;

import com.heneylemonade.task01.common.*;
/**
 * description:用来判断职位与薪水是否匹配
 *
 * @author HoneyLemonade
 * @version V1.0
 * @date 2018/10/24 19:30
 * @since 1.1
 */
public class Check {
    public boolean staffCheck(Position position,int salary){
        switch (position){
            case MAJORDOMO:
                if(salary < 15000 || salary > 20000){
                    System.out.println("输入薪水有误,请重新输入薪水:");
                    return false;
                }
                break;
            case MANAGER:
                if(salary < 8000 || salary > 15000){
                    System.out.println("输入薪水有误,请重新输入薪水:");
                    return false;
                }
                break;
            case SUPERVISOR:
                if(salary < 6000 || salary > 8000){
                    System.out.println("输入薪水有误,请重新输入薪水:");
                    return false;
                }
                break;
            case WORKER:
                if(salary < 4000 || salary > 6000){
                    System.out.println("输入薪水有误,请重新输入薪水:");
                    return false;
                }
                break;
        }
        return true;
    }
}

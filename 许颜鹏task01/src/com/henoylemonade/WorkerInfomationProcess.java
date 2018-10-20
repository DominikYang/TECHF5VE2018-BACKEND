package com.henoylemonade;

import java.util.ArrayList;

/**
 * 类属性：无
 * 类方法：设置薪水的方法
 * 说明：该类继承了Worker类，并添加了构造方法
 * @auther 许颜鹏
 * @date 2018/10/18 10:30
 */
public class WorkerInfomationProcess {//构造方法中定义workers为Worker类的数组，运用了多态
    public ArrayList<Worker> workers = new ArrayList();


    public void insertMajordomo(String name, Gender gender, int year, int month, int date, int salary) {//插入Majordomo对象
        Worker temp = new Majordomo(name, gender, year, month, date, salary);
        workers.add(temp);
    }

    public void insertManager(String name, Gender gender, int year, int month, int date, int salary) {//插入Manager对象
        Worker temp = new Manager(name, gender, year, month, date, salary);
        workers.add(temp);
    }

    public void insertSupervisor(String name, Gender gender, int year, int month, int date, int salary) {//插入Supervisor对象
        Worker temp = new Supervisor(name, gender, year, month, date, salary);
        workers.add(temp);
    }

    public void insertStaff(String name, Gender gender, int year, int month, int date, int salary) {//插入Staff对象
        Worker temp = new Staff(name, gender, year, month, date, salary);
        workers.add(temp);
    }

    public void deleteWorker(int num) {//删除任意对象，所给num表示对象在数组中的索引
        workers.remove(num - 1);
    }

    public void modifyName(int num, String name) {//修改名字，num表示对象在数组中的索引，name表示要修改的名字
        workers.get(num - 1).setName(name);
    }

    public void modifyGender(int num, Gender gender) {//修改性别，num表示对象在数组中的索引，gender表示要修改的性别
        workers.get(num - 1).setGender(gender);
    }

    public void modifyBirthday(int num, int year, int month, int date) {//修改生日，num表示对象在数组中的索引，year表示年，month表示月，date表示日
        workers.get(num - 1).setBirthday(num, month, date);
    }

    public void modifySalary(int num, int salary) {//修改名字，num表示对象在数组中的索引，salary表示要修改的薪水
        workers.get(num - 1).setSalary(salary);
    }

    public void search(int num) {//根据索引搜索对象，并显示其信息
        System.out.println(workers.get(0).getName());
        System.out.println(workers.get(0).getGender());
        System.out.println(workers.get(0).getBirthday().getTime());
        System.out.println(workers.get(0).getPosition());
        System.out.println(workers.get(0).getSalary());
    }
}

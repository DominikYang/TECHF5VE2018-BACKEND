package dao;

import entity.Staff;
/*
实现员工增删改查功能的逻辑类
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaffCrud {
    public List<Staff> staffList=new ArrayList<Staff>();  //创建一个list来存放员工
    //此为日期的正则表达
    public  static String eL="(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)   \n" +
            "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29) ";
    /*
    用于添加员工成员
     */
    public boolean addStaff(Staff staff) {
        System.out.println("请输入该员工的编号：");
        Scanner in = new Scanner(System.in);
        String id = in.next();
        staff.setId(id);
        System.out.println("请输入该员工的姓名：");
        String name = in.next();
        staff.setName(name);
        while (true) {                                        //通过while循环提示用户输入正确的性别
            System.out.println("请输入该员工性别（男或女）：");
            String gender = in.next();
            if (gender.equals("男") || gender.equals("女")) {           //判断用户输入的是否是男或女
                staff.setGender(gender);
                break;
            } else {
                System.out.println("请输入“男”或“女”");
            }
        }
        while (true){                                          //通过while循环提示用户输入正确的日期格式
            System.out.println("请输入该员工生日（xxxx-xx-xx格式）：");
            String birthday = in.next();
            Pattern p = Pattern.compile(eL); //使用正则表达式判断日期格式是否正确
            Matcher m = p.matcher(birthday);
            if (m.matches()) {
            staff.setBirthday(birthday);
            break;
            }else{
            System.out.println("请输入xxxx-xx-xx格式！");
        }
    }
        while (true) {
            System.out.println("请选择该员工的职务：");
            System.out.println("1.总监");
            System.out.println("2.经理");
            System.out.println("3.主管");
            System.out.println("4.普通员工");
            int flag = in.nextInt();
            if (flag == 1) {
                staff.setPost("总监"); break;
            } else if (flag == 2) {
                staff.setPost("经理"); break;
            } else if (flag == 2) {
                staff.setPost("主管"); break;
            } else if (flag == 3) {
                staff.setPost("普通员工"); break;
            } else {
                System.out.println("请输入正确的数字");
            }
        }
        while(true){
            System.out.println("请输入该员工的薪水");
            System.out.println("总监薪水：15000-20000");
            System.out.println("经理薪水：8000-15000");
            System.out.println("主管薪水：6000-8000");
            System.out.println("员工薪水：4000-6000");
            int salary=in.nextInt();
            /*
            通过判断员工的职位来控制员工的收入
             */
            if(staff.getPost().equals("总监")){
                if(salary>=15000&&salary<=20000){
                    staff.setSalary(salary);
                    break;
                }else {
                    System.out.println("请注意提示输入正确的薪水！");
                }
            }
            if(staff.getPost().equals("经理")){
                if(salary>=8000&&salary<=15000){
                    staff.setSalary(salary);
                    break;
                }else {
                    System.out.println("请注意提示输入正确的薪水！");
                }
            }
            if(staff.getPost().equals("主管")){
                if(salary>=6000&&salary<=8000){
                    staff.setSalary(salary);
                    break;
                }else {
                    System.out.println("请注意提示输入正确的薪水！");
                }
            }
            if(staff.getPost().equals("普通员工")){
                if(salary>=4000&&salary<=6000){
                    staff.setSalary(salary);
                    break;
                }else {
                    System.out.println("请注意提示输入正确的薪水！");
                }
            }
        }
        for(int i=0;i<staffList.size();i++){                          //使用list遍历
            if(staff.getId().equals(staffList.get(i).getId())){
                System.out.println("添加失败！该编号员工已存在！");             //当添加已存在的id时输出已存在确保每位员工的唯一性
                return false;
            }
        }
        staffList.add(staff);
        System.out.println("添加成功！");
        return true;
    }
    /*
    用于删除员工成员
     */
    public void removeStaff(String id){
        for(int i=0;i<=staffList.size();i++){           //通过遍历list来删除list中的员工
            if(i==staffList.size()){
                System.out.println("删除失败！不存在该员工！");           //当不存在该员工时则删除失败
                break;
            }
            if (staffList.get(i).getId().equals(id)){
                Staff staff=new Staff();
                staff=staffList.get(i);
                staffList.remove(staff);
                System.out.println("删除成功！");
                break;
            }
        }
    }
    /*
    通过id编号的唯一性来修改员工信息
     */
    public void updateStaff(String id){
        int Flag1=0;           //设置变量来控制用户输入数据类型
        for(int i=0;i<=staffList.size();i++) {            //遍历list集合
            if(i==staffList.size()&&Flag1==0){                   //当遍历完整个list还未找到则输出不存在该员工
                System.out.println("该编号的员工不存在！");
                break;
            }
            if (id.equals(staffList.get(i).getId())) {
                System.out.println("请选择要修改的属性：");
                System.out.println("1.修改id");
                System.out.println("2.修改姓名");
                System.out.println("3.修改性别");
                System.out.println("4.修改出生日期");
                System.out.println("5.修改职务");
                System.out.println("6.修改薪水");
                Scanner in = new Scanner(System.in);
                try {
                    int flag = in.nextInt();                  //这里要捕获InputMismatchException
                    if (flag == 1) {
                        System.out.println("请输入修改后的id：");
                        String updateId = in.next();
                        staffList.get(i).setId(updateId);
                        System.out.println("修改成功");
                        break;
                    }
                    if (flag == 2) {
                        System.out.println("请输入修改后的名字：");
                        String name = in.next();
                        staffList.get(i).setName(name);
                        System.out.println("修改成功");
                        break;
                    }
                    if (flag == 3) {
                        System.out.println("请输入修改后的性别：");
                        String gender = in.next();
                        staffList.get(i).setGender(gender);
                        System.out.println("修改成功");
                        break;
                    }
                    if (flag == 4) {
                        int Flag2=0;             //设置变量控制循环 使用户输出正确的日期格式
                        while (true) {
                            System.out.println("请输入修改后的生日：");
                            String birthday = in.next();
                            Pattern p = Pattern.compile(eL); //使用正则表达式判断日期格式是否正确
                            Matcher m = p.matcher(birthday);
                            if (m.matches()) {
                                staffList.get(i).setBirthday(birthday);
                                break;
                            } else {
                                Flag2=1;
                                System.out.println("请输入xxxx-xx-xx格式！");
                            }
                        }
                        if (Flag2==0){
                            break;
                        }
                    }
                    if (flag == 5) {
                        System.out.println("请输入修改后的职务：");
                        String post = in.next();
                        staffList.get(i).setPost(post);
                        System.out.println("修改成功");
                        break;
                    }
                    if (flag == 6) {
                        System.out.println("请输入修改后的薪水：");
                        int salary = in.nextInt();
                        staffList.get(i).setSalary(salary);
                        System.out.println("修改成功");
                        break;
                    }
                }catch(InputMismatchException ex){
                    System.out.println("请输入正确的数据类型！");
                    Flag1=1;
                    break;
                }
            }
        }
    }
    /*
    用来打印所有员工信息 且每一个员工信息以一行打印
     */
    public void printStaffInformation(){
        System.out.println("以下为全部的员工信息：\n");
        for(int i=0;i<staffList.size();i++){
            System.out.print("id："+staffList.get(i).getId());
            System.out.print("  姓名："+staffList.get(i).getName());
            System.out.print("  性别："+staffList.get(i).getGender());
            System.out.print("  生日："+staffList.get(i).getBirthday());
            System.out.print("  职务："+staffList.get(i).getPost());
            System.out.println("  薪水："+staffList.get(i).getSalary()+"元");
        }
    }
    /*
    通过id来查找该员工信息
     */
    public void searchStaffById(String id){
        for(int i=0;i<=staffList.size();i++){
            if(i==staffList.size()){
                System.out.println("查询失败！不存在该员工！");   //当遍历完真个list还未找到则输出查找失败
                break;
            }
            if (staffList.get(i).getId().equals(id)){
                System.out.println("查询成功！");
                System.out.println("该员工信息如下：");
                System.out.print("id："+staffList.get(i).getId());
                System.out.print("  姓名："+staffList.get(i).getName());
                System.out.print("  性别："+staffList.get(i).getGender());
                System.out.print("  生日："+staffList.get(i).getBirthday());
                System.out.print("  职务："+staffList.get(i).getPost());
                System.out.println("  薪水："+staffList.get(i).getSalary()+"元");
                break;
            }
        }

    }
}

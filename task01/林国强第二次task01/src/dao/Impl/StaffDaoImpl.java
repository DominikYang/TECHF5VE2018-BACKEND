package dao.Impl;

import dao.StaffDao;
import entity.Staff;
import validation.Validate;
import view.StaffView;
/**
 * 实现员工信息增删改查接口
 *
 * @author linguoqiang
 * @version V1.0
 * @date 2018/10/24  16:00
 * @since 1.8
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaffDaoImpl implements StaffDao {
    private List<Staff> staffList=new ArrayList<Staff>(100);
    private StaffView staffView=new StaffView();
    private Validate validate=new Validate();
    public boolean addStaff(Staff staff) {
        System.out.println("请输入该员工的编号：");
        Scanner in = new Scanner(System.in);
        String id = in.next();
        System.out.println("请输入该员工的姓名：");
        String name = in.next();
        staff.setId(id);
        staff.setName(name);
        while (true) {
            System.out.println("请输入该员工性别（男或女）：");
            String gender = in.next();
            if(validate.genderValidate(gender)){
                staff.setGender(gender);
                break;
            }else{
                System.out.println("请输入男或女");
            }
        }
        while (true){
            System.out.println("请输入该员工生日（xxxx-xx-xx格式）：");
            String birthday = in.next();
            if(validate.dateValidate(birthday)){
                staff.setBirthday(birthday);  break;
            }else{
                System.out.println("请输入xxxx-xx-xx格式!");
            }
    }
        while (true) {
            staffView.postView();
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
            staffView.salaryView(); //显示薪水的区间
            int salary=in.nextInt();
            if(validate.salaryValidate(salary,staff)){
                staff.setSalary(salary);
                break;
            }else{
                System.out.println("请输入正确的工资！");
            }
        }
        for(int i=0;i<staffList.size();i++){
            if(staff.getId().equals(staffList.get(i).getId())){
                System.out.println("添加失败！该编号员工已存在！");
                return false;
            }
        }
        staffList.add(staff);
        System.out.println("添加成功！");
        return true;
    }
    public void removeStaff(String id){
        /**
         * 遍历该集合，查找是否存在该id的员工
         */
        for(int i=0;i<=staffList.size();i++){
            if(i==staffList.size()){
                System.out.println("删除失败！不存在该员工！");
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
    public void updateStaff(String id){
        for(int i=0;i<=staffList.size();i++) {
            if(i==staffList.size()){
                System.out.println("该编号的员工不存在！");
                break;
            }
            if (id.equals(staffList.get(i).getId())) {
                staffView.modifyView();    //显示修改界面
                Scanner in = new Scanner(System.in);
                try {
                    int flag = in.nextInt();
                    switch (flag) {
                        case 1:
                            System.out.println("请输入修改后的id：");
                            String updateId = in.next();
                            staffList.get(i).setId(updateId);
                            System.out.println("修改成功");
                            break;
                        case 2:
                            System.out.println("请输入修改后的名字：");
                            String name = in.next();
                            staffList.get(i).setName(name);
                            System.out.println("修改成功");
                            break;
                        case 3:
                            System.out.println("请输入修改后的性别：");
                            String gender = in.next();
                            staffList.get(i).setGender(gender);
                            System.out.println("修改成功");
                            break;
                        case 4:
                            int Flag = 0;
                            while (true) {
                                System.out.println("请输入修改后的生日：");
                                String birthday = in.next();
                                if(validate.dateValidate(birthday)){
                                    staffList.get(i).setBirthday(birthday);  break;
                                }else{
                                    System.out.println("请输入xxxx-xx-xx格式!");
                                }
                            }
                            if (Flag == 0) {
                                break;
                            }
                        case 5:
                            System.out.println("请输入修改后的职务：");
                            String post = in.next();
                            staffList.get(i).setPost(post);
                            System.out.println("修改成功");
                            break;
                        case 6:
                            System.out.println("请输入修改后的薪水：");
                            int salary = in.nextInt();
                            if(validate.salaryValidate(salary,staffList.get(i))){
                                staffList.get(i).setSalary(salary);
                                System.out.println("修改成功");
                            }else{
                                System.out.println("修改失败");
                            }
                            break;
                    }
                }catch(InputMismatchException ex){
                    System.out.println("请输入正确的数据类型！");
                }
            }
        }
    }
    public void printStaffInformation(){
        System.out.println("以下为全部的员工信息：\n");
        for(int i=0;i<staffList.size();i++){
            System.out.println(staffList.get(i).toString());  //通过lombok的toString重写方法打印
        }
    }
    public void searchStaffById(String id){
        for(int i=0;i<=staffList.size();i++){
            if(i==staffList.size()){
                System.out.println("查询失败！不存在该员工！");
                break;
            }
            if (staffList.get(i).getId().equals(id)){
                System.out.println(staffList.get(i).toString());  //通过lombok的toString重写方法打印
                break;
            }
        }

    }
}

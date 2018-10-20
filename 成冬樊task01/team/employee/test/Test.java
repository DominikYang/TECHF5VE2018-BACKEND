package team.employee.test;
import java.util.Scanner;
import team.employee.member.*;
import team.employee.ceo.*;
import team.employee.charge.*;
import team.employee.commonemployee.*;
import team.employee.manager.*;
/**
 * @author 成冬樊
 *
 */
public class Test{

    /**
     * 用数组存取数据
     * len表示长度，也就是数据数量
     */
    static int len = 0;
    static Member[] emp = new Member[100];
    static Scanner sc = new Scanner(System.in);
    //打印信息
    public void printEmployee(Member em) {
        System.out.println(" 姓名： " + em.getName());
        System.out.println(" 性别： " + em.getSex());
        System.out.println(" 职务： " + em.getPosition());
        System.out.println(" 出生日期 : " + em.getBirthday());
        System.out.println(" 工资：" + em.getSalary());
    }
    //增加的方法
    public void addEmployee() {
        Member em = null;
        System.out.println("增加员工");
        System.out.print("请输入员工姓名：");
        String name = sc.next();
        System.out.print("请输入员工性别：");
        String sex = sc.next();
        System.out.print("请输入员工职务(员工、主管、经理、总监)：");
        String position = sc.next();
        System.out.print("请输入员工出生日期：");
        String birthday = sc.next();
        System.out.print("请输入员工工资：");
        double salary = sc.nextDouble();

        //根据员工的职务不同，分为不同的类
        if(position.equals("员工")) {
            em = new CommonEmployee();
        } else if(position.equals("主管")) {
            em = new Charge();
        } else if(position.equals("经理")) {
            em = new Manager();
        } else if(position.equals("总监")) {
            em = new CEO();
        } else {
            System.out.println("输入不正确！");
        }
        em.setName(name);
        em.setSex(sex);
        em.setPosition(position);
        em.setBirthday(birthday);
        em.setSalary(salary);
        emp[++len] = em;
        printEmployee(emp[len]);
        System.out.println("添加成功！");
    }

    //删除的方法
    public void deleteEmployee() {
        System.out.println("删除员工");
        System.out.println("请输入员工姓名：");
        //设置一个查找的信号
        boolean sign = false;
        String name = sc.next();
        for(int i=0; i<=len; i++) {
            //删除指定1数组元素
            if(emp[i].getName().equals(name)) {
                printEmployee(emp[i]);
                for(int j=i; j<=len; j++) {
                    emp[j] = emp[j+1];
                }
                emp[len] = null;
                len--;
                System.out.println("删除成功！");
                sign = true;
                break;
            }
        }
        if(!sign) {
            System.out.println("查无此人，请重新输入：");
            deleteEmployee();
        }
    }
    //修改的方法
    public void updateEmployee() {
        System.out.println("修改员工");
        System.out.println("请输入员工姓名：");
        //设置一个信号，判断数组里有没有要找的数据
        boolean sign = false;
        String name = sc.next();
        for(int i=0; i<=len; i++) {
            if(emp[i].getName().equals(name)) {
                printEmployee(emp[i]);
                System.out.println("按顺序填写：");
                System.out.print("请输入姓名：");
                emp[i].setName(sc.next());
                System.out.print("请输入性别：");
                emp[i].setSex(sc.next());
                System.out.print("请输入职务(员工、主管、经理、总监)：");
                emp[i].setPosition(sc.next());
                System.out.print("请输入出生日期：");
                emp[i].setBirthday(sc.next());
                System.out.print("请输入工资：");
                break;
            }
        }
        if(!sign) {
            System.out.println("查无此人，请重新输入：");
            updateEmployee();
        }
    }
    //查找的方法
    public void findEmployee() {
        System.out.println("查找员工");
        System.out.println("请输入员工姓名：");
        //设置一个查找的信号，判断数组里有没有要找的数据
        boolean sign = false;
        String name = sc.next();
        for( int i=0; i<=len; i++) {
            if(emp[i].getName().equals(name)) {
                printEmployee(emp[i]);
                System.out.println("查找成功！");
                sign = true;
                break;
            }
        }
        if(!sign) {
            System.out.println("查无此人，请重新输入：");
            findEmployee();
        }
    }



    public static void main(String[] args) {

        Test t = new Test();



        //业务选择
        label : while(true) {
            System.out.println("请选择业务：");
            System.out.println("1. 增加 ");
            System.out.println("2. 删除 ");
            System.out.println("3. 修改 ");
            System.out.println("4. 查询 ");
            System.out.println("0. 退出 ");
            int select = sc.nextInt();
            switch (select) {
                case 1: //添加
                    t.addEmployee();
                    break;
                case 2: //删除
                    t.deleteEmployee();
                    break;
                case 3: //修改
                    t.updateEmployee();
                    break;
                case 4: //查找
                    t.findEmployee();
                    break;
                case 0: //退出
                    System.out.println("退出成功！");
                    break label;

                default:
                    System.out.println("数字不正确！");
                    break;
            }
        }
    }

}

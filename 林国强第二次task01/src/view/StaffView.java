package view;
/**
 * 实现该系统的视图层
 *
 * @author linguoqiang
 * @version V1.0
 * @date 2018/10/24  16:20
 * @since 1.8
 */
public class StaffView {
    /**
     * 显示主界面
     */
    public void View(){
        System.out.println("****欢迎来到员工信息管理系统****");
        System.out.println("********请选择您的操作********");
        System.out.println("*********1.添加员工**********");
        System.out.println("*********2.删除员工**********");
        System.out.println("*********3.更改员工信息******");
        System.out.println("*********4.查询员工**********");
        System.out.println("*********5.显示信息**********");
        System.out.println("*********6.退出系统**********");
    }

    /**
     * 显示修改界面
     */
    public void modifyView(){
        System.out.println("请选择要修改的属性：");
        System.out.println("1.修改id");
        System.out.println("2.修改姓名");
        System.out.println("3.修改性别");
        System.out.println("4.修改出生日期");
        System.out.println("5.修改职务");
        System.out.println("6.修改薪水");
    }

    /**
     * 显示薪水提示界面
     */
    public void salaryView(){
        System.out.println("请输入该员工的薪水");
        System.out.println("总监薪水：15000-20000");
        System.out.println("经理薪水：8000-15000");
        System.out.println("主管薪水：6000-8000");
        System.out.println("员工薪水：4000-6000");
    }

    /**
     * 显示职位选择界面
     */
    public void postView(){
        System.out.println("请选择该员工的职务：");
        System.out.println("1.总监");
        System.out.println("2.经理");
        System.out.println("3.主管");
        System.out.println("4.普通员工");
    }

}

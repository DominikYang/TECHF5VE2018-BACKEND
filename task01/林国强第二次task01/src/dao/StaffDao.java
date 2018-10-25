package dao;

import entity.Staff;

/**
 *员工信息接口
 *
 * @author linguoqiang
 * @version V1.0
 * @date 2018/10/24 15:56
 * @since 1.8
 */

public interface StaffDao {

     boolean addStaff(Staff staff);    //增加员工

     void removeStaff(String id);      //删除员工

     void updateStaff(String id);      //修改员工属性

     void printStaffInformation();      //输出打印所有员工信息

     void searchStaffById(String id);    //通过id查找某一个员工
}

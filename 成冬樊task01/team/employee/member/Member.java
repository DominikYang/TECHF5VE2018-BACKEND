
package team.employee.member;

/**
 * @author 成冬樊
 *
 */
public class Member {

    /**
     * 成员属性:姓名，性别，出生日期，职务，工资
     */
    private String name;
    private String sex;
    private String birthday;
    private String position;
    private double salary;




    public String getName() {              //get
        return name;
    }                                       //姓名

    public void setName(String name) {      //set
        this.name = name;
    }

    public String getSex() {                 //get
        return sex;
    }                                         //性别

    public void setSex(String sex) {         //set
        this.sex = sex;
    }

    public String getPosition() {             //get
        return position;
    }                                           //职务

    public void setPosition(String position) {   //set
        this.position = position;
    }

    public String getBirthday() {               //get
        return birthday;
    }                                          //出生日期

    public void setBirthday(String birthday) {   //set
        this.birthday = birthday;
    }

    public double getSalary() {                    //get
        return salary;
    }                                               //工资

    public void setSalary(double salary){          //set
        this.salary = salary;
    }



    public String toString() {
        return "姓名：" + name + ", 性别：" + sex + ", 出生日期：" + birthday
                + ", 职务：" + position + ", 工资：" + salary;
    }

}

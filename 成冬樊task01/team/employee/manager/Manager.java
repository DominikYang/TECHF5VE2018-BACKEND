package team.employee.manager;

import team.employee.member.Member;

public class Manager extends Member {

    //工资范围
    public void setSalary(double salary) {
        if (salary > 8000 && salary < 15000) {
            super.setSalary(salary);
        }
    }

}

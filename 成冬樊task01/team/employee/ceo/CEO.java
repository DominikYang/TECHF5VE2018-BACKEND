package team.employee.ceo;

import team.employee.member.Member;

public class CEO extends Member {

    //工资范围
    public void setSalary(double salary) {
        if (salary > 15000 && salary < 20000) {
            super.setSalary(salary);
        }
    }
}

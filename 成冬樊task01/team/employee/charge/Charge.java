package team.employee.charge;

import team.employee.member.Member;

public class Charge extends Member {

     //工资范围
    public void setSalary(double salary) {
        if (salary > 6000 && salary < 8000) {
            super.setSalary(salary);
        }

    }

}


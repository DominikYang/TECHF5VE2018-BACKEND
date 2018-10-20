package team.employee.commonemployee;
import team.employee.member.Member;

public class CommonEmployee extends Member{

            //工资范围
        public void setSalary(double salary) {
            if (salary > 4000 && salary < 6000) {
                super.setSalary(salary);
            }
        }
}




package validation;

import entity.Staff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证信息正确性
 * @author linguoqiang
 * @version V1.0
 * @date 2018/10/24  17:20
 * @since 1.8
 */
public class Validate {

        /*
        校验薪水的合法性
         */
        public boolean salaryValidate(int salary, Staff staff){
            if(staff.getPost().equals("总监")){
                if(salary>=15000&&salary<=20000){
                    return true;
                }else {
                    return false;
                }
            }
            if(staff.getPost().equals("经理")){
                if(salary>=8000&&salary<=15000){
                    return true;
                }else {
                    return false;
                }
            }
            if(staff.getPost().equals("主管")){
                if(salary>=6000&&salary<=8000){
                    return true;
                }else {
                   return false;
                }
            }
            if(staff.getPost().equals("普通员工")){
                if(salary>=4000&&salary<=6000){
                    return true;
                }else {
                   return false;
                }
            }
            return true;
        }
        /*
        校验性别的合法性
         */
        public boolean genderValidate(String gender){
            if (gender.equals("男") || gender.equals("女")) {
                return true;
            } else {
                return false;
            }
        }
        /*
        校验生日日期的合法性
         */
        public boolean dateValidate(String date){
            //用于正则表达式验证日期
            String eL="(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)   \n" +
                    "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29) ";

            Pattern p = Pattern.compile(eL); //使用正则表达式判断日期格式是否正确
            Matcher m = p.matcher(date);
            if (m.matches()) {
                return true;
            }else{
               return false;
            }
        }
}


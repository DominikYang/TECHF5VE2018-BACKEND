package entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

/**
 *员工的实体类，进行属性的封装
 *
 * @author linguoqiang
 * @version V1.0
 * @date 2018/10/24 15.50
 * @since 1.8
 */
@NoArgsConstructor  //使用lombok生成无参构造函数
@Data   //使用lombok
public class Staff {
    @NonNull                    //检查这个域的值是否为空
    private String name;     //员工的姓名
    @NonNull
    private String gender;    //员工的性别
    @NonNull
    private String birthday;   //员工的生日
    @NonNull
    private String post;     //员工的职位
    @NonNull
    private int salary;     //员工的薪水
    @NonNull
    private String id;  //设置员工编号，确定某个员工的唯一性
}

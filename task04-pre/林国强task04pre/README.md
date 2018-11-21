##*Task04 -前期测试*

在task04开始之前，我们先做一些简单的测试

+假设现在有一张user表，user表有如下字段：

id（int），name（varchar），email（varchar），password（varchar），phone（varchar）

请写出增加用户，删除用户，查询用户信息，修改用户信息对应的sql语句

增加：insert into user(id,name,email,password,phone)

values(?,?,?,?,?)

删除：delete 

from user

where id=?

查询：select *

from user

where id=?

修改：update user

set name=?

where name?


+现在有一数组，请写出方法去掉其中的重复元素 样例输入： [1,1,1,2,2,2,3,3,4,4,5,6] 样例输出： [1,2,3,4,5,6]

答：
```
/**
 * @program: Task04Pre
 * @description: 对数组元素进行去重
 * @author: Lin
 * @create: 2018-11-20 18:54
 **/
public class ArrayTest {
     static int[] array={1,1,1,2,2,2,3,3,4,4,5,6};
    public static void main(String[] args) {
        Set set=new HashSet();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set.toString());
    }
}
```

+请简述重载和重写的区别

答：Java的方法重载，就是在类中可以创建多个方法，它们具有相同的名字，但具有不同的参数和不同的定义。

调用方法时通过传递给它们的不同参数个数和参数类型来决定具体使用哪个方法。

    Java方法重写（覆盖），就是若子类中的方法与父类中的某一方法具有相同的方法名、返回类型和参数表且子类想对该方法重新编写，则子类的新方法将覆盖原有父类的方法。
	
+请简述“==” 和 equals（）的区别

答：==比较的是栈中的内容地址，即两个对象的地址是否相同。equals比较的是堆中的内容是否相等，即两个对象的内容是否相等。

请简述StringBuffer和StringBuilder的区别

答：

    String是不可变字符串，StringBuilder是可变字符串且效率高，但是线程不安全。
	
     StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
	 
   当String被修改时会新new一个String然后把原来的String回收，所以StringBuilder在对字符串进行修改时速度比String快。
   
#*请以markdown形式提交你的答案，在这篇文档的基础上进行答题（代码也写里面），注意markdown的书写格式*
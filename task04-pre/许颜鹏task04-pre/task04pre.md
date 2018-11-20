# Task04 -前期测试


+  假设现在有一张user表，user表有如下字段：
    
    id（int），name（varchar），email（varchar），password（varchar），phone（varchar）
    
     请写出增加用户，删除用户，查询用户信息，修改用户信息对应的sql语句

答：
  首先创建表，此过程中**将id设为主键**，并设置id**递增**。
 表中初始数据为:


 |id|name|email|password|phone|  
 |--|----|-----------|-----|----|  
 |1 |小红|123@163.com|123	|123|  
 |2 |小绿|321@163.com|321	|321|  
 |3 |小白|456@163.com|456	|456|  
 |4 |小黑|654@163.com|654	|654|  


执行SQL语句：
INSERT INTO user ( NAME, email, PASSWORD, phone )
VALUES
	( "小添加", '789@163.com', '789', '789' );

变为：


|id|name|email|password|phone|  
 |--|----|-----------|-----|----|  
 |1 |小红|123@163.com|123	|123|  
 |2 |小绿|321@163.com|321	|321|  
 |3 |小白|456@163.com|456	|456|  
 |4 |小黑|654@163.com|654	|654|  
 |5	|小添加|789@163.com|789 |789|  


+ 现在有一数组，请写出方法去掉其中的重复元素
    样例输入： [1,1,1,2,2,2,3,3,4,4,5,6]
    样例输出： [1,2,3,4,5,6]

答：
``` java
import java.util.ArrayList;

public class arrydemo {
    public static void main(String[] args) {
        //定义未去重数组
        int[] originalArray = {1,1,1,2,2,2,3,3,4,4,5,6};
        //定义去重后的数组
        ArrayList<Integer> finallArray = new ArrayList<>();
        //循环遍历未去重数组元素，若finallArray中不包含次元素则添加
        for (int i = 0; i < originalArray.length; i++) {
            if (!finallArray.contains(originalArray[i])) {
                finallArray.add(originalArray[i]);
            }
        }
        System.out.println(finallArray);
    }
}
```


+ 请简述重载和重写的区别
+ 请简述“==” 和 equals（）的区别
+ 请简述StringBuffer和StringBuilder的区别

答：


#### 重载：


重载是指方法名相同，但方法所需参数不同，根据方法获得的不同参数，同名方法就可以做出相应的处理，是一种多态的表现形式。


#### 重写：


而重写是指子类对父类方法内部实现的重新定义，但是前提是方法的返回值和参数列表不能改变，子类可以根据需要，重写父类的方法。


#### ==：


基本数据类型(注意:不包含String)使用 == 时，比较的是他们的值。
而类使用 == 时，比较的是地址。


#### equals()：


equals()本是Object类中的方法，用于比较是否有相同地址，但有些子类对其进行了重写，例如String，String的equals()方法用于比较内容是否相同，而非地址
。


#### StringBuffer：


StringBuffer中方法可以带有synchronized关键字，可以保证线程安全，但是效率慢。


#### StringBuilder:


StringBuilder的方法则没有synchronized该关键字，所以不能保证线程安全，但是效率快。
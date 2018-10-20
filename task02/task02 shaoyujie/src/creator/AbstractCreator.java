package creator;

 /*³éÏó¹¤³§
 * @author VCEtwp
 * @version 1.8
 * @createTime 2018.10.20
 */

import staff.Staff;


public abstract class AbstractCreator {
   
    public abstract Staff createProductChief(String name,String sex,String birthTime,int salary); 
    
    public abstract Staff createProductEmployee(String name,String sex,String birthTime,int salary);
    
    public abstract Staff createProductManager(String name,String sex,String birthTime,int salary);
    
    public abstract Staff createProduteorSupervisor(String name,String sex,String birthTime,int salary);
}
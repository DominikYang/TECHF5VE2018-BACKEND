package staff.factory;

 import staff.entity.Staff;


public abstract class AbstractCreator {
   
    public abstract Staff createProductChief(String name,String sex,String birthTime,int salary); 
    
    public abstract Staff createProductEmployee(String name,String sex,String birthTime,int salary);
    
    public abstract Staff createProductManager(String name,String sex,String birthTime,int salary);
    
    public abstract Staff createProduteorSupervisor(String name,String sex,String birthTime,int salary);
}

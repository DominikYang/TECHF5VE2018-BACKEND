package creator;
import staff.Chief;
import staff.Employee;
import staff.Manager;
import staff.Staff;
import staff.Supervisor;

/*
 *  ����ʵ�ʴ���Ա��ʵ�����������нˮ���ò�ͬ�Ĵ�������
 * @author VCEtwp
 * @version 1.8
 * @createTime 2018.10.20
 */
public class ConcreteCreator extends AbstractCreator{
	public Staff createStaff(String name,String sex,String birthTime,int salary) {
	if(salary<=20000&&salary>=15000) {
		return createProductChief(name,sex,birthTime,salary);
	}else if (salary<15000&&salary>=8000) {
			return createProductManager(name,sex,birthTime,salary);
		}else if(salary<8000&&salary>=6000){
			return createProduteorSupervisor(name,sex,birthTime,salary);
		}else if (salary<6000&&salary>=4000) {
			return createProductEmployee(name,sex,birthTime,salary);
		}else {
			System.out.println("�����нˮ����");
			return null;
		}
	
	}

	@Override
	public Staff createProductChief(String name,String sex,String birthTime,int salary) {
		
		return new Chief().createChief(name,sex,birthTime,salary);
	}


	@Override
	public Staff createProductEmployee(String name,String sex,String birthTime,int salary) {
		
		return new Employee().createEmployee(name,sex,birthTime,salary);
	}

	@Override
	public Staff createProductManager(String name,String sex,String birthTime,int salary) {
		
		return new Manager().createManager(name,sex,birthTime,salary);
	}

	@Override
	public Staff createProduteorSupervisor(String name,String sex,String birthTime,int salary) {
		
		return new Supervisor().createSupervisor(name,sex,birthTime,salary);
	}

}

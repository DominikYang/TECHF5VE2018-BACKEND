package controller;
/*�������Ա������
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;
public class FindStaff {
	public void findStaff() {
		String key;//�ݴ������ؼ���
		boolean exist=false;//�洢�Ƿ�����������
		int num;//����staffList�ļ�����
		Scanner in=new Scanner(System.in);
		
		for (num = 0; num < Control.staffList.size(); num++) {
			System.out.print("��ţ�"+num+1+"   ");
			System.out.print("������"+Control.staffList.get(num).getName()+"   ");
			System.out.print("�Ա�"+Control.staffList.get(num).getSex()+"   ");
			System.out.print("�������ڣ�"+Control.staffList.get(num).getBirthTime()+"   ");
			System.out.print("ְλ��"+Control.staffList.get(num).getPosition()+"   ");
			System.out.println("нˮ��"+Control.staffList.get(num).getSalary()+"   ");
		}
		System.out.println("�����������ؼ���");
		key=in.next();
		for (num = 0; num < Control.staffList.size(); num++) {
			if(key.equals(Control.staffList.get(num).getName())||key.equals(Control.staffList.get(num).getSex())||key.equals(Control.staffList.get(num).getBirthTime())||key.equals(Control.staffList.get(num).getPosition()))
			{
			exist=true;
			System.out.print("��ţ�"+num+1+"   ");
			System.out.print("������"+Control.staffList.get(num).getName()+"   ");
			System.out.print("�Ա�"+Control.staffList.get(num).getSex()+"   ");
			System.out.print("�������ڣ�"+Control.staffList.get(num).getBirthTime()+"   ");
			System.out.print("ְλ��"+Control.staffList.get(num).getPosition()+"   ");
			System.out.println("нˮ��"+Control.staffList.get(num).getSalary()+"   ");
			}
		}
		if (!exist) {
			System.out.println("δ�������������");
		}
	}
}

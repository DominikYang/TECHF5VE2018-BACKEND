package controller;
/*�����޸�Ա������
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;
public class EditStaff {
	public void editStaff() {
		int num;//����staffList�ļ�����
		int key;//�����洢�������
		int NO;//�����洢����Ա�����
		for (num = 0; num < Control.staffList.size(); num++) {
			System.out.print("��ţ�"+num+1+"   ");
			System.out.print("������"+Control.staffList.get(num).getName()+"   ");
			System.out.print("�Ա�"+Control.staffList.get(num).getSex()+"   ");
			System.out.print("�������ڣ�"+Control.staffList.get(num).getBirthTime()+"   ");
			System.out.print("ְλ��"+Control.staffList.get(num).getPosition()+"   ");
			System.out.println("нˮ��"+Control.staffList.get(num).getSalary()+"   ");
		}
		System.out.println("��ѡ��Ҫ�༭�ı��");
		Scanner in=new Scanner(System.in);
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("����������������롣");
			}
			NO=in.nextInt();
			System.out.println("��ѡ���޸����ݣ�");
			System.out.println("1.����");
			System.out.println("2.�Ա�");
			System.out.println("3.��������");
			System.out.println("4.ְλ");
			System.out.println("5.нˮ");
			System.out.println("�������ּ�ȡ������");
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("����������������롣");
			}
			key=in.nextInt();
			switch (key) {
			case 1:
				System.out.println("������޸ĺ�����");
				Control.staffList.get(NO-1).setName(in.next());
				break;

			case 2:
				System.out.println("������޸ĺ�����");
				Control.staffList.get(NO-1).setSex(in.next());
				break;
				
			case 3:
				System.out.println("������޸ĺ�����");
				Control.staffList.get(NO-1).setBirthTime(in.next());
				break;
				
			case 4:
				System.out.println("������޸ĺ�����");
				Control.staffList.get(NO-1).setPosition(in.next());
				break;
				
			case 5:
			System.out.println("������޸ĺ�����");
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("��������Ч����");
			}
			Control.staffList.get(NO-1).setSalary(in.nextInt());
			break;
			}
	}
}

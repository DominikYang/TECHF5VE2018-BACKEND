package controller;
/*����ɾ��Ա������
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;
public class DeleteStaff {
	public void deleteStaff() {
		int num;//����staffList�ļ�����
		int key;//�����洢Ҫɾ���ı��
		for (num = 0; num < Control.staffList.size(); num++) {//�ȱ���ѭ�����һ��
			System.out.print("��ţ�"+num+1+"   ");
			System.out.print("������"+Control.staffList.get(num).getName()+"   ");
			System.out.print("�Ա�"+Control.staffList.get(num).getSex()+"   ");
			System.out.print("�������ڣ�"+Control.staffList.get(num).getBirthTime()+"   ");
			System.out.print("ְλ��"+Control.staffList.get(num).getPosition()+"   ");
			System.out.println("нˮ��"+Control.staffList.get(num).getSalary()+"   ");
		}
		System.out.println("��ѡ��Ҫɾ���ı��");
		Scanner in=new Scanner(System.in);
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("����������������롣");
			}
			key=in.nextInt();
			Control.staffList.remove(key-1);
			System.out.println("ɾ���ɹ�");
	}
}

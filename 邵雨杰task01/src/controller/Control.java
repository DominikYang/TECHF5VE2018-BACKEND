package controller;
/*�������ڣ���ȡ�û��Ĳ���
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import staff.Staff;;
public class Control {
	public static List<Staff> staffList=new ArrayList<Staff>(); //�洢Ա��
public static void main(String[] args) {
	int key;//���ڴ洢ѡ����
	System.out.println("Ա������ϵͳ");
	for(;;) {
	System.out.println("1.����Ա��");
	System.out.println("2.ɾ��Ա��");
	System.out.println("3.����Ա��");
	System.out.println("4.�༭Ա��");
	System.out.println("5.�˳�");
	Scanner in=new Scanner(System.in);
	while(!in.hasNextInt()) {
		in.next();
		System.out.println("����������������롣");
	}
	key=in.nextInt();
	switch (key) {
	case 1:
		new CreateStaff().createStaff();
		System.out.println("��ӳɹ�");
		break;

	case 2:
		new DeleteStaff().deleteStaff();
		System.out.println("ɾ���ɹ�");
		break;
		
	case 3:
		new FindStaff().findStaff();
		break;
		
	case 4:
		new EditStaff().editStaff();
		System.out.println("�޸ĳɹ�");
		break;
		
	case 5:
		System.exit(0);
		
		default:
			System.out.println("��������Ч����");
	}
	
	
		
}
}
}
package controller;
/*���𴴽�Ա���������ô�������
* @author VCEtwp
* @version 1.8
* @createTime 2018.10.20
*/
import java.util.Scanner;

import creator.ConcreteCreator;
import staff.Staff;;;
public class CreateStaff {
	public void createStaff() {
		Staff theNew;
		 String name; 		//����
		 String sex;	 	//�Ա�
		 String birthTime;	//����
		 int salary;		//нˮ
		System.out.println("������Ա������");
		Scanner in=new Scanner(System.in);
		name=in.next();
		
		System.out.println("������Ա���Ա�");
		sex=in.next();
		while(!sex.equals("��")&&!sex.equals("Ů")) {
			System.out.println("��������������л�Ů��");
			sex=in.next();
		}
		
		System.out.println("������Ա������ ��19001230��ʽ����");
		birthTime=in.next();
		while(birthTime.length()!=8) {
			System.out.println(birthTime.length());
			System.out.println("��ʽ����");
			birthTime=in.next();
		}
			System.out.println("������Ա��нˮ");
			while(!in.hasNextInt()) {
				in.next();
				System.out.println("�������������һ������");
			}
			salary=in.nextInt();
			theNew=new ConcreteCreator().createStaff(name,sex,birthTime,salary);
			if(theNew!=null) {
			Control.staffList.add(theNew);
			}
		}
	}


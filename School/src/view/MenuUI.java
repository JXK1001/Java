package view;

import java.util.Scanner;

import entity.Student;

public class MenuUI {
	public static void show(Student student){
		System.out.println("1-�޸����룻2-ѡ��γ̣�3����ѯ�γ�;0-�˳�");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			ModifyPasswordUI.show();
			break;
		case 2:
			SCUi.show(student);
			break;
		case 3:
			SCUi.showSc(student);
			break;
		case 0:
			System.out.println("�˳�ϵͳ");
			break;
		
		}
	}

}

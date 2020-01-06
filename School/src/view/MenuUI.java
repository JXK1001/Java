package view;

import java.util.Scanner;

import entity.Student;

public class MenuUI {
	public static void show(Student student){
		System.out.println("1-修改密码；2-选择课程；3：查询课程;0-退出");
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
			System.out.println("退出系统");
			break;
		
		}
	}

}

package view;
import biz.StudentBiz;
import java.util.Scanner;
import dao.StudentDao;
public class ModifyPasswordUI {
	public static void show() {
		Scanner scanner = new Scanner(System.in);
		String studentNo;
		String oldPassword;
		String new1;
		String new2;
		System.out.println("������ѧ�ţ�");
		scanner = new Scanner(System.in);
		studentNo = scanner.nextLine();
		System.out.println("����������룺");
		scanner = new Scanner(System.in);
		oldPassword = scanner.nextLine();
		System.out.println("�����������룺");
		new1 = scanner.nextLine();
		System.out.println("���ٴ��������룺");
		new2 =scanner.nextLine();
		StudentBiz studentBiz = new StudentBiz();
		studentBiz.modifyPassword(studentNo,oldPassword,new1,new2);
	}
}

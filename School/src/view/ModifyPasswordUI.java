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
		System.out.println("求输入学号：");
		scanner = new Scanner(System.in);
		studentNo = scanner.nextLine();
		System.out.println("请输入旧密码：");
		scanner = new Scanner(System.in);
		oldPassword = scanner.nextLine();
		System.out.println("请输入新密码：");
		new1 = scanner.nextLine();
		System.out.println("请再次输入密码：");
		new2 =scanner.nextLine();
		StudentBiz studentBiz = new StudentBiz();
		studentBiz.modifyPassword(studentNo,oldPassword,new1,new2);
	}
}

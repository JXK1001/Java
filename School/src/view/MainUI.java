package view;

import java.util.Scanner;

public class MainUI {
	public static void show() {
		System.out.println("1-ע�᣻2-��¼��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			RegisterUI.show();
			break;
		case 2:
			LoginUI.show();
			break;
		}
	}
}

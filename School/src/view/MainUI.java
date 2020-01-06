package view;

import java.util.Scanner;

public class MainUI {
	public static void show() {
		System.out.println("1-×¢²á£»2-µÇÂ¼£»0-ÍË³ö");
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

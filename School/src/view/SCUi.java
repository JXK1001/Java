package view;

import java.util.HashMap;
import java.util.Scanner;

import dao.SCDao;
import entity.IEntity;
import entity.SC;
import entity.Student;
import biz.StudentBiz;

public class SCUi {
	public static void show(Student student) {
		HashMap<String, IEntity> allSc=SCDao.getInstance().getAllEntities();
		System.out.println("请选择课程：");
		for(String key:allSc.keySet()){
			SC scBean=(SC) allSc.get(key);
			System.out.println(scBean.getCourseNo());
		}
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		SC chose=(SC) allSc.get(option);
		student.setSc(chose);
		System.out.println("选择了"+chose.getCourseNo());
		MenuUI.show(student);
	}
	public static void showSc(Student student){
		SC sc=student.getSc();
		System.out.println(student.getStudentName()+"选择了"+sc.getCourseNo());
		MenuUI.show(student);
	}
	
	
		
}

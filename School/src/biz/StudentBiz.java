package biz;

import dao.StudentDao;
import entity.IEntity;
import entity.Student;
import view.MainUI;
import view.MenuUI;
import view.ModifyPasswordUI;

public class StudentBiz {
	StudentDao studentDao;
	private Student student;
	//登录
	public void login(String studentNo, String studentPassword) {

		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("用户不存在");
			return;
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("登录成功");
			MenuUI.show(student);
		} else {
			System.out.println("密码不正确");
			MainUI.show();
		}

	}
	//注册，业务逻辑实现
	public void register(String studentNo, 
						String studentName, 
						String studentGender, 
						int studentAge, 
						String studentDepartment, 
						String firstPassword, 
						String secondPassword) {
		if(firstPassword.equals(secondPassword)) {
			student = new Student();
			student.setStudentNo(studentNo);
			student.setStudentName(studentName);
			student.setStudentAge(studentAge);
			student.setStudentDepartment(studentDepartment);
			student.setStudentPassword(firstPassword);
			studentDao = StudentDao.getInstance();
			studentDao.insert(student);
			System.out.println("注册成功！");
			MenuUI.show(student);
		}else {
			System.out.println("注册失败！");
			MainUI.show();
		}
	}
	
	//改密逻辑层
		public void modifyPassword( String studentNo,
									String oldPassword,
									String new1,
									String new2){
			StudentDao studentDao = StudentDao.getInstance();
			student = (Student) studentDao.getEntity(studentNo);
			
			if(student.getStudentPassword().equals(oldPassword)){
				
				if(new1.equals(new2)){
					studentDao.update(student);
					System.out.println("修改成功!");
					MainUI.show();
			}else{
				System.out.println("两次输入的密码不一致！");
				ModifyPasswordUI.show();				
				}
			}else{
				System.out.println("旧密码输入不正确！");
				ModifyPasswordUI.show();
			
		}
	}
}

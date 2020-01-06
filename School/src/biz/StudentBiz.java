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
	//��¼
	public void login(String studentNo, String studentPassword) {

		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("�û�������");
			return;
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("��¼�ɹ�");
			MenuUI.show(student);
		} else {
			System.out.println("���벻��ȷ");
			MainUI.show();
		}

	}
	//ע�ᣬҵ���߼�ʵ��
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
			System.out.println("ע��ɹ���");
			MenuUI.show(student);
		}else {
			System.out.println("ע��ʧ�ܣ�");
			MainUI.show();
		}
	}
	
	//�����߼���
		public void modifyPassword( String studentNo,
									String oldPassword,
									String new1,
									String new2){
			StudentDao studentDao = StudentDao.getInstance();
			student = (Student) studentDao.getEntity(studentNo);
			
			if(student.getStudentPassword().equals(oldPassword)){
				
				if(new1.equals(new2)){
					studentDao.update(student);
					System.out.println("�޸ĳɹ�!");
					MainUI.show();
			}else{
				System.out.println("������������벻һ�£�");
				ModifyPasswordUI.show();				
				}
			}else{
				System.out.println("���������벻��ȷ��");
				ModifyPasswordUI.show();
			
		}
	}
}

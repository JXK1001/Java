 package dao;
import entity.IEntity;
import entity.Student;

import java.util.HashMap;

public class StudentDao implements IDao {

	private static StudentDao instance;
	private HashMap<String, IEntity> students;
	private Student student;
	private StudentDao() {
		students = new HashMap<String, IEntity>();
		student = new Student();
		
		student.setStudentNo("164801001");
		student.setStudentName("����");
		student.setStudentGender("��");
		student.setStudentPassword("123456");
		student.setStudentAge(20);
		student.setStudentDepartment("���ѧԺ");
		students.put(student.getStudentNo(), student);
	}
	public static StudentDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new StudentDao();
					return instance;
				}
			}
		}
		return instance;
	}
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}

	public void delete(IEntity entity) {
		// TODO Auto-generated method stub
		Student st = (Student)entity;
		students.remove(st);
	}
	public void update(IEntity entity) {
		// TODO Auto-generated method stub
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}

	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return students;
	}

	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub		
		return students.get(Id);
	}

}

package dao;
import entity.IEntity;
import entity.Student;

import java.util.HashMap;
import entity.Course;

public class CourseDao implements IDao {
	private HashMap<String, IEntity> course; 

	private static CourseDao instance;
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		Course  cr=(Course) entity;
		course.put(cr.getCourseNo(), cr);
	}

	public void delete(IEntity entity) {
		// TODO Auto-generated method stub
		Course  cr=(Course) entity;
		course.remove(cr);
	}

	public void update(IEntity entity) {
		// TODO Auto-generated method stub
		Course  cr=(Course) entity;
		course.put(cr.getCourseNo(), cr);
	}
	public HashMap<String, entity.IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return course;
	}

	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return null;
	}
	public static CourseDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new CourseDao();
					return instance;
				}
			}
		}
		return instance;
	}

}

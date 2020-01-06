package biz;
import dao.StudentDao;
import entity.Course;
import entity.IEntity;
import entity.Student;
import view.MainUI;
import dao.CourseDao;
import java.util.HashMap;
import  dao.*;
public class CourseBiz {
	private HashMap<String, IEntity> course;
	CourseDao courseDao = CourseDao.getInstance();
	
	public void addACourse(){
		
		course = courseDao.getAllEntities();
	}
	
	
	
}

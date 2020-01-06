package dao;
import entity.IEntity;
import entity.Student;
import entity.SC;

import java.util.HashMap;

import biz.SCBiz;

public class SCDao implements IDao {
	private static HashMap<String, IEntity> sc;
	private static SCDao instance;
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
       SC scc = (SC)entity;
       sc.put(String.valueOf(scc.getGrade()), scc);
	}

	public void delete(IEntity entity) {
		// TODO Auto-generated method stub
		SC scc = (SC)entity;
	      sc.remove(scc);
	}

	public void update(IEntity entity) {
		// TODO Auto-generated method stub
		  SC scc = (SC)entity;
	       sc.put(String.valueOf(scc.getGrade()), scc);
	}

	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return sc;
	}

	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return null;
	}
	public static SCDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new SCDao();
					sc=new HashMap<>();
					SCBiz.showSc();
					return instance;
				}
			}
		}
		return instance;
	}
}

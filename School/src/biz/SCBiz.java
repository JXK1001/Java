package biz;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import entity.Course;
import entity.IEntity;
import entity.SC;
import entity.Student;
import view.MainUI;
import  dao.*;
public class SCBiz {
 /* 查看选课信息*/
	  public static void txt2String(String pathname){
	        try{
	        	File file = new File(pathname);
	            BufferedReader br = new BufferedReader(new FileReader(file));
	            String s="";
	            int i=0;
	            while((s = br.readLine())!=null){
	            	i++;
	            	SC sc=new SC();
	            	sc.setCourseNo(s);
	            	sc.setGrade(i);
	            	SCDao.getInstance().insert(sc);
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	  public static void showSc(){
		  String path="D:\\School\\book.txt";
		  txt2String(path);
	  }
	  
}



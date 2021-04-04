package leaveAttendenceApp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import leaveAttendenceApp.entities.Student;

@Component
public class StudentDao 
{
	@Autowired
 private HibernateTemplate hibernateTemplate ;
	
	
	// create student data    // and update also
	@Transactional
	public void createStudent(Student student)
	{
		this.hibernateTemplate.saveOrUpdate(student);   // or save(student) only save data //) used saveOrUpdate(student) for new data save & change it  
	}
	
	// get single student data
		public Student getStudent(int sid)
		{
			return this.hibernateTemplate.get(Student.class, sid);
		}
		
	// get all student data
	public List<Student> getStudents()
	{
	  List<Student> studentList=this.hibernateTemplate.loadAll(Student.class);
	  return studentList;
	}
	
	
	// delete single  student data
	@Transactional
	public void deleteStudent(int sid)
	{
	 Student st=	this.hibernateTemplate.load(Student.class, sid);
	  this.hibernateTemplate.delete(st);
	}
	
	
}






























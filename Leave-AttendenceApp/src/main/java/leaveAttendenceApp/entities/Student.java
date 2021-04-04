package leaveAttendenceApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int sid;
   private String sname;
   private String sclass;
   private String department;
   
      // setter getter
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSclass() {
	return sclass;
}
public void setSclass(String sclass) {
	this.sclass = sclass;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

                  // para cons
public Student(int sid, String sname, String sclass, String department) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sclass = sclass;
	this.department = department;
}
                 // def con
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
                        // tostring
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sclass=" + sclass + ", department=" + department + "]";
}
 
}

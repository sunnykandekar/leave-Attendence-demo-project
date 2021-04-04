package leaveAttendenceApp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import leaveAttendenceApp.entities.LeaveDetails;
import leaveAttendenceApp.repository.Query;

@Component
public class LeaveDao 
{

    @Autowired
    private HibernateTemplate hibernateTemplate ;
    
    
 // create student data
 	@Transactional
 	public void addLeave(LeaveDetails leavedetails)
 	{
 		this.hibernateTemplate.saveOrUpdate(leavedetails);   // or save(LeaveDetails) only save data //) used saveOrUpdate(LeaveDetails) for new data save & change it  
 	}
 	
 	// get single student data
 		public LeaveDetails getLeave(int id)
 		{
 			return this.hibernateTemplate.get(LeaveDetails.class, id);
 		}
 		
 	// get all student data
 	public List<LeaveDetails> getAllLeave()
 	{
 	  List<LeaveDetails> leaveList=this.hibernateTemplate.loadAll(LeaveDetails.class);
 	  return leaveList;
 	}
 	
 	
 	// delete single  student data
 	@Transactional
 	public void deleteLeave(int id)
 	{
 		LeaveDetails ld=this.hibernateTemplate.load(LeaveDetails.class, id);
 	  this.hibernateTemplate.delete(ld);
 	}
 	
 	//
 	

    @Query(nativeQuery = true, value = "select * from leave_details where active=true")
    public List<LeaveDetails> getAllActiveLeaves() {
		return null;
	}
 	//
 	public List<LeaveDetails> getAllLeavesOnStatus(boolean pending, boolean accepted, boolean rejected) {

 		
 		StringBuffer whereQuery = new StringBuffer();
 		if (pending)
 		    whereQuery.append("active=true or ");
 		if (accepted)
 		    whereQuery.append("(active=false and accept_reject_flag=true) or ");
 		if (rejected)
 		    whereQuery.append("(active=false and accept_reject_flag=false) or ");

 		whereQuery.append(" 1=0");
 		
 	 List<LeaveDetails> leaveList2=this.getAllLeavesOnStatus(pending, accepted, rejected);
 	   return leaveList2;    
 	}
 	
}

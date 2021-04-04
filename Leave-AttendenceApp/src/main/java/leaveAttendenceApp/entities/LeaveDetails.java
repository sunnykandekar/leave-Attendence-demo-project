package leaveAttendenceApp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeaveDetails 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    
    private String sclass;
    
    private String department;

    private Date fromDate;

    private Date toDate;

    private String leaveType;

    private String reason;

    @Column(name = "accept_reject_flag")
    private boolean acceptRejectFlag;

    @Column(name = "active")
    private boolean active;

    
           // setter getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public boolean isAcceptRejectFlag() {
		return acceptRejectFlag;
	}

	public void setAcceptRejectFlag(boolean acceptRejectFlag) {
		this.acceptRejectFlag = acceptRejectFlag;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
            
	       // para con
	public LeaveDetails(int id, String username, String sclass, String department, Date fromDate, Date toDate, String leaveType, String reason,
			boolean acceptRejectFlag, boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.sclass = sclass;
		this.department = department;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.leaveType = leaveType;
		this.reason = reason;
		this.acceptRejectFlag = acceptRejectFlag;
		this.active = active;
	}
      // def con
	public LeaveDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
             // tostring
	@Override
	public String toString() {
		return "LeaveDetails [id=" + id + ", username=" + username + ", sclass=" + sclass + ", department=" + department + " fromDate=" + fromDate + ", toDate=" + toDate
				+ ", leaveType=" + leaveType + ", reason=" + reason + ", acceptRejectFlag=" + acceptRejectFlag
				+ ", active=" + active + "]";
	}
    
    
}
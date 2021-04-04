package leaveAttendenceApp.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import leaveAttendenceApp.dao.LeaveDao;
import leaveAttendenceApp.entities.LeaveDetails;
//import leaveAttendenceApp.service.LeaveManageService;
//import leaveAttendenceApp.services.leaveManageService;

@Controller
public class LeaveController 
{
	
	@Autowired
	private LeaveDao leavedao;
	
	@RequestMapping("/LeaveDetailsform")
    public String home(Model model)         // display all leave list
    {
		List<LeaveDetails> leaveList =  leavedao.getAllLeave();
		model.addAttribute("leave",leaveList);
    	return "LeaveDetailsform";
    }
	            // to check all leaves status
	@RequestMapping("/LeaveStatus")
    public String home1(Model model)         // display all leave list
    {
		List<LeaveDetails> leaveList =  leavedao.getAllLeave();
		model.addAttribute("leave",leaveList);
    	return "LeaveStatus";
    }
	 
	  // display add form 
	@RequestMapping("/addLeave")
    public String addLeave()
    {
    	return "addLeaveform";
    }
	
	//handler add Student form
		@RequestMapping(value="/handleLeave", method=RequestMethod.POST)    // here we used this handeler fro both save & update
	    public RedirectView handleLeave(@ModelAttribute LeaveDetails leavedetails, HttpServletRequest request)
	    {
			System.out.println(leavedetails);// console
			leavedao.addLeave(leavedetails);
			RedirectView redirectView =new RedirectView();
			redirectView.setUrl(request.getContextPath()+ "/LeaveDetailsform");
	    	return redirectView;
	    }
		
		// display update form 
				@RequestMapping("/LeaveDetailsform/update/{id}")
			    public String updateLeave(@PathVariable("id") int id, Model model)
			    {
					LeaveDetails leavedetails =this.leavedao.getLeave(id);
				model.addAttribute("leave",leavedetails);
			    	return "updateStudentform";
			    }
			
			//handler for delete data
				@RequestMapping("/LeaveDetailsform/delete/{id}")
			    public RedirectView deleteLeave(@PathVariable("id") int id, HttpServletRequest request)
			    {
					this.leavedao.deleteLeave(id);;
					RedirectView redirectView =new RedirectView();
					redirectView.setUrl( request.getContextPath()+"/LeaveDetailsform");
			    	return redirectView;
			    }

        //
			   /* @Autowired
			    private LeaveManageService leaveManageService;
				
				// pending, accept,reject
				
				 @RequestMapping(value = "/user/get-all-leaves", method = RequestMethod.GET)
				    public @ResponseBody String getAllLeaves(@RequestParam(value = "pending", defaultValue = "false") boolean pending,
					    @RequestParam(value = "accepted", defaultValue = "false") boolean accepted,
					    @RequestParam(value = "rejected", defaultValue = "false") boolean rejected) throws Exception 
				 {

					Iterator<LeaveDetails> iterator = leaveManageService.getAllLeaves().iterator();
					if (pending || accepted || rejected)
					    iterator = leaveManageService.getAllLeavesOnStatus(pending, accepted, rejected).iterator();
					return jsonArr.toString();;
				 }*/
}

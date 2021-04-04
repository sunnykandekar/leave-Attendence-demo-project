package leaveAttendenceApp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import leaveAttendenceApp.dao.StudentDao;
import leaveAttendenceApp.entities.Student;

@Controller
public class MainController 
{
	@Autowired
	private StudentDao studentdao;
	
	@RequestMapping("/")
    public String home(Model model)
    {
		List<Student> studentList =  studentdao.getStudents();
		model.addAttribute("student",studentList);
    	return "index";
    }
	 
	  // display add form  
	@RequestMapping("/addStudent")
    public String addStudent()
    {
    	return "addStudentform";
    }
	
	//handler add Student form   // insert new student details
	@RequestMapping(value="/handleStudent", method=RequestMethod.POST)    // here we used this handeler fro both save & update
    public RedirectView handleStudent(@ModelAttribute Student student, HttpServletRequest request)
    {
		System.out.println(student);// console
	    studentdao.createStudent(student);
		RedirectView redirectView =new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/");
    	return redirectView;
    }
	
	  // display update form 
		@RequestMapping("/update/{sid}")
	    public String updateStudent(@PathVariable("sid") int sid, Model model)
	    {
		Student student =this.studentdao.getStudent(sid);
		model.addAttribute("stud",student);
	    	return "updateStudentform";
	    }
	
	//handler for delete data
		@RequestMapping("/delete/{sid}")
	    public RedirectView deleteStudent(@PathVariable("sid") int sid, HttpServletRequest request)
	    {
			this.studentdao.deleteStudent(sid);
			RedirectView redirectView =new RedirectView();
			redirectView.setUrl(request.getContextPath()+ "/");
	    	return redirectView;
	    }
}

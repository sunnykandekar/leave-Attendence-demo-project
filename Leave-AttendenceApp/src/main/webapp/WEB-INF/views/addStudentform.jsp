<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>addStudentform</title>

<%@include file="./base.jsp"%>
</head>
<body>
     
           <h1 class="container text-center">Fill the given form</h1>

             
           
 <form action="handleStudent" method="post" class="container center">
  <div class="form-group">
    <label for="exampeStudentName">Student Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Enter Student Name" name="sname">
  </div>
  
  <div class="form-group">
    <label for="exampeClassName">Class Year</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Enter Class year" name="sclass">
  </div>
  
  <div class="form-group">
    <label for="exampeDepartmentName">Department Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Enter Department Name" name="department">
  </div>
   
  <div class="container text-center">
      <a href="${pageContext.request.contextPath}/" 
      class="btn btn-outline-danger">Back</a>
      
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
  
</form>
             
             
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LeaveDetailsform</title>

<%@page isELIgnored="false"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

      <%@include file="./base.jsp"%>

</head>
<body>

          
<h2>Hello World!</h2>
 
    <h1 class="container text-center">List of All Leaves Request</h1>
    
    <br></br>
    
    
    <table class="table text-center">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Sr.No</th>
      <th scope="col">Student Name</th>
      <th scope="col">Class Year</th>
      <th scope="col">Department Name</th>
      <th scope="col">From Date</th>
      <th scope="col">To Date</th>
      <th scope="col">Leave Type</th>
      <th scope="col">Reason</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${leave}" var="ld">  <!-- // here used key val(student) of model attribute from maincontroller. -->
  
  <tr>
     <th scope="row">${ld.id} </th>
     <td>${ld.username}</td>
     <td>${ld.sclass}</td>
     <td>${ld.department}</td>
     <td>${ld.fromDate}</td>
     <td>${ld.toDate}</td>
     <td>${ld.leaveType}</td>
     <td>${ld.reason}</td>
     
      <td class=" text-center"><a href="LeaveDetailsform/delete/${ld.id}"><i class="fas fa-trash text-danger" style="font-size:15px;">REJECT</i></a></td>
      <td class=" text-center"><a href="LeaveDetailsform/update/${ld.id}"><i class="fas fa-edit text-primary" style="font-size:15px;">Edit</i></a></td>
      
     <td class=" text-center"><a th:href="@{/user/manage-leaves/accept/{id}(id=${leaveInfo.id})}" ><i class="fas fa-edit text-success" style="font-size:15px;">ACCEPT</i></a></td>
      
  </tr>
  </c:forEach>
  
  </tbody>
</table>
    
             <div class= "container text-center">
                 <a href="addLeave" class="btn btn-outline-success">Add New Leave Request</a>
             </div>
    

</body>
</html>
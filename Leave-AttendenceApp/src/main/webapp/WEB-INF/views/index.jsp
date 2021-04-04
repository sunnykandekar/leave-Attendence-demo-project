<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index/Home Page</title>
 
   <%@page isELIgnored="false"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

      <%@include file="./base.jsp"%>
</head>

<body>


<h2>Hello World!</h2>
 
    <h1 class="container text-center">Welcome to List of All Students</h1>
    
    <br></br>
    
    
    <table class="table text-center">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Sr.No</th>
      <th scope="col">Student Name</th>
      <th scope="col">Class Year</th>
      <th scope="col">Department Name</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${student}" var="st">  <!-- // here used key val(student) of model attribute from maincontroller. -->
  
    <tr>
      <th scope="row">${st.sid} </th>
      <td>${st.sname}</td>
      <td>${st.sclass}</td>
      <td>${st.department}</td>
      <td class=" text-center"><a href="delete/${st.sid}"><i class="fas fa-trash text-danger" style="font-size:15px;"></i></a></td>
      <td class=" text-center"><a href="update/${st.sid}"><i class="fas fa-edit text-primary" style="font-size:15px;">Edit</i></a></td>
    </tr>
  </c:forEach>
  
  </tbody>
</table>
    
             <div class= "container text-center">
                 <a href="addStudent" class="btn btn-outline-success">Add New Student</a>
             </div>
    
</body>
</html>

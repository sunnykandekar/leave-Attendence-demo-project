<!DOCTYPE HTML>
<html>
<head>
<title>Apply Leave</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<%@include file="./base.jsp"%>

</head> 
<body>

         <div>
                    <h1 class="container text-center">Fill the given Leave form</h1>
         </div>
                                  <br>
 <form action="handleLeave" method="post" class="container center">
  <div class="form-group">
    <label for="exampeStudentName">Student Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Enter Student Name" name="username">
  </div>
  
  <div class="form-group">
    <label for="exampeClassName">Class Year</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Enter Class year" name="sclass">
  </div>
  
  <div class="form-group">
    <label for="exampeDepartmentName">Department Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Enter Department Name" name="department">
  </div>
  
  	<div class="form-group">
	  <label >From Date  :</label>
		<input type="text" th:field="*{fromDate}" class="form-control" id="exampleInputEmail1" placeholder="From Date"name="fromDate" />
	  <label  <%-- th:if="${#fields.hasErrors('fromDate')}"  --%>th:errors="*{fromDate}" ></label> 
</div>
					
<div class="form-group">
	<label >To Date :</label>
    	<input type="text" th:field="*{toDate}" class="form-control" id="exampleInputEmail1" placeholder="To Date" name="toDate"/>
   <label <%-- th:if="${#fields.hasErrors('toDate')}" --%> th:errors="*{toDate}"></label> 
</div>
					
 <div class="form-group">
    <label for="exampleFormControlSelect1">Leave Type :</label>
  <label  <%-- th:if="${#fields.hasErrors('leaveType')}" --%> th:errors="*{leaveType}" ></label> 
    
    <select class="form-control" id="exampleFormControlSelect1" name="leaveType">
    <option value="">Select</option>
      <option value="Casual Leave">Casual Leave</option>
      <option value="Casual Leave">Sick Leave</option>
      <option value="Casual Leave">Paid Leave</option>
      <option value="Casual Leave">Non-Paid Leave</option>
      
    </select>
 </div>
  
					
    <div class="form-group">
    <label for="exampleFormControlTextarea1" <%-- th:if="${#fields.hasErrors('reason')}" --%> th:errors="*{reason}">Leave Reason :</label>
       <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="reason"></textarea>
  </div>
					
					
   
  <div class="container text-center">
      <a href="${pageContext.request.contextPath}/" 
      class="btn btn-outline-danger">Back</a>
      
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
  
</form>                   
         
    
           <script type="text/javascript">
          	  $(function(){
		      $('.leave-date').datepicker();
	       });
        </script>

<!--js -->
<script th:src="@{/js/jquery.nicescroll.js}"></script>
<script th:src="@{/js/scripts.js}"></script>
<!-- Bootstrap Core JavaScript -->
   <script th:src="@{/js/bootstrap.min.js}"></script>
   <!-- /Bootstrap Core JavaScript -->	   

</body>
</html>
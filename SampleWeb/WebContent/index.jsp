<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<!-- <script type="text/javascript">
$(document).ready(function(){
    $("#submit").click(function(){
    	saveEmp();
    });
});
function saveEmp(){
	 var fname=$('#fname').val();
	 var lname=$('#lname').val();
	 $.ajax({
	
		 	        type: "POST",
		 	        url: "/SampleWeb/login",
		 	        data: "fname=" + fname+ "&lname="+lname,
		 	       success: function(response){
		 	    	  alert(response);
		 	        },
		 	        error: function(e){
		 	        alert('Error: ' + e);
		 	        } 
		 	        });
}

</script> -->
<body>
<h2>Student Information</h2>
<form:form method="GET" action="login" modelAttribute="Person">
First Name: <input type="text" name="firstName"><br />
Last Name: <input type="text" name="lastName" /><br/>
Email  :   <input type="email" id="email" name="email"><br/>
Phone  :   <input type="number" id="phone" name="phone"><br/>
<input type="submit" value="submit" id="submit">
</form:form>
</body>
</html>
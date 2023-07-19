<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Entry Name</title>
</head>
<body>
 

<h4>Please Enter your name</h4>
	<s:form action="helloWorld">
	
		<s:textfield name="name" label="your name">
			<s:submit>
			
			</s:submit>
		
		</s:textfield>
	</s:form>

</body>
</html>
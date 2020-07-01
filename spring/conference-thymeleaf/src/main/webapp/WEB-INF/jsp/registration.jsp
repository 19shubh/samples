<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1>Registration</h1>
	<form:form modelAttribute="registration">
		<table>
			<tr>
				<td><spring:message code="name"/>:</td>
				<td>
					<form:input path="name"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Add Registration">
				</td>
			</tr>	
		</table>
	</form:form>
</body>
</html>
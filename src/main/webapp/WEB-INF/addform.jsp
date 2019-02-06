<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<spring:url value="/resources/style.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />

</head>
<body>
<form:form action="saveUser" modelAttribute="User">
<div id="addEmployeeDiv">
<table align="center" >



<tr>
<td>firstName</td><td><form:input path="Name" cssClass="focus1"/></td>

</tr>
<tr>
<td>City(*)</td><td><form:input path="City" cssClass="focus1"/></td>

</tr>
<tr>
<td>Phone(*)</td><td><form:input path="Phone" cssClass="focus1"/></td>

</tr>



<tr>
<td><input type="submit"/></td>

</tr>

</table>

</div>	
	</form:form>
	<a href="viewAllEmployees">View Employees</a>
</body>
</html>
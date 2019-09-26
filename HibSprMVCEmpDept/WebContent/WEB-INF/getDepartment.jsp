<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Department Details</h2>
	<form:form action="addDepartment" method="post">
		<table>
			<tr>
				<td><form:label path="dname">Department Name</form:label></td>
				<td><form:input path="dname"/></td>
			</tr>
			<tr>
				<td><form:label path="location">Location</form:label></td>
				<td><form:input path="location"/></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
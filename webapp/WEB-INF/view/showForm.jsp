<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<h1>Student Form</h1>
<form:form action="processForm" modelAttribute="Student">
	Student Name: <form:input type="text" path="name"/>
	<form:errors  path="name"/>
	<br/>
	Student Age: <form:input type="text" path="age"/>
	<form:errors  path="age"/>
	<br/>
	Course Code: <form:input type="text"  path="courseCode"/>
	<form:errors  path="courseCode"/>
	<br/>
	<form:input type="submit" value="submit" path=""/>
</form:form>
</html>
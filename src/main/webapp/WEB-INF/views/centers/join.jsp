<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="post" action="/join" modelAttribute="user">
<div class="innerTemplate">
	<form:input path="id" type="text" />
	<form:input path="pw" type="password" />
	<input type="submit" value="join" />	
</div>
</form:form>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<body>
 <p>URI: ${uri} <br/>
 User :  ${user} <br/>
 roles:  ${roles} <br/><br/>
 </p>
 <form action="/logout" method="post">
  <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
  <input type="submit" value="Logout">
</form>
</body>
</html>


<%-- <sec:authorize access="hasRole('ROLE_USER')">
<a href="${pageContext.request.contextPath}/user">user</a>
</sec:authorize>

<sec:authorize access="hasRole('ROLE_ADMIN')">
<a href="${pageContext.request.contextPath}/admin">admin</a>
</sec:authorize> --%>


<a href="${pageContext.request.contextPath}/user">user</a>
<a href="${pageContext.request.contextPath}/admin">admin</a>

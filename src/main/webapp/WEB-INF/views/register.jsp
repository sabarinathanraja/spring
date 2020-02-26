<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registeration</title>
</head>
<body>
<a href="/viewUsers" style="text-decoration:none">View Users</a>
  <form:form 
          action="/userregister" method="post" modelAttribute="userform">
             <table>
             		 <tr>
                    	<td><form:label path="username">
                     	 User Name</form:label></td>
                   	 	<td><form:input path="username"/></td>
                  		           			 </tr>
                             <tr>
                    <td><form:label path="password">
                      Password</form:label></td>
                    <td><form:input path="password"/></td>
                  
                </tr>
                <tr>
                    <td><form:label path="age">
                      Age</form:label></td>
                    <td><form:input path="age"/></td>
                   
                </tr>
                <tr>
                    <td><form:label path="address">
                      Address</form:label></td>
                    <td><form:input path="address"/></td>
                               </tr>
                               <tr>
                    <td><form:label path="gender">
                      Gender</form:label></td>
                    <td><form:input path="gender"/></td>
                               </tr>
                               <tr>
                    <td><form:label path="email">
                      Email</form:label></td>
                    <td><form:input path="email"/></td>
                               </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form> 
</body>
</html>
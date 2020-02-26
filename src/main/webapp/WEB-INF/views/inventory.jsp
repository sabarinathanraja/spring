<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory page</title>
</head>
<body>
<form:form 
          action="${pageContext.request.contextPath}/inventorysave" method="post" modelAttribute="inventory">
             <table>
             		 <tr>
                    	<td><form:label path="bookName">
                     	Book Name </form:label></td>
                   	 	<td><form:input path="bookName"/></td>
                  		           			 </tr>
                             <tr>
                    <td><form:label path="author">
                   Author</form:label></td>
                    <td><form:input path="author"/></td>
                  
                </tr>
                <tr>
                    <td><form:label path="description">
                      Description</form:label></td>
                    <td><form:input path="description"/></td>
                   
                </tr>
                <tr>
                    <td><form:label path="quantity">
                      Quantity</form:label></td>
                    <td><form:input path="quantity"/></td>
                               </tr>
                               <tr>
                    <td><form:label path="price">
                      Price</form:label></td>
                    <td><form:input path="price"/></td>
                               </tr>
                               <tr>
                    <td><input type="submit" value="AddInventory"/></td>
                </tr>
            </table>
        </form:form> 


</body>
</html>
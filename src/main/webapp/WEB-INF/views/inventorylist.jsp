<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory List</title>
</head>
<body>

<h3>Books list</h3>

<c:if test="${!empty inventorylist}">
 <table class="tg" border="1">
 <tr>
  <th width="120">Book Name</th>
  <th width="120">Author</th>
  <th width="120">Quantity</th>
  <th width="120">Description</th>
  <th width="120">price</th>
  
 </tr>
 <c:forEach items="${inventorylist}" var="inventory">
  <tr>
   <td>${inventory.bookName}</td>
   <td>${inventory.author}</td>
   <td>${inventory.quantity}</td>
   <td>${inventory.description}</td>
    <td>${inventory.price}</td>
    <td><a href="${pageContext.request.contextPath}/update?getId=${inventory.bookId}">Update</a></td>
  </tr>
 </c:forEach>
 </table>
</c:if>

</body>

</html>
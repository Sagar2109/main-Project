<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <%--  <base href="<%=basePath%>"> --%>
    
    <title>My JSP 'index.jsp' starting page</title>
    
     <script type = "text/javascript" src="/static/validation1.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> -->
  <style>

center,table,th,td,form,a{

 width: 400px;
  font-family: Lucida Calligraphy,High Tower Text;
  font-size:18px;
}




</style>
  
  </head >

  <body >
 
  <!--  <img src='reds.png' style='width:100%;height:100%' alt='red' /> -->
    This is my JSP page. <br>
    <center>
<h3>Form Title</h3>

<f:form action="/save" modelAttribute="custer" method="post"  name="custer" >
<table border="0" cellpadding="10">

<!-- <tr><td>Id</td><td> -->
<f:hidden name="id" path="id"/></td></tr>

<tr><td>Name</td>
<td><f:input type="text" name="customername" path="customername"/></td></tr>
<tr><td>Mobile Number</td><td><f:input type="text" name="mobileno" path="mobileno"/></td></tr>
<tr><td>Email</td><td><f:input type="text" name="email" path="email"/></td></tr>
<tr><td>Movie Name</td><td><f:input type="text" name="movienm" path="movienm"/></td></tr>
<tr><td><label for="time" name="time">Choose Time:</label>
  <select id="time" name="time">
    <option value="9:00">9:00</option>
    <option value="10:00">10:00</option>
    <option value="1:00">1:00</option>
    <option value="4:00">4:00</option>
  </select></td></tr>

<tr><td>Price</td><td><f:input type="text" name="price" path="price"/></td></tr>
<tr><td>No Of Ticktes</td><td><f:input type="number" name="totalticktes" path="totalticktes"/></td></tr>
<tr><td>TotalPrize</td><td><f:input type="number" name="totalprize" path="totalprize"/></td></tr>




<tr><td><input type="submit" name="vw" value="Insert/Update" onclick="return validateForm()"/></td></tr>

</table>
</f:form>
<a href="/read">See Your Tickets</a>
</center>
    
    
     
    
 
  </body>
 
</html>

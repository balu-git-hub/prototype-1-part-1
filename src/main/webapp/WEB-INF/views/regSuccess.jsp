<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registration Success</title>
		<link rel="stylesheet" href="/css/showDetails.css">
	</head>

	<body  style="background-image: url('images/solo.jpg')">
		<div align="center">
	        <h2>Registration Succeeded!</h2>
	        
	        <table>
	        	<tbody>
	        		<tr>
	        			  <td> <span>First name</span><br/> </td>
	        			  <td><span>${user.firstName}</span> </td>
	        	    </tr> 
	        	    
	        	    <tr>
	        	    	<td>  <span>Middle name</span><br/> </td>
	        	    	<td>  <span>${user.middleName}</span> </td>
	        	    </tr>
	        	    
	        	    <tr>
	        	    	<td>  <span>Last name</span><br/> </td>
	        	    	<td> <span>${user.lastName}</span></td>
	        	    </tr>
	        	    
	        	    <tr>
	        	    	<td>  <span>Address</span></td>
	        	    	<td>  <span>${user.address},${user.state},${user.country}${user.zipcode}</span> </td>
	        	    </tr>
	        	    
	        	    <tr>
	        	    	<td>  <span>E-mail: </span><span>${user.email}</span> </td>
	        	    	<td>   <span>Number: </span><span>${user.phoneNumber}</span><br/> </td> 
	        	    </tr>
	        	    
	        	    <tr>
	        	    	<td>  <span>Height: </span><span>${user.height}</span> </td>
	        	    	<td>   <span>Weight: </span><span>${user.weight}</span><br/> </td> 
	        	    </tr>
	        	    
	        	</tbody>
	        </table>
	        
    	</div>
	</body>
	
</html>
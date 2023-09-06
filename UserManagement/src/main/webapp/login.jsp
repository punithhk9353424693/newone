<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div
		style="width: 400px; height: 300px; background-color: grey; margin: 10px auto">
		<form action="check"  ModelAttribute="user1" style="margin: auto 30px">
			
			<input type="text" placeholder="Enter your Name" name="B"
				style="width: 300px; height: 40px; margin-top: 20px;"><br>
		
			<input type="password" placeholder="Enter your Password" name="A"
				style="width: 300px; height: 40px; margin-top: 20px;"> <br>
			<br> <input type="submit" value="ligin"
				style="background-color: black; color: white; width: 100px; height: 30px; border-radius: 7px">
		</form>
		
	</div>

</form>
</body>
</html>
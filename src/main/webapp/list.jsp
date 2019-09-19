<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="list" method="post">
    <input type="text" name="users[0].name"><br/>
    <input type="password" name="users[0].password" ><br/>
    <input type="text" name="users[0].address.name" ><br/>
    <input type="text" name="users[1].name"><br/>
    <input type="password" name="users[1].password" ><br/>
    <input type="text" name="users[1].address.name" ><br/>
    <input type="submit">
</form>
</body>
</html>

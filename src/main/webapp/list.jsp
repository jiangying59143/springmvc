<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="list" method="post">
    name:<input type="text" name="users[0].name"><br/>
    birth:<input type="text" name="users[0].birth"><br/>
    password:<input type="password" name="users[0].password" ><br/>
    address.name:<input type="text" name="users[0].address.name" ><br/><br/>

    name:<input type="text" name="users[1].name"><br/>
    birth:<input type="text" name="users[1].birth"><br/>
    password:<input type="password" name="users[1].password" ><br/>
    address.name:<input type="text" name="users[1].address.name" ><br/>
    <input type="submit">
</form>
</body>
</html>

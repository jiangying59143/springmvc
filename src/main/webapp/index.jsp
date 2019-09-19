<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <script type="text/javascript" src = "js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            var address = {
                "name" : "松泽家园"
            }

            var user = {
                "name" : "家爱心",
                password : "12312",
                address : address
            }

            $.ajax({
                url : "json",
                data : JSON.stringify(user),
                type : "POST",
                contentType:"application/json;charset=UTF-8",
                dataType : "text",
                success: function(data){
                    $("#title").text(data);
                }
            })
        })
    </script>
</head>
<body>
<h2 id="title">Hello World!</h2>
</body>
</html>

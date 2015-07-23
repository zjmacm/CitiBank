<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/7/12
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"  scope="page"/>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页</title>
  <script type="text/javascript" src="/res/js/common/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="/res/js/common/jcl.js"></script>



  <script type="text/javascript">

    $(document).ready(function() {
        $('#btn').click(function () {
            var username = $('#username').val();
            var passwrod = $('#password').val();
            $.ajax({
                url: "index",
                type: "post",
                dataType: "json",
                data: {"name": username, "password": passwrod},
                success: function (data) {
                    if (data.result == "ssss") {
                        alert(data.result);
                    }
                }
            });

        });
    });
  </script>

</head>
<body>
<input type="text" id="username">
<input type="password" id="password">
<input id="btn" type="button" value="测试">

</body>
</html>

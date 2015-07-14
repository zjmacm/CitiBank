<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/7/13
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript" src="/res/js/common/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/res/js/common/jcl.js"></script>
<script type="text/javascript">
  $(document).ready(function(){
    $('#login_submit').click(function(){
      var username = $('#username').val();
      var password = $('#password').val();
      $.ajax({
        url: companyLogin,
        data:{'username':username,'password':password},
        type: 'post',
        dataType: 'json',
        success:function(data){
          if(data.result=="success"){
            alert("登陆成功!");
            jcl.go("/index");
          }
          else if(data.result=="error"){
            alert("用户名或密码错误!");
          }
          else if(data.result=="empty"){
            alert("用户名或密码不能为空!");
          }
          else{
            alert("网络错误，请重试！");
          }
        }
      });

    });
  });
</script>
<html>
<head>
    <title></title>
</head>
<body>
<input type="text" id="username"><br/>
<input type="password" id="password"><br/>
<input type="button" value="提交申请" id="login_submit">


</body>
</html>

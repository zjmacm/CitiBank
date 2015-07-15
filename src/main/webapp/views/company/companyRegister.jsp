<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/7/13
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>

<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript" src="/res/js/common/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/res/js/common/jcl.js"></script>
<Script type="text/javascript">
  $(document).ready(function() {

    var username = $('#username').val();
    var password = $('#password').val();
    var repassword = $('#repassword').val();
    var companyName = $('#companyName').val();
    var companyType = $('#companyType').val();
    var registerCapital = $('#registerCapital').val();
    var businessLicense = $('#businessLicense').val();
    var legalPresentative = $('#legalPresentative').val();
    var formedTime = $('#formedTime').val();
    var officialWeb = $('#officialWeb').val();
    var baseAddress = $('#baseAddress').val();
    var registerAddress = $('#registerAddress').val();
    var consultPhone = $('#consultPhone').val();
    var workingFiled = $('#workingFiled').val();
    var majorAffair = $('#majorAffair').val();
    var revenueModels = $('#revenueModels').val();





    $('#register_submit').click(function(){
      if(password==repassword){
        return false;
      }

      $.ajax({
        url:companyRegister,
        data:{'username':username,'password':password},
        dataType: 'json',
        type: 'post',
        success:function(data){
          if(data.result=="success") {
            alert('注册成功');
            jcl.go("/index");
          }
          else if(data.result=="repeat"){
            alert("用户名已存在，请重新填写！");
          }
          else{
            alert("网络错误，请重新再试");
          }
        }
      });
    });
  });
</Script>
<html>
<head>
    <title></title>
</head>
<body>

<input type="text" id="username">
<input type="password" id="password">
<button id="register_submit">注册</button>
</body>
</html>

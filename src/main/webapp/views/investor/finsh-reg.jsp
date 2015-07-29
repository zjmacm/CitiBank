<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="../public/stylesheets/font.css">
    <link rel="stylesheet" href="../public/stylesheets/customer-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/finish-reg.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <title>注册完成</title>
</head>

<body>
    <jsp:include page="../visitor/customer-header.jsp"/>
    <div id="main">
        <div id="content">
            <div id="sitenav">
                <ul>
                    <li>
                        <span><img src="../public/images/1.png" alt="" />设置登录名</span>
                    </li>
                    <li>
                        <span><img src="../public/images/2.png" alt="" />填写注册信息</span>
                    </li>
                    <li>
                        <span class="sitnav-active"><img src="../public/images/3.png" alt="" />注册完成</span>
                    </li>
                </ul>
            </div>
            <div id="glance">
                <div id="tips">
                    <p>恭喜你,已完成注册</p>
                </div>
                <div id="finsh-tips">
                    <img src="../public/images/finsh-face.png">
                </div>
                <div id="go">
                    <ul>
                        <li>
                            <span class="go-item" id="item1">前去完善信息</span>
                        </li>
                        <li>
                            <span class="go-item" id="item2">以后再完善,<a href="/index" title="">去首页看看</a></span>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</body>

</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="../public/stylesheets/business-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/nav.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/check-investment-sign.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <meta charset="UTF-8">
    <title>电子签约(审核中）</title>
</head>
<body>
    <div id="header">
        <div id="header-nav">
            <div id="nav-list">
                <ul>
                    <li>
                        <a href="/index" title="">
                            <span class="nav-item  active">首页</span>
                        </a>
                    </li>
                    <li id="finance">
                        <a href="/finance" title="">
                            <span class="nav-item">融资板块</span>
                        </a>
                        <div id="finance-subnav">
                            <ul>
                                <li>
                                    <a href="/management" title="">
                                        <span>撮合配对</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="/intention/getIntentionPage" title="">
                                        <span>意向发布</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="/invetfinane" title="">
                                        <span>业务洽谈</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="/electronical/getElectronicalPage" title="">
                                        <span>电子签约</span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a href="/invest" title="">
                            <span class="nav-item">信息发布</span>
                        </a>
                    </li>
                    <li id="service">
                        <a href="/service" title="">
                            <span class="nav-item">资产管理</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="iciti">
                <ul id="i-column">
                    <li id="user-photo">
                        <span>
                            <a href="_target" title="">
                                <img src="../public/images/user.png" alt="" />
                            </a>
                        </span>
                    </li>
                    <li id="go">
                        <span id="text">我的账号<img src="../public/images/back-bottom.png"></span>
                        <ul>
                            <li>
                                <a href="/ifollow" title="">
                                    <span>我关注的</span>
                                </a>
                            </li>
                            <li>
                                <a href="/inews" title="">
                                    <span>我的消息</span>
                                </a>
                            </li>
                            <li>
                                <a href="/isource" title="">
                                    <span>资料管理</span>
                                </a>
                            </li>
                            <li>
                                <a href="/logout" title="">
                                    <span>退出</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="wrap">
        <jsp:include page="list_signed.jsp"/>
        </div>
        <div class="main">
            <p class="welcome">
                <span class="name">王女士</span>
                ，欢迎您
            </p>
            <p class="stage">
                当前的状态：
                <span >数字证书申请审核中</span>
            </p>
            <div class="left_line">
            </div><!--left_line-->
            <span class="tit">电子签约流程</span>
            <div class="right_line">             
            </div><!--right_line-->
            <div class="progress">
                <img src="../public/images/DC-apply.png" class="DC_apply">
                <img src="../public/images/connection.png" class="connection c1">
                <img src="../public/images/DC-authentication.png" class="DC_authentication">
                <img src="../public/images/connection.png" class="connection c2">
                <a href="#">    
                    <img src="../public/images/check-contract.png" class="check_contract">
                </a>
                <img src="../public/images/connect-slide.png" class="connect_slide cs1">
                <a href="#">
                    <img src="../public/images/sign-contract.png" class="sign_contract">
                </a>
                <img src="../public/images/connect-slide.png" class="connect_slide cs2">
                <img src="../public/images/number-authentication.png" class="number_authentication">
                <img src="../public/images/connection.png" class="connection c3">
                <img src="../public/images/time-authentication.png" class="time_authentication">               
                <img src="../public/images/connection.png" class="connection c4">
                <a href="#">
                    <img src="../public/images/sign-finished.png" class="sign_finished">
                </a>
            </div><!--progress-->
        </div><!--main-->
    </div><!--wrap-->
     <div id="footer">
        <div id="foot-list">
        </div>
    </div>
</body>
</html>
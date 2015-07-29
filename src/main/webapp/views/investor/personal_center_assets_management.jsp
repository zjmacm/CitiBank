<%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>个人中心-资产管理</title>
    <link href="../public/stylesheets/personalcenter_assetsmanagement.css" type="text/css" rel="stylesheet">
    <link href="../public/stylesheets/business-header.css" rel="stylesheet" type="text/css">
    <link href="../public/stylesheets/customer-footer.css" rel="stylesheet" type="text/css">
</head>
<body>
<% Map<String,Object> userInfo= (Map<String, Object>) request.getAttribute("userInfo");%>
<jsp:include page="invest-header.jsp"/>
<div class="main">
    <div class="container">
        <div id="title">
                <h1>资料管理</h1>
            </div>
        <div id="first">
            <div style="margin: 8px">基本信息</div>
            <hr/>
            <div class="box">
                <div id="first_left">
                        <div class="block">
                            <p>投资者姓名：<%= userInfo.get("investorName")%></p><br/>
                            <p>联系方式：<%= userInfo.get("consultPhone")%></p><br/>
                            <p>职位：投资顾问</p><br/>
                            <p>资金额：<%= userInfo.get("totalMoney")==null?userInfo.get("totalMoney"):"暂无"%>万元</p><br/>
                            <p>所在地区：<%= userInfo.get("baseAddress")%></p><br/>
                        </div>
                        <div class="block">
                            <p>投资领域：<%= userInfo.get("investField")%></p><br/>
                            <p>投资阶段：<%= userInfo.get("investStage")%></p><br/>
                            <p>投资周期：<%= userInfo.get("investPeriod")%>年</p><br/>
                            <p>公司规模：占地<%= userInfo.get("companyScale")==null?userInfo.get("companyScale"):"暂无"%>亩</p><br/>
                            <p>投资地区：<%= userInfo.get("investArea")%></p><br/>
                        </div>

                    </div>
                <div id="first_right">
                        <div class="block">
                            <img src="<%= userInfo.get("logoPath")%>">
                            <p id="button1"><a href="">更换</a></p>
                        </div>
                        <div class="block">
                            <p>所在公司名称：<%= userInfo.get("companyName")%></p><br/>
                            <p>公司注册地址：<%= userInfo.get("address")==null?userInfo.get("address"):"暂无"%></p><br/>
                            <p>公司注册地址：<%= userInfo.get("address")==null?userInfo.get("registeredCapital"):"暂无"%>万元</p><br/>
                            <p>法定代表人信息：<%= userInfo.get("legalRepresentative")%></p><br/>
                            <p>法定代表人委托信息：<%= userInfo.get("legalRepresentativeMandator")%></p><br/>
                        </div>
                    </div>
            </div>
        </div>
        <div id="second">
            <div style="margin: 8px">基本信息</div>
            <hr/>
            <div class="box">
                <div id="second_top">
                    <div id="top_left">
                        <p>股东背景：某基金创始人之一</p><br/>
                        <p>投资行业：<%= userInfo.get("investIndustry")==null?userInfo.get("investIndustry"):"暂无"%></p><br/>
                        <p>投资类型：<%= userInfo.get("investType")==null?userInfo.get("investType"):"暂无"%></p><br/>
                        <p>达成案例：点击查看</p><br/>
                    </div>
                    <div id="top_right">
                        <p>管理基金：方圆基金</p><br/>
                        <p>投资意向金额：<%= userInfo.get("investMoney")==null? userInfo.get("investMoney"):"暂无"%></p><br/>
                        <p>所需资料：<%= userInfo.get("material")==null?userInfo.get("material"):"暂无"%></p><br/>
                    </div>
                </div>
                <div id="second_middle">投资历史：<br/>
                    <%= userInfo.get("investHistory")==null?userInfo.get("investHistory"):"暂无"%>
                </div>
                <%--<div id="second_bottom">--%>
                    <%--<p>瑞贝卡（600439.sh）、兴森科技（002436.sz)</p><br/>--%>
                    <%--<p>天壕节能科技股份有限公司（300332.sz）</p><br/>--%>
                    <%--<p>郴州金贵银业股份有限公司（已过发审会）</p><br/>--%>
                    <%--<p>金轮科创股份有限公司（已过发审会）</p><br/>--%>
                    <%--<p id="button2"><a href="">编辑</a></p>--%>
                <%--</div>--%>
            </div>
        </div>
    </div>
</div>
<div id="footer">
    <div id="foot-list">
    </div>
</div>
</body>
</html>
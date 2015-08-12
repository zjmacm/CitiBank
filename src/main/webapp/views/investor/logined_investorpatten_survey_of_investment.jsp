<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>已登录-投资者模式-资产管理-股权管理</title>
    <link href="/public/stylesheets/radioButton.css" rel="stylesheet" type="text/css">
    <link href="/public/stylesheets/business-header.css" rel="stylesheet" type="text/css">
    <link href="/public/stylesheets/customer-footer.css" rel="stylesheet" type="text/css">
    <link href="/public/stylesheets/logined_investorpatten_stockright_manage.css" rel="stylesheet" type="text/css">
</head>
<body>
<% List<Map<String,Object>> data= (List<Map<String, Object>>) request.getAttribute("data");%>
<jsp:include page="invest-header.jsp"/>
<div id="main">
    <div id="nav-boder">
        <div id="nav">
            <span id="tab1"
                  style="border-style: none solid none none; border-color: lightgray;border-width: 1px;">
                <a href="/asset/investor/0">投资概况</a>
            </span>
            <span id="tab2">
                <a href="/asset/investor/1">股权管理</a>
            </span>
            <span id="tab3">
                <a href="/asset/investor/2">债权管理</a>
            </span>
            <span id="search">
                <label for="search-content">搜索:</label>
                <input type="text" id="search-content">
                <input type="button" id="search-button" value="确定">
            </span>
        </div>
        <div id="selected1">
            投资概况
        </div>
    </div>
    <div id="filter">
        <div>筛选条件</div>
        <div>
            <form>
            <span>发布时间：</span>
                <input id='one-month' type="radio" name="radio-group" checked="checked" />
                <label for="one-month">近一个月</label>
                <input id='three-month' type="radio" name="radio-group"/>
                <label for="three-month">近三个月</label>
                <input id='six-month' type="radio" name="radio-group"/>
                <label for="six-month">近六个月</label>
                <input id='one-year' type="radio" name="radio-group"/>
                <label for="one-year">近一年</label>
                <input id='two-year' type="radio" name="radio-group"/>
                <label for="two-year">近两年</label>
            </form>
        </div>
    </div>
    <div id="content">
        <div id="subtitle">
            股权状况分布
        </div>
        <% for (int i=0;i<data.size();++i){%>
        <div class="list-text">
            <div>
                公司名称
            </div>
            <div>
                <span>所在地：<%= data.get(i).get("investArea")%></span>
                <span>份额：<%= data.get(i).get("stockRate")%></span>
                <span>投入资金额：<%= data.get(i).get("investMoney")%>万</span>
            </div>
        </div>
        <% }%>
    </div>
</div>
<div id="footer">
    <div id="foot-list">
    </div>
</div>
</body>
</html>
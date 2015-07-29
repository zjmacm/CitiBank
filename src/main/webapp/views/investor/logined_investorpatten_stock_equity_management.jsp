<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>已登录-投资者模式-资产管理-股权管理</title>
    <link href="../public/stylesheets/radioButton.css" rel="stylesheet" type="text/css">
    <link href="../public/stylesheets/business-header.css" rel="stylesheet" type="text/css">
    <link href="../public/stylesheets/customer-footer.css" rel="stylesheet" type="text/css">
    <link href="../public/stylesheets/logined_investorpatten_stockright_manage.css" rel="stylesheet" type="text/css">
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
                                <a href="/esignature" title="">
                                    <span>意向发布</span>
                                </a>
                            </li>
                            <li>
                                <a href="/invetfinane" title="">
                                    <span>业务洽谈</span>
                                </a>
                            </li>
                            <li>
                                <a href="/invetfinane" title="">
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
<div id="main">
    <div id="nav-boder">
        <div id="nav">
            <span id="tab1">
                <a href="logined_investorpatten_survey_of_investment.jsp">投资概况</a>
            </span>
            <span id="tab2">
                <a href="logined_investorpatten_stock_equity_management.jsp">股权管理</a>
            </span>
            <span id="tab3">
               <a href="logined_investorpatten_stockright_manage.jsp">债权管理</a>
            </span>
            <span id="search">
                <label for="search-content">搜索:</label>
                <input type="text" id="search-content">
                <input type="button" id="search-button">
            </span>
        </div>
        <div id="selected2">
            股权管理
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
        <div class="list-text">
            <div>
                公司名称
            </div>
            <div>
                <span>所在地：北京</span>
                <span>份额：1</span>
                <span>投入资金额：100万</span>
            </div>
        </div>
        <div class="list-text">

        </div>
        <div class="list-text">

        </div>
        <div class="list-text">

        </div>
    </div>
</div>
<div id="footer">
    <div id="foot-list">
    </div>
</div>
</body>
</html>
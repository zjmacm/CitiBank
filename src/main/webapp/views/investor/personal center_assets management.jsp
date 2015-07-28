<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
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
                            <p>投资者姓名：沈女士</p><br/>
                            <p>联系方式：18840838187</p><br/>
                            <p>职位：投资顾问</p><br/>
                            <p>资金额：1000万元</p><br/>
                            <p>所在地区：广东省深证市</p><br/>
                        </div>
                        <div class="block">
                            <p>投资领域：能源、房地产</p><br/>
                            <p>投资阶段：天使轮</p><br/>
                            <p>投资周期：2年</p><br/>
                            <p>投资规模：占地12亩</p><br/>
                            <p>投资地区：广东省、浙江省</p><br/>
                        </div>

                    </div>
                <div id="first_right">
                        <div class="block">
                            <img src="../public/images/myphoto.png">
                            <p id="button1"><a href="">更换</a></p>
                        </div>
                        <div class="block">
                            <p>所在公司名称：方圆基金公司</p><br/>
                            <p>公司注册地址：辽宁省大连市大连理工大学</p><br/>
                            <p>公司注册地址：1000万元</p><br/>
                            <p>法定代表人信息：王森淼</p><br/>
                            <p>法定代表人委托信息：宁泽涛</p><br/>
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
                        <p>投资行业：建筑业、能源</p><br/>
                        <p>投资类型：股/债权投资</p><br/>
                        <p>达成案例：点击查看</p><br/>
                    </div>
                    <div id="top_right">
                        <p>管理基金：方圆基金</p><br/>
                        <p>投资意向金额：无</p><br/>
                        <p>所需资料：无</p><br/>
                    </div>
                </div>
                <div id="second_middle">投资历史：<br/>
                    过去5年终，已经投资了近十家企业，其中已经有3家在国内主板和创业板上市，
                    有两家已经通过了中国证券会的核准，即将在深圳创业板上市。
                    我们投资的企业都是各细分行业领袖或者是具有巨大潜力的新兴企业，以下是部分已投资企业：
                </div>
                <div id="second_bottom">
                    <p>瑞贝卡（600439.sh）、兴森科技（002436.sz)</p><br/>
                    <p>天壕节能科技股份有限公司（300332.sz）</p><br/>
                    <p>郴州金贵银业股份有限公司（已过发审会）</p><br/>
                    <p>金轮科创股份有限公司（已过发审会）</p><br/>
                    <p id="button2"><a href="">编辑</a></p>
                </div>
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
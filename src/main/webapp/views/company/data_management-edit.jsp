<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="../public/stylesheets/business-header.css" rel="stylesheet" type="text/css">
    <link href="../public/stylesheets/customer-footer.css" rel="stylesheet" type="text/css">
    <link href="../public/stylesheets/data_management-edit.css" rel="stylesheet" type="text/css">
    <title>资料管理-编辑状态</title>
</head>
<body>
<jsp:include page="business-header.jsp"/>
<div id="main">
    <div id="title">
        资 料 管 理
    </div>
    <div class="subtitle">
        基本内容
        <div id="back">
            <a href="">返回上一层</a>
        </div>
    </div>
    <hr/>
    <div class="content">
        <div class="box1">
            <p>
                公司名称：深圳诚勒达电力建设有限公司<br/>
                公司类型：有限责任公司<br/>
                所属行业：电力建设<br/>
                咨询电话：<input id="tel"><br/>
                主营业务：电力建设<br/>
                盈利模式：
                <select>
                    <option value="1">关系服务</option>
                    <option value="2">产品标准</option>
                    <option value="3">客户解决方案</option>
                    <option value="4">个性挖掘</option>
                    <option value="5">速度领先</option>
                    <option value="6">数据处理</option>
                    <option value="7">成本占优</option>
                    <option value="8">中转站模式</option>
                    <option value="9">其他</option>

                </select>
                <br/>
            </p>
        </div>
        <div class="box2">
            <p>
                注册资本：1000万<br/>
                营业执照注册号：201392080<br/>
                法人代表：<input id="legal_person"><br/>
                注册时间：2015-01-01<br/>
                总部地址：<input id="address"><br/>
                当前信用等级：AAA<br/>
            </p>
        </div>
        <div class="box3">
            <div id="img">
                <img src="">
            </div>
            <div id="modify">
                <a href="">更改</a>
            </div>
        </div>
    </div>
    <div class="subtitle">
        更多信息
    </div>
    <hr/>
    <div class="content" style="height: 700px;position: relative">
        <div style="height: 152px">
            <div class="box1">
                <p>
                    公司细分行业：电子科技<br/>
                    担保方：<input id="danbaofang"><br/>
                    员工人数：<input id="renshu"><br/>
                    相关机构：<input id="xiangguanjigou"><br/>
                </p>
            </div>
            <div class="box2">
                <p>
                    占地面积：<input id="area"><br/>
                    分厂：<input id="fenchang"><br/>
                    子公司：<input id="zigongsi"><br/>
                    驻外办事机构：<input id="banshijigou"><br/>
                </p>
            </div>
            <div class="box3" style="height: 152px"></div>
        </div>
        <div class="textarea">
            经营理念：<textarea rows="2" cols="80%" id="linian" style="vertical-align: top"></textarea><br/>
        </div>
        <div class="textarea">
            产品服务：<textarea rows="2" cols="80%" id="fuwu" style="vertical-align: top"></textarea><br/>
        </div>
        <div class="textarea">
            行业概况：<textarea rows="2" cols="80%" id="gaikuang" style="vertical-align: top"></textarea><br/>
        </div>
        <div class="textarea">
            发展战略：<textarea rows="2" cols="80%" id="zhanlue" style="vertical-align: top"></textarea><br/>
        </div>
        <div class="textarea">
            团队描述：<textarea rows="2" cols="80%" id="miaoshu" style="vertical-align: top"></textarea><br/>
        </div>
        <div class="box1">
            <p>优势与专长：</p>
            <div class="subbox">
                技术优势：<input id="jishuyoushi"><br/>
                产品优势：<input id="chanpinyoushi"><br/>
                市场优势：<input id="shichangyoushi"><br/>
            </div>
            <p>发展情况：<a href="">点击添加</a></p>
        </div>
        <div id="submit">
            <p><a href="">保存</a></p>
        </div>
    </div>
</div>
<div id="footer">
    <div id="foot-list">
    </div>
</div>
</body>
</html>
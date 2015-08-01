<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1"/>
    <title>电子签约-协议查询</title>
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/eletronic-contrating-inquiry-protocol.css">

</head>
<body>
<jsp:include page="invest-header.jsp"/>
<div id="mainContainer">
    <div id="main">
        <jsp:include page="list_signed.jsp"/>
        <div id="mainContent">
            <p class="title">信用监管报告</p>

            <div id="searchForm">
                <div id="searchInput">
                    <div id="textClear">
                        <a href=""><img src="../public/images/cancel.png"></a>
                    </div>
                    <input id="searchText" type="text" placeholder="请输入关键字搜索">
                </div>
                <a href="" style="display:inline;">
                    <div id="searchButton">查询</div>
                </a>

            </div>
            <div id="selectForm">
                <p>排序：</p>
                <select>
                    <option></option>
                    <option>签约时间</option>
                    <option>签约方</option>
                    <option>合约内容</option>
                    <option>状态</option>
                </select>
            </div>
            <!--******* *************************************** table**********************************************-->
            <div id="TableList">
                <table class="hovertable">

                    <tr>
                        <th>签约时间</th>
                        <th>签约方</th>
                        <th>合约内容</th>
                        <th>状态</th>
                    </tr>

                    <!--*****************全是一样的**************************************************************************************-->
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>
                    <tr>
                        <td>2015-01-01</td>
                        <td>安心股权有限公司</td>
                        <td>股权转让协议</td>
                        <td>审核中</td>
                    </tr>


                </table>
                <hr class="hr1"/>
            </div>
            <div id="page">
            </div>
        </div>
    </div>
</div>
<div id="footer">
</div>
</body>
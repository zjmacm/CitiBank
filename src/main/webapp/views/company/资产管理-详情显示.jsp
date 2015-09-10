<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>资产管理-详情显示</title>
    <link href="../public/stylesheets/business-header.css" rel="stylesheet" type="text/css">
    <link href="../public/stylesheets/customer-footer.css" rel="stylesheet" type="text/css">
    <link href="../public/stylesheets/product_details.css" rel="stylesheet" type="text/css">
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
<div id="container">
    <div id="head">
        <div id="button">
            <p><a href="">返回上一层
                <img src="../public/images/back.png" style="vertical-align: middle"></a></p>
        </div>
        <div id="title">
            <p>当前投资公司：深圳诚勒达电力建设工程公司</p>
        </div>
    </div>
    <div id="main">
        <div id="left">
            <div id="column1">
                <div class="subtitle"><p>发展数据</p></div>
                <div class="text" style="width: 40%;display: inline-block">
                    <p>
                        利润额：1000万元<br/>
                        销售毛利率：80%<br/>
                        资产负债率：20%<br/>
                        流动比率：50%<br/>
                    </p>
                </div>
                <div class="text" style="width: 40%;display: inline-block">
                    <p>
                        应收账款周转天数：28天<br/>
                        应收账款周转率：30%<br/>
                        净值报酬率：50%<br/>
                        总资产周转率：16%<br/>
                    </p>
                </div>
            </div>
            <div id="column2">
                <div class="subtitle"><p>定期报告</p></div>
                <div class="text">
                    <p>
                        <a href="">文件文件1.PDF</a><br/>
                        <a href="">文件文件1.PDF</a><br/>
                        <a href="">文件文件1.PDF</a><br/>
                        <a href="">文件文件1.PDF</a><br/>
                    </p>
                </div>
            </div>
            <div class="column">
                <div class="subtitle"><p>临时发布</p></div>
                <div class="text">
                    <p>
                        <a href="">文件文件1.PDF</a><br/>
                        <a href="">文件文件1.PDF</a><br/>
                        <a href="">文件文件1.PDF</a><br/>
                        <a href="">文件文件1.PDF</a><br/>
                    </p>
                </div>
            </div>
            <div class="column">
                <div class="subtitle"><p>相关新闻</p></div>
                <div class="text">
                    <p>
                        <a href="">新闻新闻，跳官网</a><br/>
                        <a href="">新闻新闻，跳官网</a><br/>
                        <a href="">新闻新闻，跳官网</a><br/>
                        <a href="">新闻新闻，跳官网</a><br/>
                    </p>
                </div>
            </div>
        </div>
        <div id="right" style="background-color: white">
            <div class="box">
                <img src="../public/images/example.jpg">
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
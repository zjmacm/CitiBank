<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/logined-company-proprety.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/radioButton.css">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>产品详情-公司详情</title>
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
        <div id="content">
            <div id="nav-head">
                <div id="nav">
                    <a href="/debat-manag"><span id="debat-manag">债权管理</span></a>
                    <span id="search">搜索：</span>
                    <input></input>
                    <span><a href="/serach"><img src="../public/images/_search.png"></a></span>
                </div>
                <div id="nav1">
                    <a href="/stock-manag"><span id="stock-manag">股权管理</span></a>
                </div>
            </div>
            <div id="sift">
                <span>筛选条件</span>
                <span>发布时间：</span>
                <div id="announce-time">
                    <form>
                        <input type="radio" id="1" value="1" name="time" check="checked" />
                        <label for="1">近一个月</label>
                        <input type="radio" id="2" value="2" name="time" />
                        <label for="2">近三个月</label>
                        <input type="radio" id="3" value="3" name="time" />
                        <label for="3">近六个月</label>
                        <input type="radio" id="4" value="4" name="time" />
                        <label for="4">近一年</label>
                        <input type="radio" id="5" value="5" name="time" />
                        <label for="5">近两年</label>
                    </form>
                </div>
            </div>
            <div id="announce-message">
                <span>发布信息</span>
            </div>
            <div class="product">
                <span>产品名称1</span>
                <div class="prod1">
                    <ul>
                        <li>发布时长：1个月24天</li>
                        <li>目前股权状况：一共买的价钱</li>
                        <li>融资方式：股权融资</li>
                    </ul>
                </div>
                <div class="prod2">
                    <ul>
                        <li>期限：6个月</li>
                        <li>融资占比：谁买了，买了多少</li>
                        <li>意向投资方：互相关注的</li>
                    </ul>
                </div>
            </div>
            <div class="product">
                <span>产品名称2</span>
                <div class="prod1">
                    <ul>
                        <li>发布时长：1个月24天</li>
                        <li>目前股权状况：一共买的价钱</li>
                        <li>融资方式：股权融资</li>
                    </ul>
                </div>
                <div class="prod2">
                    <ul>
                        <li>期限：6个月</li>
                        <li>融资占比：谁买了，买了多少</li>
                        <li>意向投资方：互相关注的</li>
                    </ul>
                </div>
            </div>
            <div id="nav-footer">
            </div>
        </div>
    </div>
    <div id="footer">
    </div>
</body>

</html>

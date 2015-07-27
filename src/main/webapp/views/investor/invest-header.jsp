<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
    <title>header</title>
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
                            <span class="nav-item">投资板块</span>
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
                            <span class="nav-item">信息披露</span>
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
                                <a href="/investor/ifollow.htm" title="">
                                    <span>我关注的</span>
                                </a>
                            </li>
                            <li>
                                <a href="/investor/inews.htm" title="">
                                    <span>我的消息</span>
                                </a>
                            </li>
                            <li>
                                <a href="/investor/isource.htm" title="">
                                    <span>资料管理</span>
                                </a>
                            </li>
                            <li>
                                <a href="/investor/logout.htm" title="">
                                    <span>退出</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</body>

</html>

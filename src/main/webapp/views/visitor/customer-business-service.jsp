<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="/public/stylesheets/customer-header.css">
    <link rel="stylesheet" type="text/css" href="/public/stylesheets/company-service-content.css">
    <link rel="stylesheet" type="text/css" href="/public/stylesheets/customer-footer.css">
    <script type="text/javascript" src="/public/javascripts/jq.js"></script>
    <script type="text/javascript" src="/public/javascripts/citi.js"></script>
    <script src="/public/javascripts/unslider.js"></script>
    <script type="text/javascript">
    $(window).load(function() {
        var unslider = $('.banner').unslider({
            delay: 3000,
            fluid: true
        });
        $('.unslider-arrow').click(function() {
            var fn = this.className.split(' ')[1];
            unslider.data('unslider')[fn]();
        });

    });
    </script>
    <title>企业服务</title>
</head>

<body>
    <div id="header">
        <div id="header-nav">
            <div id="nav-list">
                <ul>
                    <li>
                        <a href="/index" title="">
                            <span class="nav-item">
								首页
							</span>
                        </a>
                    </li>
                    <li>
                        <a href="/finance" title="">
                            <span class="nav-item">融资企业</span>
                        </a>
                    </li>
                    <li>
                        <a href="/invest" title="">
                            <span class="nav-item">投资中心</span>
                        </a>
                    </li>
                    <li id="service">
                        <a href="/service" title="">
                            <span class="nav-item active">企业服务</span>
                        </a>
                        <div id="service-subnav">
                            <ul>
                                <li>
                                    <a href="/management" title="">
                                        <span>资产管理</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="/esignature" title="">
                                        <span>电子签约</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="/invetfinane" title="">
                                        <span>投/融资</span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>
            <div id="nav-login">
                <ul>
                    <li>
                        <a href="/login" title="">
                            <span>登陆</span>
                        </a>
                    </li>
                    <li>
                        <a href="/reg" title="">
                            <span>注册</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div id="main">
        <div id="content">
            <div id="first-glance" class="banner">
                <a href="#" class="unslider-arrow next">
                    <img src="/public/images/btn-pre.png" alt="" />
                </a>
                <a href="#" class="unslider-arrow next">
                    <img src="/public/images/btn-next.png" alt="" />
                </a>
                <ul>
                    <li style="background-image:url(/public/images/banner1.jpg)">
                    </li>
                    <li style="background-image:url(/public/images/banner2.png)">
                    </li>
                    <li style="background-image:url(/public/images/banner3.png)">
                    </li>
                </ul>
            </div>
            <div id="service-item">
                <div id="item-management">
                    <p class="title">资产管理</p>
                    <p class="item-describe">
                        可为单一客户提供定向资产管理服务
                        <br/> 为多个用户办理集合资产管理业务
                        <br/> 为客户特定目的办理专项资产管理业务
                    </p>
                    <div class="other">
                        <span>了解更多</span>
                        <span>
	            			<a href="/go" title="">
	            				去管理
	            			</a>
            			</span>
                    </div>
                </div>
                <div id="item-esignature">
                    <p class="title">电子签约</p>
                    <p class="item-describe">
                        自动化线上交易
                        <br/> 通过业务洽谈，协商协议具体内容
                        <br/> 依托数字认证，时间戳认证，完成线上交易
                    </p>
                    <div class="other">
                        <span>了解更多</span>
                        <span>
	            			<a href="/go" title="">
	            				去签约
	            			</a>
            			</span>
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

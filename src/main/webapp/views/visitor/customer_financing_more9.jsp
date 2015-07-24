<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>游客模式-融资企业-详情查看</title>
    <link href="/public/stylesheets/customer_financing_more.css" rel="stylesheet" type="text/css">
    <link href="/public/stylesheets/customer-header.css" rel="stylesheet" type="text/css">
    <link href="/public/stylesheets/customer-footer.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/public/javascripts/jq.js"></script>
    <script type="text/javascript" src="/public/javascripts/islider.js"></script>
    <script type="text/javascript">
    window.onload = function() {
        $('.banner').unslider({
            fluid: true,
            dots: true
        });
        var arr = ['url(/public/images/s9_1.png)',
            'url(/public/images/s9_2.png)',
            'url(/public/images/s9_3.png)'
        ];
        var i = 0;
        $('.dot').each(function() {
            this.style.backgroundImage = arr[i++];
        });
    }
    </script>
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
                        <span class="nav-item active">融资企业</span>
                    </a>
                </li>
                <li>
                    <a href="/invest" title="">
                        <span class="nav-item">投资中心</span>
                    </a>
                </li>
                <li id="service">
                    <a href="/service" title="">
                        <span class="nav-item">企业服务</span>
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
        <div class="container">
            <div class="top">
                <img class="head" src="/public/images/logo_0009.jpg">
                <p style="font-size: 2em">日航饭店</p><br/>
                <div class="about">
                    <p>拥有中、西、日式餐厅、酒吧和茶室，可满足不同口味客人的需要</p>
                </div>
                <div class="top-right">
                    <div class="return">
                        <a id="return0" href="">访问官网</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a id="return" href="">返回上一层<img style="vertical-align: middle" src="/public/images/back.png"></a>
                    </div>
                    <div class="button" id="send">
                        <a href="">发送意见</a>
                    </div>
                    <div class="button" id="attention">
                        <a href="">关注企业</a>
                    </div>
                </div>
            </div><hr class="clear"/>
            <div class="center">
                <h2 style="font-size: 1.2em">公司信息</h2><br>
                <div class="center-left">
                    <div class="center-title-line">
                        <span class="title">基本信息：</span>
                        <span class="short-line"></span>
                    </div>
                    <div class="center-content">
                        成立时间：2006<br/>
                        注册资本：500万人民币<br/>
                        咨询电话：0769-89178333<br/>
                        企业类型：有限责任公司<br/>
                        注册地址：东莞市南城区莞太路<br/><br/>
                    </div>
                    <div class="center-title-line">
                        <span class="title">公司规模：</span>
                        <span class="short-line"></span>
                    </div>
                    <div class="center-content">
                        分厂：无<br/>
                        子公司：无<br/>
                        驻外办事处机构：无<br/>
                        员工人数：200人<br/>
                        占地面积：10000平米<br/><br/>
                    </div>
                </div>
                <div class="center-right">
                    <p style="font-size: 1.1em">公司图片：</p>
                    <br/>
                    <div class="imgBox" id="slider">
                        <div class="banner">
                            <ul id="banner-image">
                                <li style="background-image: url(/public/images/rotate9_1.png)"></li>
                                <li style="background-image: url(/public/images/rotate9_2.png)"></li>
                                <li style="background-image: url(/public/images/rotate9_3.png)"></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="bottom">
                <div class="bottom-title-line">
                    <span class="title">行业发展：</span>
                    <span class="long-line"></span>
                </div>
                <div class="center-content">
                    所属行业：服务业<br/>
                    细分行业：餐饮<br/>
                    <p class="content">
                    </p><br/>
                </div>
                <div class="bottom-title-line">
                    <span class="title">产品服务：</span>
                    <span class="long-line"></span>
                </div>
                <div class="center-content">
                    <p class="content">主要经营川菜、鲁菜、创新菜、台湾菜、各式精美小炒、南北各地风味小吃。客人在此可享受全身心的放松。特色美食廊，传统的异国风情甜品、西饼，各种色拉、海鲜、甜点自助，不同的国度，体验不同的异国风情。
                    </p><br/>
                </div>
                <div class="bottom-title-line">
                    <span class="title">优势专长：</span>
                    <span class="long-line"></span>
                </div>
                <div class="center-content">
                    技术优势：先进的技术<br/>
                    产品优势：产品符合大众口味<br/>
                    市场优势：市场必需品<br/>
                    人才优势：兢兢业业的优秀员工<br/>
                    管理优势：卓有成效的管理团队<br/>
                    品牌优势：品质安全健康<br/><br/>
                </div>
                <div class="bottom-title-line">
                    <span class="title">公司介绍：</span>
                    <span class="long-line"></span>
                </div>
                <div class="center-content">
                    <p class="content">
                        设有中、西、韩餐厅、酒吧、多功能厅等，位于酒店2层的中餐厅、包间装修豪华、富有特色，提供川、鲁、粤各种风味菜肴，由大师精心烹制的菜肴美味经典，味道独特，周到热情的服务让人印象深刻，受到新老顾客的一致好评。
                    </p>
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
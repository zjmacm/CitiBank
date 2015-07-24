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
        var arr = ['url(/public/images/s2_1.png)',
            'url(/public/images/s2_2.png)',
            'url(/public/images/s2_3.png)'
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
                <img class="head" src="/public/images/logo_0002.jpg">
                <p style="font-size: 2em">仙宗汇饭店</p>
                <br/>
                <div class="about">
                    <p>是一家四星级酒店，位于重庆北部新城核心商业区域，地理位置优越，交通便利。</p>
                </div>
                <div class="top-right">
                    <div class="return">
                        <a id="return0" href="">访问官网</a> &nbsp;&nbsp;&nbsp;&nbsp;
                        <a id="return" href="">返回上一层<img style="vertical-align: middle" src="/public/images/back.png"></a>
                    </div>
                    <div class="button" id="send">
                        <a href="">发送意见</a>
                    </div>
                    <div class="button" id="attention">
                        <a href="">关注企业</a>
                    </div>
                </div>
            </div>
            <hr class="clear" />
            <div class="center">
                <h2 style="font-size: 1.2em">公司信息</h2>
                <br>
                <div class="center-left">
                    <div class="center-title-line">
                        <span class="title">基本信息：</span>
                        <span class="short-line"></span>
                    </div>
                    <div class="center-content">
                        成立时间：2003
                        <br/> 注册资本：500万人民币
                        <br/> 咨询电话：4007-889-889
                        <br/> 企业类型：民营企业
                        <br/> 注册地址：重庆江北区红锦大道2号
                        <br/>
                        <br/>
                    </div>
                    <div class="center-title-line">
                        <span class="title">公司规模：</span>
                        <span class="short-line"></span>
                    </div>
                    <div class="center-content">
                        分厂：无<br/>
                        子公司：5个<br/> 
                        驻外办事处机构：无<br/> 
                        员工人数：1600人<br/> 
                        占地面积：10000平米<br/><br/>
                    </div>
                </div>
                <div class="center-right">
                    <p style="font-size: 1.1em">公司图片：</p>
                    <br/>
                    <div class="imgBox" id="slider">
                        <div class="banner">
                            <ul id="banner-image">
                                <li style="background-image: url(/public/images/rotate2_1.png)"></li>
                                <li style="background-image: url(/public/images/rotate2_2.png)"></li>
                                <li style="background-image: url(/public/images/rotate2_3.png)"></li>
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
                    所属行业：服务业
                    <br/> 细分行业：餐饮
                    <br/>
                    <p class="content">
                    </p>
                    <br/>
                </div>
                <div class="bottom-title-line">
                    <span class="title">产品服务：</span>
                    <span class="long-line"></span>
                </div>
                <div class="center-content">
                    <p class="content">仙宗汇饭店的精品菜肴，仅继承保留了中国美食推崇的色香味，更是在此基础上大胆创新，融合了各个菜系的优点，发展出独特的新派菜风格。
                    </p>
                    <br/>
                </div>
                <div class="bottom-title-line">
                    <span class="title">优势专长：</span>
                    <span class="long-line"></span>
                </div>
                <div class="center-content">
                    技术优势：先进的技术
                    <br/> 产品优势：产品符合大众口味
                    <br/> 市场优势：市场必需品
                    <br/> 人才优势：兢兢业业的优秀员工
                    <br/> 品牌优势：卓有成效的管理团队
                    <br/> 管理优势：品质安全健康
                    <br/>
                    <br/>
                </div>
                <div class="bottom-title-line">
                    <span class="title">公司介绍：</span>
                    <span class="long-line"></span>
                </div>
                <div class="center-content">
                    <p class="content">
                        集餐饮、生态养殖、早餐快餐冷链物流配送、连锁经营、休闲旅游、幸福美丽乡村建设、古镇院落式特色酒店、餐饮职业培训学校、能源、金融投资等为一体的大型民营企业。
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

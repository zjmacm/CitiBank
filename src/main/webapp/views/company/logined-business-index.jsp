<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>

<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1" />
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/logined-busiess-index.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <script type="text/javascript" src="../public/javascripts/jq.js"></script>
    <script type="text/javascript" src="../public/javascripts/d3.min.js"></script>
    <script type="text/javascript" src="../public/javascripts/citi.js"></script>
    <script src="../public/javascripts/unslider.js"></script>
    <script type="text/javascript">
    $(window).load(function() {
        var unslider = $('.banner').unslider({
            delay: 3000,
            fluid: true
        });
        $('#site-banner-r').css({
            height: '240px'
        })
        $('#site-banner-l').css({
            height: '240px'
        })
        $('.unslider-arrow').click(function() {
            var fn = this.className.split(' ')[1];
            unslider.data('unslider')[fn]();
        });
        var lscroll = {
            parent: {
                obj: '#policy-item',
                height: 240
            },
            scroll: {
                height: 360,
                speedUp: 120,
                firstScroll: '#lf',
                secondScroll: '#ls'
            }

        };

        var rscroll = {
            parent: {
                obj: '#market-item',
                height: 240
            },
            scroll: {
                height: 360,
                speedUp: 120,
                firstScroll: '#rf',
                secondScroll: '#rs'
            }
        }

        citi.scrollUp(lscroll);
        citi.scrollUp(rscroll);
    })
    </script>
    <title>企业首页</title>
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
            <div class="banner" id="first-glance">
                <a href="#" class="unslider-arrow next">
                    <img src="../public/images/btn-pre.png" alt="" />
                </a>
                <a href="#" class="unslider-arrow next">
                    <img src="../public/images/btn-next.png" alt="" />
                </a>
                <ul>
                    <li style="background-image:url(../public/images/banner1.jpg)">
                    </li>
                    <li style="background-image:url(../public/images/banner2.png)">
                    </li>
                    <li style="background-image:url(../public/images/banner3.png)">
                    </li>
                </ul>
            </div>
            <!-- <div class="banner" id="second-glance">
                <a href="#" class="unslider-arrow next">
                    <img src="../public/images/btn-pre.png" alt="" />
                </a>
                <a href="#" class="unslider-arrow next">
                    <img src="../public/images/btn-next.png" alt="" />
                </a>
                <ul>
                    <li style="background-image:url(../public/images/company1.png)">
                    </li>
                    <li style="background-image:url(../public/images/company2.png)">
                    </li>
                </ul>
            </div> -->
            <div id="invest-center">
                <div id="inv-title">
                    <p id="inv-title">推荐投资人</p>
                </div>
                <div id="invest-list">
                    <div id="left-banner">
                        <p>知名投资人</p>
                        <div class="banner" id="site-banner-l">
                            <ul>
                                </li>
                                <li style="background-image:url(../public/images/company1.png)">
                                </li>
                                <li style="background-image:url(../public/images/company2.png)">
                                </li>
                            </ul>
                        </div>
                        <div class="invest-more">
                            <span><a href="/invest-more" title="">查看更多投资人>></a></span>
                        </div>
                    </div>
                    <div id="right-banner">
                        <p>新晋投资人</p>
                        <div class="banner" id="site-banner-r">
                            <ul>
                                <li style="background-image:url(../public/images/company3.png)">
                                </li>
                                <li style="background-image:url(../public/images/company4.png)">
                                </li>
                            </ul>
                        </div>
                        <div class="invest-more">
                            <span><a href="/invest-more" title="">查看更多投资人>></a></span>
                        </div>
                    </div>
                </div>
            </div>
            <div id="news">
                <p id="zixun">资讯</p>
                <div id="news-area">
                    <ul>
                        <li>
                            <div class="title-nav">
                                <span>政策资讯</span>
                                <span class="more">
                                    <a href="/more" title="">更多</a>
                                </span>
                            </div>
                            <div id="policy-item">
                                <div class="zixun-item" id="lf">
                                    <p>
                                        <a title="浙江发布金融产业发展规划 金融产业再获政策支持" href="_target">浙江发布金融产业发展规划 金融产业再获政策支持
                                        </a>
                                    </p>
                                    <p>
                                        <a title="用好改革政策做好金融工作 " href="_target">用好改革政策做好金融工作 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="金融数据显经济企稳 央行定调下半年政策" href="_target">金融数据显经济企稳 央行定调下半年政策
                                        </a>
                                    </p>
                                    <p>
                                        <a title="国务院部署促进进出口稳定增长政策措施 " href="_target">国务院部署促进进出口稳定增长政策措施 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="央行定调货币政策：基调保持稳健 调控追求精准" href="_target">央行定调货币政策：基调保持稳健 调控追求精准
                                        </a>
                                    </p>
                                    <p>
                                        <a title="金融数据显经济企稳 央行定调下半年政策" href="_target">金融数据显经济企稳 央行定调下半年政策
                                        </a>
                                    </p>
                                    <p>
                                        <a title="用好改革政策做好金融工作 " href="_target">用好改革政策做好金融工作 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="用好改革政策做好金融工作 " href="_target">用好改革政策做好金融工作 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="金融数据显经济企稳 央行定调下半年政策" href="_target">金融数据显经济企稳 央行定调下半年政策
                                        </a>
                                    </p>
                                </div>
                                <div class="zixun-item" id="ls">
                                    <p>
                                        <a title="浙江发布金融产业发展规划 金融产业再获政策支持" href="_target">浙江发布金融产业发展规划 金融产业再获政策支持
                                        </a>
                                    </p>
                                    <p>
                                        <a title="用好改革政策做好金融工作 " href="_target">用好改革政策做好金融工作 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="金融数据显经济企稳 央行定调下半年政策" href="_target">金融数据显经济企稳 央行定调下半年政策
                                        </a>
                                    </p>
                                    <p>
                                        <a title="浙江发布金融产业发展规划 金融产业再获政策支持" href="_target">浙江发布金融产业发展规划 金融产业再获政策支持
                                        </a>
                                    </p>
                                    <p>
                                        <a title="浙江发布金融产业发展规划 金融产业再获政策支持" href="_target">浙江发布金融产业发展规划 金融产业再获政策支持
                                        </a>
                                    </p>
                                    <p>
                                        <a title="浙江发布金融产业发展规划 金融产业再获政策支持" href="_target">浙江发布金融产业发展规划 金融产业再获政策支持
                                        </a>
                                    </p>
                                    <p>
                                        <a title="国务院部署促进进出口稳定增长政策措施 " href="_target">国务院部署促进进出口稳定增长政策措施 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="用好改革政策做好金融工作 " href="_target">用好改革政策做好金融工作 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="浙江发布金融产业发展规划 金融产业再获政策支持" href="_target">浙江发布金融产业发展规划 金融产业再获政策支持
                                        </a>
                                    </p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="title-nav">
                                <span>市场资讯</span>
                                <span class="more">
                                    <a href="/more" title="">更多</a>
                                </span>
                            </div>
                            <div id="market-item">
                                <div class="zixun-item" id="rf">
                                    <p>
                                        <a title="2015年上半年社会融资规模增量8.81万亿元 " href="_target">2015年上半年社会融资规模增量8.81万亿元 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="德隆系前高管操盘 深圳惠程证券投资收益剧增" href="_target">德隆系前高管操盘 深圳惠程证券投资收益剧增
                                        </a>
                                    </p>
                                    <p>
                                        <a title="德隆系前高管操盘 深圳惠程证券投资收益剧增" href="_target">德隆系前高管操盘 深圳惠程证券投资收益剧增 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="方正证券被证监会立案调查 涉嫌信息披露违规" href="_target">方正证券被证监会立案调查 涉嫌信息披露违规 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="工行与泛欧交易所开展战略合作 " href="_target">工行与泛欧交易所开展战略合作 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="理财产品发行量维持平稳" href="_target">理财产品发行量维持平稳 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="红蜻蜓等6只新股周一上市定位分析" href="_target">红蜻蜓等6只新股周一上市定位分析
                                        </a>
                                    </p>
                                    <p>
                                        <a title="赛升药业等3只新股周三申购指南 顶格需83.4万元" href="_target">赛升药业等3只新股周三申购指南 顶格需83.4万元 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="兖州煤业高管增持超10万股 拟投资超23亿建煤矿" href="_target">兖州煤业高管增持超10万股 拟投资超23亿建煤矿
                                        </a>
                                    </p>
                                </div>
                                <div class="zixun-item" id="rs">
                                    <p>
                                        <a title="2015年上半年社会融资规模增量8.81万亿元 " href="_target">2015年上半年社会融资规模增量8.81万亿元 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="德隆系前高管操盘 深圳惠程证券投资收益剧增" href="_target">德隆系前高管操盘 深圳惠程证券投资收益剧增
                                        </a>
                                    </p>
                                    <p>
                                        <a title="德隆系前高管操盘 深圳惠程证券投资收益剧增" href="_target">德隆系前高管操盘 深圳惠程证券投资收益剧增 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="方正证券被证监会立案调查 涉嫌信息披露违规" href="_target">方正证券被证监会立案调查 涉嫌信息披露违规 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="工行与泛欧交易所开展战略合作 " href="_target">工行与泛欧交易所开展战略合作 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="理财产品发行量维持平稳" href="_target">理财产品发行量维持平稳 
                                        </a>
                                    </p>
                                    <p>
                                        <a title="红蜻蜓等6只新股周一上市定位分析" href="_target">红蜻蜓等6只新股周一上市定位分析
                                        </a>
                                    </p>
                                    <p>
                                        <a title="赛升药业等3只新股周三申购指南 顶格需83.4万元" href="_target">赛升药业等3只新股周三申购指南 顶格需83.4万元 
                                        </a>
                                    </p>
                                </div>
                            </div>
                        </li>
                    </ul>
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

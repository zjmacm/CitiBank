<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1" />
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/release_tender_offers.css">
    <title>股权发布</title>

</head>
<body>
<div id="header">
    <div id="header-nav">
        <div id="nav-list">
            <ul>
                <li>
                    <a href="/investor/index.htm" title="">
                        <span class="nav-item  active">首页</span>
                    </a>
                </li>
                <li id="finance">
                    <a href="/financing/Matching.htm" title="">
                        <span class="nav-item">投资板块</span>
                    </a>
                    <div id="finance-subnav">
                        <ul>
                            <li>
                                <a href="/financing/Matching.htm" title="">
                                    <span>撮合配对</span>
                                </a>
                            </li>
                            <li>
                                <a href="/intention/getIntentionPage" title="">
                                    <span>意向发布</span>
                                </a>
                            </li>
                            <li>
                                <a href="/invetfinane" title="">
                                    <span>业务洽谈</span>
                                </a>
                            </li>
                            <li>
                                <a href="/electronical/getElectronicalPage" title="">
                                    <span>电子签约</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li>
                    <a href="/report/getReport.htm" title="">
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
<div id="main_body_m">
    <div id="swap">
        <div id="list">
            <div id="list-title">
                <span>意向发布</span>
            </div>
            <div id="list-item">
                <span ><a href="/intention/getIntentionPage">股权收购</a></span>
                <span ><a href="/intention/getDebtPage">债权购买</a></span>
            </div>

        </div>

        <div class="main_body">
            <div id="main_first">
                <div class="body_title">
                    基本信息
                </div>
                <hr >
                <div class="first">
                    <p >
                        姓名：自动获取<br/>
                        所在地区：自动获取<br/>
                        产品类型：股权投资<br/>
                    </p>
                </div>
                <div class="first">
                    <p >
                        投资地区：自动获取<br/>
                        资金主体：自动获取<br/>
                        投资行业：自动获取<br/>
                    </p>
                </div>
                <div class="input_text">
                    <form class="input_form">
                        <label >投资金额：</label>
                        <input class="input" type="text"/>
                        <label> — </label>
                        <input class="input" type="text"/>
                        <label>万</label>
                    </form>
                    <form >
                        <label >投资年限：</label>
                        <input class="input" type="text"/>
                        <label> 年 </label>
                    </form>
                </div>

            </div>
            <div class="main_first">
                <div class="body_title">
                    更多信息
                </div>
                <hr>
                <div class="input_text">
                    <form class="input_form">
                        <label >参股比例:</label>
                        <input class="input" type="text"/>
                        <label> — </label>
                        <input class="input" type="text"/>
                        <label>%</label>
                    </form>
                    <form >
                        <label >投资阶段:</label>
                        <select>
                            <option value="种子">种子</option>
                            <option value="初创" selected="selectd">初创</option>
                            <option value="拓展前">拓展前</option>
                            <option value="拓展后">拓展后</option>
                            <option value="Pre-IPO">Pre-IPO</option>
                        </select>
                    </form>
                    <form class="input_form">
                        <label >要求提供文件:</label>
                        <input class="input_doc" type="text"/>
                        <br/>
                        <div class="input_textarea"> 投资要求概述: </div>
                        <textarea rows="7" cols="60"></textarea>
                    </form>
                </div>
                <div id="button">
                    <a href="/intention/intentionPublish">发布</a>
                </div>

            </div>
        </div>
    </div>
</div>



<div id="footer">
</div>
</body>
</html>
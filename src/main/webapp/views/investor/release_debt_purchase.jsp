<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1" />
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/release_debt_purchase.css">
    <title>债权购买</title>

</head>
<body>
<div id="header">
    <div id="header-nav">
        <div id="nav-list">
            <ul>
                <li>
                    <a href="/index" title="">
							<span class="nav-item active" >
								首页
							</span>
                    </a>
                </li>
                <li>
                    <a href="/finance" title="">
                        <span class="nav-item">投资模块</span>
                    </a>
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
<div id="main_body_m">
    <div id="swap">
        <div id="list">
            <div id="list-title">
                <span>意向发布</span>
            </div>
            <div id="list-item">
                <span ><a href="/intention/getIntentionPage">股权收购</a></span>
                <span id="selected"><a href="/intention/getDebtPage">债权购买</a></span>
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
                        <label >最低回报要求:（年利率）</label>
                        <input class="input" type="text"/>
                        <label> — </label>
                        <input class="input" type="text"/>
                        <label>%</label>
                    </form>
                    <form >
                        <label >风险控制要求:</label>
                        <select>
                            <option value="看书">看书</option>
                            <option value="抵押" selected="selectd">抵押</option>
                            <option value="运动">运动</option>
                            <option value="购物">购物</option>
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
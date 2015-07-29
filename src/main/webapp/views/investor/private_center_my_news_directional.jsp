<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1"/>
    <title>个人中心-我的消息</title>
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/private-center-my-news.css">

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
                                            <img src="../public/images/user.png" alt="">
                                        </a>
		                			</span>
                </li>
                <li id="go">
                        					<span id="text">我的账号
                        						<img src="../public/images/back-bottom.png">
                        					</span>
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
<div id="mainContainer">
    <div id="main">
        <div id="sidebarContainer">
            <div id="listTitle">
                <ul id="sidebarTitle">
                    <li class="sidebarItem">我的消息</li>
                </ul>
            </div>
            <div id="listContent">
                <ul id="sidebar">
                    <li class="sidebarItem"><a href="" class="sidebarItem">系统信息</a></li>
                    <li class="sidebarItem"><a href="" class="sidebarItem">私信</a></li>
                    <li class="sidebarItem_selected"><a href="" class="sidebarItem">定向披露</a></li>
                </ul>
            </div>
        </div>
        <div id="mainContent">
            <div id="searchForm">
                <p>查询：</p>

                <div id="searchInput">
                    <input id="searchText" type="text" placeholder="请输入关键字搜索">
                </div>
                <a href="" style="display:inline;">
                    <div id="searchButton">确定</div>
                </a>

            </div>
            <!--******* *************************************** table**********************************************-->
            <div id="TableList">
                <table class="hovertable">

                    <tr>
                        <th>&nbsp;日期&nbsp;&nbsp;&nbsp;</th>
                        <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;内容&nbsp;&nbsp;&nbsp;</th>
                        <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;更多操作</th>
                    </tr>

                    <!--*****************全是一样的**************************************************************************************-->
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
                    </tr>
                    <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                        onMouseOut="this.style.backgroundColor='#d4e3e5';">
                        <td>&nbsp;&nbsp;&nbsp;2015-07-08&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;深圳成乐达电力建设公司关注了您&nbsp;&nbsp;&nbsp;</td>
                        <td><a class="com_detail" href="link address">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除&nbsp;&nbsp;&nbsp;企业详情</a>
                        </td>
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
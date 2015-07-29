<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1" />
    <title>个人中心-我的消息</title>
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/personal_center_my_message_privately.css">

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
                    <li class="sidebarItem"><a href="" class="sidebarItem">定向披露</a></li>
                </ul>
            </div>
        </div>
        <div id="mainContent">
            <div id="searchForm">
                <div id="searchInput">
                    <input id="searchText" type="text" placeholder="请输入关键字">
                </div>
                <a href="" style="display:inline;">
                    <div class="searchButton">确定</div>
                </a>

            </div>
            <div id="mainContent_list">
                <div class="table_item">
                    &nbsp;&nbsp;股权人定向披露
                    <img class="img_down" src="../public/images/pick_up.png">
                </div>
                <div class="table_item_text">
                    <div class="pick_up_first">
                      <span>请选择定向披露的对象:</span><br/>
                        <form  >
                            <input type="checkbox" />
                            <label>男</label><br/>
                            <input type="checkbox"  />
                            <label>女</label><br/>
                            <input type="checkbox"/>
                            <label>王森淼</label>
                        </form>
                    </div>
                    <div class="pick_up_second">
                        <form  >
                            <label>股份变动及股东变动情况.PDF</label><br/>
                            <label>股份变动及股东变动情况.PDF</label><br/>
                            <label>股份变动及股东变动情况.PDF</label>
                        </form>
                    </div>
                    <div class="inputButton">
                        <a href="" style="display:inline;">
                            <div class="searchButton">确定</div>
                        </a>
                    </div>

                </div>

                <div class="table_item">
                    &nbsp;&nbsp;债权人定向披露
                    <img class="img_down" src="../public/images/pick_up.png">
                </div>
                <div class="table_item_text">
                    <div class="pick_up_first">
                        <span>请选择定向披露的对象:</span><br/>
                        <form  >
                            <input type="checkbox" />
                            <label>男</label><br/>
                            <input type="checkbox"  />
                            <label>女</label><br/>
                            <input type="checkbox"/>
                            <label>王森淼</label>
                        </form>
                    </div>
                    <div class="pick_up_second">
                        <form  >
                            <label>股份变动及股东变动情况.PDF</label><br/>
                            <label>股份变动及股东变动情况.PDF</label><br/>
                            <label>股份变动及股东变动情况.PDF</label>
                        </form>
                    </div>
                    <div class="inputButton">
                        <a href="" style="display:inline;">
                            <div class="searchButton">确定</div>
                        </a>
                    </div>

                </div>
            </div>
            <div id="page">
                <div>

                </div>
            </div>
        </div>
    </div>
</div>
<div id="footer">
</div>
</body>

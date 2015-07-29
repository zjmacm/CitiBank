<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>

<head>
	<meta charset="UTF-8">
    	<meta name="renderer" content="webkit">
    	<meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1" />
	<title>电子签约-协议查询</title>
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/eletronic-contrating-inquiry-protocol.css">

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
			<jsp:include page="list_signed.jsp"/>
			<div id="mainContent">
            <p class="title">信用监管报告</p>
                     <div id="searchForm">
					<div id="searchInput">
                        <div id="textClear">
                            <a href=""><img src="../public/images/cancel.png"></a>
                        </div>
						<input id="searchText" type="text" placeholder="请输入关键字搜索">
					</div>
					<a href="" style="display:inline;">
                                                                                <div id="searchButton">查询</div>
                                                                    </a>

				    </div>
                    <div id="selectForm">
                        <p>排序：</p>
                        <select>
                            <option></option>
                            <option>签约时间</option>
                            <option>签约方</option>
                            <option>合约内容</option>
                            <option>状态</option>
                        </select>
                    </div>
<!--******* *************************************** table**********************************************-->
                    <div id="TableList">
                    	<table class="hovertable">
                        
                        <tr>
                        	<th>签约时间</th><th>签约方</th><th>合约内容</th><th>状态</th>
                        </tr>
                        
   <!--*****************全是一样的**************************************************************************************-->
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
                        </tr>
                        <tr>
                            <td>2015-01-01</td><td>安心股权有限公司</td><td>股权转让协议</td> <td>审核中</td>
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
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>

<head>
	<meta charset="UTF-8">
    	<meta name="renderer" content="webkit">
    	<meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1" />
	<title>已登录-企业模式-融资板块（撮合配对）</title>
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/user-corporate-mode-finance-patch.css">
    <script type="text/javascript" src="../public/javascripts/jq.js"></script>
</head>
<body>
	<div id="header">
        		<jsp:include page="invest-header.jsp"/>
    	</div>
	<div id="mainContainer">
		<div id="main">
			<div id="mainContent">
                    <div id="searchForm">
                        <div id="searchInput">
                                <div id="textClear">
                                    <a href=""><img src="../public/images/cancel.png"></a>
                                </div>
                                <input id="searchText" type="text" placeholder="请输入关键字搜索">
                        </div>
                        <a href="" style="display:inline;">
                            <div id="searchButton">确定</div>
                        </a>
                   </div>
                   <div id="selectForm">
                        <p>类型：</p>
                        <select>
                            <option>全部</option>
                            <option>股权投资</option>
                            <option>债权投资</option>
                        </select>
                    </div>
                    <a href="javascript:void(0);" style="display:inline;color:#2A324B;padding-left:20px;" onclick="$('#patchPanel').slideToggle('slow');">显示/隐藏筛选信息</a>
                    <div id="patchPanel">
                        <div>地区筛选：<div class="selectItemGroup">
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                                <span class="selectItem"><input type="checkbox">地区一</span>
                            </div>
                            
                        </div>
                        <br/>
                        <div>行业筛选：<div class="selectItemGroup">
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                                <span class="selectItem"><input type="checkbox">行业一</span>
                            </div>
                        </div>
                        <br/>
                        <div>资金类型：<div class="selectItemGroup">
                                <span class="selectItem"><input type="checkbox">全部</span>
                                <span class="selectItem"><input type="checkbox">个人资金</span>
                                <span class="selectItem"><input type="checkbox">企业资金</span>
                                <span class="selectItem"><input type="checkbox">投资公司</span>
                                <span class="selectItem"><input type="checkbox">基金公司</span>
                                <span class="selectItem"><input type="checkbox">其他资金</span>
                            </div>
                        </div>
                        <br/>
                        <div>金额区间：<div class="selectItemGroup">
                                <input type="input" class="sizeSelect">&nbsp;-&nbsp;<input type="input" class="sizeSelect">
                                万元
                            </div>
                        </div>
                        <br/>
                        <div>收益率范围：<div class="selectItemGroup">
                                <input type="input" class="sizeSelect">&nbsp;-&nbsp;<input type="input" class="sizeSelect">
                                %
                        </div>
                        <a href="/financing/matching">
                            <div id="patchConfirmButton">确定</div>
                        </a>
                    </div>
                </div> 
<!--******* *************************************** table**********************************************-->
                    <div id="TableList">
                    	<table>
                        
                        <tr>
                        	<th>产品名称</th>
                            <th>类型</th>
                            <th>地区</th>
                            <th>资金类型</th>
                            <th>金额</th>
                            <th class="rightItem">投资者</th>
                        </tr>
                        
   <!--*****************全是一样的**************************************************************************************-->
                        <tr>
                            <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td><td>股权投资</td><td>深圳市</td><td>企业资金</td><td>4000万</td><td>王女士</td>
                        </tr>
                        <tr>
                            <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td><td>股权投资</td><td>深圳市</td><td>企业资金</td><td>4000万</td><td>王女士</td>
                        </tr>
                        <tr>
                            <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td><td>股权投资</td><td>深圳市</td><td>企业资金</td><td>4000万</td><td>王女士</td>
                        </tr>
                        <tr>
                            <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td><td>股权投资</td><td>深圳市</td><td>企业资金</td><td>4000万</td><td>王女士</td>
                        </tr>
                        <tr>
                            <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td><td>股权投资</td><td>深圳市</td><td>企业资金</td><td>4000万</td><td>王女士</td>
                        </tr>
                        <tr>
                            <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td><td>股权投资</td><td>深圳市</td><td>企业资金</td><td>4000万</td><td>王女士</td>
                        </tr>
                    </table>
                    </div>
				<div id="page">
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
    	</div>
</body>
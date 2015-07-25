<head>
	<meta charset="UTF-8">
    	<meta name="renderer" content="webkit">
    	<meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1" />
	<title>我要发布</title>
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/message-publish-my-publish.css">
	<script type="text/javascript" src="../public/javascripts/jq.js"></script>
	<script type="text/javascript" src="../public/javascripts/publish.js"></script>
</head>
<body>
<jsp:include page="customer-header.jsp"/>
	<div id="mainContainer">
		<div id="main">
			<div id="sidebarContainer">
				<div id="listTitle">
					<ul id="sidebarTitle">
						<li class="sidebarItem">电子签约</li>
					</ul>
				</div>	
				<div id="listContent">
					<ul id="sidebar">
						<li class="sidebarItem"><a href="" class="sidebarItem">协议签约</a></li>
						<li class="sidebarItem"><a href="" class="sidebarItem">协议查询</a></li>
						<li class="sidebarItem"><a href="" class="sidebarItem">返回</a></li>
					</ul>
				</div>
			</div>
			<div id="mainContent">
				<div id="searchForm">
					<div id="input">
						<div id="textClear">
							<a href=""><img src="../public/images/cancel.png"></a>
						</div>
						<textarea id="searchText" rows="1" placeholder="请输入关键字搜索"></textarea>
					</div>
					<a href="">
					<img src="../public/images/search.png">
					<p id="searchTitle">搜索</p>
					</a>

				</div>
				<p class="title">我要发布</p>
				<div id="subjectListContainer">
					<table id="subjectListContent">
						<tr>
							<th>债券代码</th>
							<th>债券名称</th>
							<th>所属行业</th>
							<th>转让日期</th>
							<th>承销商</th>
							<th>受托人</th>
						</tr>
						<tr>
							<td class="listItem">a</td>
							<td class="listItem">a</td>
							<td class="listItem">a</td>
							<td class="listItem">a</td>
							<td class="listItem">a</td>
							<td class="listItem">a</td>
						</tr>
					</table>
				</div>
				<div>
					<a href="javascript:void(0);" onclick="startWidget()"><img src="../public/images/publish.png"></a>
				</div>
				<div id="page">
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
    	</div>
</body>

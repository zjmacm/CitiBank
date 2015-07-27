<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<head>
	<meta charset="UTF-8">
    	<meta name="renderer" content="webkit">
    	<meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1" />
	<title>预约管理-当前预约</title>
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/reservation-management-current-reservation.css">

</head>
<body>
	<jsp:include page="business-header.jsp"/>
	<div id="mainContainer">
		<div id="main">
			<div id="sidebarContainer">
				<div id="listTitle">
					<ul id="sidebarTitle">
						<li class="sidebarItem">预约管理</li>
					</ul>
				</div>	
				<div id="listContent">
					<ul id="sidebar">
						<li class="sidebarItem"><a href="/company/reservation_current.htm" class="sidebarItem">当前预约</a></li>
						<li class="sidebarItem"><a href="/company/reservation_finish.htm" class="sidebarItem">已完成预约</a></li>
						
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
                    <div id="selectForm">
                        <p>排序：</p>
                        <select>
                            <option></option>
                            <option>预约方</option>
                            <option>联系方式</option>
                            <option>预约时间</option>
                            <option>预约提交时间</option>
                            <option>操作</option>
                        </select>
                    </div>
<!--******* *************************************** table**********************************************-->
                    <div id="TableList">
                    	<table class="hovertable">
                        
                        <tr>
                        	<th>预约方</th><th>联系方式</th><th>预约时间</th><th>&nbsp;预约提交时间</th><th>&nbsp;&nbsp;操作</th>
                        </tr>
                        
   <!--*****************全是一样的**************************************************************************************-->
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                         <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                         <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                         <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                        <tr onMouseOver="this.style.backgroundColor='#ffff66';"
                            onMouseOut="this.style.backgroundColor='#d4e3e5';">
                            <td>王森淼&nbsp;</td><td>&nbsp;18840838187&nbsp;</td><td>&nbsp;2015-08-01&nbsp;</td> <td>&nbsp;2015-01-01&nbsp;&nbsp;</td><td><a class="A_finished"href="链接地址">&nbsp;&nbsp;&nbsp;完成&nbsp;&nbsp;&nbsp;</a></td>
                        </tr>
                      
    
                    </table>
                    <hr class="hr1"/>
                    </div>
                 <!--<div id="listcontain">
                 
                 
                       <ul id="Ul_listcontainer">
                       		<li class="h1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日期&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;内容&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;更多操作</li>
                            <hr class="line1">
                            
                       </ul>
                 </div>-->
				<div id="page">
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
    	</div>
</body>
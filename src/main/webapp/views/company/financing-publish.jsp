<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<link rel="stylesheet" href="../public/stylesheets/business-header.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/task1.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/finacing-publish.css">
	<link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <script type="text/javascript" src="/public/javascripts/jq.js"></script>
	<meta charset="UTF-8">
	<title>意向发布</title>
    <script type="text/javascript">
        $(document).ready(function(){
            console.log("helloworld");
            $.ajax({
                url : 'getCompanyInfo',
                type : 'post',
                dataType : 'json',
                data:{},
                error:'error',
                success:function(data){
                    $('#name').val(data.row.NAME);
                    $('#companyName').val(data.companyName);
                    $('#formedTime').val(data.formedTime);
                    $('#baseAddress').val(data.baseAddress);
                    $('#registerCapital').val(data.registerCapital);
                    $('#workingFiled').val(data.workingFiled);
                }

            });


        });
    </script>
</head>

<body>
<jsp:include page="business-header.jsp"/>
    <div class="wrap">
        	 <div class="nav">
                  <div class="title">
                      <p>意向发布</p>
                  </div><!--tit-->
                  <div class="tri">
                  </div>
                  <div class="tri1">
                  </div>
                  <div class="list">
                    <ul>
                        <li class="on">
                            <a href="#">私募股权</a>
                        </li>
                        <li>
                            <a href="/company/simuzhai.htm">私募债</a>
                        </li>
                        
                    </ul>
                   </div><!--list-->
            </div><!--nav-->
    	<div class="main">
            <form action="#" method="post">
        		<div class="basic_info">
        			<p class="tit">基本信息</p>
        			<div class="left fl">
        				<p>公司名称：<span id="companyName"></span></p>
    					<p>公司注册时间：<span id="formedTime"></span></p>
    					<p>产品类型：<span id=""></span></p>
        			</div><!--left-->
        			<div class="right fr">
        				<p>公司注册地区：<span id="baseAddress"></span></p>
    					<p>公司注册资本：<span id="registerCapital"></span></p>
    					<p>所属行业：<span id="workingFiled"></span></p>
        			</div><!--right-->
        			<div class="buttom">
    	    			<p>
    	    				发行金额：
    	    				<input type="text" >
    	    				—
    	    				<input type="text">
    	    				万
    	    			</p>
    	    			<p>
    	    				<label>发行年限：</label>
    	    				<input type="text" id="year">
    	    				年
    	    			</p>
    	    			<p>
                            <label for="text">发行完成:</label>
    	    				<textarea id="text"  cols=50 rows=6 >
                            </textarea>
                        </p>
    	    		</div><!--bottom-->
        		</div><!--basic_info-->
        		<div class="more_info">
        			<p class="tit">更多信息</p>
                    <div class="left fl">
                         <p> 
                            资金方占股比例：
                            <input class="por" type="text">
                            —
                            <input class="por" type="text">
                            %
                         </p>
                         <p>
                             投资退出方式：
                             <input class="exit" type="text">
                         </p>
                         <p>
                             项目所处阶段:
                            <input class="stage" type="text">
                         </p>
                         <p>
                             最短退出年限:
                            <input class="short" type="text">
                         </p>
                         <p>
                             担保方:
                            <input class="ensure" type="text">
                         </p>
                    </div><!--left-->
                    <div class="right right1 fl">
                        <p>
                            企业当前净资产:
                            <input  class="pro" type="text">
                            万
                        </p>
                        <p>
                             去年营业额：
                            <input class="trunover" type="text">
                            万
                        </p>
                        <p>
                            公司净利润：
                            <input  class="profits" type="text">
                            万
                        </p>
                        <p>
                            投资门槛：
                            <input type="text" class="threshold">
                            万
                        </p>
                        <p>
                            最低追加资金:
                            <input type="text" class="add">
                            万
                        </p>
                    </div><!--right-->
        		</div><!--more_info-->
                <input class="submit" type="submit" value="发布">
            </form>
    	</div><!--main-->
    </div><!--wrap-->
     <div id="footer">
        <div id="foot-list">
        </div>
    </div>
</body>
</html>
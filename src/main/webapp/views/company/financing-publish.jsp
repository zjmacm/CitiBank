<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"
        import ="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<link rel="stylesheet" href="/public/stylesheets/business-header.css">
	<link rel="stylesheet" type="text/css" href="/public/stylesheets/task1.css">
	<link rel="stylesheet" type="text/css" href="/public/stylesheets/finacing-publish.css">
	<link rel="stylesheet" type="text/css" href="/public/stylesheets/customer-footer.css">
    <script type="text/javascript" src="/public/javascripts/jquery-1.7.2.min.js"></script>
	<meta charset="UTF-8">
	<title>意向发布</title>
    <script type="text/javascript">

    </script>

</head>

<body>
<jsp:include page="business-header.jsp"/>
<%Map<String,Object> userInfo = (Map<String,Object>)request.getAttribute("userInfo");%>

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
            <form action="" method="post">

        		<div class="basic_info">
        			<p class="tit">基本信息</p>
        			<div class="left fl">
        				<p>公司名称：<%=userInfo.get("companyName")%></p>
    					<p>公司注册时间：<%=userInfo.get("formedTime")%></p>
    					<p>产品类型：<%=userInfo.get("productName")%></p>
        			</div><!--left-->
        			<div class="right fr">
        				<p>公司注册地区：<%=userInfo.get("baseAddress")%></p>
    					<p>公司注册资本：<%=userInfo.get("registerCapital")%></p>
    					<p>所属行业：<%=userInfo.get("workingFiled")%></p>
        			</div><!--right-->
        			<div class="buttom">
    	    			<p>
    	    				发行金额：
    	    				<input type="text" name="lowMoney">
    	    				—
    	    				<input type="text" name="highMoney">
    	    				万
    	    			</p>
    	    			<p>
    	    				<label>发行年限：</label>
    	    				<input type="text" name="year">
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
                            <input class="por" type="text" name="lowRatio">
                            —
                            <input class="por" type="text" name="highRatio">
                            %
                         </p>
                         <p>
                             投资退出方式：
                             <input class="exit" type="text" name="exit">
                         </p>
                         <p>
                             项目所处阶段:
                            <input class="stage" type="text" name="stage">
                         </p>
                         <p>
                             最短退出年限:
                            <input class="short" type="text" name="shortYear">
                         </p>
                         <p>
                             担保方:
                            <input class="ensure" type="text" name="assure">
                         </p>
                    </div><!--left-->
                    <div class="right right1 fl">
                        <p>
                            企业当前净资产:
                            <input  class="pro" type="text" name="property">
                            万
                        </p>
                        <p>
                             去年营业额：
                            <input class="trunover" type="text" name="lastYearEarn">
                            万
                        </p>
                        <p>
                            公司净利润：
                            <input  class="profits" type="text" name="profit">
                            万
                        </p>
                        <p>
                            投资门槛：
                            <input type="text" class="threshold" name="threshold">
                            万
                        </p>
                        <p>
                            最低追加资金:
                            <input type="text" class="add" name="add">
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
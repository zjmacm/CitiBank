<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1"/>
    <title>已登录-投资者模式-融资板块（撮合配对）</title>
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/business-header.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/customer-footer.css">
    <link rel="stylesheet" type="text/css" href="../public/stylesheets/company-corporate-mode-finance-patch.css">
    <script type="text/javascript" src="../public/javascripts/jq.js"></script>
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
              <div id="patchPanel">`
                  <div>地区筛选：<div class="selectItemGroup">
                      <span class="selectItem"><input type="checkbox" name="investArea">黑龙江</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">吉林</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">辽宁</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">河北</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">河南</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">新疆</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">江苏</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">山西</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">陕西</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">甘肃</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">四川</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">青海</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">湖南</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">江西</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">湖北</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">安徽</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">浙江</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">福建</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">广东</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">广西</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">贵州</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">云南</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">海南</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">内蒙古</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">山东</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">宁夏</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">西藏</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">北京</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">天津</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">上海</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">重庆 </span>
                      <span class="selectItem"><input type="checkbox" name="investArea">香港</span>
                      <span class="selectItem"><input type="checkbox" name="investArea">台湾</span>
                  </div>
                  </div>
                  <br/>
                  <div>行业筛选：
                      <div>行业筛选：<div class="selectItemGroup">
                          <span class="selectItem"><input type="checkbox" name="investIndustry">金融投资</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">房地产</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">能源</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">化学化工</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">节能环保</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">建筑建材</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">矿产冶金</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">基础设施</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">农林牧渔</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">国防军工</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">航空航天</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">电气设备</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">机械机电</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">交通运输</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">仓储物流</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">汽车汽配</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">纺织服装饰品</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">旅游酒店</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">餐饮休闲娱乐</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">教育培训体育</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">文化传媒广告</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">批发零售</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">家电数码</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">家居日用</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">食品饮料烟草</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">医疗保健</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">生物医药</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">IT互联网</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">电子通信</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">海洋开发</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">商务贸易</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">家政服务</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">园林园艺</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">收藏品</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">行政事业机构</span>
                          <span class="selectItem"><input type="checkbox" name="investIndustry">其他行业</span>
                      </div>
                  </div>
                  <br/>
                  <div>资金类型：
                      <div class="selectItemGroup">
                          <span class="select-item"><input type="checkbox">全部</span>
                          <span class="select-item"><input type="checkbox">无担保</span>
                          <span class="select-item"><input type="checkbox">公司/机构担保</span>
                          <span class="select-item"><input type="checkbox">个人担保</span>
                      </div>
                  </div>
                  <br/>
                  <div>金额区间：
                      <div class="selectItem-group">
                          <input type="input" class="sizeSelect">&nbsp;-&nbsp;
                          <input type="input" class="sizeSelect"> 万元
                      </div>
                  </div>
                  <br/>
                  <div>收益率范围：
                      <div class="selectItem-group">
                          <input type="input" class="sizeSelect" name="lowLeastReturnDemand">&nbsp;-&nbsp;
                          <input type="input" class="sizeSelect" name="highLeastReturnDemand"> %
                      </div>
                  </div>
                  <br/>
                  <div>
                      信用等级范围：
                      <div class="selectItem-group">
                          <input type="input" class="sizeSelect" name="lowCreditRank">&nbsp;-&nbsp;
                          <input type="input" class="sizeSelect" name="highCreditRank">
                      </div>
                      <a href="">
                          <div id="patchConfirmButton">确定</div>
                      </a>
                  </div>
              </div>
              <div id="TableList">
                  <table>
                      <tr>
                          <th>产品名称</th>
                          <th>类型</th>
                          <th>地区</th>
                          <th>所属行业</th>
                          <th>资金类型</th>
                          <th>收益率</th>
                          <th class="rightItem">信用等级</th>
                      </tr>
<!--*****************全是一样的**************************************************************************************-->
<%-- <tr>
     <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td>
     <td>股权投资</td>
     <td>深圳市</td>
     <td>教师</td>
     <td>企业资金</td>
     <td>6.1%</td>
     <td>AAA</td>
 </tr>
 <tr>
     <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td>
     <td>股权投资</td>
     <td>深圳市</td>
     <td>企业资金</td>
     <td>4000万</td>
     <td>王女士</td>
 </tr>
 <tr>
     <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td>
     <td>股权投资</td>
     <td>深圳市</td>
     <td>企业资金</td>
     <td>4000万</td>
     <td>王女士</td>
 </tr>
 <tr>
     <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td>
     <td>股权投资</td>
     <td>深圳市</td>
     <td>企业资金</td>
     <td>4000万</td>
     <td>王女士</td>
 </tr>
 <tr>
     <td>深圳某资金500万-2亿寻经营性实体招商引资项目</td>
     <td>股权投资</td>
     <td>深圳市</td>
     <td>企业资金</td>
     <td>4000万</td>
     <td>王女士</td>
 </tr>--%>
<% List<Map<String, Object>> matching = (List<Map<String, Object>>) request.getAttribute("data");
%>

<% for(int i = 0;i < matching.size();i++) {%>
<tr>
    <td><%=matching.get(i).get("productName")%></td>
    <td><%=matching.get(i).get("investType")%></td>
    <td><%=matching.get(i).get("investArea")%></td>
    <td><%=matching.get(i).get("investArea")%></td>
    <td><%=matching.get(i).get("fundBody")%></td>
    <td><%=matching.get(i).get("investorName")%></td>
    <td><%=matching.get(i).get("creditRank")%></td>
</tr>
<%}%>
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

</html>

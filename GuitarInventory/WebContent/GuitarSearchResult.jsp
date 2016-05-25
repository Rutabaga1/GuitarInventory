<%@ page import="guitar.inventory.model.SearchService,guitar.inventory.model.Guitar,java.util.List" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GuitarSearch</title>
<link rel="stylesheet" type="text/css" href="css/reset.css" >
<link rel="stylesheet" type="text/css" href="css/style.css" >

</head>

<body>

 <div id="top-line"></div>

<!-- START LOGO SECTION -->
<div id="logo-bar">
	<div class="center-block clearfix">
		 <div class="logo">
		 <br />
		 <br />
		 <br />
		 
		 	<P align="center"><strong><font color="brown" size="7">吉他</font></strong></P>
		 </div> 
		<div class="ads"><a href=""><img src="images/background.jpg" width="290px" height="100px" title="Advertisement" alt="a" /></a></div>
	</div><!-- .center-block -->
</div><!-- #logo-bar -->
<!-- END LOGO SECTION -->

<!-- START WRAPPER SECTION -->
<div id="wrapper">

	<div id="separator">
		<div class="center-block">
			<h3>喜欢音乐</h3>
			<span>: 一定让您满意</span>
		</div>
	</div>

	<!-- START CONTENT -->
	<div class="center-block-page clearfix">
	  <form action="GuitarSearch"  >
		<table> 
			<tbody>
			<tr>
		   			<td colspan="5"><hr size="1" /></td>
		   		</tr>
		  <tr> <td colspan="5"> 
			
				<input type="radio" name="search" value="01"><strong>全部吉他</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
			 <hr size="1" />
			<br /> 
			</td></tr>
		    
		   		<tr>
		   			<td rowspan="2"><input type="radio" name="search" value="02" checked="checked"><strong>筛选</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td>类型：&nbsp;<input type="text" name="gType" value="${requestScope.gType }" />&nbsp;</td>
		   			<td>价格：&nbsp;
		   				<select name="price" size="1">
		   					<option value="300">300以下</option>
		   					<option value="400">400以下</option>
		   					<option value="500">500以下</option>
		   					<option value="600">600以下</option>
		   					<option value="601">600以上</option>
		   					<option value="6" selected="selected">任意</option>
		   				</select>
		   			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<td colspan="2">大小：&nbsp;
		   				<select name="gSize" size="1">
		   					<option value="大">大</option>
		   					<option value="中">中</option>
		   					<option value="小">小</option>
		   					<option value="4" selected="selected">任意</option>
		   					
		   				</select>
		   			&nbsp;</td>
		   			
		   		</tr>
		   		<tr>
		   			<td>颜色：&nbsp;<input type="text" name="color" maxlength="2" value="${requestScope.color }" />&nbsp;</td>
		   			
		   			<td colspan="3">品牌：&nbsp;
		   			<select name="seller" size="1">
		   					<option value="Martin">Martin</option>
		   					<option value="Taylor">Taylor</option>
		   					<option value="Gibson">Gibson</option>
		   					<option value="Yamaha">Yamaha</option>
		   					<option value="Cort">Cort</option>
		   					<option value="Takamine">Takamine</option>
		   					<option value="7" selected="selected">任意</option>
		   				</select>
		   			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		   			<!-- <td>库存量：&nbsp;
		   				<input type="checkbox" name="inventory" value="00" checked="checked" />仅显示有库存量的
		   			&nbsp;</td> -->
		   		</tr>
		   		<tr>
		   			<td colspan="5" align="center"><input type="submit" value="确定" /></td>
		   		
				</tr>
		   		<tr>
		   			<td colspan="5"><hr size="1" /></td>
		   		</tr>
		   		
			</tbody>
		   </table>   
		</form>
		
		<table>
			<tbody>
				<tr>
		   			<td colspan="6">您选择的是：</td>
		   		</tr>
				<tr>
					<td align="center"><strong>图片</strong></td>
		   			<td align="center"><strong>类型</strong></td>
		   			<td align="center"><strong>价格</strong></td>
		   			<td align="center"><strong>大小</strong></td>
		   			<td align="center"><strong>颜色</strong></td>
		   			<td align="center"><strong>品牌</strong></td>
		   		</tr>
		   		<tr>
		   			<td colspan="6"><hr size="1" /></td>
		   		</tr>

		   		
		   	<c:forEach var="oneGuitar" items="${requestScope.theGuitars }">
		   			<tr height="140px">
		   				 <td width="180px"><img src="images/${oneGuitar.GSeries}.jpg" width="130px" height="130px"></td> 
		   				<td align="center" width="100px">${oneGuitar.GType }</td>
		   				<td align="center" width="100px">${oneGuitar.GPrice }</td>
		   				<td align="center" width="100px">${oneGuitar.GSize }</td>
		   				<td align="center" width="100px">${oneGuitar.GColor }</td>
		   				<td align="center" width="100px">${oneGuitar.GSeller }</td>
		   			</tr>
		   		</c:forEach>
			</tbody>
		</table>		
	</div>
	
</div><!--   width="120px"  #wrapper -->

<!-- END WRAPPER -->	    

<!-- START FOOTER -->
<div class="divider-100-2px"></div>

<!-- START FOOTER MENU  -->
<div id="footer-menu">
	<div class="center-block clearfix">
		<div class="copyright">&copy; Copyright &copy; Electronic Commerce 2013-2.</div>
	</div><!-- .center-block -->
</div><!-- #footer-menu -->
<!-- END FOOTER MENU  -->

</body>
</html>
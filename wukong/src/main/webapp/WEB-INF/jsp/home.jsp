<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<jsp:include page="../_shared/include_layui_basic.jsp"></jsp:include>
<jsp:include page="../_shared/include_compatible_basic.jsp"></jsp:include>
<title>首页</title>
<script src="${pageContext.request.contextPath}/js/home.js"></script>
</head>

<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
	<div class="layui-header">
		<div class="layui-logo">layui 后台布局</div>
		<!-- 头部区域（可配合layui已有的水平导航） -->
		<ul class="layui-nav layui-layout-left">
			<li class="layui-nav-item">
				<a href="javascript:;">控制台</a>
			</li>
			<li class="layui-nav-item">
				<a href="javascript:;">商品管理</a>
			</li>
			<li class="layui-nav-item">
				<a href="javascript:;">用户</a>
			</li>
			<li class="layui-nav-item">
				<a href="javascript:;">其它系统</a>
				<dl class="layui-nav-child">
					<dd>
						<a href="javascript:;">邮件管理</a>
					</dd>
					<dd>
						<a href="javascript:;">消息管理</a>
					</dd>
					<dd>
						<a href="javascript:;">授权管理</a>
					</dd>
				</dl>
			</li>
		</ul>
		<ul class="layui-nav layui-layout-right">
			<li class="layui-nav-item">
				<a href="javascript:;"> <img src="http://t.cn/RCzsdCq" class="layui-nav-img"> 贤心
				</a>
				<dl class="layui-nav-child">
					<dd>
						<a href="javascript:;">基本资料</a>
					</dd>
					<dd>
						<a href="javascript:;">安全设置</a>
					</dd>
				</dl>
			</li>
			<li class="layui-nav-item">
				<a href="javascript:;">退了</a>
			</li>
		</ul>
	</div>

	<div class="layui-side layui-bg-black">
		<div class="layui-side-scroll">
			<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
			<ul class="layui-nav layui-nav-tree" lay-filter="test">
				<li class="layui-nav-item layui-nav-itemed">
					<a class="" href="javascript:;"><i class="fa fa-camera-retro"></i>&nbsp;&nbsp;所有商品</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="javascript:;">列表一</a>
						</dd>
						<dd>
							<a href="javascript:;">列表二</a>
						</dd>
						<dd>
							<a href="javascript:;">列表三</a>
						</dd>
						<dd>
							<a href="javascript:;">超链接</a>
						</dd>
					</dl>
				</li>
				<li class="layui-nav-item">
					<a href="javascript:;">解决方案</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="javascript:;">列表一</a>
						</dd>
						<dd>
							<a href="javascript:;">列表二</a>
						</dd>
						<dd>
							<a href="javascript:;">超链接</a>
						</dd>
					</dl>
				</li>
				<li class="layui-nav-item">
					<a href="javascript:;">云市场</a>
				</li>
				<li class="layui-nav-item">
					<a href="javascript:;">发布商品</a>
				</li>
			</ul>
		</div>
	</div>

	<div class="layui-body">
		<!-- 内容主体区域 -->
		<div style="padding: 15px;">内容主体区域</div>
	</div>

	<div class="layui-footer">
		<!-- 底部固定区域 -->
		© layui.com - 底部固定区域
	</div>
</div>
</body>

</html>
<%--
  Created by IntelliJ IDEA.
  User: Arvin
  Date: 2016/5/7
  Time: 08:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 首页</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h1 style="text-align: center">首页</h1>

<h3 style="text-align: center"></h3>

<div style="text-align: center" class="alert alert-success" role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
        <span class="sr-only">Close</span>
    </button>
    <a href="/admin/users"><strong>用户管理</strong></a> 访问用户管理页面.
</div>

<div style="text-align: center" class="alert alert-info" role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
        <span class="sr-only">Close</span>
    </button>
    <a href="/admin/blogs"><strong>博客管理</strong></a> 访问博客管理页面.
</div>

<!--
关于css 的alert，在以下网站有介绍
http://wiki.jikexueyuan.com/project/bootstrap4/components/alerts/
-->
<!--
--------以下为alert的4种样式--------
-->
<div class="alert alert-success" role="alert">
    <strong>alert-success</strong> You successfully read this important alert message.
</div>
<div class="alert alert-info" role="alert">
    <strong>alert-info</strong> This alert needs your attention, but it's not super important.
</div>
<div class="alert alert-warning" role="alert">
    <strong>alert-warning</strong> Better check yourself, you're not looking too good.
</div>
<div class="alert alert-danger" role="alert">
    <strong>alert-warning</strong> Change a few things up and try submitting again.
</div>

<div class="alert alert-warning alert-dismissible fade in" role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
        <span class="sr-only">Close</span>
    </button>
    <strong>Holy guacamole!</strong> You should check in on some of those fields below.
</div>
<!--
<div class="alert alert-warning" role="alert">
    <a href="/admin/blogs" type="button" class="btn btn-primary btn-sm">博客管理</a>
</div>
-->
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>

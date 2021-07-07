<%--
  Created by IntelliJ IDEA.
  User: 15985
  Date: 2018/11/12
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="description" content="">
    <meta name="Author" content="">
    <!-- CSS Files -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="fonts/icon-7-stroke/css/pe-icon-7-stroke.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet" media="screen">
    <link href="css/owl.theme.css" rel="stylesheet">
    <link href="css/owl.carousel.css" rel="stylesheet">

    <link href="css/styles.css" rel="stylesheet" media="screen">

    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Alegreya+Sans:100,300,400,700' rel='stylesheet' type='text/css'>


    <!-- Font Awesome -->
    <link href="css/font-awesome.min.css" rel="stylesheet">
</head>

<body data-spy="scroll" data-target="#navbar-scroll">

<div id="top"></div>

<!-- NAVIGATION -->
<div id="menu">
    <nav class="navbar-wrapper navbar-default" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-themers">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand site-name" href="#top"><img src="images/logo.png" alt="logo"></a>
            </div>

            <div id="navbar-scroll" class="collapse navbar-collapse navbar-themers navbar-right">
                <ul class="nav navbar-nav">
                    <li><a href="#top">主页</a></li>
                    <li><a href="#intro">通知</a></li>
                    <li><a href="#feature">新闻</a></li>
                    <li><a href="#screenshot">图片</a></li>
                    <li><a href="#clients">个人页面</a></li>
                    <li><a href="#package">关于我们</a></li>
                    <li><a href="#download">下载</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>

<div class="fullscreen landing parallax banner" data-img-width="2000" data-img-height="1325" data-diff="100">

    <div class="overlay">
        <div class="container">
            <div class="row">



                <div class="col-md-6">

                    <h1 class="wow fadeInLeft">

                        欢迎！
                    </h1>

                    <div class="landing-text wow fadeInLeft">
                        <p>欢迎来到你的个人网站，这里将为您提供最新的新闻资讯，网站将记录您的个人动态，并与周围的人一起分享</p>
                    </div>
                    <form action="/SignInServlet" method="post">
                    <input type="text" name="userName" style="color:black" placeholder="用户名" style="width:250px; height:30px;"><br><br>
                    <input type="text" name="password" style="color:black" placeholder="密码" style="width:250px; height:30px;"><br>

                    <br>
                    <!-- header button -->
                    <div class="head-btn wow fadeInLeft">

                            <input type="submit" class="btn-primary play-market" value="登陆"/>

                        <a href="#" class="btn-primary play-market">
                            <i class="fa fa-android"></i> <span> 注册</span>
                        </a>
                    </div>
                    </form>
                    <br><br><br><br><br><br><br><br><br><br><br><br><br>



                </div>

                <!-- phone image -->
                <div class="col-md-6">
                    <img src="images/header-phone.png" alt="phone" class="header-phone img-responsive wow fadeInRight">
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>

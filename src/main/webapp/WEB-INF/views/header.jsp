<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>Its수영장</title>

    <!-- Favicon -->
    <link type="image/png" rel="icon" href="resources/img/core-img/favicon.ico">

    <!-- Stylesheet -->
    
    <link type="text/css" rel="stylesheet" href="resources/css/animate.css">
    <link type="text/css" rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="resources/css/classy-nav.css">
    <link type="text/css" rel="stylesheet" href="resources/css/font-awrsome.min.css">
    <link type="text/css" rel="stylesheet" href="resources/css/magnific-popup.css">
    <link type="text/css" rel="stylesheet" href="resources/css/one-music-icon.css">
    <link type="text/css" rel="stylesheet" href="resources/style.css">
    <link type="text/css" rel="stylesheet" href="resources/update.css">

</head>

<body>
<body>
    <!-- Preloader -->
    <div class="preloader d-flex align-items-center justify-content-center">
        <div class="lds-ellipsis">
            <div></div>
            <div></div>
            <div></div>
            <div></div>
        </div>
    </div>

    <!-- ##### Header Area Start ##### -->
    <header class="header-area">
        <!-- Navbar Area -->
        <div class="oneMusic-main-menu">
            <div class="classy-nav-container breakpoint-off">
                <div class="container">
                    <!-- Menu -->
                    <nav class="classy-navbar justify-content-between" id="oneMusicNav">

                        <!-- Nav brand -->
                        <a href="home" class="nav-brand"><img src="resources/img/core-img/logo_swim.png" alt=""></a>

                        <!-- Navbar Toggler -->
                        <div class="classy-navbar-toggler">
                            <span class="navbarToggler"><span></span><span></span><span></span></span>
                        </div>

                        <!-- Menu -->
                        <div class="classy-menu">

                            <!-- Close Button -->
                            <div class="classycloseIcon">
                                <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                            </div>

                            <!-- Nav Start -->
                            <div class="classynav">
                                <ul>
                                    <li><a href="index.html">수영장 소개</a></li>
                                    <li><a href="event.html">온라인등록</a></li>
                                    <li><a href="blog.html">스토어</a></li>
                                    <li><a href="albums-store.html">프로그램</a>
                                    	<ul class="dropdown">
                                            <li><a href="index.html">수영</a></li>
                                            <li><a href="albums-store.html">아쿠아</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">시간표</a></li>
                                    <c:if test="${CSTMR.admin_check eq 'Y'}">
                                    <li><a href="search">관리자메뉴</a></li>
                                    </c:if>
                                </ul>

                                <!-- Login/Register & Cart Button -->
                                <div class="login-register-cart-button d-flex align-items-center">
                                    <!-- Login/Register -->
                                    <c:if test="${empty CSTMR}">
                                    <div class="login-register-btn mr-50">
                                        <a href="login" id="loginBtn">로그인 /회원가입</a>
                                    </div>
                                    </c:if>
                                    <c:if test="${not empty CSTMR}">
									 <div class="login-register-btn mr-50">
                                        <a href="login" id="loginBtn">마이페이지</a>
                                    </div>
                                    <div class="login-register-btn mr-50">
                                        <a href="logOut" id="loginBtn">로그아웃</a>
                                    </div>
                                    </c:if>
                                    <!-- Cart Button -->
                                    <div class="cart-btn">
                                        <p><span class="icon-shopping-cart"></span> <span class="quantity">1</span></p>
                                    </div>
                                </div>
                            </div>
                            <!-- Nav End -->

                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>

</body>
</html>
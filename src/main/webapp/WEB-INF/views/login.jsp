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
    <title>It`s 수영장 - 로그인 및 회원가입</title>

</head>

<body>
    <jsp:include page="header.jsp" />

    <!-- ##### Breadcumb Area Start ##### -->
    <section class="breadcumb-area bg-img bg-overlay" style="background-image: url(resources/img/bg-img/breadcumb3.jpg);">
        <div class="bradcumbContent">
        	<p>It`s 수영장</p>
            <h2>Login</h2>
        </div>
    </section>
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Login Area Start ##### -->
    <section class="login-area section-padding-100">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-lg-8">
                    <div class="login-content">
                        <h3>환영합니다</h3>
                        <!-- Login Form -->
                        <div class="login-form">
                            <form action="loginCheck" method="post">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">아이디</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" name="cstmr_id" aria-describedby="emailHelp" placeholder="아이디를 입력해주세요">
                                    <small id="emailHelp" class="form-text text-muted"><i class="fa fa-lock mr-2"></i>We'll never share your email with anyone else.</small>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">비밀번호</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" name="cstmr_password" placeholder="비밀번호를 입력해주세요">
                                </div>
                                <c:if test="${not empty MSG}">
							 	<div style="color:red;"> ${MSG}</div>
							  	</c:if>
                                <button type="submit" class="btn oneMusic-btn mt-30">로그인</button>
                             </form>
                                <a href="register"><button type="button" class="btn oneMusic-btn mt-30">회원가입</button></a>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ##### Login Area End ##### -->

    <!-- ##### Footer Area Start ##### -->
    <jsp:include page="footer.jsp" />
    <!-- ##### Footer Area Start ##### -->

</body>

</html>
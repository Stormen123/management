<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html >

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
	    <title>관리자 페이지</title>
	
	    <!-- Favicon -->
	    <link rel="icon" href="img/core-img/favicon.ico">
	
	    <!-- Stylesheet -->
	    <link rel="stylesheet" href="style.css">
	
	</head>
	
	<body>
	    <jsp:include page="header.jsp" />
		
		<!-- ##### Breadcumb Area Start ##### -->
	    <section class="breadcumb-area bg-img bg-overlay" style="background-image: url(resources/img/bg-img/swim-2.JPG);">
	        <div class="bradcumbContent">
	            <p>It`s Pool</p>
	            <h2>관리자 페이지</h2>
	        </div>
	    </section>
	    <!-- ##### Breadcumb Area End ##### -->
	    
	    <jsp:include page="adminMenu.jsp" />

    <!-- ##### Contact Area Start ##### -->
    <section class="contact-area section-padding-100 bg-img bg-fixed">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="section-heading black">
                        <h2>회원조회</h2>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-12">
                    <!-- Contact Form Area -->
                    <div class="contact-form-area">
                        <form action="memberSearch" method="post">
                            <div class="row1">
                                <div class="col-md-6 col-lg-4">
                                    <div class="form-group">
                                        <input type="text" class="form-control" name="search" placeholder="검색어를 입력하세요.">
                                    </div>
                                </div>
                                <div class="col-12 text-center"> <!-- 버튼 css -->
                                    <button class="btn oneMusic-btn mt-30" type="submit" >조회 <i class="fa fa-angle-double-right"></i></button>
                                </div>
                            </div>
                        </form>
                        
                    </div>
                </div>
            </div>
        </div>
		
        
    </section>
     
	
	
	<c:if test="${RESULT eq 'zero'}">
		<p>hi</p>
	</c:if>
    <!-- ##### Footer Area Start ##### -->
    <jsp:include page="footer.jsp" />
    <!-- ##### Footer Area Start ##### -->

  
</body>
<script>
	$(function() {
		<c:if test="${RESULT eq 'zero'}">
		
		</c:if>
	});	
</script>
</html>
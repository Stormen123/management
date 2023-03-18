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
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Login Area Start ##### -->
    <section class="login-area section-padding-100">
        <div class="container ">
            <div class="row justify-content-center">
                <div class="col-12 col-lg-8">
                    <div class="login-content">
                        <h3>회 원 조 회</h3>
                        <!-- Login Form -->
                        <div class="login-form">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">회원번호</label>
                                    <input type="text" name="mber_code" id="mber_code">
                                </div>
                                
                                <div class="form-group">
                                    <label for="exampleInputPassword1">이름</label>
                                    <input type="text" name="mber_nm" id="mber_nm">
                                </div>
                                
                                <div class="form-group">
                                    <label for="exampleInputPassword1">등급</label>
                                    <input type="text" name="mber_grade" id="mber_grade">
                                </div>
                                
                                 <div class="form-group">
                                    <label for="exampleInputPassword1">전화번호</label>
                                    <input type="text" name="mber_phone" id="mber_phone">
                                </div>
                                
                                <div class="form-group">
                                    <label for="exampleInputPassword1">생년월일</label>
                                    <input type="text" name="mber_brthdy" id="mber_brthdy">
                                </div>
                                
                                <div class="form-group">
                                    <label for="exampleInputPassword1">성별</label>
                                    <input type="text" name="mber_sexdstn" id="mber_sexdstn">
                                </div>
                               
                                <div class="form-group">
                                    <label for="exampleInputPassword1">비고</label>
                                    <input type="text" name="mber_note" id="mber_note">
                                </div>
                                <button type="button" id="schregist" class="search-btn">등록조회</button>
                                <button type="button" id="locregist" class="search-btn">사물함조회</button>
                                <div id="memdiv">
                                	<section id="section1">
                                	<table id="memtable">
                                		<tr >
											<td>상태</td>
											<td>등록날짜</td>
											<td>종목</td>
											<td>강좌</td>
											<td>요일</td>
											<td>시간</td>
											<td>등록기간</td>
											<td>개월</td>
										</tr>
										<c:forEach var="list" items="${REGISTLIST}">
										<tr>
											<td>${list.regist_state}</td>
											<td>${list.regist_regdate}</td>
											<td>${list.sch_item}</td>
											<td>${list.sch_class}</td>
											<td>${list.sch_day}</td>
											<td>${list.sch_time}</td>
											<td>${list.regist_date}</td>
											<td>${list.regist_month}</td>
										</tr>
										</c:forEach>
                                	</table>
                                	</section>
                                	<section id="section2"> 
                                		<table id="memtable">
                                		<tr>
											<td> 등록날짜</td>
											<td>종목</td>
											<td>강좌</td>
											<td>요일</td>
											<td>시간</td>
											<td>등록기간</td>
											<td>개월</td>
										</tr>
										<c:forEach var="list" items="${REGISTLIST}">
										<tr>
											<td>${list.regist_regdate}</td>
											<td>${list.sch_item}</td>
											<td>${list.sch_class}</td>
											<td>${list.sch_day}</td>
											<td>${list.sch_time}</td>
											<td>${list.regist_date}</td>
											<td>${list.regist_month}</td>
										</tr>
										</c:forEach>
                                	</table>
                                	</section>
                                </div>
                                <button type="button" class="btn oneMusic-btn mt-30">회원가입</button>
                                <a href="login"><button type="button" class="btn oneMusic-btn mt-30">취소</button></a>
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
<script>
$(function() {
	$("#mber_code").val('<c:out value="${MEMBER.mber_code}"/>');
	$("#mber_nm").val('<c:out value="${MEMBER.mber_nm}"/>');
	$("#mber_grade").val('<c:out value="${MEMBER.mber_grade}"/>');
	$("#mber_phone").val('<c:out value="${MEMBER.mber_phone}"/>');
	$("#mber_brthdy").val('<c:out value="${MEMBER.mber_brthdy}"/>');
	$("#mber_sexdstn").val('<c:out value="${MEMBER.mber_sexdstn}"/>');
	$("#mber_note").val('<c:out value="${MEMBER.mber_note}"/>');
	
	$("#section1").show();
	$('#section2').hide();
	
	$("#schregist").click(function(){
		$("#section1").show();
		$('#section2').hide();
	});
	
	$("#locregist").click(function(){
		$("#section2").show();
		$('#section1').hide();
	});
	
});	
</script>
</html>
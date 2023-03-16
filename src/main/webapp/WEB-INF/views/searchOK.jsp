<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="box_title">
		<thead>
			<tr>
				<th scope="col">회원코드</th>
				<th scope="col">이름</th>
				<th scope="col">등급</th>
				<th scope="col">성별</th>
				<th scope="col">생년월일</th>
				<th scope="col">전화번호</th>
				<th scope="col">메모</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${MEMBER.mber_code}</td>
				<td>${MEMBER.mber_nm}</td>
				<td>${MEMBER.mber_grade}</td>
				<td>${MEMBER.mber_sexdstn}</td>
				<td>${MEMBER.mber_brthdy}</td>
				<td>${MEMBER.mber_phone}</td>
				<td>${MEMBER.mber_note}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>
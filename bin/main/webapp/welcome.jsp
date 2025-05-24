<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>홈</title>
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<%@ include file = "menu.jsp" %>	
	
	<%	Date date = new Date();
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
		String strdate = simpleDate.format(date);	
	%>
	
	<%! String greeting = "최's 쇼핑몰에 오신 걸 환영합니다~";
		String author_info = "작성자 : 융합소프트웨어학과, 2019142051, 최자연";
	%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="disply-3">
				<%=greeting %>
			</h1>
		</div>
	</div>
	
	<div class="container">
		<div class="text-center">
			<h3>
				<%= author_info %>
			</h3>
		</div>
	</div>
	
	<div class="container">
		<div class="text-center">
		<h4>수정일 : <%= strdate %></h4>
			<%
				Calendar cal = Calendar.getInstance();
			
				String am_pm;
				int hour = cal.get(Calendar.HOUR);
				int min = cal.get(Calendar.MINUTE);
				int sec = cal.get(Calendar.SECOND);
				if(hour/12==0)	{
					am_pm = "AM";
				}
				else {
					am_pm = "PM";
					hour = hour - 12;
				}
				String CT = hour + ":" + min + ":" + sec + " " + am_pm;
				out.println("현재 접속 시간 : " + CT + "\n");
				%>
		</div>
	</div>
	
	<%@ include file = "footer.jsp" %>
</body>
</html>
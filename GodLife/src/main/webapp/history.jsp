<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html; charset=EUC-KR" %>

<html>
<head>

<title>��� ��ǰ ����</title>

</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	response.setCharacterEncoding("euc-kr");
	String history = null;
	Cookie[] cookies = request.getCookies();
	if (cookies!=null && cookies.length > 0) {
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if (cookie.getName().equals("history")) {
				history = cookie.getValue();
				System.out.println("history"+history);
			}
		}
		if (history != null) {
			String[] h = history.split("/");
			for (int i = 0; i < h.length; i+=2) {
				if (!h[i].equals("null")) {
					if(i+2 != h.length) {
%>
<a href="product/getProduct?prodNo=<%=h[i]%>&menu=search"
	target="rightFrame"><%=h[i+1]%></a>
<br>
<%
					} else {
%>
<a href="product/getProduct?prodNo=<%=h[i]%>&menu=search"
	target="rightFrame"><%=h[i+1]%></a>
<br>
<%
					break; }
				}
			}
		}
	}
%>

</body>
</html>
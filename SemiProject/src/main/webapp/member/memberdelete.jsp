<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String mnum = request.getParameter("mnum");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("password");

	MemberDao dao = new MemberDao();
	
	boolean b = dao.ismemNameEmailPass(name, email, password);
			
	if(b){
		dao.deleteMember(mnum);%>
		<script type="text/javascript">
			alert("Ż�� �Ǿ����ϴ�");
		</script>
		<%response.sendRedirect("../index.jsp?boramMain=login/logoutaction.jsp");
	}else{%>
		<script type="text/javascript">
			alert("���������� ���� �ʽ��ϴ�");
			history.back();
		</script>
	<%}
%>
</body>
</html>
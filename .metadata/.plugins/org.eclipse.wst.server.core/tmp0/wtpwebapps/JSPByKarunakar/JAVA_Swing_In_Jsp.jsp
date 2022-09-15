

<%@page import="javax.swing.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		JFrame jf = new JFrame("JSwing Demo");
		JLabel l1 = new JLabel("UserName");
		JLabel l2 = new JLabel("Password");
		JButton jb=new JButton("Log In");
		JPanel jp =new JPanel(null);
		JTextField jtf1 = new JTextField(20);
		JTextField jtf2 = new JTextField(20);
		
		l1.setBounds(10, 10, 100, 20);
		l2.setBounds(10, 40, 100, 20);
		jtf1.setBounds(150, 10, 150, 20);
		jtf2.setBounds(150, 40, 150, 20);
		jb.setBounds(100,70, 100, 35);
		jp.setBounds(50,50,300,140);
		
		jp.add(l1);
		jp.add(jtf1);
		jp.add(l2);
		jp.add(jtf2);
		jp.add(jb);
		
		jf.add(jp);
		jf.setLayout(null);
		jf.setSize(600, 400);
		jf.setVisible(true);
	%>
</body>
</html>
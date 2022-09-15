<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

Google Contacts is a contact management service developed by Google. It is available as an Android mobile app, a web app, or on the sidebar of Gmail as part of Google Workspace. Wikipedia
Operating system: Android, Web browser
Initial release: March 3, 2015; 6 years ago
Stable release: 3.16.1.290725621 / January 23, 2020; 23 months ago

<hr/>
<%
response.setContentType("text/html");



String wn=application.getInitParameter("WebsiteName");
String wu=application.getInitParameter("WURL");

String username=config.getInitParameter("Username");
String pwd=config.getInitParameter("Password");
out.println("Website name : "+wn);
out.println("Website url : "+wu);

if(pwd.equals("Tom123"))
{
	out.println("Welcome "+username);
}
else
{
	out.println("wrong password");
}


%>
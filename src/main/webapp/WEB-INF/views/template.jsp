<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String head = (String)request.getAttribute("head");
    String leftBody = (String)request.getAttribute("left");
    String centerBody = (String)request.getAttribute("center");
    String rightBody = (String)request.getAttribute("right");
    String bottom = (String)request.getAttribute("bottom");
%>
<%--
head's height is 150px
body's width is 1000px
    left-body's width is 150px
    center-body's width is 700px
    right-body's width is 150px
bottom's height is 100px
--%>
<html>
<head>
    <title>Welcome!</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/templateBase.css" >
</head>
<body>
<div id="all" class="bodyContainer">
    <div id="head" class="templateContainer" style="height:130px;">
        <jsp:include page="<%= head%>" flush="false"/>
    </div>
    <div id="body" class="templateContainer" style="height:570px;" >
        <div id="left-body" style="width: 150px; float:left;"> <jsp:include page="<%= leftBody%>" flush="false"/> </div>
        <div id="center-body" style="width: 700px; float:left;" > <jsp:include page="<%= centerBody%>" flush="false"/> </div>
        <div id="right-body" style="width:150px;float:left" > <jsp:include page="<%= rightBody%>" flush="false"/> </div>
    </div>
    <div id="bottom" class="templateContainer" style="height:100px;">
        <jsp:include page="<%=bottom%>" flush="false"/>
    </div>
</div>
</body>
</html>

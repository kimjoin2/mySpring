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
    left-body's width is 200px
    center-body's width is 650px
    right-body's width is 150px
bottom's height is 100px
--%>
<html>
<head>
    <title>Welcome!</title>
    <style>

        .all-width {
            width:1000px;
            margin: 0 auto;
        }

    </style>
</head>
<body>
<div id="all" class="all-width">
    <div id="head" class="all-width" style="height:150px;">
        <jsp:include page="<%= head%>" flush="false"/>
    </div>
    <div id="body" class="all-width">
        <div id="left-body" style="width: 200px; float:left;"> <jsp:include page="<%= leftBody%>" flush="false"/> </div>
        <div id="center-body" style="width: 650px; float:left;" > <jsp:include page="<%= centerBody%>" flush="false"/> </div>
        <div id="right-body" style="width:150px;float:left" > <jsp:include page="<%= rightBody%>" flush="false"/> </div>
    </div>
    <div id="bottom" class="all-width" style="height:100px;">
        <jsp:include page="<%=bottom%>" flush="false"/>
    </div>
</div>
</body>
</html>

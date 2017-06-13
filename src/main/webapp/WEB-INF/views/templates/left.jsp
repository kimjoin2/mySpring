<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
left-body's width is 150px
--%>
<style>
    ul {
        padding: 0;
    }
    li {
        display: block;
    }
</style>

<div class="innerTemplate">
    <div style="height:90px;">
        <div style="height:30px;">
            name
        </div>
        <div style="height:30px;">
            ment
        </div>
        <div style="height:30px;">
            buttons
        </div>
    </div>
    <div>
        <%--
            use jQuery's Menu Categories
        --%>
        <ul>
            <li>num1</li>
            <li>num2</li>
            <li>num3</li>
        </ul>
    </div>
    <div style="height:60px; margin: auto 0 0 0;">
        <div style="height:50%;">
           today&nbsp;nbsp0
        </div>
        <div style="height:50%;">
            total&nbsp;0
        </div>
    </div>
</div>

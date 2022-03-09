<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>全部论文信息</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script>
        $(function () {
            $('#header').load('reader_header.html');
        })
    </script>
</head>
<body background="img/lizhi.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">

<div id="header"></div>

<div style="padding: 20px 1770px 10px">
    <form method="post" action="reader_querypaper_do.html" class="form-inline" id="searchform">
        <div >
            <input style="float:right" type="text" placeholder="输入论文名" class="form-control" id="search" name="searchWord">
            <span class="input-group-btn">
                <input style="float:right" type="submit" value="搜索" class="btn btn-default">
            </span>
        </div>
    </form>
    <script>
        $("#searchform").submit(function () {
            var val = $("#search").val();
            if (val == '') {
                alert("请输入关键字");
                return false;
            }
        })
    </script>
</div>
<div style="position: relative;top: 10%">
    <c:if test="${!empty succ}">
        <div class="alert alert-success alert-dismissable">
            <button type="button" class="close" data-dismiss="alert"
                    aria-hidden="true">
                &times;
            </button>
                ${succ}
        </div>
    </c:if>
    <c:if test="${!empty error}">
        <div class="alert alert-danger alert-dismissable">
            <button type="button" class="close" data-dismiss="alert"
                    aria-hidden="true">
                &times;
            </button>
                ${error}
        </div>
    </c:if>
</div>
<div class="panel panel-default" style="width: 90%;margin-left: 5%">
    <div class="panel-heading" style="background-color: #fff">
        <h3 class="panel-title">
            全部论文
        </h3>
    </div>
    <div class="panel-body">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>论文题目</th>
                <th>作者</th>
                <th>期刊/会议名</th>
                <th>年份</th>
                <th>页数</th>
                <th>期号</th>
                <th>卷号</th>
                <th>详情</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${papers}" var="paper">
                <tr>
                    <td><c:out value="${paper.name}"></c:out></td>
                    <td><c:out value="${paper.author}"></c:out></td>
                    <td><c:out value="${paper.publish}"></c:out></td>
                    <td><c:out value="${paper.year}"></c:out></td>
                    <td><c:out value="${paper.page}"></c:out></td>
                    <td><c:out value="${paper.no}"></c:out></td>
                    <td><c:out value="${paper.vol}"></c:out></td>

                    <td><a href="reader_paper_detail.html?paperId=<c:out value="${paper.paperId}"></c:out>">
                        <button type="button" class="btn btn-success btn-xs">详情</button>
                    </a></td>
                    
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>

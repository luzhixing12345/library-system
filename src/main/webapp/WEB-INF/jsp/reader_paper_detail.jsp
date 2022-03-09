<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>《 ${detail.name}》</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js" ></script>
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
<div class="col-xs-6 col-md-offset-3" style="position: relative;top: 3%">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">《 ${detail.name}》</h3>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <tr>
                    <th width="15%">论文题目</th>
                    <td>${detail.name}</td>
                </tr>
                <tr>
                    <th>作者</th>
                    <td>${detail.author}</td>
                </tr>
                <tr>
                    <th>期刊/会议名</th>
                    <td>${detail.publish}</td>
                </tr>
                <tr>
                    <th>年份</th>
                    <td>${detail.year}</td>
                </tr>
                <tr>
                    <th>页数</th>
                    <td>${detail.page}</td>
                </tr>
                <tr>
                    <th>期号</th>
                    <td>${detail.no}</td>
                </tr>
                <tr>
                    <th>卷号</th>
                    <td>${detail.vol}</td>
                </tr>
                <tr>
                    <th>摘要</th>
                    <td>${detail.introduction}</td>
                </tr>
                <tr>
                    <th>下载链接</th>
                    <td><a href="${detail.doi}" target = "_self">下载</a></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

</div>

</body>
</html>

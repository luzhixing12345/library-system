<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>论文信息添加</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style>
        .form-group {
            margin-bottom: 0;
        }
    </style>
    <script>
        $(function () {
            $('#header').load('admin_header.html');
        })
    </script>
</head>
<body background="img/sky.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">

<div id="header"></div>
<div style="position: relative;padding-top: 60px; width: 80%;margin-left: 15%">
    <form action="paper_add_do.html" method="post" id="addpaper">
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="name">论文题目</label>
            <input type="text" class="form-control" name="name" id="name" placeholder="请输入论文题目">
        </div>
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="author">作者</label>
            <input type="text" class="form-control" name="author" id="author" placeholder="请输入作者名">
        </div>
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="author">页数</label>
            <input type="text" class="form-control" name="page" id="page" placeholder="请输入论文页数">
        </div>
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="publish">期刊/会议名</label>
            <input type="text" class="form-control" name="publish" id="publish" placeholder="请输入期刊/会议名">
        </div>
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="no">期号</label>
            <input type="text" class="form-control" name="no" id="no" placeholder="请输入期号">
        </div>
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="vol">卷号</label>
            <input type="text" class="form-control" name="vol" id="vol" placeholder="请输入卷号">
        </div>
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="year">年份</label>
            <input type="text" class="form-control" name="year" id="year" placeholder="请输入发表年份">
        </div>
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="introduction">摘要</label>
            <textarea class="form-control" rows="3" name="introduction" id="introduction"
                      placeholder="请输入摘要"></textarea>
        </div>
        <div class="form-group" style="padding:10px 0px 0px">
            <label for="doi">下载链接</label>
            <input type="text" class="form-control" name="doi" id="doi" placeholder="请输入下载链接">
        </div>

        <input type="submit" value="添加" class="btn btn-success btn-lg" style="float:right; margin-top: 10px;">
        <script>
            $("#addpaper").submit(function () {
                if ($("#name").val() == '' || $("#author").val() == '' || $("#publish").val() == '' ||  $("#year").val() == '' || $("#introduction").val() == '' || $("#doi").val() == '') {
                    alert("请填入完整论文信息！");
                    return false;
                }
            })
        </script>
    </form>
</div>
</body>
</html>

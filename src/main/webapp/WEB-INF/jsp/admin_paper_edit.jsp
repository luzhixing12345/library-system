<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑《 ${detail.name}》</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js" ></script>
    <script>
        $(function () {
            $('#header').load('admin_header.html');
        })
    </script>
</head>
<body background="../../static/img/paper2.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">

<div id="header" style="padding-bottom: 80px"></div>

<div class="col-md-6 col-md-offset-3" style="position: relative;">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">编辑《 ${detail.name}》</h3>
        </div>
        <div class="panel-body">
            <form action="paper_edit_do.html?paperId=${detail.paperId}" method="post" id="addpaper" >

                <div class="input-group">
                    <span  class="input-group-addon">论文题目</span>
                    <input type="text" class="form-control" name="name" id="name" value="${detail.name}">
                </div>
                <div class="input-group">
                    <span class="input-group-addon">作者</span>
                    <input type="text" class="form-control" name="author" id="author" value="${detail.author}" >
                </div>
                <div class="input-group">
                    <span class="input-group-addon">页数</span>
                    <input type="text" class="form-control" name="page" id="page" value="${detail.page}" >
                </div>
                <div class="input-group">
                    <span  class="input-group-addon">期刊/会议名</span>
                    <input type="text" class="form-control" name="publish" id="publish"  value="${detail.publish}" >
                </div>
                <div class="input-group">
                    <span class="input-group-addon">期号</span>
                    <input type="text" class="form-control" name="no" id="no" value="${detail.no}" >
                </div>
                <div class="input-group">
                    <span class="input-group-addon">卷号</span>
                    <input type="text" class="form-control" name="vol" id="vol" value="${detail.vol}" >
                </div>
                <div class="input-group">
                    <span class="input-group-addon">年份</span>
                    <input type="text" class="form-control" name="year" id="year"  value="${detail.year}" >
                </div>
                <div class="input-group">
                    <span  class="input-group-addon">摘要</span>
                    <textarea class="form-control" rows="3" name="introduction" id="introduction"
                      placeholder="请输入摘要">${detail.introduction}</textarea>
                </div>
                <div class="input-group">
                    <span  class="input-group-addon">下载链接</span>
                    <input type="text" class="form-control" name="doi"  id="doi" value="${detail.doi}">
                </div>
                <input type="submit" value="确定" class="btn btn-success btn-lg" style="float: right;">
                <script>
                    $("#addpaper").submit(function () {
                        if($("#name").val() == '' || $("#author").val() == '' || $("#publish").val() == '' ||  $("#year").val() == '' || $("#introduction").val() == '' || $("#doi").val() == ''){
                            alert("请填入完整论文信息！");
                            return false;
                        }
                    })
                </script>
            </form>
        </div>
    </div>

</div>

</body>
</html>

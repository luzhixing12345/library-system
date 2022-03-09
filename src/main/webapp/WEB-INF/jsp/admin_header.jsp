<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://cdn.jsdelivr.net/npm/jquery/dist/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome/css/font-awesome.min.css"/>
<script src="https://cdn.jsdelivr.net/gh/stevenjoezhang/live2d-widget/autoload.js"></script>
<nav style="position:fixed;z-index: 999;width: 100%;background-color: #24292f" class="navbar fixed-top navbar-expand-sm bg-dark navbar-dark"
     role="navigation">
    <div class="container-fluid">
        <div class="navbar-header" style="margin-left: 8%;margin-right: 1%">
            <a class="navbar-brand" href="admin_main.html" style="font-family: 华文行楷; font-size: 250%; color: rgb(255, 255, 255)">library system</a>
        </div>
        <div class="collapse navbar-collapse" >
            <ul class="nav navbar-nav navbar-left">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: white">
                        图书管理
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="admin_books.html">全部图书</a></li>
                        <li class="divider"></li>
                        <li><a href="book_add.html">增加图书</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: white">
                        论文管理
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="admin_papers.html">全部论文</a></li>
                        <li class="divider"></li>
                        <li><a href="paper_add.html">增加论文</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: white">
                        读者管理
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="allreaders.html">全部读者</a></li>
                        <li class="divider"></li>
                        <li><a href="reader_add.html">增加读者</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: white">
                        借还管理
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="lendlist.html">借还日志</a></li>
                    </ul>
                </li>
                <li >
                    <a href="admin_repasswd.html" style="color: white">
                        密码修改
                    </a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="login.html" style="color: white">${admin.username}, 已登录</a>
                </li>
                <li><a href="logout.html" style="color: white">退出</a></li>
            </ul>
        </div>
    </div>
</nav>
<!--代码放置于</body>上方-->
 
<script>
 
    !function(){
     
    function n(n,e,t){
     
    return n.getAttribute(e)||t
     
    }
     
    function e(n){
     
    return document.getElementsByTagName(n)
     
    }
     
    function t(){
     
    var t=e("script"),o=t.length,i=t[o-1];
     
    return{
     
    l:o,z:n(i,"zIndex",-1),o:n(i,"opacity",.5),c:n(i,"color","0,0,0"),n:n(i,"count",99)
     
    }
     
    }
     
    function o(){
     
    a=m.width=window.innerWidth||document.documentElement.clientWidth||document.body.clientWidth,
     
    c=m.height=window.innerHeight||document.documentElement.clientHeight||document.body.clientHeight
     
    }
     
    function i(){
     
    r.clearRect(0,0,a,c);
     
    var n,e,t,o,m,l;
     
    s.forEach(function(i,x){
     
    for(i.x+=i.xa,i.y+=i.ya,i.xa*=i.x>a||i.x<0?-1:1,i.ya*=i.y>c||i.y<0?-1:1,r.fillRect(i.x-.5,i.y-.5,1,1),e=x+1;e<u.length;e++)n=u[e],
     
    null!==n.x&&null!==n.y&&(o=i.x-n.x,m=i.y-n.y,
     
    l=o*o+m*m,l<n.max&&(n===y&&l>=n.max/2&&(i.x-=.03*o,i.y-=.03*m),
     
    t=(n.max-l)/n.max,r.beginPath(),r.lineWidth=t/2,r.strokeStyle="rgba("+d.c+","+(t+.2)+")",r.moveTo(i.x,i.y),r.lineTo(n.x,n.y),r.stroke()))
     
    }),
     
    x(i)
     
    }
     
    var a,c,u,m=document.createElement("canvas"),
     
    d=t(),l="c_n"+d.l,r=m.getContext("2d"),
     
    x=window.requestAnimationFrame||window.webkitRequestAnimationFrame||window.mozRequestAnimationFrame||window.oRequestAnimationFrame||window.msRequestAnimationFrame||
     
    function(n){
     
    window.setTimeout(n,1e3/45)
     
    },
     
    w=Math.random,y={x:null,y:null,max:2e4};m.id=l,m.style.cssText="position:fixed;top:0;left:0;z-index:"+d.z+";opacity:"+d.o,e("body")[0].appendChild(m),o(),window.onresize=o,
     
    window.onmousemove=function(n){
     
    n=n||window.event,y.x=n.clientX,y.y=n.clientY
     
    },
     
    window.onmouseout=function(){
     
    y.x=null,y.y=null
     
    };
     
    for(var s=[],f=0;d.n>f;f++){
     
    var h=w()*a,g=w()*c,v=2*w()-1,p=2*w()-1;s.push({x:h,y:g,xa:v,ya:p,max:6e3})
     
    }
     
    u=s.concat([y]),
     
    setTimeout(function(){i()},100)
     
    }();
     
    </script>
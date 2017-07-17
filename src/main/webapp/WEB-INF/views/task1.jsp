<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Task1</title>
    <link href="/resources/css/bootstrap.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="/resources/css/bootstrap-theme.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="/resources/css/style.css" media="all" rel="stylesheet" type="text/css"/>
</head>
<body class="page-header-fixed bg-1">
<div class="navbar navbar-fixed-top scroll-hide" style="overflow: visible;">
    <div class="container-fluid main-nav clearfix">
        <div class="nav-collapse">
            <ul class="nav">
                <li>
                    <a href="">
                        <span class="glyphicon glyphicon-home"></span>Home</a>
                </li>
                <li><a href="/artpieces">
                    <span class="glyphicon glyphicon-king"></span>Artpieces</a>
                </li>
                <li><a href="/employees">
                    <span class="glyphicon glyphicon-user"></span>Employees</a>
                </li>

                <li><a href="/excursions">
                    <span class="glyphicon glyphicon-list-alt"></span>Excursions</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="container-fluid main-content" style="width: 30%">
    <div class="widget-container fluid-height clearfix">
        <div class="widget-content padded clearfix">
            <h3 align="center">"${artpieceObject.name}"</h3>
            <ul style="list-style-type: none;" class="center-block">
                <li>
                    <b>Name:</b> ${artpieceObject.name}
                </li>
                <li>
                    <b>Author:</b> ${artpieceObject.author}
                </li>
                <li>
                    <b>Hall:</b> ${artpieceObject.hall}
                </li>
                <li>
                    <b>Material:</b> ${artpieceObject.material}
                </li>
                <li>
                    <b>Technique:</b> ${artpieceObject.technique}
                </li>
            </ul>

        </div>
    </div>
</div>
<script src="/resources/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Museum</title>
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
                    <a href="/">
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
<div class="container-fluid main-content" style="width: 60%">
    <div class="widget-container fluid-height clearfix">
        <div class="widget-content padded clearfix">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 1</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show info about the artpiece</span>
                        <form class="navbar-form navbar-right" action="/task1" method="post">
                            <div class="form-group">
                                <input name="artpiece" type="text" class="form-control" placeholder="Artpiece">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 2</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show all artpieces of an author</span>
                        <form class="navbar-form navbar-right" action="/task2" method="post">
                            <div class="form-group">
                                <input name="author" type="text" class="form-control" placeholder="Author">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 3</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show artpieces by employee</span>
                        <form class="navbar-form navbar-right" action="/task3" method="post">
                            <div class="form-group">
                                <input name="name" type="text" class="form-control" placeholder="Employee">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 4</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show artpieces in a hall</span>
                        <form class="navbar-form navbar-right" action="/task4" method="post">
                            <div class="form-group">
                                <input name="hall" type="text" class="form-control" placeholder="Hall">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 5</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show all guides</span>
                        <form action="/task5" method="get">
                            <button type="submit" class="btn btn-default pull-right" >Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 6</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show excursionists that are free</span>
                        <br>
                        <form class="test-form navbar-form navbar-right">
                            <div class="form-group">
                                From
                                <input type="text" class="form-control" placeholder="YYYY-MM-DD hh:mm:ss">
                                To
                                <input type="text" class="form-control" placeholder="YYYY-MM-DD hh:mm:ss">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 7</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show available excursions</span>
                        <br>
                        <form class="test-form navbar-form navbar-right" action="/task7" method="post">
                            <div class="form-group">
                                From
                                <input name="startdate" type="text" class="form-control" placeholder="YYYY-MM-DD hh:mm:ss">
                                To
                                <input name="enddate" type="text" class="form-control" placeholder="YYYY-MM-DD hh:mm:ss">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 8</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show the statistic of the given material</span>
                        <form class="navbar-form navbar-right">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Material">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 9</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show the statistic of the given technique</span>
                        <form class="navbar-form navbar-right">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Technique">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 10</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show excursions in period</span>
                        <br>
                        <form class="navbar-form navbar-right">
                            <div class="form-group">
                                From
                                <input type="text" class="form-control" placeholder="YYYY-MM-DD hh:mm:ss">
                                To
                                <input type="text" class="form-control" placeholder="YYYY-MM-DD hh:mm:ss">
                            </div>
                            <button type="submit" class="btn btn-default">Execute</button>
                        </form>

                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Task 11</h3>
                    </div>
                    <div class="panel-body">
                        <span class="pull-left">Show excursions statistic</span>
                        <button type="submit" class="btn btn-default pull-right">Execute</button>
                    </div>
                </div>
        </div>
    </div>
</div>
<script src="/resources/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>

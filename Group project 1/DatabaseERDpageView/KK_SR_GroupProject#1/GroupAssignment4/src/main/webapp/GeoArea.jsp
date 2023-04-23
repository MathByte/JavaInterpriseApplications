<%@ page import="com.sk.groupassignment4.Beans.GeoGraphicArea" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: khach
  Date: 2/25/2023
  Time: 10:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GeoGraphicArea</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


</head>









<body>
<%--<header>--%>
<%--    <div class="collapse bg-dark" id="navbarHeader">--%>
<%--        <div class="container">--%>
<%--            <div class="row">--%>
<%--                <div class="col-sm-8 col-md-7 py-4">--%>
<%--                    <h4 class="text-white">About</h4>--%>
<%--                    <p class="text-muted">GeoGraphicArea According to levels.</p>--%>
<%--                </div>--%>
<%--                <div class="col-sm-4 offset-md-1 py-4">--%>
<%--                    <h4 class="text-white">Contact</h4>--%>
<%--                    <ul class="list-unstyled">--%>
<%--                        <li><a href="#" class="text-white">Follow on Twitter</a></li>--%>
<%--                        <li><a href="#" class="text-white">Like on Facebook</a></li>--%>
<%--                        <li><a href="#" class="text-white">Email me</a></li>--%>
<%--                    </ul>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <div class="navbar navbar-dark bg-dark box-shadow">--%>
<%--        <div class="container d-flex justify-content-between">--%>
<%--            <a href="#" class="navbar-brand d-flex align-items-center">--%>
<%--                <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="mr-2"><path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z"></path><circle cx="12" cy="13" r="4"></circle></svg>--%>
<%--                <strong>Album</strong>--%>
<%--            </a>--%>
<%--            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">--%>
<%--                <span class="navbar-toggler-icon"></span>--%>
<%--            </button>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</header>--%>

<main role="main">


    <section class="jumbotron text-center">
        <div class="container">
            <h1 class="jumbotron-heading">GeoGraphic Areas</h1>

        </div>
    </section>

    <div class="album py-5 bg-light">
        <div class="container">

            <div class="row">
                <a href=index.jsp>Home Page</a>
                <h2>list the names of all geographic areas that belong to that hierarchy level.</h2>
                <div class="col-md-3">
                    <div class="card mb-4 box-shadow">
                        <h2 class="card-img-top"> Level 0 </h2>
                        <div class="card-body">
                           <div class="d-flex justify-content-between align-items-center">

                                <table class="table">
                                    <tbody>

                                    <% ArrayList<GeoGraphicArea> g0 = (ArrayList<GeoGraphicArea>) request.getAttribute("list0");
                                        for(GeoGraphicArea gItem0 : g0){
                                        %>
                                        <tr>
                                        <%--<td><a href=GeoAreaServlet/edit?id=+<%=gItem0.getGeoGraphicAreaId()%> > <%=gItem0.getName()%></a></td>--%>
                                            <td><a href=geoAreaServlet/detail?id=<%=gItem0.getGeoGraphicAreaId()%>> <%=gItem0.getName()%></a></td>
                                        </tr>

                                     <%  }  %>



                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card mb-4 box-shadow">
                        <h2 class="card-img-top"> Level 1 </h2>
                        <div class="card-body">
                            <div class="d-flex justify-content-between align-items-center">

                                <table class="table">
                                    <tbody>

                                    <% ArrayList<GeoGraphicArea> g1 = (ArrayList<GeoGraphicArea>) request.getAttribute("list1");
                                        for(GeoGraphicArea gItem1 : g1){
                                    %>
                                    <tr>
                                        <td><a href=geoAreaServlet/detail?id=<%=gItem1.getGeoGraphicAreaId()%>> <%=gItem1.getName()%></a></td>
                                    </tr>

                                    <%  }  %>



                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card mb-4 box-shadow">
                        <h2 class="card-img-top"> Level 2 </h2>
                        <div class="card-body">
                            <div class="d-flex justify-content-between align-items-center">

                                <table class="table">
                                    <tbody>

                                    <% ArrayList<GeoGraphicArea> g2 = (ArrayList<GeoGraphicArea>) request.getAttribute("list2");
                                        for(GeoGraphicArea gItem2 : g2){
                                    %>
                                    <tr>
                                        <td><a href=geoAreaServlet/detail?id=<%=gItem2.getGeoGraphicAreaId()%>> <%=gItem2.getName()%></a></td>
                                    </tr>

                                    <%  }  %>



                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card mb-4 box-shadow">
                        <h2 class="card-img-top"> Level 3 </h2>
                        <div class="card-body">
                            <div class="d-flex justify-content-between align-items-center">

                                <table class="table">
                                    <tbody>

                                    <% ArrayList<GeoGraphicArea> g3 = (ArrayList<GeoGraphicArea>) request.getAttribute("list3");
                                        for(GeoGraphicArea gItem3: g3){
                                    %>
                                    <tr>
                                        <td><a href=geoAreaServlet/detail?id=<%=gItem3.getGeoGraphicAreaId()%>> <%=gItem3.getName()%></a></td>
                                    </tr>

                                    <%  }  %>



                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</main>

<footer class="text-muted">
    <div class="container">
        <p class="float-right">
            <a href="#">Back to top</a>
        </p>

    </div>
</footer>











<%--<%--%>
<%--    ArrayList<GeoGraphicArea> gArea =--%>
<%--        (ArrayList<GeoGraphicArea>)request.getAttribute("list");--%>
<%--    for(GeoGraphicArea g : gArea)--%>
<%--    {%>--%>

<%--        <p> <%=g.getLevel()%> </p>--%>
<%--    <%}--%>

<%--%>--%>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>

</body>
</html>

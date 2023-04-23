<%--
  Created by IntelliJ IDEA.
  User: khach
  Date: 2/26/2023
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<main role="main">
    <section class="jumbotron text-center">
        <div class="container">
            <h1 class="jumbotron-heading">GeoGraphic Areas</h1>

        </div>
    </section>






    <div class="album py-5 bg-light">
        <div class="container">

            <div class="row">

                <h2>Details</h2>
                <div class="col-md-6">
                    <div class="card mb-4 box-shadow">

                        <div class="card-body">
                            <div class="d-flex justify-content-between align-items-center">

                                <table class="table table-borderless">


                                    <tbody>
                                    <tr>
                                        <th scope="row">Geographic Area ID :</th>
                                        <td>${id}</td>


                                    </tr>
                                    <tr>
                                        <th scope="row">Name :</th>
                                        <td >${name}</td>

                                    </tr>
                                    <tr>
                                        <th scope="row">Code :</th>
                                        <td>${code}</td>


                                    </tr>
                                    <tr>
                                        <th scope="row">Level :</th>
                                        <td >${level}</td>

                                    </tr>
                                    <tr>
                                        <th scope="row">Alternative Code :</th>
                                        <td >${altercode}</td>

                                    </tr>
                                    <tr>
                                        <th scope="row">Total population M+F:</th>
                                        <td >${totalp}</td>

                                    </tr>
                                    </tbody>


                                </table>


                            </div>
                            <a href="../geoAreaServlet">Go back</a>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>














    </main>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>

</body>
</html>

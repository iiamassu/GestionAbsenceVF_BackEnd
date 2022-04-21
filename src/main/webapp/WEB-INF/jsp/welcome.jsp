<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<h1>Salah Eddine HADDANE</h1>
<table  class="table table-bordered">
        <thead class="table-primary">
        <tr>
            <th  scope="col">Heure debut</th>
            <th  scope="col">Heure fin</th>
            <th  scope="col">Motif</th>
        </tr>
        </thead>
        <c:forEach var="item" items="${absence}">
            <tr>
                <td scope="row"> ${item.heure_debut} </td>
                <td> ${item.heure_fin} </td>
                <td> ${item.motif} </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
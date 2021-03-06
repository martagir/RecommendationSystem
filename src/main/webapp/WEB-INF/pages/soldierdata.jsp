<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <title>SoldierData</title>

  <style type="text/css">
    .tg {
      border-collapse: collapse;
      border-spacing: 0;
      border-color: #ccc;
    }

    .tg td {
      font-family: Arial, sans-serif;
      font-size: 14px;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #fff;
    }

    .tg th {
      font-family: Arial, sans-serif;
      font-size: 14px;
      font-weight: normal;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #f0f0f0;
    }

    .tg .tg-4eph {
      background-color: #f9f9f9
    }
  </style>

</head>
<body>
<h1>Soldier Details</h1>

<table class="tg">
  <tr>
    <th width="80">ID</th>
    <th width="120">Surname</th>
    <th width="120">Name</th>
    <th width="120">MiddleName</th>
  </tr>
  <tr>
    <td>${soldier.id}</td>
    <td>${soldier.surname}</td>
    <td>${soldier.name}</td>
    <td>${soldier.middleName}</td>
  </tr>
</table>
</body>
</html>
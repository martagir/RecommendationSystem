<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Soldiers Page</title>

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
<a href="../../index.jsp">Back to main menu</a>

<br/>
<br/>

<h1>Soldier List</h1>

<c:if test="${!empty listSoldiers}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Surname</th>
            <th width="120">Name</th>
            <th width="120">MiddleName</th>
            <th width="120">DateOfConscription</th>
            <th width="120">MilitaryCard</th>
            <th width="120">Rank_id</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listSoldiers}" var="soldier">
            <tr>
                <td>${soldier.id}</td>
                <td><a href="/soldierdata/${soldier.id}" target="_blank">${soldier.surname}</a></td>
                <td>${soldier.name}</td>
                <td>${soldier.middleName}</td>
                <td>${soldier.dateOfConscription}</td>
                <td>${soldier.militaryCard}</td>
                <td>${soldier.rank_id}</td>
                <td><a href="<c:url value='/edit/${soldier.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/remove/${soldier.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<h1>Add a Soldier</h1>

<c:url var="addAction" value="/soldiers/add"/>

<form:form action="${addAction}" commandName="soldier">
    <table>
        <c:if test="${!empty soldier.name}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="surname">
                    <spring:message text="Surname"/>
                </form:label>
            </td>
            <td>
                <form:input path="surname"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="name">
                    <spring:message text="Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="middleName">
                    <spring:message text="MiddleName"/>
                </form:label>
            </td>
            <td>
                <form:input path="middleName"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="dateOfConscription">
                    <spring:message text="DateOfConscription"/>
                </form:label>
            </td>
            <td>
                <form:input path="dateOfConscription"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="militaryCard">
                    <spring:message text="MilitaryCard"/>
                </form:label>
            </td>
            <td>
                <form:input path="militaryCard"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="rank_id">
                    <spring:message text="Rank"/>
                </form:label>
            </td>
            <td>
                <form:input path="rank_id"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty soldier.name}">
                    <input type="submit"
                           value="<spring:message text="Edit Soldier"/>"/>
                </c:if>
                <c:if test="${empty soldier.name}">
                    <input type="submit"
                           value="<spring:message text="Add Soldier"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

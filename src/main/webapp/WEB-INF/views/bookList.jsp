<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-25
  Time: 오후 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>bookList.jsp</title>
    <style>
        table, tr, td, th {
            border: solid 1px black;
            border-collapse: collapse;
            padding: 10px;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>번호</th>
        <th>도서명</th>
        <th>저자</th>
        <th>가격</th>
        <th>출판사</th>
    </tr>
    <c:forEach items="${bookList}" var="book">
        <tr>
<%--        모델의 쿼티이름과 동일해야 함 --%>
<%--        var : forEach 안에서만 사용함 --%>
    <td>${book.bookId}</td>
    <td>
<%--        책 제목을 클릭하면 /book 이라는 주소로 클릭한 책의 bookId를 전달
            /book 주소를 처리하는 Controller 메서드 정의
            findBook.jsp에 해당 책 정보 출력 --%>
        <a href="/book?bookId=${book.bookId}">${book.bookName}</a>

    </td>
    <td>${book.bookAuthor}</td>
    <td>${book.bookPrice}</td>
    <td>${book.bookPublisher}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

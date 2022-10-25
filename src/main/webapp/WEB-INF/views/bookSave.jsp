<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-24
  Time: 오후 4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bookSave</title>
</head>
<body>
    <h2>신규도서 등록</h2>
   <form action="/save" method="post">
       <input type="text" name="bookName" placeholder="도서명 입력"> <br>
       <input type="text" name="bookAuthor" placeholder="저자명 입력"> <br>
       <input type="text" name="bookPrice" placeholder="도서 가격 입력"> <br>
       <input type="text" name="bookPublisher" placeholder="출판사 입력"> <br>
       <input type="submit" value="등록">
    </form>
</body>
</html>

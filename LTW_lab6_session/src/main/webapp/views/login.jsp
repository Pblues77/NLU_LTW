<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: sans-serif;
            display: flex;
            min-height: 100vh;
            justify-content: center;
            align-items: center;
        }
        .container{
            width: 40%;
            box-shadow: 0 3px 10px 0 rgba(0, 0, 0, .14);
        }
        form {
            text-align: center;
            margin: 30px;
        }

        .input_style {
            display: flex;
            width: 100%;
            border: steelblue solid 2px;
            height: 50px;
            margin: 20px 0;
        }

        .input_style input {
            width: 100%;
            margin-left: 10px;
            border: none;
            outline: none;
            font-size: 20px;
        }
        #submit_bt{
            width: 30%;
            height: 40px;
            font-size: 10px;
            font-weight: bold;
            color: white;
            cursor: pointer;
            border-radius: 5px;
            border: none;
            background-color: steelblue;
        }
    </style>
</head>
<body>
<div class="container">
    <form action="login">
        <h1>Đăng Nhập</h1>
        <div class="input_style">
            <label for="email_phone"></label>
            <input type="text" id="email_phone" name="email_phone" placeholder="Nhập email hoặc số điện thoại">
        </div>
        <div class="input_style">
            <label for="password"></label>
            <input type="password" id="password"  name="password" placeholder="Nhập mật khẩu">
        </div>
        <button type="submit" id="submit_bt">
            Đăng nhập
        </button>

        <% String re = request.getAttribute("result")==null?"":request.getAttribute("result").toString(); %>
        <p id="result" name="result"><%=re%></p>
    </form>
</div>
</body>
</html>
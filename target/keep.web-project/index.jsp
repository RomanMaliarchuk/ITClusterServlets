<!DOCTYPE html>

<br>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <title>Using Servlet</title>

    <style type="text/css">
        body {background-color:#66cc66}
        form input {font-size: 25px;}
        .mainForm{
            margin: 10px;
            padding: 20px;
            border: 1px solid red;
        }
    </style>


</head>

<body>
<div class="mainForm">

    <form action="addUser" method="POST">
        <input name="addUser" type="submit" value=" Додати користувача           ">
        <input name="action" type="hidden"  value="addUser">
    </form>
    </br>

    <form action="viewUsers" method='POST'>
        <input name="viewUsers" type="submit" value=" Переглянути користувачів ">
        <input name="action" type="hidden"  value="viewUsers">
    </form>
    </br>

    <form action="addNote" method='POST'>
        <input name="addNote" type="submit" value=" Додати нотатку                   ">
        <input name="action" type="hidden"  value="addNote">
    </form>
    </br>

    <form action="viewNotes" method='POST'>
        <input name="viewNotes" type="submit" value=" Переглянути нотатки          ">
        <input name="action" type="hidden"  value="viewNotes">
    </form>

</div>


</body>

</html>
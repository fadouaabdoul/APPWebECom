<%--
  Created by IntelliJ IDEA.
  User: ThDdly_Sn
  Date: 6/5/2021
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Client</title>
</head>
<body>

<h1>Client Space</h1>
<form action="Client" method="post">

    <fieldset>
        <legend>Create Client</legend>
        <p> Bienvenue!</p>

        <label for="gender">Gender<span class="requis">*</span></label>
        <input type="text" id="gender" name="gender" value="" size="20" maxlength="60" />
        <br />
        <br>

        <label for="name">Name <span class="requis">*</span></label>
        <input type="text" id="name" name="name" value="" size="20" maxlength="20" />
        <br />
        <br>

        <label for="lastname">Last Name <span class="requis">*</span></label>
        <input type="text" id="lastname" name="lastname" value="" size="20" maxlength="20" />
        <br /> <br>

        <label for="adresse">Adresse de livraison <span class="requis">*</span></label>
        <input type="text" id="adresse" name="adresse" value="" size="20" maxlength="20" />
        <br />
        <br>

        <label for="email">Adresse email <span class="requis">*</span></label>
        <input type="text" id="email" name="email" value="" size="20" maxlength="60" />
        <br />
        <br>


        <label for="phone">Phone Number <span class="requis">*</span></label>
        <input type="text" id="phone" name="phone" value="" size="20" maxlength="20" />
        <br />
        <br>

        <input type="submit" value="Save" class="sansLabel" />
        <input type="submit" value="Cancel" class="sansLabel" />

        <br />
    </fieldset>


</form>






</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: ThDdly_Sn
  Date: 6/5/2021
  Time: 6:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Commande</title>
</head>
<body>
<h1>Create a command</h1>
<form action="Commande" method="POST">


    <fieldset>
        <legend>Create a command</legend>
        <p> Fill the Forum</p>

        <label for="date">Date<span class="requis">*</span></label>
        <input type="text" id="date" name="date" value="" size="20" maxlength="60" />
        <br />
        <br>

        <label for="montant">Montant <span class="requis">*</span></label>
        <input type="text" id="montant" name="montant" value="" size="20" maxlength="20" />
        <br />
        <br>

        <label for="modepaiment">Mode de paiment <span class="requis">*</span></label>
        <input type="text" id="modepaiment" name="modepaiment" value="" size="20" maxlength="20" />
        <br /> <br>



        <label for="statuspaiment">Status de paiment <span class="requis">*</span></label>
        <input type="text" id="statuspaiment" name="statuspaiment" value="" size="20" maxlength="20" />
        <br /> <br>



        <label for="modelivraison">Mode de Livraison <span class="requis">*</span></label>
        <input type="text" id="modelivraison" name="modelivraison" value="" size="20" maxlength="20" />
        <br /> <br>


        <label for="statuslivraison">Status de Livraison <span class="requis">*</span></label>
        <input type="text" id="statuslivraison" name="statuslivraison" value="" size="20" maxlength="20" />
        <br /> <br>


        <select name="Products">
            <option value="0" selected>(please select:)</option>
            <option value="Laptop"> Laptop</option>
            <option value="Keybaord"> Keybaord</option>
            <option value="Phone"> Phone</option>
            <option value="Headphones"> Headphones</option>
        </select>
        <br>

        <br>

        <input type="submit" value="Validate" class="sansLabel" />
        <input type="submit" value="Back" class="sansLabel" />

        <br />
    </fieldset>

</form>




</body>
</html>

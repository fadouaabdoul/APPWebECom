<%--
  Created by IntelliJ IDEA.
  User: ThDdly_Sn
  Date: 6/5/2021
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>Affichage d'un client</title>
</head>
<body>

<%-- Puis affichage des données enregistrées dans le bean "client" transmis par la servlet --%>
<p>Nom : ${ client.name }</p>
<p>Mail : ${ client.mail }</p>
<p>gender : ${ client.gender }</p>
<p>Numéro de téléphone : ${ client.numTele }</p>
<p>Email : ${ client.address }</p>

</body>
</html>

package com.APPWebECom.APPWebECom.Servlet;

import com.APPWebECom.APPWebECom.Beans.Client;
import com.APPWebECom.APPWebECom.Beans.Commande;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ServletCommandeCreate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher
                ( "/WEB-INF/CreateCommande.jsp" ).forward( request, response );

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Client client = (Client) request.getAttribute( "client" );
        Date dateCom = (Date) request.getAttribute( "date" );
        float montant = Float.parseFloat(request.getParameter( "montant" ));



        Commande commande = new Commande();
        commande.setClient( client );
        commande.setDateCom( dateCom );
        commande.setMontant( montant );

        request.setAttribute( "commande", commande );

        this.getServletContext().getRequestDispatcher( "/WEB-INF/RecapCommande.jsp" ).forward( request, response );

    }
}

package com.APPWebECom.APPWebECom.Servlet;

import com.APPWebECom.APPWebECom.Beans.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class ServletClientCreate extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher
                ( "/WEB-INF/CreateClient.jsp" ).forward( request, response );
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter( "name" );
        String gender = request.getParameter( "gender" );
        String mail = request.getParameter( "mail" );
        int phone = Integer.parseInt(request.getParameter( "phone" ));
        String address = request.getParameter( "address" );


        //create new client  bean  and initialize with the data recuperee

        Client client = new Client();

        client.setName( name );
        client.setGender(client.gender );
        client.setMail( mail );
        client.setNumTele( phone );
        client.setAddress( address );


        // add the bean on the object query
        request.setAttribute( "client", client );

        // transfer to the jsp that will show everything
        this.getServletContext().getRequestDispatcher( "WEB-INF/RecapClient.jsp" ).forward( request, response );
    }

}

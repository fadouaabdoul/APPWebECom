package com.APPWebECom.APPWebECom.Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class ServletClientCreate extends HttpServlet {

   /** public static final String CHAMP_NAME = "Name";
    public static final String CHAMP_GENDER = "Gender";
    public static final String CHAMP_MAIL = "Mail";
    public static final String CHAMP_NUM_TELE = "Num Tele";**/


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher
                ("/WEB-INF/CreateClient.jsp").forward( request, response );


    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       /** String name = request.getParameter(CHAMP_NAME);
        String gender = request.getParameter( CHAMP_GENDER );
        String mail = request.getParameter( CHAMP_MAIL );
        String numTele = request.getParameter( CHAMP_NUM_TELE );**/




    }


}

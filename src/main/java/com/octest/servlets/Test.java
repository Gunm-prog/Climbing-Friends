package com.octest.servlets;

import com.octest.beans.Auteur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * *Servlet implementation class Test
 * */

@WebServlet ("/Test")
public class Test extends HttpServlet {
    private static final long serialVersionUID = 1L;
    /**
     * @See HttpServlet#HttpServlet()
     */
    public Test(){
        super();
        //TODO Auto-generated constructor stub
    }
    /**
     * @See HttpServlet#DoGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO Auto-generated method stub
       /* response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<title>Test</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Bonjour !</p>");
        out.println("</body>");
        out.println("</html>");*/
        Auteur auteur = new Auteur();
        auteur.setPrenom("Mathieu");
        auteur.setNom("Nebra");
        auteur.setActif(true);

        request.setAttribute("auteur", auteur);
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);

    }
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //TODO Auto-generated method stub
    }
}

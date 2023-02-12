/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Service.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nuket
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        if(action!=null&&action.equals("reset")){
            session.invalidate();
            session = request.getSession();
            boolean logout = true;
            request.setAttribute("logout",logout);
        }
        
        String username = (String) session.getAttribute("username");
        if(username==null){
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
        }
       
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           HttpSession session = request.getSession();
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          request.setAttribute("username",username);
          request.setAttribute("password",password);
           if(password==null||password.equals("")||username==null||username.equals("")){
               Boolean notFull = true;
               request.setAttribute("notfull", notFull);
               getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
               return;
           }
           LoginService login = new LoginService();
           User user = login.logIn(username, password);
           if(user==null){
               Boolean incorrect = true;
               request.setAttribute("incorrect", incorrect);
               getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
               return;
           }else{
               session.setAttribute("username",user);
               response.sendRedirect("home");
           }
           
    }

}

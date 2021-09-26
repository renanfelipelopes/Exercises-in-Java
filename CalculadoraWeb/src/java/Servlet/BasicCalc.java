package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author renan
 */
public class BasicCalc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            float n1 = Float.parseFloat(request.getParameter("Numero1"));
            float n2 = Float.parseFloat(request.getParameter("Numero2"));
            float soma = 0;            
            soma = n1 + n2;
            
            float n3 = Float.parseFloat(request.getParameter("Numero1"));
            float n4 = Float.parseFloat(request.getParameter("Numero2"));
            float sub = 0;            
            sub = n3 - n4;
            
            float n5 = Float.parseFloat(request.getParameter("Numero1"));
            float n6 = Float.parseFloat(request.getParameter("Numero2"));
            float mult = 0;            
            mult = n5 * n6;
            
            float n7 = Float.parseFloat(request.getParameter("Numero1"));
            float n8 = Float.parseFloat(request.getParameter("Numero2"));
            float div = 0;            
            div = n7 / n8;
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BasicCalc</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<pre>");
            out.println("Numero1........: " + n1);
            out.println("Numero2........: " + n2);
            out.println("Soma........: " + soma);
            out.println("Numero1........: " + n3);
            out.println("Numero2........: " + n4);
            out.println("Subtração........: " + sub);
            out.println("Numero1........: " + n5);
            out.println("Numero2........: " + n6);
            out.println("Multiplicação........: " + mult);
            out.println("Numero1........: " + n7);
            out.println("Numero2........: " + n8);
            out.println("Divisão........: " + div);
            out.println("</pre>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

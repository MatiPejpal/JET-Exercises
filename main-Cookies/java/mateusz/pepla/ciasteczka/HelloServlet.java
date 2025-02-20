package mateusz.pepla.ciasteczka;

import java.io.*;
import java.time.LocalTime;

import jakarta.ejb.Local;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie cookie = new Cookie("diminishingCookie", LocalTime.now().toString());
        cookie.setMaxAge(30);
        cookie.setPath("/");
        response.addCookie(cookie);

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1><form action=\"/Ciasteczka-1.0-SNAPSHOT/second\" method=\"GET\">\n" +
                "    <input type=\"submit\" value=\"wcisnij\">\n" +
                "</form>\n");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
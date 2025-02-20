package mateusz.pepla.ciasteczka;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalTime;

import static java.lang.Math.abs;

@WebServlet(name = "second", value = "/second")
public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String start = "";
        for(Cookie c: request.getCookies())
            if (c.getName().equals("diminishingCookie")){
                start = c.getValue();
                break;
            }
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (!"".equals(start)) {
            long elapsedTime = 30 + Duration.between(LocalTime.now(), LocalTime.parse(start)).toSeconds();
            out.println("<h1>Time to end: " + elapsedTime + "</h1>");
        }else
            out.println("<h1>There is no cookie!</h1>");
        out.println("</body></html>");

    }

}

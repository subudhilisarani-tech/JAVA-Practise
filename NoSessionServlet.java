import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NoSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("user");
        out.println("Welcome " + name);
    }
}
package gradle.wildfly;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "test")
public class TestServlet extends HelloServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        int firstInt = Integer.parseInt(first);
        int secondInt = Integer.parseInt(second);
        int sum = firstInt * secondInt;
        resp.getWriter().println(sum);
    }
}

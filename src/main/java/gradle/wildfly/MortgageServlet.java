package gradle.wildfly;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(urlPatterns = "mortgage")
public class MortgageServlet extends HelloServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sumOfCredit = req.getParameter("sumOfCredit");
        String yearsOfCredit = req.getParameter("yearsOfCredit");
        String interest = req.getParameter("interest");

        double sumOfCreditD = Double.parseDouble(sumOfCredit);
        double monthsOfCreditD = (Double.parseDouble(yearsOfCredit))*12;
        double interestParsed = Double.parseDouble(interest);

        double monthlyInterest = (interestParsed/ 100)/12;

        double monthlyPayment = sumOfCreditD *
                ((monthlyInterest * Math.pow((1 + monthlyInterest), monthsOfCreditD)) /
                        ((Math.pow((1 + monthlyInterest), monthsOfCreditD)) - 1));

        double overPayment = (monthlyPayment * monthsOfCreditD)-sumOfCreditD;

        double monthlyPaymentRound = Math.round(monthlyPayment * 100) / 100;
        double overPaymentRound = Math.round(overPayment * 100) / 100;


        resp.setContentType ("text/html; charset=UTF-8");

        resp.getWriter().println("Ежемесячная выплата составит " + monthlyPaymentRound + "\n" + " руб");
        resp.getWriter().write("<br />");
        resp.getWriter().println("Переплата составит: " + overPaymentRound + " руб");
    }

}

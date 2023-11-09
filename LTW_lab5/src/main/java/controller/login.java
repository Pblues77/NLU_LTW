package controller;

import model.Account;
import model.AccountManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/login")
public class login extends HttpServlet {
    private AccountManager accountManager = new AccountManager();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String email_phone = req.getParameter("email_phone");
        String pw = req.getParameter("password");
        System.out.println(email_phone);
        if (!accountManager.checkExist(email_phone)) {
            req.setAttribute("result", "Tài khoản không tồn tại!");
            req.getRequestDispatcher("views/login.jsp").forward(req, resp);
        } else {
            Account a = accountManager.checkLogin(email_phone, pw);
            if (a != null)
                resp.getWriter().println("Chào " + a.getName() + ", nạp lần đầu ngay thôiii");
            else {
                req.setAttribute("result", "Email/Số điện thoại hoặc mật khẩu không chính xác!");
                req.getRequestDispatcher("views/login.jsp").forward(req, resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}

package controller;

import model.User;
import model.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;


@WebServlet("/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String email_phone = req.getParameter("email_phone");
        String pw = req.getParameter("password");

        User user = UserService.getInstance().checkLogin(email_phone, pw);
        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("auth", user);
            resp.sendRedirect("views/index.jsp");
        } else {
            req.setAttribute("result", "Email/Số điện thoại hoặc mật khẩu không chính xác!");
            req.getRequestDispatcher("views/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}

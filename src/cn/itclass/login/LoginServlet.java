package cn.itclass.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 编码设置
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		// 获得输入的验证码
		String checkCode_client = (String) request.getParameter("checkCode");

		// 获得生成的验证码
		String checkCode_session = (String) request.getSession().getAttribute("checkcode_session");

		// 两者进行比对，是否一致
		if (!checkCode_client.equals(checkCode_session)) {
			request.setAttribute("loginInfo", "您的验证码不正确！！！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}else {
			//此处为校验成功，然后获取用户名密码啥啥啥的，进行一堆操作。就不写了
			response.getWriter().write("登陆成功");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
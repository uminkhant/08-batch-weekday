package com.jdc.mkt.entity.communication.toCommunicate;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/toForward")
public class ToForwardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static final String FOOTER = """
			</body>
			</html>
			""";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getServletContext().getRequestDispatcher("/header").include(req, resp);
		var message = req.getAttribute("message") != null ?
				req.getAttribute("message") : "no message";
		
		resp.getWriter()
		.append("<h3>")
		.append("This is from toForward :")
		.append(message.toString())
		.append("</h3>")
		.append(FOOTER)
		.flush();
	}

}

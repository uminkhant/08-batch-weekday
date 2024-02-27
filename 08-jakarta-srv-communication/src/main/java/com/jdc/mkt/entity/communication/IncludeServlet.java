package com.jdc.mkt.entity.communication;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final String FOOTER = """
			
			</body>
			</html>
			""";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//relative paths
		req.getRequestDispatcher("toInclude").include(req, resp);
		
		//absoulute paths
		var context = req.getServletContext();
		context.getRequestDispatcher("/toInclude").include(req, resp);
		
		// name dispatcher
		context.getNamedDispatcher("toIncludeName").include(req, resp);
		
		resp.getWriter()
		.append("<p>This is from include servlet </p>")
		.append(FOOTER)
		.flush();
	}

}

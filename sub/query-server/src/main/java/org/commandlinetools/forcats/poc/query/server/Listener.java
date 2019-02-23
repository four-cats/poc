package org.commandlinetools.forcats.poc.query.server;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "QueryServerListener", urlPatterns = {"query"}, loadOnStartup = 1) 
public class Listener extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.getWriter().print(handleQuery("query"));
    }

    public static String handleQuery(String query) {
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch(Exception ex) {
            System.err.println("caught ex" + ex);
        }
        return "1000 Query Server Listener handleQuery response TBD";
    }
}


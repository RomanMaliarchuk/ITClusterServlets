package ua.com.maliarchuk.servlets;

import ua.com.maliarchuk.database.DataBase;
import ua.com.maliarchuk.model.ModelUser;
import ua.com.maliarchuk.view.ViewUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by roman on 17.07.2017.
 */
@WebServlet(name = "viewUsers", urlPatterns = {"/viewUsers"})
public class ViewUsers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String textInfo = new ViewUser().getAllUsers();

        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>\n" +
                    "\n" +
                    "<br>\n" +
                    "\n" +
                    "<head>\n" +
                    "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                    "\n" +
                    "    <title>Using Servlet</title>\n" +
                    "\n" +
                    "    <style type=\"text/css\">\n" +
                    "        body {background-color:#66cc66;}\n" +
                    "        form input {font-size: 25px;}\n" +
                    "        .mainForm{\n" +
                    "            margin: 10px;\n" +
                    "            padding: 20px;\n" +
                    "            border: 1px solid red;\n" +
                    "        }\n" +
                    "        .info{\n" +
                    "            margin: 10px;\n" +
                    "            padding: 20px;\n" +
                    "            font-size: 25px;\n" +
                    "            border: 1px solid red;\n" +
                    "        }\n" +
                    "    </style>\n" +
                    "\n" +
                    "\n" +
                    "</head>\n" +
                    "\n" +
                    "<body>\n" +
                    "<div class=\"mainForm\">\n" +
                    "\n" +
                    "    <form action=\"addUser\" method=\"POST\">\n" +
                    "        <input name=\"addUser\" type=\"submit\" value=\" Додати користувача           \">\n" +
                    "        <input name=\"action\" type=\"hidden\"  value=\"addUser\">\n" +
                    "    </form>\n" +
                    "    </br>\n" +
                    "\n" +
                    "    <form action=\"viewUsers\" method='POST'>\n" +
                    "        <input name=\"viewUsers\" type=\"submit\" value=\" Переглянути користувачів \">\n" +
                    "        <input name=\"action\" type=\"hidden\"  value=\"viewUsers\">\n" +
                    "    </form>\n" +
                    "    </br>\n" +
                    "\n" +
                    "    <form action=\"addNote\" method='POST'>\n" +
                    "        <input name=\"addNote\" type=\"submit\" value=\" Додати нотатку                   \">\n" +
                    "        <input name=\"action\" type=\"hidden\"  value=\"addNote\">\n" +
                    "    </form>\n" +
                    "    </br>\n" +
                    "\n" +
                    "    <form action=\"viewNotes\" method='POST'>\n" +
                    "        <input name=\"viewNotes\" type=\"submit\" value=\" Переглянути нотатки          \">\n" +
                    "        <input name=\"action\" type=\"hidden\"  value=\"viewNotes\">\n" +
                    "    </form>\n" +
                    "\n" +
                    "</div>\n" +
                    "\n" +
                    "<div class=\"info\">\n" +
                    textInfo +
                    "</div>\n" +
                    "\n" +
                    "</body>\n" +
                    "\n" +
                    "</html>");
        } finally {
            out.close();
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

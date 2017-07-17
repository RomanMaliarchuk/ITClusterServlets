package ua.com.maliarchuk.view;

/**
 * Created by roman on 17.07.2017.
 * The class has methods for creating a new user and outputting information about all users
 */

import com.sun.org.apache.xpath.internal.operations.Mod;
import ua.com.maliarchuk.database.DataBase;
import ua.com.maliarchuk.model.ModelUser;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ViewUser {

    public void createNewUser(String userName, String password){
        ModelUser user = new ModelUser(userName, password);
        DataBase.allUsers.add(user);
    }

    public String getAllUsers(){
        String textInfo = "";
        if(DataBase.allUsers.size()==0) textInfo = "Користувачі в базі даних відсутні!";
        for (ModelUser user : DataBase.allUsers){
            textInfo = textInfo + "ID: " + user.getUserID() + ".  Логін: " + user.getUserName() + " -----> Пароль: " + user.getUserPassword() + "<br>";
        }
        return textInfo;
    }

    public String getListUsers(){
        String listUsers = "";

        for (ModelUser user : DataBase.allUsers){
            //<option value="1">Роман</option>
            listUsers = listUsers + "<option value=\"" + user.getUserID() + "\">" + user.getUserName() + "</option>";
        }

        return listUsers;
    }

}

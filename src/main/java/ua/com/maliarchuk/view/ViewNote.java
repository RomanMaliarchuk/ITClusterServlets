package ua.com.maliarchuk.view;

/**
 * Created by roman on 17.07.2017.
 */

import ua.com.maliarchuk.database.DataBase;
import ua.com.maliarchuk.model.ModelNote;
import ua.com.maliarchuk.model.ModelUser;
import java.util.Scanner;

public class ViewNote {

    public void createNewNote(String textNote, int ID){
        ModelNote note = new ModelNote(textNote, ID);
        DataBase.allNote.add(note);
    }

    public String getAllNotes(){
        String textInfo = "";
        if(DataBase.allNote.size()==0) textInfo = "Нотатки в базі даних відсутні!";
        for (ModelNote note : DataBase.allNote){

            int userID = note.getUserId();
            String userName = "";
            for(ModelUser user : DataBase.allUsers){
                if(user.getUserID()==userID) userName=user.getUserName();
            }

            textInfo = textInfo + "Користувач: " + userName + " ---> Нотатка: " + note.getNote() + "<br>" + "<br>";

        }
        return textInfo;
    }
}


package ua.com.maliarchuk.database;

/**
 * Created by roman on 17.07.2017.
 * The class simulates the DataBase on static collections
 */

import ua.com.maliarchuk.model.ModelNote;
import ua.com.maliarchuk.model.ModelUser;
import java.util.ArrayList;

public class DataBase {
    public static ArrayList<ModelUser> allUsers = new ArrayList<ModelUser>();
    public static ArrayList<ModelNote> allNote = new ArrayList<ModelNote>();
}


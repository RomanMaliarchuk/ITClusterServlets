package ua.com.maliarchuk.model;

/**
 * Created by roman on 17.07.2017.
 */

import java.util.ArrayList;

public class ModelUser {

    private static int countUser = 0;

    private int userID;
    private String userName;
    private String userPassword;

    public ModelUser(){}

    public ModelUser(String userName, String userPassword) {
        countUser++;
        this.userID = countUser;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public int getUserID(){return userID;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelUser modelUser = (ModelUser) o;

        if (userID != modelUser.userID) return false;
        if (userName != null ? !userName.equals(modelUser.userName) : modelUser.userName != null) return false;
        return userPassword != null ? userPassword.equals(modelUser.userPassword) : modelUser.userPassword == null;
    }

    @Override
    public int hashCode() {
        int result = userID;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ModelUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}

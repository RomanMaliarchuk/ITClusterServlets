package ua.com.maliarchuk.model;

/**
 * Created by roman on 17.07.2017.
 */

public class ModelNote {

    private String note;
    private int userId;

    public ModelNote(){}

    public ModelNote(String note, int userId) {
        this.note = note;
        this.userId = userId;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelNote modelNote = (ModelNote) o;

        if (userId != modelNote.userId) return false;
        return note != null ? note.equals(modelNote.note) : modelNote.note == null;
    }

    @Override
    public int hashCode() {
        int result = note != null ? note.hashCode() : 0;
        result = 31 * result + userId;
        return result;
    }

    @Override
    public String toString() {
        return "ModelNote{" +
                "note='" + note + '\'' +
                ", userId=" + userId +
                '}';
    }
}



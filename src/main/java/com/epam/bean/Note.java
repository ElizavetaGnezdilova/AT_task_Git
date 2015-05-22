package com.epam.bean;

import com.epam.dao.NoteBookProvider;

/**
 * Created by Elizaveta_Gnezdilova on 4/23/2015.
 */
public class Note implements java.io.Serializable {
    private String author;
    private String content;
    private int dayCreation;
    private int monthCreation;
    private int yearCreation;


    public Note(String author, String content, int dayCreation, int monthCreation, int yearCreation) {
        this.setAuthor(author);
        this.setContent(content);
        this.setDayCreation(dayCreation);
        this.setMonthCreation(monthCreation);
        this.setYearCreation(yearCreation);
        NoteBookProvider.getNoteBook().addNote(this);
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public int getDayCreation() {
        return dayCreation;
    }

    public int getMonthCreation() {
        return monthCreation;
    }

    public int getYearCreation() {
        return yearCreation;
    }

    public String getDateCreation() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(dayCreation);
//        stringBuilder.append("/");
        stringBuilder.append(monthCreation);
//        stringBuilder.append("/");
        stringBuilder.append(yearCreation);
        String strI = stringBuilder.toString();
        return strI;
    }

    public static String getDateCreation(int dayCreation, int monthCreation, int yearCreation) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(dayCreation);
        //stringBuilder.append("/");
        stringBuilder.append(monthCreation);
       // stringBuilder.append("/");
        stringBuilder.append(yearCreation);
        String strI = stringBuilder.toString();
        return strI;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDayCreation(int dayCreation) {
        this.dayCreation = dayCreation;
    }

    public void setMonthCreation(int monthCreation) {
        this.monthCreation = monthCreation;
    }

    public void setYearCreation(int yearCreation) {
        this.yearCreation = yearCreation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Note  note = (Note) obj;
        if (null == author) {
            return (author == note.author);
        } else {
            if (!author.equals(note.author)) {
                return false;
            }
        }
        if (dayCreation != note.dayCreation) {
            return false;
        }
        if (monthCreation != note.monthCreation) {
            return false;
        }
        if (yearCreation != note.yearCreation) {
            return false;
        }
        if (null == content) {
            return (content == note.content);
        } else {
            if (!content.equals(note.content)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (23 * ((0 == dayCreation) ? 2 : dayCreation) +
                27 * ((0 == monthCreation) ? 3 : monthCreation) +
                23 * ((0 == yearCreation) ? 7 : yearCreation) +
               11* ((null == author) ? 3 : author.hashCode()) +
                7*((null == content) ? 5 : content.hashCode()));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" \n ");
        stringBuilder.append(" author: ");
        stringBuilder.append(" \n ");
        stringBuilder.append(author);
        stringBuilder.append(" \n ");
        stringBuilder.append(" date of creation: ");
        stringBuilder.append(" \n ");
        stringBuilder.append(getDateCreation());
        stringBuilder.append(" \n ");
        stringBuilder.append("content: ");
        stringBuilder.append(" \n ");
        stringBuilder.append(content);


        return stringBuilder.toString();
    }

}


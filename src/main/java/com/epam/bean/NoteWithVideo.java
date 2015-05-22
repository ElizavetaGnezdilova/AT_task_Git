package com.epam.bean;

import java.util.Date;

/**
 * Created by Elizaveta_Gnezdilova on 4/27/2015.
 */
public class NoteWithVideo extends Note {
    private String video;

    public NoteWithVideo(String author, String content, int dayCreation, int monthCreation, int yearCreation, String video){
        super(author,content,dayCreation,monthCreation,yearCreation);
        this.video = video;

    }

    public String getImage() {
        return video;
    }

    public void setImage(String im) {
        this.video = im;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        } else {
            if (getClass() != obj.getClass()) {
                return false;
            }
            NoteWithVideo noteWithVideo = (NoteWithVideo) obj;
            if (null == video) {
                return (video == noteWithVideo.video);
            } else {
                if (!video.equals(noteWithVideo.video)) {
                    return false;
                }
            }
            return true;
        }

    }

    @Override
    public int hashCode() {
        return (int) super.hashCode() + (13 * ((null == video) ? 3 : video.hashCode()));
    }

    @Override
    public String toString() {
        return super.toString() + " \n " + " video " + " \n " + video;
    }

}

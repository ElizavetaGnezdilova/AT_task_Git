package com.epam.bean;

/**
 * Created by Elizaveta_Gnezdilova on 4/27/2015.
 */
public class NoteWithImage extends Note {
    private String image;
    public NoteWithImage( String author, String content, int dayCreation, int monthCreation, int yearCreation, String image){
        super(author,content,dayCreation,monthCreation,yearCreation);
        this.image = image;

    }
    public String getImage(){return image;}

    public void setImage(String image){this.image = image;}
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){ return false;}
        else{
            if (getClass() != obj.getClass()) {return false;}
            NoteWithImage noteWithImage = (NoteWithImage) obj;
            if (null == image) {
                return (this.image == noteWithImage.image);
            } else {
                if (!this.image.equals(noteWithImage.image)) {
                    return false;
                }
            }
            return true;
        }

    }
    @Override
    public int hashCode(){
        return(int)  super.hashCode() + (13 *((null==image)? 3:image.hashCode()));
    }
    @Override
    public String toString(){
        return  super.toString() + " \n "+ " image "+" \n " +image;
    }

}

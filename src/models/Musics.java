package models;

public class Musics extends Sounds{
    private String album;
    private String cantor;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getClassification() {
        if (this.getTotalReproductions() > 2000) {
            return 10;
        } else {
            return  7;
        }
    }
}

package models;

public class Sounds {
    private String title;
    private int totalReproductions;
    private int totaLikes;
    private int classification;
    private String Author;
    private double duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void like() {
        this.totaLikes++;
    }

    public void reproduced() {
        this.totalReproductions++;
    }

}

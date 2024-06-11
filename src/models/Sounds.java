package models;

public class Sounds {
    private String title;
    private int totalReproductions;
    private int totaLikes;
    private int classification;
    private String Author;
    private double duration;

    public int getTotaLikes() {
        return totaLikes;
    }

    public void setTotaLikes(int totaLikes) {
        this.totaLikes = totaLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

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

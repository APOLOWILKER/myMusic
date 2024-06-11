import models.Musics;
import models.MyFavorites;
import models.Podcast;
import models.Sounds;

public class Main {
    public static void main(String[] args) {
        Musics myMusic = new Musics();
        myMusic.setTitle("Pescador de Ilusões");
        myMusic.setCantor("O rappa");

        for (int i = 0; i < 1000; i++){
            myMusic.reproduced();
        }

        for (int i = 0; i < 50; i++){
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Alow Devs");
        myPodcast.setPresenter("Apolo Wilker");

        for (int i = 0; i < 5000; i++){
            myPodcast.reproduced();
        }

        for (int i = 0; i < 1000; i++){
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.inclui(myPodcast);
        favorites.inclui(myMusic);
    }
}

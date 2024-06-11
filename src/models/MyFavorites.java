package models;

public class MyFavorites {
    public void inclui(Sounds sound) {
        if (sound.getClassification() >= 9) {
            System.out.println(sound.getTitle() + ". é considerador sucesso absoluto" +
                    " e preferido por todos!");
        } else {
            System.out.println(sound.getTitle() +  ". Ótima opcão para ouvir.");
        }
    }
}

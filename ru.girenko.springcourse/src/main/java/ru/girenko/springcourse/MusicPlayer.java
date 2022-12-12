package ru.girenko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public void playMusic(Catalog catalog){
        Random random = new Random();
        int randomNumber =random.nextInt(3);

        if (catalog == Catalog.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else if (catalog == Catalog.RAP) {
            System.out.println(rapMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }
}

package ru.girenko.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {


    private List<Music> catalog;


    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;

    public MusicPlayer(List<Music> catalog) {
        this.catalog = catalog;
    }

    public String playMusic(){

        Random random = new Random();

        return "Играет: "+ catalog.get(random.nextInt(catalog.size())).getSong()+" на громкосте: "+ volume;
    }
}

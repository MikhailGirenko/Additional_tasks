package ru.girenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music{
    @Override
    public ArrayList<String> getSong() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("Rock1");
        songList.add("Rock2");
        songList.add("Rock3");
        return songList;
    }
}

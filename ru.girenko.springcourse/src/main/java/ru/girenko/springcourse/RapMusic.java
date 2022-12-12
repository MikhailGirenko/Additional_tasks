package ru.girenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RapMusic implements Music  {

    @Override
    public ArrayList<String> getSong() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("rap1");
        songList.add("rap2");
        songList.add("rap3");
        return songList;
    }
}

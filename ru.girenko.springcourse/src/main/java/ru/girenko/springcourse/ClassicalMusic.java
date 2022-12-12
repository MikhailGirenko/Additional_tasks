package ru.girenko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music{


    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public ArrayList<String> getSong() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("Classic1");
        songList.add("Classic2");
        songList.add("Classic3");
        return songList;
    }
}

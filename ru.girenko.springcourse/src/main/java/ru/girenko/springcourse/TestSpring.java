package ru.girenko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();
        context.close();
    }
}

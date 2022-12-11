package ru.girenko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      Music music =context.getBean("rockMusic", Music.class);
      MusicPlayer musicPlayer = new MusicPlayer(music);
      musicPlayer.playMusic();

      Music music2=context.getBean("classicalMusic", Music.class);
      MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
      classicalMusicPlayer.playMusic();

//        boolean comparison = musicPlayer1 == musicPlayer2;
//        System.out.println(comparison);
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//        musicPlayer1.setVolume(10);
//        //System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
//        //System.out.println(musicPlayer2.getName());
//        System.out.println(musicPlayer2.getVolume());
//       // musicPlayer.playMusicList();
        context.close();
    }
}

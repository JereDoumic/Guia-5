import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Artist duki = new Artist("Duki", 23, "Arg");
        Artist shakira = new Artist("Shakira", 40, "Col");
        Album album2 = new Album("2015", "Desde el fin de mundo", duki);
        Song goteo = new Song("Goteo", "02:34", Gender.TRAP, album2);
        Song wakaWaka = new Song("Waka waka", "3:02", Gender.POP, album2);
        Song rockstar = new Song("Rockstar", "2:32", Gender.TRAP, album2);
        /*ArrayList<Song> listOfSongs = new ArrayList<>();
        listOfSongs.add(goteo);
        listOfSongs.add(wakaWaka);
        listOfSongs.add(rockstar);
        System.out.println(listOfSongs);*/
        /*PremiumList premiumList = new PremiumList();
        premiumList.addSong(goteo);
        premiumList.addSong(rockstar);
        premiumList.addSong(wakaWaka);*/
        //System.out.println(basiclist.toString());
        //premiumList.play();
        //basiclist.play();
        //premiumList.viewListSong();
        Spotify menu = new Spotify("Jere", "premium");




    }
}


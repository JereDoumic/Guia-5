import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class PremiumList implements Reproduccion{

    private String name;

    private LinkedList<Song> myList = new LinkedList<>();

    public PremiumList() {
    }

    public PremiumList(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("LISTA DE REPRODUCCION: ");
        int i = 1;
        for(Song song: this.myList) {
            System.out.println("Cancion numero: " + i);
            System.out.println("Cancion: " + song.getName());
            System.out.println("Album: " + song.getAlbum().getTittle());
            System.out.println("Artista: " + song.getAlbum().getArtist().getName());
            if (song.getArtistInvit() != null) {
                System.out.println("Artista invitado: " + song.getArtistInvit());
            }
            System.out.println("  ");
            i++;
        }
    }

    @Override
    public void addSong(Song song) {
        myList.add(song);
    }

    @Override
    public void deleteSong() {

    }

    @Override
    public void viewListSong() {

    }

    @Override
    public void changeSong() {

    }
}

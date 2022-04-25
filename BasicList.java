import java.util.ArrayList;
import java.util.Stack;

public class BasicList implements Reproduccion{
    private String name;
    private Stack<Song> myList = new Stack<>();
    private Stack<Song> myListAux = new Stack<>();

    public BasicList() {
    }

    public BasicList(String name) {
        this.name = name;
    }

    @Override
    public void play() {
            if(myList != null){
                System.out.println("Cancion: " + myList.get(0).getName());
                System.out.println("Album: " + myList.get(0).getAlbum().getTittle());
                System.out.println("Genero: " + myList.get(0).getGender());
                System.out.println("Artista: " + myList.get(0).getAlbum().getArtist().getName());
                if (myList.get(0).getArtistInvit() != null) {
                    System.out.println("Artista invitado: " + myList.get(0).getArtistInvit());
                }
                System.out.println("   ");
                this.myListAux.add(0, myList.get(0));
                this.myList.remove(0);
                this.myList.add(myListAux.get(0));
            }
    }

    @Override
    public void addSong(Song song) {
        this.myList.add(song);
    }

    @Override
    public void deleteSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void viewListSong() {
            System.out.println(myList.toString());
            System.out.println("   ");
    }

    @Override
    public void changeSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public String toString() {
        return "BasicList{" +
                "name='" + this.name + '\'' +
                ", myList=" + this.myList +
                '}';
    }
}
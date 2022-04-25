public class Song {
    private String name;
    private String duration;
    private String gender;
    private String artistInvit;
    private Album album;

    //regionConstructores
    public Song() {
    }

    public Song(String name, String duration, String gender, String artistInvit, Album album) {
        this.name = name;
        this.duration = duration;
        this.gender = gender;
        this.artistInvit = artistInvit;
        this.album = album;
    }

    public Song(String name, String duration, String gender, Album album) {
        this.name = name;
        this.duration = duration;
        this.gender = gender;
        this.album = album;
    }
    //endregion

    //regionGetASet
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getArtistInvit() {
        return artistInvit;
    }

    public void setArtistInvit(String artistInvit) {
        this.artistInvit = artistInvit;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    //endregion


    @Override
    public String toString() {
        return "\nSong{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", gender='" + gender + '\'' +
                ", artistInvit='" + artistInvit + '\'' +
                ", album=" + album +
                '}';
    }
}

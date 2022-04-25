public class Album {
    private String ageOfPublished;
    private String tittle;
    private Artist artist;

    public Album(String ageOfPublished, String tittle, Artist artist) {
        this.ageOfPublished = ageOfPublished;
        this.tittle = tittle;
        this.artist = artist;
    }

    public Album() {
    }

    public String getAgeOfPublished() {
        return ageOfPublished;
    }

    public void setAgeOfPublished(String ageOfPublished) {
        this.ageOfPublished = ageOfPublished;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "ageOfPublished='" + ageOfPublished + '\'' +
                ", tittle='" + tittle + '\'' +
                ", artist=" + artist +
                '}';
    }
}

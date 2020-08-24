
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    public boolean equals (Object compare) {
        if (this==compare) {
            return true;
        }
        if (!(compare instanceof Song)) {
            return false;
        }
        Song temp= (Song) compare;
        if (this.artist==temp.artist && this.name==temp.name && this.durationInSeconds ==temp.durationInSeconds) {
            return true;
        }
        return false;
    }    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}

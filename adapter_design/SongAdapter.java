package adapter_design;

public class SongAdapter extends Song{
    private Tune tune;

    public SongAdapter(Tune tune){
        this.tune = tune;
    }

    public String getTitle(){
        return String.valueOf(title[0]);
    }

    public String getAlbum(){
        return String.valueOf(title[1]);
    }

    public String getArtistFirstName(){
        return String.valueOf(name[0]);

    }

    public String getArtistLastName(){
        return String.valueOf(name[1]);

    }

    public String getGenre(){
        return String.valueOf(Genre.OTHER);
    }

}

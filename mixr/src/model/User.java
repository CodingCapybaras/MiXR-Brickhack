import java.util.ArrayList;

public class User {
    private ArrayList<Mix> mixes = new ArrayList<Mix>();
    private ArrayList<Mix> likedMixes= new ArrayList<Mix>();
    private String picture;
    private String name;

    public User(String name, String picture, ArrayList<Mix> mixes, ArrayList<Mix> likedMixes){
        this.name = name;
        this.picture = picture;
        this.mixes= mixes;
        this.likedMixes=likedMixes;
    }

    public void addMix(Mix mix){
        mixes.add(mix);
    }
    public void removeMix(Mix mix){
       mixes.remove(mix); //-------can I remove mix just by passing the object?
    }
    public String getName(){
        return name;
    }
    public String getPicture(){
        return picture;
    }
    public void likeMix(Mix mix){
        mix.incrementRating();
    }
    public void unlikeMix(Mix mix){
        mix.decrementRating();
    }
    public ArrayList<Mix> getListOfMixes(){
        return mixes;
    }
    public ArrayList<Mix> getListOfLikedMixes(){
        return likedMixes;
    } 

}

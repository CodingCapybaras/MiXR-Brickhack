import java.util.ArrayList;
//user class
public class User {
    //User attributes
    private ArrayList<Mix> mixes = new ArrayList<Mix>();
    private ArrayList<Mix> likedMixes= new ArrayList<Mix>();
    private String picture;
    private String name;
    
    //User constructor
    public User(String name, String picture, ArrayList<Mix> mixes, ArrayList<Mix> likedMixes){
        this.name = name;
        this.picture = picture;
        this.mixes= mixes;
        this.likedMixes=likedMixes;
    }
    //adding mix
    public void addMix(Mix mix){
        mixes.add(mix);
    }
    //removing mix
    public void removeMix(Mix mix){
       mixes.remove(mix); //-------can I remove mix just by passing the object?
    }

    //like and unlike mix
    public void likeMix(Mix mix){
        mix.incrementRating();
    }
    public void unlikeMix(Mix mix){
        mix.decrementRating();
    }

    //getter methods
    public String getName(){
        return name;
    }
    public String getPicture(){
        return picture;
    }
    public ArrayList<Mix> getListOfMixes(){
        return mixes;
    }
    public ArrayList<Mix> getListOfLikedMixes(){
        return likedMixes;
    } 
    
    

}

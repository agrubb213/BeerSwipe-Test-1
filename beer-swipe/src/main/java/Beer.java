import java.util.ArrayList;

/**
 * Created by Grubb on 5/15/2019.
 */
public class Beer {
    private int alphaPer;
    private int betaPer;
    private ArrayList<String>tasteTags;


    public Beer(int alphaPer, int betaPer, ArrayList<String> tasteTags) {
        this.alphaPer = alphaPer;
        this.betaPer = betaPer;
        this.tasteTags = tasteTags;
    }

    public int getAlphaPer() {
        return alphaPer;
    }

    public int getBetaPer() {
        return betaPer;
    }

    public ArrayList<String> getTasteTags() {
        return tasteTags;
    }

    public void setTasteTags(String tasteTags) {
        this.tasteTags.add(tasteTags);
    }
}

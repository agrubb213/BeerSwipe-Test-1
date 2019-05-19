import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Grubb on 5/15/2019.
 * Gets the beer json file and uploads beers into a list.
 * After it is organize the beer list uploaded into a new json file
 */
public class BeerList {
    static ArrayList<Beer> beerList = new ArrayList<>();
    public void beerUpload(){
        Gson gson = new Gson();

        try {
            FileWriter writer = new FileWriter("organized.json");
            gson.toJson(beerList,writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void beerDownload(){
        JSONParser parser = new JSONParser();

        JSONArray jsonObject = (JSONArray) parser.parse(new FileReader("organizedBeer.json"));

        for (Object o : jsonObject) {

            JSONObject person = (JSONObject) o;

            int alphaPer = (int) person.get("alphaPer");
            System.out.println(alphaPer);

            int betaPer = (int) person.get("betaPer");
            System.out.println(betaPer);


            JSONArray flavor = (JSONArray) person.get("cars");


            for (Object tag : flavor)
            {
                System.out.println(tag+"");
            }
            Beer newBeer = new Beer(alphaPer,betaPer,flavor);
            beerList.add(newBeer);
        }

    }

    public ArrayList<Beer> getBeerList() {
        return beerList;
    }
}

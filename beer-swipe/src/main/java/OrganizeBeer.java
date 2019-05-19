import java.util.ArrayList;

/**
 * Created by Grubb on 5/15/2019.
 * Takes a beer list from class BeerList and gives the beer flavor tags based on percent
 * and can list beers in order of tags
 */
public class OrganizeBeer {
    private BeerList beerList = new BeerList();
    private String flavorType;
    private ArrayList<Beer> organizeBeerList = new ArrayList<>();

    public void setTags(){
        for(Beer beer: beerList.getBeerList()){
            if(beer.getAlphaPer() == 10){
                flavorType = "apple";
                beer.setTasteTags(flavorType);
            }else{
                flavorType = "pineapple";
                beer.setTasteTags(flavorType);
            }
        }
    }
    //takes beers and list beers that have certain tags
    public void organizeBeer(String userTag){
        ArrayList<String> taste;

        for(Beer beer: beerList.getBeerList()){
            taste = beer.getTasteTags();
            for(String tasteTag : taste){
                if(tasteTag.equals("userTag")){
                    organizeBeerList.add(beer);
                }
            }

        }
    }
    
    /*
    OrganizeBeer organize = new OrganizeBeer;
    for(string userTag : tags){
        organize.organizeBeer(userTag);
    }
     */
}

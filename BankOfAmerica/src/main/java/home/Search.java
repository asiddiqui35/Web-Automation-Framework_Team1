package home;

import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI {
    public void searchInSearchBox(){
        List<String> list = new ArrayList<String>();
        list.add("Location");
        list.add("e-banking");
        list.add("monthly fees");
        for(String topics: list) {
            typeByCssNEnter("#nav-search-query", topics);
            driver.navigate().refresh();
        }
    }
}

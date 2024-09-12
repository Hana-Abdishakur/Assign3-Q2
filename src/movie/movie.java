package movie;

import java.util.ArrayList;
import java.util.List;

public class movie {
    private List<movieItem> items;

    public  movie(){
        items = new ArrayList<>();
    }
    public void addmovieItem(movieItem item){
        items.add(item);
    }
    public void printmovieDetails(){
        for (movieItem item : items) {
            item.printDetails();
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class MovieOperation {
    static ArrayList<MovieDTO> al = new ArrayList<>();
    public void pre(){
        al.add(new MovieDTO("기생충","봉준호",132,5.5f,"1"));
        al.add(new MovieDTO("괴물","송강호",66,9.5f,"2"));
    }

    public void enter(String title, String major, int runTime, float rating, String genre) {
        MovieDTO dto = new MovieDTO(title, major, runTime, rating, genre);
        al.add(dto);
    }

    public void print() {
        Collections.sort(al,(s1, s2) -> (int) ((s2.getRating() * 100) - (s1.getRating() * 100)));

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }

    public void search(String genreNumber) {
        for (int i =0; i < al.size();i++ ){
            MovieDTO dto = al.get(i);
            String genre = dto.getGenre();
            if(genre.equals(genreNumber)){
                System.out.println(dto);
            }
        }
    }
}

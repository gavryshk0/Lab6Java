import java.util.ArrayList;
import java.util.List;

public class Film {
    private String title;
    private int year;
    private FilmInfo info;

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
        this.info = new FilmInfo();
    }

    public void displayInfo() {
        System.out.println("Назва фiльму: " + title);
        System.out.println("Рiк виходу: " + year);
        System.out.println("Тривалiсть: " + info.getDuration() + " хвилини");
        System.out.println("Жанр: " + info.getGenre());
        System.out.print("Режисер(и): ");
        for (String director : info.getDirectors()) {
            System.out.print(director + ", ");
        }
        System.out.println();
    }

    public class FilmInfo {
        private int duration;
        private String genre;
        private List<String> directors;

        public FilmInfo() {
            directors = new ArrayList<>();
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public List<String> getDirectors() {
            return directors;
        }
    }

    public static void main(String[] args) {
        Film myFilm = new Film("Blade Runner 2049", 2017);
        myFilm.info.setDuration(164);
        myFilm.info.setGenre("Трилер");
        myFilm.info.getDirectors().add("Деннi Вiльньов");
        myFilm.info.getDirectors().add("Гемптон Фенчер");

        myFilm.displayInfo();
    }
}

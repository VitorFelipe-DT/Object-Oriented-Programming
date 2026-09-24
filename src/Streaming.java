import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;

public class Streaming {
    static void main(String [] args) {
        Film myFilm = new Film();
        myFilm.setName("The GodFather");
        myFilm.setReleaseYear(1972);
        myFilm.setDurationInMinutes(175);

        //Crie uma ficha técnica utilizando Orientacao ao Objeto
        myFilm.technicalSpecifications();

        myFilm.evaluates(8);
        myFilm.evaluates(5);
        myFilm.evaluates(10);
        //System.out.println(myFilm.getTotalNumberOfReview());
        System.out.println(myFilm.calculateTheAverage());

        Series mySerie = new Series();
        mySerie.setName("lost");
        mySerie.setReleaseYear(2004);
        mySerie.technicalSpecifications();
        mySerie.setSeasons(6);
        mySerie.setEpisodesPerSeason(25);
        mySerie.setMinutesPerEpisode(50);
        System.out.println("Time to binge-watch the series: " + mySerie.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myFilm);
        calculator.includes(mySerie);
        System.out.println(calculator.getTotalTime());

    }


}

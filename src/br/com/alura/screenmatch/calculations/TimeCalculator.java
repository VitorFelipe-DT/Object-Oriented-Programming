package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void includes(Film f) {
//        totalTime += f.getDurationInMinutes();
//
//    }
//
//    public void includes(Series s) {
//        totalTime += s.getDurationInMinutes();
//    }

    public void includes(Title title){
        this.totalTime += title.getDurationInMinutes();
    }
}
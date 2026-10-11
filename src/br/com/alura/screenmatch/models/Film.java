package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Stars;

//Utilizamos o extends para dizer que Film tem tudo que o Title tem!
public class Film extends Title implements Stars {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) calculateTheAverage() / 2;
    }
}

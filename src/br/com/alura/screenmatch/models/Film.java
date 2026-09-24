package br.com.alura.screenmatch.models;
//Utilizamos o extends para dizer que Film tem tudo que o Title tem!
public class Film extends Title {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

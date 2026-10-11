package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Stars;

public class Episodes implements Stars {
    private int numberOfEpisodes;
    private String name;
    private Series series;
    private int totalViews;


    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getRating() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}


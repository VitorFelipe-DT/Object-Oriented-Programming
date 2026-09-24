package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean incluedInThePlan;
    private double sumOfRatings;
    private int totalNumberOfReview;
    private int durationInMinutes;

    private int getTotalNumberOfReview(){
        return totalNumberOfReview;
    }
    //Aqui o Setter que fez o comando
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncluedInThePlan(boolean incluedInThePlan) {
        this.incluedInThePlan = incluedInThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    //Criando um metodo:

    public void technicalSpecifications(){
        System.out.println("Movie Title: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    public void evaluates(double score){
        sumOfRatings += score;
        totalNumberOfReview++;
    }

    public double calculateTheAverage(){
        return sumOfRatings / totalNumberOfReview;
    }
}

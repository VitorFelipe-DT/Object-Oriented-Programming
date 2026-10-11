package br.com.alura.screenmatch.calculations;

public class RecommendationFilter {

    public void filter(Stars classifiable){
        if (classifiable.getRating() >= 4) {
            System.out.println("It's among the current favorites.");
        } else if (classifiable.getRating() >= 2) {
            System.out.println("Very well rated at the moment. ");
        }else {
            System.out.println("Add it to your watch list. ");
        }
    }
}

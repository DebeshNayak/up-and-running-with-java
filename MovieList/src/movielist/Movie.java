/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist;

/**
 *
 * @author debes
 */
public class Movie {
    private String movieTitle;
    private String rating;
    private int year;
    private int runTime;
    public Movie(String title, String rating, int year, int runTime){
        this.movieTitle = title;
        this.rating = rating;
        this.year = year;
        this.runTime = runTime;
    }
    public String getMovieTitle(){
        return movieTitle;
    }
    public void setMovieTitle(String value){
        movieTitle = value;
    }
    public String getRating(){
        return rating;
    }
    public void setRating(String value){
        rating = value;
    }
    public int getyear(){
        return year;
    }
    public void setYear(int value){
        year = value;
    }
    public int getRunTime(){
        return runTime;
    }
    public void setRunTime(int value){
        runTime = value;
    }
    public String toString(){
        return "Movie title: " + movieTitle +
                "\n Rating: " + rating + 
                "\n Year: " + year +
                "\n Total runtime: " + runTime;
    }
}

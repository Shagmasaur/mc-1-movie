package com.jap;

import java.util.*;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating()
    {

        Map<Movie,Integer> map = new HashMap();
        //create five movie object by calling Movie class parameterized constructor
        Movie movie1 = new Movie(100,"Inception","Action","08/07/2010");
        Movie movie2 = new Movie(101,"The Batman","SuperHero","01/03/2022");
        Movie movie3 = new Movie(102,"Interstellar","Sci-Fi","26/10/2014");
        Movie movie4 = new Movie(103,"Tenet","Spy","26/08/2020");
        Movie movie5 = new Movie(104,"The Hangover","comedy","30/05/2009");
        //create HashMap object and add all the Movie object inside it
        map.put(movie1,2);
        map.put(movie2,5);
        map.put(movie3,4);
        map.put(movie4,4);
        map.put(movie5,3);

        //Key will be movie object and value will be rating ranging from 1 to 5

        //return the HashMap object
        //Map map = new HashMap();

        return map;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map,int rating){
        //Create a TreeSet object
        Set<String> set = new TreeSet<>();
        //Use entrySet() method to iterate through the map object
        for(Map.Entry<Movie,Integer> entry : map.entrySet()){
            if(entry.getValue() == rating){
                set.add(entry.getKey().getMovieName());
            }
        }
        //retrieve all the movies name having rating as 4

        //Store the movie name in TreeSet object

        //return the TreeSet object

      return set;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        //Create a ArrayList object of type String
        List<String> list = new ArrayList();

        //get the first value from the map and store it in the variable max

        // Use entrySet().iterator().next() method to retrieve the first value of Map object


        //get the name of the movie with the highest rating and add it in the List created
        for(Map.Entry<Movie,Integer> entry : map.entrySet()){
            if(entry.getValue() == 5){
                list.add(entry.getKey().getMovieName());
            }
        }
        //return the List object
        return list;
    }
    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map){
        //Create a Map object
        Map<String,String> map1 = new HashMap();
        //use entrySet to iterate through the Map object

        //get all the movies name and their released date for the movie of genre "comedy"

        //store movie name with release date in the above created Map object and return the Map object
        for(Map.Entry<Movie,Integer> entry : map.entrySet()){
            if(entry.getKey().getGenre().equalsIgnoreCase("comedy")){
                map1.put(entry.getKey().getMovieName(),entry.getKey().getReleaseDate());
            }
        }
        return map1;
    }

    public static void main(String[] args)
    {
        MovieService movieService = new MovieService();
        Map <Movie,Integer> map = movieService.getMovieWithRating();
        System.out.println(map);
        Set set = movieService.getMovieNameWithRating4(map,4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating((Map<Movie, Integer>) map);
        System.out.println("--------------");
        System.out.println("Highest Rating " +list);
    }
}

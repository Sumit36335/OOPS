import java.io.*;
import java.util.*;

class Movie
{
    String name;
    int rating;
    long profit,moneyCollection;
    String leadActor,leadActress;
    
    public Movie(String name, int rating , long moneyCollection, long profit , String leadActor,String leadActress){
        this.name= name;
        this. rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor= leadActor;
        this.leadActress= leadActress;
    }
    public void displayMovie()
    {
        System.out.println(this.rating);
        System.out.println(this.moneyCollection);
        System.out.println(this.profit);
        System.out.println(this.leadActor);
        System.out.println(this.leadActress);
    }
}
public class Solution {

     
    public static void main(String[] args) {
         
        Movie batman1= new Movie("Batman 1",8,200000,5000,"Rachel Gupta & Nikhil Chinapa","Disha");
        Movie batman2= new Movie("Batman 2",9,500000,8000,"Rannvijay Singha & Prince Narula","Neha Dhupia");
        Movie batman3= new Movie("Batman 3",10,700000,6000,"Rachel Gupta & Prince Narula","Neha Dhupia");
        batman1.displayMovie();
        batman2.displayMovie();
        batman3.displayMovie();
        
    }
}

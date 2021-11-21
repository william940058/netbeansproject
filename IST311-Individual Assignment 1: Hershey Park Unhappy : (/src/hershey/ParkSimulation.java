/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hershey;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author macbookpro
 */
public class ParkSimulation {
    private ArrayList<Customer>customers = new ArrayList();
    private ArrayList<Food>foods = new ArrayList();
    private ArrayList<Ride>rides = new ArrayList();
    private ArrayList<Restroom>restrooms = new ArrayList();
    private ArrayList<Interaction> interactions = new ArrayList();
    ArrayList<String>results = new ArrayList();
    
    public void addCustomer(){
        
        for(int i =0; i<50; i++){
            Customer cus = new Customer();
            cus.setCustomerId(i+1);
            String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder ss = new StringBuilder();
            StringBuilder sss = new StringBuilder();
            Random rnd = new Random();
            while (ss.length() < 5) { 
                int index = (int) (rnd.nextFloat() * name.length());
                ss.append(name.charAt(index));
            }
            while (sss.length() < 5) { 
                int index = (int) (rnd.nextFloat() * name.length());
                sss.append(name.charAt(index));
            }
            cus.setFirstName(ss.toString());
            cus.setLastName(sss.toString());
            customers.add(cus);
        } 
    }
    public void addFood(){
        Food f1 = new Food(1, "Noodles", 5,"Food");
        Food f2 = new Food(2, "Burger", 20, "Food"); 
        foods.add(f1);
        foods.add(f2);
                
    }
            
    
    public void addRide(){
        Ride r1 = new Ride(284, "Roller", 25, "Ride");
        Ride r2 = new Ride(310, "HAUNT", 62,"Ride");
        rides.add(r1);
        rides.add(r2);
         
        }
            
        
    public void addRestroom(){
        Restroom rr1 = new Restroom(777,1, "Restroom");
        restrooms.add(rr1);
                  
            
    }
    
    public ArrayList recordCompletedHershey(){
        String[] dates = {"11/5/2019", "23/6/2017", "15/3/2018", "30/6/2018", "12/3/2017"};
        
        for(int i=0;i<1000;i++){
            Interaction act = new Interaction();
            int cu =(int)(Math.random()*50);
            act.setCustomers(customers.get(cu));
            
            int nu =(int)(Math.random()*2);
            act.setFoods(foods.get(nu));
            
            int ru =(int)(Math.random()*2);
            act.setRides(rides.get(ru));   
            
            
            act.setRestrooms(restrooms.get(0));  
            
            int d = (int)(Math.random()*5);
            act.setDate(dates[d]);
            
            int dd =(int)(Math.random()*50 + 1);
            act.setDuration(dd);
            interactions.add(act);
            
        }
        return interactions;
            
    }
    public void swap(ArrayList<Interaction> ar, int a, int b)
  {
      Interaction tempswap = ar.get(a);
      ar.set(a, ar.get(b));
      ar.set(b, tempswap);
  }

  public int getMin(ArrayList<Interaction> ar, int startPos)
  {
      Interaction min = ar.get(startPos);
      int minPos = startPos;
      for (int i= startPos+1 ; i < 1000; i++){
        if (ar.get(i).getDuration() < min.getDuration())
        {
          min = ar.get(i);
          minPos = i;
        }
    }

    return minPos;
  }

    public void performSelectionSort(ArrayList<Interaction> ar)
  {
    for (int i = 0; i < 1000; i++)
      {
        int min = getMin(ar, i);
        if (ar.get(min).getDuration() < ar.get(i).getDuration())
        {
          swap(ar, min, i);
        }
      }
 }
    public String Time(Customer cc){
        int id = cc.getCustomerId();
        int rideT = 0;
        int foodT = 0;
        int restT = 0;
        for(int i=0; i < interactions.size(); i++){
            if(interactions.get(i).getCustomers().getCustomerId() == id){
                Interaction temp = interactions.get(i);
                if(temp.getRides()!= null && temp.getFoods() == null && temp.getRestrooms() == null){
                    rideT = rideT +temp.getDuration();
                }
                else if(temp.getRides() == null && temp.getFoods() != null && temp.getRestrooms() == null){
                    foodT = foodT + temp.getDuration();
                }
                else if(temp.getRides() == null && temp.getFoods() == null && temp.getRestrooms() != null){
                    restT = restT + temp.getDuration();
                }
            }
        }
        return "FoodTime: " + foodT+ "RideTime: " + rideT + "RestTime: " + restT;
    }
    public void Result(){
        for(int i = 0; i< customers.size(); i++){
            int id = i + 1;
            Time(customers.get(i));
            results.add(i,"CustomerID: " + id + Time(customers.get(i)));
        }
    }
    
    public void SaveData(){
        try{
            File file = new File("Record.csv");
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; i< customers.size(); i++){
                Customer temp = customers.get(i);
                pw.println(temp.getCustomerId()+ ", " + temp.getLastName() + ", " + temp.getFirstName());
            }
            pw.println();
            for(int i = 0; i< rides.size(); i++){
                Ride temp = rides.get(i);
                pw.println(temp.getRideId()+ ", " + temp.getRideName()+ ", " + temp.getRideTime());
            }
            pw.println();
            for(int i = 0; i< foods.size(); i++){
                Food temp = foods.get(i);
                pw.println(temp.getFoodId()+ ", " + temp.getFoodName() + ", " + temp.getFoodPrice());
            }
            pw.println();
            for(int i = 0; i< restrooms.size(); i++){
                Restroom temp = restrooms.get(i);
                pw.println(temp.getRestRoomId()+ ", " + temp.getRestRoomPrice());
            }
            pw.println();
            for(int i = 0; i< interactions.size(); i++){
                Interaction temp = interactions.get(i);
                pw.println(temp.getCustomers()+ ", " + temp.getFoods() + ", " + temp.getRides() + ", " + temp.getRestrooms() + ", " + temp.getDuration());
            }
            pw.close();
        }
        catch(IOException e){
            System.out.println("Error!");
        }
  
    }
}


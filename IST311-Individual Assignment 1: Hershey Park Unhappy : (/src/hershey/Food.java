/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hershey;

/**
 *
 * @author macbookpro
 */
public class Food extends Activity{
    private int foodId;
    private String foodName;
    private int foodPrice;

    public Food(int foodId, String foodName, int foodPrice, String ActivityType) {
        super(ActivityType);
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public Food() {
       
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }
    
    
    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    @Override
    public String toString() {
        return super.toString() + " FoodId=" + foodId + ", FoodName=" + foodName + ", FoodPrice=" + foodPrice;
    }

    
}


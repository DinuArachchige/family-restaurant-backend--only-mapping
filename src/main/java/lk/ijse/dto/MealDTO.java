package lk.ijse.dto;

public class MealDTO {

    private int mealCode;
    private String mealName;
    private String description;
    private double price;
    private String category;
    private String imageURL;

    public MealDTO(){

    }

    public MealDTO(int mealCode, String mealName, String description, double price, String category, String imageURL) {
        this.mealCode = mealCode;
        this.mealName = mealName;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageURL = imageURL;
    }

    public int getMealCode() {
        return mealCode;
    }

    public void setMealCode(int mealCode) {
        this.mealCode = mealCode;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}

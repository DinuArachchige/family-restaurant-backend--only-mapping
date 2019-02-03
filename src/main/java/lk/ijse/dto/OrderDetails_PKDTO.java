package lk.ijse.dto;

public class OrderDetails_PKDTO {

    private int mealCode;
    private int o_ID;

    public OrderDetails_PKDTO(){

    }

    public OrderDetails_PKDTO(int mealCode, int o_ID) {
        this.mealCode = mealCode;
        this.o_ID = o_ID;
    }

    public int getMealCode() {
        return mealCode;
    }

    public void setMealCode(int mealCode) {
        this.mealCode = mealCode;
    }

    public int getO_ID() {
        return o_ID;
    }

    public void setO_ID(int o_ID) {
        this.o_ID = o_ID;
    }
}

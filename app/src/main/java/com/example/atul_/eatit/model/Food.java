package com.example.atul_.eatit.model;

/**
 * Created by Karan Patel on 17-01-2018.
 */

public class Food {
    private String Name,Image, Description,Price,Discount,MenuId,Ing,IngText;

    public Food(){

    }




    public Food(String name, String image, String description, String price, String discount, String menuId, String ing, String ingText) {
        Name = name;
        Image = image;
        Description = description;
        Price = price;
        Discount = discount;
        MenuId = menuId;
        Ing=ing;
        IngText=ingText;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }

    public String getIng() {
        return Ing;
    }

    public void setIng(String ing) {
        Ing = ing;
    }

    public String getIngText() {
        return IngText;
    }

    public void setIngText(String ingText) {
        IngText = ingText;
    }
}




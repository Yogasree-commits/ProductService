package com.example.Product.DTO;

public class FakeStoreDTO {


    //    {
//        "id": 1,
//            "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
//            "price": 109.95,
//            "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
//            "category": "men's clothing",
//            "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
//            "rating": {
//        "rate": 3.9,
//                "count": 120
//        }
//    }
    long id;
    String title;
    String description;
    String category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

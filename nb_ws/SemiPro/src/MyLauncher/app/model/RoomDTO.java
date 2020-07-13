/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package MyLauncher.app.model;

import java.sql.Timestamp;

/**
 *
 * @author jseun
 */
public class RoomDTO {
    private int no;
    private String name;
    private String roomtype;
    private int price;
    private String place;
    private String description;
    private int discount;

    public RoomDTO() {
    }

    public RoomDTO(int no, String name, String roomtype, int price, String place, String description) {
        this.no = no;
        this.name = name;
        this.roomtype = roomtype;
        this.price = price;
        this.place = place;
        this.description = description;
    }

    RoomDTO(String name, String roomtype, int price, String place, String description, int discount) {
        this.name = name;
        this.roomtype = roomtype;
        this.price = price;
        this.place = place;
        this.description = description;
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "RoomDTO{" + "no=" + no + ", name=" + name + ", roomtype=" + roomtype + ", price=" + price + ", place=" + place + ", description=" + description + ", discount=" + discount + '}';
    }

    
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
}

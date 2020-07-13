/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package MyLauncher.app.model;

/**
 *
 * @author jseun
 */
public class ReservedListDTO {
    private String name;
    private String id;
    private String geustName;
    private String phone;
    private String roomType;
    private int price;
    private int discount;
    private int payment;
    private String payBy;
    private String checkIn;
    private String checkOut;
    private String place;
    private String description;

    public ReservedListDTO() {
    }

    public ReservedListDTO(String name, String id, String geustName, String phone, String roomType, int price, int discount, int payment, String payBy, String checkIn, String checkOut, String place, String description) {
        this.name = name;
        this.id = id;
        this.geustName = geustName;
        this.phone = phone;
        this.roomType = roomType;
        this.price = price;
        this.discount = discount;
        this.payment = payment;
        this.payBy = payBy;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.place = place;
        this.description = description;
    }

    ReservedListDTO(String name, String roomType, int price, String place, int discount, String checkIn, String checkOut) {
        this.name = name;
        this.roomType = roomType;
        this.price = price;
        this.place = place;
        this.discount = discount;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "ReservedListDTO{" + "name=" + name + ", id=" + id + ", geustName=" + geustName + ", phone=" + phone + ", roomType=" + roomType + ", price=" + price + ", discount=" + discount + ", payment=" + payment + ", payBy=" + payBy + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", place=" + place + ", description=" + description + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGeustName() {
        return geustName;
    }

    public void setGeustName(String geustName) {
        this.geustName = geustName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getPayBy() {
        return payBy;
    }

    public void setPayBy(String payBy) {
        this.payBy = payBy;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
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

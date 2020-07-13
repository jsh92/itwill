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
public class MemberDTO {
    private String id;
    private String name;
    private String pwd;
    private String email;
    private String phone;
    private String description;
    private Timestamp regDate;

    public MemberDTO() {
    }

    @Override
    public String toString() {
        return "MemberDTO{" + "id=" + id + ", name=" + name + ", pwd=" + pwd + ", email=" + email + ", phone=" + phone + ", description=" + description + ", regDate=" + regDate + '}';
    }

    public MemberDTO(String id, String name, String pwd, String email, String phone, String description, Timestamp regDate) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.regDate = regDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }
    
    
    
}

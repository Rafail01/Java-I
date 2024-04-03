/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it21965;

/**
 *
 * @author Rafail Ntymenos
 */
public class Profile {
    private String AFM;
    private String address;
    private String ADT;//Αριθμός ταυτότητας
    private String category;
    private String email;
    private int discount;
    
    public Profile(){
        AFM="";
        address="";
        ADT="";
        category="";
        email="";
        discount=0;
    }
    //contractor
    public Profile(String AFM,String address,String ADT,String category,String email,int discount){
        this.ADT=ADT;
        this.AFM=AFM;
        this.address=address;
        this.category=category;
        this.email=email;
        this.discount=discount;
    }
    //setters of AFM
    public void setAFM(String newAFM){
        AFM=newAFM;
    }
    //setters of address
    public void setAddress(String newAddress){
        address=newAddress;
    }
    //setters of ADT
    public void setADT(String newADT){
        ADT=newADT;
    }
    //setters of category
    public void setCategory(String newCategory){
        category=newCategory;
    }
    //setters of email
    public void setEmail(String newEmail){
        email=newEmail;
    }
    //setters of discount
    public void setDiscount(int newDiscount){
        discount=newDiscount;
    }
    //getters of AFM
    public String getAFM(){
        return AFM;
    }
    //getters of address
    public String getAddress(){
        return address;
    }
    //getters of ADT
    public String getADT(){
        return ADT;
    }
    //geetters of category
    public String getCategory(){
        return category;
    }
    //getters of email
    public String getEmail(){
        return email;
    }
    //getters of discount
    public int getDiscount(){
        return discount;
    }
}

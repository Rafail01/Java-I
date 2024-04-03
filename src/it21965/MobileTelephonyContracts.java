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
public class MobileTelephonyContracts {
    private int code;
    private String AFM;
    private int GB;
    private int SMS;
    private long numberTelephone;
    private int minutesMobile;
    
    public MobileTelephonyContracts(){
        code=0;
        AFM="";
        GB=0;
        SMS=0;
        numberTelephone=0;
        minutesMobile=0;
    }
    
    public MobileTelephonyContracts(int code,String AFM,int GB,int SMS,long numberTelephone , int minutesMobile){
        this.code=code;
        this.AFM=AFM;
        this.GB=GB;
        this.SMS=SMS;
        this.numberTelephone=numberTelephone;
        this.minutesMobile=minutesMobile;
    }
    //setters of code
    public void setCode(int newcode){
        code=newcode;
    }
    //setters of afm
    public void setAFM(String newAFM){
        AFM=newAFM;
    }
    //setters of GB
    public void setGB(int newGB){
        GB=newGB;
    }
    //setters of SMS 
    public void setSMS(int newSMS){
        SMS=newSMS;
    }
    //setters of numberTelephone
    public void setNumberTelephone(long newNumberTelephone){
        numberTelephone=newNumberTelephone;
    }
    //setters of minutesMobile
    public void setMinutesMobile(int newMinutesMobile){
        minutesMobile=newMinutesMobile;
    }
    //getters of code
    public int getCode(){
        return code;
    }
    //getters of afm
    public String getAFM(){
        return AFM;
    }
    //getters of GB
    public int getGB(){
        return GB;
    }
    //getters of SMS
    public int getSMS(){
        return SMS;
    }
    //getters of numberTelephone
    public long getNumberTelephone(){
        return numberTelephone;
    }
     //getters of minutesMobile
    public int getMinutesMobile(){
        return minutesMobile;
    }
}

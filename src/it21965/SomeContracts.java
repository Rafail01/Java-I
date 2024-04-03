/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it21965;

import java.util.ArrayList;

/**
 *
 * @author Rafail Ntymenos
 */
public class SomeContracts {
    public int some(ArrayList<GeneralContracts> general,ArrayList<Profile> profile,int code, ArrayList< MobileTelephonyContracts> mobileContracts, ArrayList<LandlineContracts> lineContracts){
        someFirstCont(general, profile, code, mobileContracts, lineContracts);
        code++;
        secondCont(general, profile, code, mobileContracts, lineContracts);
        code++;
        return code;
    }
        
    private void someFirstCont(ArrayList<GeneralContracts> general,ArrayList<Profile> profile,int code, ArrayList< MobileTelephonyContracts> mobileContracts, ArrayList<LandlineContracts> lineContracts){
        //Profile
        
        Profile c1 = new Profile();
        
        //AFM
        c1.setAFM("kala");
        //Addres
        c1.setAddress("aaa");
        //discount
        c1.setDiscount(0);
        //ADT
        c1.setADT("ok");
        //Category
        c1.setCategory("Citizen");
        profile.add(c1);
        
        //General
        
        GeneralContracts c2 = new GeneralContracts();
        
        // AFM
        c2.setAFM("kala");
        // code
        c2.setCode(code);
        //startOfContracts
        c2.setStartOfContracts("a");
        // length
        c2.setLength(12);
        
        //typeConstracts
        c2.setTypeConstracts("electronic");
        //payment
        c2.setPayment("credit card");
        
        //Mobile
        
        MobileTelephonyContracts c3 = new MobileTelephonyContracts();

        //code
        c3.setCode(code);
        //AFM
        c3.setAFM("kala");
        //GB
        c3.setGB(15);
        //SMS
        c3.setSMS(145);
        //numberTelephone
        c3.setNumberTelephone(612345678);
        //minutesMobile
        c3.setMinutesMobile(1453);
        
        //land
        
        LandlineContracts c4 = new LandlineContracts();
        
        //code
        c4.setCode(code);
        //AFM
        c4.setAFM("kala");
        //speed
        c4.setSpeed("VDSl");
        //numberTelephone
        c4.setNumberTelephone(2123456789);
        //minutesLandline
        c4.setMinutesLandline(254);
        
        //cost
        NewContracts k = new NewContracts();
        int cost = 0; 
        cost += k.costLandLine(c4);
        cost += k.costMobile(c3);
        
        c2.setCost(cost);
        
        general.add(c2);
        mobileContracts.add(c3);
        lineContracts.add(c4);
    }
    
    private void secondCont(ArrayList<GeneralContracts> general,ArrayList<Profile> profile,int code, ArrayList< MobileTelephonyContracts> mobileContracts, ArrayList<LandlineContracts> lineContracts){
        //Profile
        
        Profile c1 = new Profile();
        
        //AFM
        c1.setAFM("ok");
        //Addres
        c1.setAddress("ka");
        //discount
        c1.setDiscount(0);
        //ADT
        c1.setADT("aka123");
        //Category
        c1.setCategory("Citizen");
        profile.add(c1);
        
        //General
        
        GeneralContracts c2 = new GeneralContracts();
        
        // AFM
        c2.setAFM("ok");
        // code
        c2.setCode(code);
        //startOfContracts
        c2.setStartOfContracts("a");
        // length
        c2.setLength(12);
        
        //typeConstracts
        c2.setTypeConstracts("electronic");
        //payment
        c2.setPayment("credit card");
        
        //Mobile
        
        MobileTelephonyContracts c3 = new MobileTelephonyContracts();

        //code
        c3.setCode(code);
        //AFM
        c3.setAFM("ok");
        //GB
        c3.setGB(15);
        //SMS
        c3.setSMS(145);
        //numberTelephone
        c3.setNumberTelephone(612345678);
        //minutesMobile
        c3.setMinutesMobile(1453);
        
        //land
        
        LandlineContracts c4 = new LandlineContracts();
        
        //code
        c4.setCode(code);
        //AFM
        c4.setAFM("ok");
        //speed
        c4.setSpeed("VDSl");
        //numberTelephone
        c4.setNumberTelephone(2123456789);
        //minutesLandline
        c4.setMinutesLandline(254);
        
        //cost
        NewContracts k = new NewContracts();
        int cost = 0; 
        cost += k.costLandLine(c4);
        cost += k.costMobile(c3);
        
        c2.setCost(cost);
        
        general.add(c2);
        mobileContracts.add(c3);
        lineContracts.add(c4);
    }
}
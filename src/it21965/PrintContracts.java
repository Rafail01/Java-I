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
public class PrintContracts {
    public void printGeneral(ArrayList<GeneralContracts> general){
        for(GeneralContracts pr2:general){
            System.out.println("general:\t"+"afm:"+pr2.getAFM()+"\tcode:"+pr2.getCode()+"\tstartOfContracts:"+pr2.getStartOfContracts()+"\tlength:"+pr2.getLength()+"\tcost:"+pr2.getCost()+"\ttypeConstracts:"+pr2.getTypeConstracts());
        }
    }
    public void printMobile( ArrayList< MobileTelephonyContracts> mobileContracts){
        for(MobileTelephonyContracts pr3:mobileContracts){
           System.out.println("mobile:\t"+"\tcode:"+pr3.getCode()+"\tAFM:"+pr3.getAFM()+"\tGb:"+pr3.getGB()+"\tnumber:"+pr3.getNumberTelephone()+"\tminutes:"+pr3.getMinutesMobile()+"\tsms:"+pr3.getSMS());
        }
    }
    public void printLand(ArrayList<LandlineContracts> lineContracts){
        for(LandlineContracts pr4:lineContracts){
           if("".equals(pr4.getSpeed())){
               System.out.println("line:\t"+"\tcode:"+pr4.getCode()+"\tAFM:"+pr4.getAFM()+"\tnumber:"+pr4.getNumberTelephone()+"\tninutes:"+pr4.getMinutesLandline());
           }else{
               System.out.println("line:\t"+"\tcode:"+pr4.getCode()+"\tAFM:"+pr4.getAFM()+"\tspeed:"+pr4.getSpeed()+"\tnumber:"+pr4.getNumberTelephone()+"\tninutes:"+pr4.getMinutesLandline());
           }
        }
    }
    public void printProfile(ArrayList<Profile> profile){
        for(Profile pr1:profile){
            System.out.println("profile:\t"+"Discount:"+pr1.getDiscount()+"\tafm:\t"+pr1.getAFM()+"\tadt:\t"+pr1.getADT()+"\taddress:\t"+pr1.getAddress()+"\tcategory:\t"+pr1.getCategory()+"\temail:\t"+pr1.getEmail());
        }
    }
}

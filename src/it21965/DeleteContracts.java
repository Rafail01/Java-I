/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it21965;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rafail Ntymenos
 */
public class DeleteContracts {
    Scanner input = new Scanner(System.in);
    public void deleteContracts(ArrayList<GeneralContracts> general,ArrayList<Profile> profile, ArrayList< MobileTelephonyContracts> mobileContracts, ArrayList<LandlineContracts> lineContracts){
        
        System.out.println("Give me AFM for delete");
        String afm=input.nextLine();
        if(checkAfmMobile(mobileContracts,afm)){
            deleteMobile(mobileContracts,afm,general);
            
        }
                          
        if(checkAfmLand(lineContracts,afm)){
            deleteLand(lineContracts,afm,general);
        }  
        //DeleteProfile(profile, afm);
                      
    }
    
    public void deleteMobile(ArrayList<MobileTelephonyContracts> mobileContracts, String afm,ArrayList<GeneralContracts> general){
        Iterator<MobileTelephonyContracts> itr = mobileContracts.iterator();
        PrintContracts print = new PrintContracts();
        print.printGeneral(general);
        int count = 0;
        
        for(MobileTelephonyContracts pr3:mobileContracts){
           if(pr3.getAFM().equals(afm)){
               System.out.println("count:\t"+count+"\tmobile:\t"+"\tAFM:"+pr3.getAFM()+"\tGb:"+pr3.getGB()+"\tnumber:"+pr3.getNumberTelephone()+"\tminutes:"+pr3.getMinutesMobile()+"\tsms:"+pr3.getSMS());
               count++;
           }
           
        }
                        
        int ch;
        
        do{
            System.out.println("Choose one count");
            ch = input.nextInt();
            if(ch < 0 || ch > count){
                System.out.println("Wrong input");
            }
        }while(ch < 0 || ch >= count);
        int k = 0,code1 = -1;
        while(itr.hasNext()){
            MobileTelephonyContracts mob = itr.next();
            if(mob.getAFM().equals(afm)){
                if(ch == k){
                    itr.remove();
                    code1 = mob.getCode();
                }
                
                k++;
            }            
        }
        if(checkAfmGeneral(general, afm)){
                deleteGeneral(general,afm,code1);
        }
        
    }
    
    public void deleteLand(ArrayList<LandlineContracts> lineContracts,String afm, ArrayList<GeneralContracts> general){
        Iterator<LandlineContracts> itr = lineContracts.iterator();
        PrintContracts print = new PrintContracts();
        print.printGeneral(general);
        
        int count = 0;
        for(LandlineContracts pr4:lineContracts){
           if(pr4.getAFM().equals(afm)){
               if("".equals(pr4.getSpeed())){
                   System.out.println("count:\t"+count+"line:\t"+"\tcode:"+pr4.getCode()+"\tAFM:"+pr4.getAFM()+"\tnumber:"+pr4.getNumberTelephone()+"\tninutes:"+pr4.getMinutesLandline());
               }else{
                   System.out.println("count:\t"+count+"line:\t"+"\tcode:"+pr4.getCode()+"\tAFM:"+pr4.getAFM()+"\tspeed:"+pr4.getSpeed()+"\tnumber:"+pr4.getNumberTelephone()+"\tninutes:"+pr4.getMinutesLandline());
               }
               count++;
           } 
        }
        int ch;
        int k = 0,code1 = -1;
        do{
            System.out.println("Choose one count");
            ch = input.nextInt();
            if(ch < 0 || ch > count){
                System.out.println("Wrong input");
            }
        }while(ch < 0 || ch >= count);
        while(itr.hasNext()){
            LandlineContracts land = itr.next();
            if(land.getAFM().equals(afm)){
                if(ch ==k){
                    itr.remove();
                    code1 = land.getCode();
                }
                k++;
            }            
        }
        if(checkAfmGeneral(general, afm)){
                deleteGeneral(general,afm,code1);
        }
    }
    
    public void deleteProfile(ArrayList<Profile> profile,String afm){
        Iterator<Profile> itr = profile.iterator();
        
        
        while(itr.hasNext()){
            Profile prof = itr.next();
            if(prof.getAFM().equals(afm)){
                itr.remove();
            }            
        }
        
    }
    
    public void deleteGeneral(ArrayList<GeneralContracts> general,String afm,int code){
        Iterator<GeneralContracts> itr =  general.iterator();
        
        while(itr.hasNext()){
            GeneralContracts gen = itr.next();
            if(gen.getCode() == code && gen.getAFM().equals(afm)){
                itr.remove();
            }
        }
    }
    
    
    
    private boolean checkAfmGeneral(Iterable<GeneralContracts> general, String afm){
        for(GeneralContracts pr2:general){
            if(pr2.getAFM().equals(afm)){
                System.out.println("You can delete General");
                return true;
            }
        }
        System.out.println("You can not delete General");
        return false;
        
    }
    private boolean checkAfmLand(Iterable<LandlineContracts> lineContracts, String afm){
         for(LandlineContracts pr4:lineContracts){
           if(pr4.getAFM().equals(afm)){
               System.out.println("You can delete Land");
               return true;
           }
        }
        System.out.println("You can not delete Land");
        return false;
    }
    
    private boolean checkAfmMobile(Iterable<MobileTelephonyContracts> mobileContracts, String afm){
        for(MobileTelephonyContracts pr3:mobileContracts){
           if(pr3.getAFM().equals(afm)){
               System.out.println("You can delete Mobile");
               return true;               
           }
        }
        System.out.println("You can not delete Mobile");
        return false;
    }
    
    /**private boolean checkAfmProfile(ArrayList<Profile> profile,String afm){
        for(Profile pr:profile){
            if(profile==null){
                return false;
            }
            if(afm.equals(pr.getAFM())){
                System.out.println("You can delete");
                return true;
            }
        }
        System.out.println("You can not delete");
        return false;
    }*/
    
}

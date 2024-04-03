/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it21965;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafail Ntymenos
 */
public class NewContracts  {
    Scanner input = new Scanner(System.in);
    
    public void makeContracts(ArrayList<GeneralContracts> general,ArrayList<Profile> profile,int code, ArrayList< MobileTelephonyContracts> mobileContracts, ArrayList<LandlineContracts> lineContracts) {
        System.out.println("Give me your AFM");
        String afm=input.nextLine();
        
        //check afm
        if(checkAfm(profile, afm)){
            GeneralContracts c1=new GeneralContracts();
            //AFM
            c1.setAFM(afm);
            //code
            c1.setCode(code);
            System.out.println("code:"+c1.getCode());
            //start of contracts
            System.out.println("Give me your desired start date of the contract");
            c1.setStartOfContracts(input.nextLine());
            
            //length
            do{
                System.out.println("Give me your length for the contract");
                c1.setLength(input.nextInt());
                if(c1.getLength()!=12 && c1.getLength()!=24){
                    System.out.println("Wrong input length(12/24)");
                }
            }while(c1.getLength()!=12 && c1.getLength()!=24);
            input.nextLine();
            do{	
                System.out.println("Type of contracts :'electronic' or 'clasic'");
                c1.setTypeConstracts(input.nextLine());
                if(!"electronic".equals(c1.getTypeConstracts()) && !"clasic".equals(c1.getTypeConstracts())){
                    System.out.println("Wrong input");
                }
            }while(!"electronic".equals(c1.getTypeConstracts()) && !"clasic".equals(c1.getTypeConstracts()));
            
            //payment
            do{
                System.out.println("means of payment");
                System.out.println("credit card OR cash OR standing order");
                c1.setPayment(input.nextLine());
                if(!"credit card".equals(c1.getPayment()) && !"cash".equals(c1.getPayment()) && !"standing order".equals(c1.getPayment())){
                    System.out.println("Wrong input (correct: credit card OR cash OR standing order)");
                }
            }while(!"credit card".equals(c1.getPayment()) && !"cash".equals(c1.getPayment()) && !"standing order".equals(c1.getPayment()));
            System.out.println("1:Mobile Telephony Contracts\t*OR*\t2:Landline Contracts");
            System.out.println("Choose one of them:");
            int ch=input.nextInt();
            if(ch==1){
                c1.setCost(makeMobileTelephonyContracts(mobileContracts,c1.getAFM(),code));
            }else{                                                                        // make cost
                c1.setCost(makeLandlineContracts(lineContracts,c1.getAFM(),code));
            }
            if(c1.getCost() != 0){
                general.add(c1);
                System.out.println("\tafm:"+c1.getAFM()+"\tcode:"+c1.getCode()+"\tstartOfContracts:"+c1.getStartOfContracts()+"\tlength:"+c1.getLength()+"\tcost:"+c1.getCost()+"\ttypeConstracts:"+c1.getTypeConstracts());
            }

            
            
        }else{
            
        }
       
        
    }
    private int makeMobileTelephonyContracts(ArrayList<MobileTelephonyContracts> mobileContracts, String afm,int code){
        Scanner input = new Scanner(System.in);
        MobileTelephonyContracts c1 = new MobileTelephonyContracts();
        System.out.println("cost list:GB=6 per GB \t SMS=2 per sms \t minutes=3 per minutes");
        //code
        c1.setCode(code);
        //afm
        c1.setAFM(afm);
        //numberTelephone
        do{
            System.out.println("Give me your number of mobile telephone");
            c1.setNumberTelephone(input.nextLong());//πρεπει να τσέκαρω αν υπάρχει αυτός ο αριθμός
            
            if(c1.getNumberTelephone() / 1000000000 != 6){
                System.out.println("Wrong input for number of telephone");
            }
            
        }while(c1.getNumberTelephone() / 1000000000 != 6);
        
        if(checkMobileTelephone(mobileContracts, c1.getNumberTelephone())){
            System.out.println("You can not make contract for this number telephone because it use for another contract");
        }else{
            //GB
            do{
                System.out.println("How many gb");
                c1.setGB(input.nextInt());
                if(c1.getGB() < 0){
                    System.out.println("Wrong input");
                }
            }while(c1.getGB() < 0);
            
            //SMS
            do{
                System.out.println("How many sms");
                c1.setSMS(input.nextInt());
                if(c1.getSMS() < 0){
                    System.out.println("Wrong input");
                }
            }while(c1.getSMS() < 0);
            
            //minutesMobile
            do{
                System.out.println("How many minutes");
                c1.setMinutesMobile(input.nextInt());
                if(c1.getMinutesMobile() < 0){
                    System.out.println("Wrong input");
                }
            }while(c1.getMinutesMobile() < 0);
            
            mobileContracts.add(c1);
            int cost = costMobile(c1);
            return cost;
        }
        return 0;
        
    }
    
    private int makeLandlineContracts(ArrayList<LandlineContracts> lineContracts, String afm,int code){
        
        Scanner input = new Scanner(System.in);
        LandlineContracts c1 = new LandlineContracts();
        
        System.out.println("cost list: VDSL=20 \t ADSL = 10 \t minutes=2 per minutes");
        //code
        c1.setCode(code);
        //afm
        c1.setAFM(afm);
        //speed
        String ch;
        do{
            System.out.println("Do you want Internet for your contract<YES>OR<NO>");
            ch=input.nextLine();
            if("yes".equals(ch)){
                System.out.println("VDSl or ADSL");
                c1.setSpeed(input.nextLine());
                if(!"ADSL".equals(c1.getSpeed())&& !"VDSL".equals(c1.getSpeed())){
                    System.out.println("Wrong input ");
                }
            }else{
                if("no".equals(ch)){
                    c1.setSpeed("");
                }
            }
           
        }while((!"ADSL".equals(c1.getSpeed()) && !"VDSL".equals(c1.getSpeed())) && !"yes".equals(ch) && !"no".equals(ch));
        
        //numberTelephone
        do{
            System.out.println("Give me your number LandLine");
            c1.setNumberTelephone(input.nextLong());
            if(c1.getNumberTelephone() / 1000000000 != 2){
                System.out.println("Wrong input for number of telephone");
            }
        }while(c1.getNumberTelephone() / 1000000000 != 2);
        if(checkLandLineTelephone(lineContracts, c1.getNumberTelephone())){
            System.out.println("You can not make contract for this number telephone because it use for another contract");
        }else{
            //minuteslandline
            do{
                System.out.println("Give me minutes");
                c1.setMinutesLandline(input.nextInt());
                if(c1.getMinutesLandline() < 0){
                    System.out.println("Wrong input");
                }
            }while(c1.getMinutesLandline() < 0);
            
            lineContracts.add(c1);
            int cost = costLandLine(c1);
            return cost;
        }
        return 0;
    }
    
    
    
    private boolean checkAfm(ArrayList<Profile> profile,String afm){
        for(Profile pr:profile){
            if(profile==null){
                return false;
            }
            if(afm.equals(pr.getAFM())){
                System.out.println("You can make contracts ");
                return true;
            }
        }
        System.out.println("You can not make contracts with this afm,because you have not created a profile");
        return false;
    }
    
    private boolean checkLandLineTelephone(ArrayList<LandlineContracts> lineContracts, long tel){
        for(LandlineContracts pr4:lineContracts){
           if(lineContracts == null){
               return false;
           } 
           if(tel == pr4.getNumberTelephone()){
               return true;
           }
           
        }
        return false;
    }
    
    private boolean checkMobileTelephone(ArrayList< MobileTelephonyContracts> mobileContracts, long tel){
        
        for(MobileTelephonyContracts pr3:mobileContracts){
            if(mobileContracts == null){
                return false;
            }
            if(tel == pr3.getNumberTelephone()){
                return true;
            }
        }
        return false;
        
    }
    
    public int costLandLine( LandlineContracts c1){
        int costVDSl = 20; // euro
        int costADSL = 10; // euro
        int costMinutes = 2;// euro per minutes 
        int cost = 0;
        
        if("VDSL".equals(c1.getSpeed())){
            cost+=20;
        }
        if("ADSL".equals(c1.getSpeed())){
            cost+=10;
        }
        cost += c1.getMinutesLandline() * 2;
        return cost;
        
    }
    
    public int costMobile(MobileTelephonyContracts c1){
        int costGB = 6;//euro per GB
        int costSMS = 2;//euro per SMS
        int costMinutes = 3;//euro per minutes
        int cost = 0;
        
        cost += c1.getGB() * costGB;
        cost += c1.getSMS() * costSMS;
        cost += c1.getMinutesMobile() * costMinutes;
        return  cost;
        
    }
    
}    

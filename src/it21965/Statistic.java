/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it21965;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rafail Ntymenos
 */
public class Statistic {
    public void statistic(ArrayList<GeneralContracts> general,ArrayList<Profile> profile, ArrayList< MobileTelephonyContracts> mobileContracts, ArrayList<LandlineContracts> lineContracts){
        Scanner input = new Scanner(System.in);
        if(!lineContracts.isEmpty()){
            findMinLand(lineContracts);
            findMaxLand(lineContracts);
            findMeanLand(lineContracts);
        }
        if(!mobileContracts.isEmpty()){
            findMinMobile(mobileContracts);
            findMaxMobile(mobileContracts);
            findMeanMobile(mobileContracts);
        }
        System.out.println("Give me your afm");
        String afm=input.nextLine();
        print(general, profile, mobileContracts, lineContracts,afm);
        discount(general, profile, mobileContracts, lineContracts, afm);
        System.out.println("After calculation discount");
        print(general, profile, mobileContracts, lineContracts, afm);
    }
    
    private void findMinMobile(ArrayList< MobileTelephonyContracts> mobileContracts){
        Iterator<MobileTelephonyContracts> itr = mobileContracts.iterator();
        int minGB = 100000000;
        int minSMS = 100000000;
        int minMinutesMobile = 100000000;
        while(itr.hasNext()){
            MobileTelephonyContracts mob = itr.next();
            if(mob.getGB() < minGB){
                minGB = mob.getGB();
            }
            if(mob.getSMS() < minSMS){
                minSMS = mob.getSMS();
            }
            if(mob.getMinutesMobile() < minMinutesMobile){
                minMinutesMobile = mob.getMinutesMobile();
            }
        }
        System.out.println("Mobile:\t"+"\tminGB:"+minGB+"\tminSMS:"+minSMS+"\tminMinutesMobile:"+minMinutesMobile);
    }
    
    private void findMinLand(ArrayList<LandlineContracts> lineContracts){
        Iterator<LandlineContracts> itr = lineContracts.iterator();
        int minMinutesLandline = 100000000;
        while(itr.hasNext()){
            LandlineContracts land = itr.next();
            if(land.getMinutesLandline() < minMinutesLandline){
                minMinutesLandline = land.getMinutesLandline();
            }
        }
        System.out.println("Land:\t"+"\tminMinutesLandline:"+minMinutesLandline);
    }
    
    private void findMaxMobile(ArrayList< MobileTelephonyContracts> mobileContracts){
        Iterator<MobileTelephonyContracts> itr = mobileContracts.iterator();
        int maxGB = -1;
        int maxSMS = -1;
        int maxMinutesMobile = -1;
        while(itr.hasNext()){
            MobileTelephonyContracts mob = itr.next();
            if(mob.getGB() > maxGB){
                maxGB = mob.getGB();
            }
            if(mob.getSMS() > maxSMS){
                maxSMS = mob.getSMS();
            }
            if(mob.getMinutesMobile() > maxMinutesMobile){
                maxMinutesMobile = mob.getMinutesMobile();
            }
        }
        System.out.println("Mobile:\t"+"\tmaxGB:"+maxGB+"\tmaxSMS:"+maxSMS+"\tmaxMinutesMobile:"+maxMinutesMobile);
    }
    
    private void findMaxLand(ArrayList<LandlineContracts> lineContracts){
        Iterator<LandlineContracts> itr = lineContracts.iterator();
        int maxMinutesLandline = -1;
        while(itr.hasNext()){
            LandlineContracts land = itr.next();
            if(land.getMinutesLandline() > 0){
                maxMinutesLandline = land.getMinutesLandline();
            }
        }
        System.out.println("Land:\t"+"\tmaxMinutesLandline:"+maxMinutesLandline);
    }
    
    private void findMeanMobile(ArrayList< MobileTelephonyContracts> mobileContracts){
        Iterator<MobileTelephonyContracts> itr = mobileContracts.iterator();
        long sGB = 0;
        long sSMS = 0;
        long sMinutes = 0;
        int count = 0;
        while(itr.hasNext()){
            MobileTelephonyContracts mob = itr.next();
            sGB += mob.getGB();
            sSMS += mob.getSMS();
            sMinutes += mob.getMinutesMobile();
            count++;
        }
        System.out.println("Mobile:\t"+"\tmeanGB:\t"+sGB/count+"\tmeanSMS:\t"+sSMS/count+"\tmeanMinutes:\t"+sMinutes/count);
    }
    
    private void findMeanLand(ArrayList<LandlineContracts> lineContracts){
        Iterator<LandlineContracts> itr = lineContracts.iterator();
        long sMin = 0;
        int count = 0;
        while(itr.hasNext()){
            LandlineContracts land = itr.next();
            sMin += land.getMinutesLandline();
            count++;
        }
        System.out.println("Land:\t"+"\tmeanMinutes:\t"+sMin/count);
    }
    
    private void print(ArrayList<GeneralContracts> general, ArrayList<Profile> profile, ArrayList< MobileTelephonyContracts> mobileContracts, ArrayList<LandlineContracts> lineContracts, String afm){
        
        for(GeneralContracts pr2:general){
            if(pr2.getAFM().equals(afm)){
                System.out.println("general:\t"+"afm:"+pr2.getAFM()+"\tcode:"+pr2.getCode()+"\tstartOfContracts:"+pr2.getStartOfContracts()+"\tlength:"+pr2.getLength()+"\tcost:"+pr2.getCost()+"\ttypeConstracts:"+pr2.getTypeConstracts());
            }
        }
        
        for(MobileTelephonyContracts pr3:mobileContracts){
           if(pr3.getAFM().equals(afm)){
                System.out.println("mobile:\t"+"\tcode:"+pr3.getCode()+"\tAFM:"+pr3.getAFM()+"\tGb:"+pr3.getGB()+"\tnumber:"+pr3.getNumberTelephone()+"\tminutes:"+pr3.getMinutesMobile()+"\tsms:"+pr3.getSMS());
           }
        }
        
        for(LandlineContracts pr4:lineContracts){
           if(pr4.getAFM().equals(afm)){
               if("".equals(pr4.getSpeed())){
                   System.out.println("line:\t"+"\tcode:"+pr4.getCode()+"\tAFM:"+pr4.getAFM()+"\tnumber:"+pr4.getNumberTelephone()+"\tninutes:"+pr4.getMinutesLandline());
               }else{
                   System.out.println("line:\t"+"\tcode:"+pr4.getCode()+"\tAFM:"+pr4.getAFM()+"\tspeed:"+pr4.getSpeed()+"\tnumber:"+pr4.getNumberTelephone()+"\tninutes:"+pr4.getMinutesLandline());
               }
           }
        }
        
        for(Profile pr1:profile){
            if(pr1.getAFM().equals(afm)){
                System.out.println("profile:\t"+"Discount:"+pr1.getDiscount()+"\tafm:\t"+pr1.getAFM()+"\tadt:\t"+pr1.getADT()+"\taddress:\t"+pr1.getAddress()+"\tcategory:\t"+pr1.getCategory()+"\temail:\t"+pr1.getEmail());
            }
        }
    }
    
    private void discount(ArrayList<GeneralContracts> general, ArrayList<Profile> profile, ArrayList< MobileTelephonyContracts> mobileContracts, ArrayList<LandlineContracts> lineContracts,String afm){
        int count = 0;
        for(GeneralContracts pr2:general){
            if(pr2.getAFM().equals(afm)){
                //System.out.println("general:\t"+"afm:"+pr2.getAFM()+"\tcode:"+pr2.getCode()+"\tstartOfContracts:"+pr2.getStartOfContracts()+"\tlength:"+pr2.getLength()+"\tcost:"+pr2.getCost()+"\ttypeConstracts:"+pr2.getTypeConstracts());
                count++;
            }
        }
        int discount = 0;
        discount += 5 * count;
        if(discount > 15){
            discount = 15;
        }
        for(Profile pr1:profile){
            if(pr1.getAFM().equals(afm)){
                //System.out.println("profile:\t"+"Discount:"+pr1.getDiscount()+"\tafm:\t"+pr1.getAFM()+"\tadt:\t"+pr1.getADT()+"\taddress:\t"+pr1.getAddress()+"\tcategory:\t"+pr1.getCategory()+"\temail:\t"+pr1.getEmail());
                if("corporation".equals(pr1.getCategory())){
                    discount += 10;
                    break;
                }
                if("Student".equals(pr1.getCategory())){
                    discount += 15;
                    break;
                }
            }
        }
        for(LandlineContracts pr4:lineContracts){
           if(pr4.getAFM().equals(afm)){
               /**if("".equals(pr4.getSpeed())){
                   System.out.println("line:\t"+"\tcode:"+pr4.getCode()+"\tAFM:"+pr4.getAFM()+"\tnumber:"+pr4.getNumberTelephone()+"\tninutes:"+pr4.getMinutesLandline());
               }else{
                   System.out.println("line:\t"+"\tcode:"+pr4.getCode()+"\tAFM:"+pr4.getAFM()+"\tspeed:"+pr4.getSpeed()+"\tnumber:"+pr4.getNumberTelephone()+"\tninutes:"+pr4.getMinutesLandline());
               }*/
               if(pr4.getMinutesLandline() > 1000){
                   discount += 8;
                   break;
               }
           }
        }
        for(MobileTelephonyContracts pr3:mobileContracts){
           if(pr3.getAFM().equals(afm)){
                //System.out.println("mobile:\t"+"\tcode:"+pr3.getCode()+"\tAFM:"+pr3.getAFM()+"\tGb:"+pr3.getGB()+"\tnumber:"+pr3.getNumberTelephone()+"\tminutes:"+pr3.getMinutesMobile()+"\tsms:"+pr3.getSMS());
                if(pr3.getMinutesMobile() > 1000){
                    discount += 11;
                    break;
                }
           }
        }
        for(GeneralContracts pr2:general){
            if(pr2.getAFM().equals(afm)){
                //System.out.println("general:\t"+"afm:"+pr2.getAFM()+"\tcode:"+pr2.getCode()+"\tstartOfContracts:"+pr2.getStartOfContracts()+"\tlength:"+pr2.getLength()+"\tcost:"+pr2.getCost()+"\ttypeConstracts:"+pr2.getTypeConstracts());
                if("credit card".equals(pr2.getPayment()) || "standing order".equals(pr2.getPayment())){
                    discount += 5;
                    break;
                }
            }
        }
        for(GeneralContracts pr2:general){
            if(pr2.getAFM().equals(afm)){
                //System.out.println("general:\t"+"afm:"+pr2.getAFM()+"\tcode:"+pr2.getCode()+"\tstartOfContracts:"+pr2.getStartOfContracts()+"\tlength:"+pr2.getLength()+"\tcost:"+pr2.getCost()+"\ttypeConstracts:"+pr2.getTypeConstracts());
                if(pr2.getTypeConstracts() == "electronic"){
                    discount += 2;
                    break;
                }
            }
        }
        if(discount > 45){
            discount = 45;
        }
         for(Profile pr1:profile){
            if(pr1.getAFM().equals(afm)){
                //System.out.println("profile:\t"+"Discount:"+pr1.getDiscount()+"\tafm:\t"+pr1.getAFM()+"\tadt:\t"+pr1.getADT()+"\taddress:\t"+pr1.getAddress()+"\tcategory:\t"+pr1.getCategory()+"\temail:\t"+pr1.getEmail());
                pr1.setDiscount(discount);
            }
        }
    }
}

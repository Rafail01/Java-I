package it21965;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author Rafail Ntymenos
 */
public class LoginProfile {
   
    
    public void makeProfile(ArrayList<Profile> profile){
        Scanner input = new Scanner(System.in);
        Profile c1= new Profile();
        try{
            //AFM
        
            System.out.println("Give me your AFM");
            c1.setAFM(input.nextLine());
            //System.out.println("Your AFM\t:"+ c1.getAFM());
        
            //Address
        
           System.out.println("Give me your Address");
           c1.setAddress(input.nextLine());
           //System.out.println("Your Address\t:"+c1.getAddress());
           
           //discount
            c1.setDiscount(0);
        
           //ADT
        
           System.out.println("Give me your Police ID");
           c1.setADT(input.nextLine());
           //System.out.println("Your Police ID\t:"+c1.getADT());
           if(rightProfile(profile, c1.getAFM(), c1.getADT())){
            // System.out.println("You can't login with same afm or adt");
           }else{
               //Category
               do{
                   System.out.println("Give me your Category");
                   System.out.println("Category:\tCitizen\tOR\tStudent\tOR\tcorporation");
                   c1.setCategory(input.nextLine());
                   if(!"Citizen".equals(c1.getCategory()) && !"Student".equals(c1.getCategory()) && !"corporation".equals(c1.getCategory())){
                       System.out.println("Wrong1 input");
                   }
               }while(!"Citizen".equals(c1.getCategory()) && !"Student".equals(c1.getCategory()) && !"corporation".equals(c1.getCategory()));
               System.out.println("Give me your Email");
               c1.setEmail(input.nextLine());
               profile.add(c1);
            }
        }catch(InputMismatchException e){
            System.out.println("Wrong input");
            System.out.println(e);
        }
        
                
        //Πρεπει να προσθέσω συνολο εκπτωσεων...
        
    }
    public boolean rightProfile(ArrayList<Profile> profile,String afm,String adt){
        
        for(Profile pr:profile){
            if(profile==null){
                return false;
            }
            if(afm.equals(pr.getAFM()) || (adt == null ? pr.getADT() == null : adt.equals(pr.getADT()))){
                System.out.println("You can't login with same afm or adt");
                return true;
            }
            //System.out.println("adt:\t"+pr.getADT()+"\tafm:\t"+pr.getAFM()+"\taddress:\t"+pr.getAddress()+"\tcategory:\t"+pr.getCategory()+"\temail:\t"+pr.getEmail());
        }
        return false;
    }
 
}

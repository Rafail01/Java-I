package it21965;

import java.io.IOException;
import java.util.Scanner; // program uses class Scanner
import java.util.ArrayList; // import the ArrayList class
import java.util.InputMismatchException;

/**
 *
 * @author Rafail Ntymenos
 */
public class It21965 {

    public static void main(String[] args) throws IOException{
        
        Scanner input = new Scanner(System.in);
        
        //Profile c2 = new Profile();
        //int ARRAY_LENGTH = 10;// declare constant
        //Profile[] profileArray=new Profile[ARRAY_LENGTH];
        //int currentSize=0;
        ArrayList<Profile> profile = new ArrayList<Profile>();
        ArrayList<GeneralContracts> general=new ArrayList<GeneralContracts>();
        ArrayList< MobileTelephonyContracts> mobileContracts=new ArrayList<MobileTelephonyContracts>();
        ArrayList<LandlineContracts> lineContracts=new ArrayList<LandlineContracts>();
        int choices;
        int code = 0;
        boolean loop = false;
        
        SomeContracts somes = new SomeContracts();
        code = somes.some(general, profile, code, mobileContracts, lineContracts);//make some contracts
        
            do{
                try{
                do{
                System.out.println("choises:");
                System.out.println(" *1* : Introduction new profile");
                System.out.println(" *2* : Introduction new contracts");
                System.out.println(" *3* : Delete contracts");
                System.out.println(" *4* : Print active constracts and statistics");
                System.out.println("Please choose one of them");
                choices = input.nextInt();
                switch(choices){
                case 1:
                    LoginProfile loginProfile=new LoginProfile();//Επολογή 1 από το μενού
                    loginProfile.makeProfile(profile);
                    //profile.MakeProfile(profileArray,currentSize);
                    /**for(int i=0;i<=currentSize;i++){
                       System.out.println("ADT:"+profileArray[currentSize].getADT()+"\tAFM:"+ profileArray[currentSize].getAFM()+"\tAddress:"+ profileArray[currentSize].getAddress() +"\tcategory:"+ profileArray[currentSize].getCategory()+"\temail:"+profileArray[currentSize].getEmail()+"\ti:"+i);
                    }*/
                    
                    //profile.PrintAllArray(profileArray, currentSize);
                    //currentSize++;
                    break;
                case 2:
                    NewContracts contract=new NewContracts();//Επιλογή 2 από το μενού
                    contract.makeContracts(general,profile,code,mobileContracts,lineContracts);
                    code++;  
                    break;
                case 3:
                    DeleteContracts delete = new DeleteContracts();
                    delete.deleteContracts(general,profile,mobileContracts,lineContracts);
                   
                    //Eδώ θα καλώ την κλάση που θα κανει delete
                    break;
                case 4:
                    Statistic stat = new Statistic();
                    stat.statistic(general, profile, mobileContracts, lineContracts);
                    //Εδώ θα εμφανίζει διάφορα στατιστίκα και τα ενεργά συμβόλαια 
                    break;
                default:
                    System.out.println("Wrong input for choices");
               }
                
               }while ((choices < 1 || choices > 4));  
               }catch(InputMismatchException e ){
                    System.out.println("Wrong value of choises");
                    System.out.println(e);
                    input.nextLine();
               }
            
                
            
            System.out.println("If you want to continue write");
            System.out.println("FALSE or TRUE");
            try{
                loop =input.nextBoolean();
            }catch(InputMismatchException e){
                System.out.println("Wrong input");
                System.out.println(e);
            }
            
        }while(loop);
       
       
        /**PrintContracts print = new PrintContracts();
        print.PrintProfile(profile);
        print.PrintGeneral(general);
        print.PrintLand(lineContracts);
        print.PrintMobile(mobileContracts);*/
    }
    
}

package it21965;

/**
 *
 * @author Rafail Ntymenos
 */
public class GeneralContracts {
    private String AFM;
    private int code;
    private String startOfContracts;
    private int length;
    private int cost;
    private String typeConstracts;
    private String payment;
    
    
    
    public GeneralContracts(){
        AFM="";
        code=0;
        startOfContracts="";
        length=0;
        cost=0;
        typeConstracts="";
        payment="";
    }
    //contractor
    public GeneralContracts(String AFM,int code, String startOfContracts, int length, int cost, String typeConstracts, String payment){
        this.AFM=AFM;
        this.code=code;
        this.startOfContracts=startOfContracts;
        this.length=length;
        this.cost=cost;
        this.typeConstracts=typeConstracts;
        this.payment=payment;
    }
        
    //setters of AFM
    public void setAFM(String newAFM){
        AFM=newAFM;
    }
    
    //setters of code
    public void setCode(int newCode){
        code=newCode;
    }
    
    //setters of startOfContracts
    public void setStartOfContracts(String newStartOfContracts){
        startOfContracts=newStartOfContracts;
    }
    //setters of length
    public void setLength(int newLength){
        length=newLength;
    }
    //setters of cost
    public void setCost(int newCost){
        cost=newCost;
    }
    //setters of typeConstracts
    public void setTypeConstracts(String newTypeConstracts){
        typeConstracts=newTypeConstracts;
    }
    //setters of payment
    public void setPayment(String newPayment){
        payment=newPayment;
    }
    //getters of code
    public int getCode(){
        return code;
    }
    
    //getters of startOfContracts
    public String getStartOfContracts(){
        return startOfContracts;
    }
    //getters of length
    public int getLength(){
        return length;
    }
    //getters of cost
    public int getCost(){
        return cost;
    }
    //getters of typeConstracts
    public String getTypeConstracts(){
        return typeConstracts;
    }
    //getters of payment
    public String getPayment(){
        return payment;
    }
    //getters of AFM
    public String getAFM(){
        return AFM;
    }
    
}

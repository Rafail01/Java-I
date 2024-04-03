package it21965;

/**
 *
 * @author Rafail Ntymenos
 */
public class LandlineContracts {
    private int code;
    private String AFM;
    private String speed;
    private long numberTelephone;
    private int minutesLandline;
    
    public LandlineContracts(){
        code=0;
        AFM="";
        speed="";
        numberTelephone=0;
        minutesLandline=0;
    }
    
    public LandlineContracts(int code,String AFM,String speed,long numberTelephone,int minutesLandline){
        this.code=code;
        this.AFM=AFM;
        this.speed=speed;
        this.numberTelephone=numberTelephone;
        this.minutesLandline=minutesLandline;
    }
    //setters of code
    public void setCode(int newcode){
        code=newcode;
    }
    //setters of afm
    public void setAFM(String newAFM){
        AFM=newAFM;
    }
    //setters of speed
    public void setSpeed(String newSpeed){
        speed=newSpeed;
    }
    //setters of numberTelephone
    public void setNumberTelephone(long newNumberTelephone){
        numberTelephone=newNumberTelephone;
    }
     //setters of minutesLandline
    public void setMinutesLandline(int newNinutesLandline){
        minutesLandline=newNinutesLandline;
    }
    //getters of code
    public int getCode(){
        return code;
    }
    //getters of afm
    public String getAFM(){
        return AFM;
    }
    //getters of speed
    public String getSpeed(){
        return speed;
    }
    //getters of numberTelephone
    public long getNumberTelephone(){
        return numberTelephone;
    }
     //getters of minutesLandline
    public int getMinutesLandline(){
        return minutesLandline;
    }
}

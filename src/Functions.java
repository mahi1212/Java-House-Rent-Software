
public class Functions {
    private String name;
    private String location;
    private int no_of_rooms;
    private String gas_sys;
    private String allowed;
    private int rent_cost;
    private String house_no;
    private int mobile;
    private byte[] image;
    private String description;

    public Functions(){}

    public Functions(String Name, String Location, int No_Of_Rooms, String Gas_Sys, String Allowed, int Rent_Cost, String House_No, int Mobile, byte[] Image, String Description){

        this.name = Name;
        this.location = Location;
        this.no_of_rooms = No_Of_Rooms;
        this.gas_sys = Gas_Sys;
        this.allowed = Allowed;
        this.rent_cost = Rent_Cost;
        this.house_no = House_No;
        this.mobile = Mobile;
        this.image = Image;
        this.description = Description;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name = Name;
    }
    //For location
    public String getLocation(){
        return location;
    }

    public void setLocation(String Location){
        this.location = Location;
    }
    //Rooms
    public int getRoom(){
        return no_of_rooms ;
    }

    public void setRoom(int No_Of_Rooms){
        this.no_of_rooms  = No_Of_Rooms;
    }
    //Gas system
    public String getGas(){
        return gas_sys;
    }

    public void setGas(String Gas_Sys){
        this.gas_sys= Gas_Sys;
    }

    //Allowed
    public String getAllowed(){
        return allowed;
    }

    public void setAllowed(String Allowed){
        this.allowed= Allowed;
    }
    //Rent_Cost
    public int getRentCost(){
        return rent_cost ;
    }

    public void setRentCost(int Rent_Cost){
        this.rent_cost= Rent_Cost;
    }
    //House_No
    public String getHouseNo(){
        return house_no;
    }

    public void setHouseNo(String House_No){
        this.house_no= House_No;
    }

    //Mobile
    public int getMobile(){
        return mobile;
    }

    public void setMobile(int Mobile){
        this.mobile = Mobile;
    }
    //    Image
    public byte[] getMyImage(){
        return image;
    }

    public String getDescription(){
        return description;
    }

    public void setDiscription(String Description){
        this.description= Description;
    }

}


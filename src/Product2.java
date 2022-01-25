
public class Product2 {

    private String id;
    private String name;
    private int qte;
    private String price;
    private int catId;
    private byte[] Image;

    public Product2(){}

    public Product2(String Id, String Name, int Qte, String Price,byte[] image, int CatId){

        this.id = Id;
        this.name = Name;
        this.qte = Qte;
        this.price = Price;
        this.Image = image;
        this.catId = CatId;

    }


    public String getID(){
        return id;
    }

    public void setID(String ID){
        this.id = ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name = Name;
    }

    public int getQte(){
        return qte;
    }

    public void setQte(int Qte){
        this.qte = Qte;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String Price){
        this.price = Price;
    }

    public int getCatID(){
        return catId;
    }

    public void setCatID(int CatID){
        this.catId = CatID;
    }

    public byte[] getMyImage(){
        return Image;
    }
}


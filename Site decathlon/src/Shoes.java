public class Shoes {
    String size;
    String color;
    String sportType;
    String material;
    Shoes(){
        size=" ";
        color=" ";
        sportType=" ";
        material=" ";
    }
    public Shoes(String size,String color,String sportType,String material){
        this.size=size;
        this.color=color;
        this.sportType=sportType;
        this.material=material;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }
}


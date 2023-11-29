public class Ball {
    String size;
    String color;
    String material;
    Ball(){
        size=" ";
        color=" ";
        material=" ";
    }
     public Ball(String size,String color,String material){
        this.size=size;
        this.color=color;
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
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material=material;
    }
}

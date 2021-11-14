package Constructor;

class Box {
    float height,weight,depth;
    Box(float height, float weight, float depth){
        this.depth=depth;
        this.height=height;
        this.weight=weight;
    }
    float volume(float height,float weight,float depth){
        return height*weight*depth;
    }
}
public class TestBox{
    public static void main(String[] args) {
        Box obj = new Box(3.0f,4.0f,5.0f);
        float ans = obj.volume(obj.height,obj.weight,obj.depth);
        System.out.println("The volume is : "+ans);
    }
}

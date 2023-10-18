public class UnidimensionalPoint {
    int x;
    int getX(){
        return x;
    }
    void setX(int x){
        this.x=x;
    }
    UnidimensionalPoint Clone(){
        UnidimensionalPoint copy= new UnidimensionalPoint();
        copy.setX(x);
        return copy;
    }
}

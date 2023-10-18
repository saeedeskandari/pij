class Point {
    int x ;
    int y;
    Point (int x , int y){
        this.x=x;
        this.y=y;
    }
    public  void moveTo(Point remote){
        this.x=remote.x;
        this.y=remote.y;

    }
}
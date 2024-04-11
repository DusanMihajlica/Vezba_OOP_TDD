public class Point {

    private int x;
    private int y;
    private boolean selectable;

    public Point(){
        this.x=5;
        this.y=5;
        this.selectable=false;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y, boolean selectable) {
        this.x = x;
        this.y = y;
        this.selectable=selectable;
    }


    public void setSelectable(boolean selectable){
        this.selectable=selectable;
    }
    public void SetX(int x){
        this.x=x;
    }
    public void SetY(int y){
        this.y=y;
    }
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    public boolean isSelectable()
    {
        return this.selectable;
    }


    public double rastojanje(int x, int y){
        double X = (double) x;
        double Y = (double) y;
        return Math.sqrt((X-getX())*(X-getX()) + (Y-getY())*(Y-getY()));
    }
}

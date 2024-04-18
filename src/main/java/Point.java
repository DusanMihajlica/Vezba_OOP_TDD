import java.awt.Graphics;
public class Point extends Shape implements Movable{

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


    public double rastojanje(double x, double y){
        double X = (double) x;
        double Y = (double) y;
        return Math.sqrt((X-getX())*(X-getX()) + (Y-getY())*(Y-getY()));
    }

    public boolean Sadrzi(Point tacka)
    {
        double x = tacka.getX();
        double y = tacka.getY();
        if(this.rastojanje(x, y)<=2)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "(" +this.x + "," +this.y + "," +this.selectable + ")";
    }
    public boolean equalse(Point tacka){
        if(this.x == tacka.getX() && this.y == tacka.getY() && this.selectable ==tacka.isSelectable())
        {
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void moveTo(int x, int y) {
        this.x =x;
        this.y =y;
    }
    @Override
    public void moveBy(int byX, int byY) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveBy'");
    }
    @Override
    public boolean contains(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }
    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
    
}

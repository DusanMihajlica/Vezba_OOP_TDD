import java.awt.Graphics;
import java.awt.Color;
public abstract class Shape implements Movable{
    
    protected boolean selected;
	public abstract boolean contains(int x, int y);
	public abstract void draw(Graphics g);
	public abstract double comapreTo(Point point1);
}

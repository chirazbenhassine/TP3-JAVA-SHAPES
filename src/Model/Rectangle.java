package Model;
import java.awt.Graphics;

	public class Rectangle extends Drawable{

		public Rectangle(Point p, int x, int y) {
			super(p, x, y);
			// TODO Auto-generated constructor stub
		}

		public Point getPoint() {
	    	return this.p;
	    }
	    
	    public int getX() {
	    	return this.x;
	    }
	    
	    public int getY() {
	    	return this.y;
	    }
			public void draw(Graphics g) {
				g.drawRect(this.p.getX(), this.p.getY(), this.getX(), this.getY());
				
			}
			public boolean contain(Point p) {
				if (p.getX() > this.getPoint().getX() && p.getX() < this.getPoint().getX()+ this.getX()&&
						p.getY()> this.getPoint().getY() && p.getY()< this.getPoint().getY()+this.getY()) {
					return true;
				}
				return false;
			}


	


}

package User;


import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import Controller.Controller;
import Model.Model;
import View.MyComponent;

public class Main {

	public static void main(String[] args) {
		MyComponent mc = new MyComponent();
		Model m = new Model();
		Controller c = new Controller(m,mc);

	}
}

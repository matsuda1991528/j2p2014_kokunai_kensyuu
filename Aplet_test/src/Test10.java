

import java.applet.Applet;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionListener;
import java.awt.*;
import java.awt.event.*;


public class Test10 extends Applet implements MouseMotionListener {
	int gx = 0;
	int gy = 0;
	Graphics Grp;
	Button btnRed;
	public void init(){
		Grp = getGraphics();
		addMouseMotionListener(this);
		add(btnRed = new Button("ê‘"));
	}
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Grp.drawLine(gx,gy,e.getX(),e.getY());gx = e.getX();gy = e.getY();
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		gx = e.getX();	gy = e.getY();
	}
	public boolean action(Event e,Object o){
		if(o.equals("ê‘")) {
			Grp.setColor(new Color(255,0,0));
		}
		return true;
	}

}

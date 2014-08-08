package img;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.*;
import java.awt.event.*;

public class Test09 extends Applet implements MouseMotionListener {
	int gx = 0;    //X座標を保持する変数
	int gy = 0;    //Y座標を保持する変数
	Graphics Grp;
	public void init(){
		Grp = getGraphics();
		addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//マウスドラック時に、画面に出力
		Grp.drawLine(gx,gy,e.getX(),e.getY());
		gx = e.getX();
		gy = e.getY();

	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//現在のマウス座標保持
		gx = e.getX();
		gy = e.getY();

	}

}

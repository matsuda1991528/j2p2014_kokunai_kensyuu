package img;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.*;
import java.awt.event.*;

public class Test09 extends Applet implements MouseMotionListener {
	int gx = 0;    //X���W��ێ�����ϐ�
	int gy = 0;    //Y���W��ێ�����ϐ�
	Graphics Grp;
	public void init(){
		Grp = getGraphics();
		addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//�}�E�X�h���b�N���ɁA��ʂɏo��
		Grp.drawLine(gx,gy,e.getX(),e.getY());
		gx = e.getX();
		gy = e.getY();

	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//���݂̃}�E�X���W�ێ�
		gx = e.getX();
		gy = e.getY();

	}

}

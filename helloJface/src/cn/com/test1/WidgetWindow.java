package cn.com.test1;

import java.awt.FlowLayout;

import javax.swing.GroupLayout;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class WidgetWindow extends ApplicationWindow {
	public static void main(String[] args) {
		WidgetWindow wwin = new WidgetWindow();
		wwin.setBlockOnOpen(true);
		wwin.open();
		Display.getCurrent().dispose();
	}

	public WidgetWindow() {
		super(null);
	}

	protected Control createContents(Composite parent) {
		getShell().setText("Widget Window");
		parent.setLayout(null);
		parent.setSize(400, 250);
//		Button push = new Button(parent, SWT.ARROW | SWT.RIGHT);
//		push.setText("RIGHT");
//		push.pack();
//		Button[] checks = new Button[2];
//		checks[0] = new Button(parent, SWT.CHECK);
//		checks[0].setText("Choice 1");
//		checks[0].setLocation(10,5);
//		checks[0].pack();
//		checks[1] = new Button(parent, SWT.CHECK);
//		checks[1].setText("Choice 2");
//		checks[1].setLocation(10,30);
//		checks[1].pack();
//		
//		
//		Button[] radios = new Button[3];
//		radios[0] = new Button(parent, SWT.RADIO);
//		radios[0].setSelection(true);
//		radios[0].setText("Choice 1");
//		radios[0].setLocation(100,5);
//		radios[0].pack();
//		radios[1] = new Button(parent, SWT.RADIO);
//		radios[1].setText("Choice 2");
//		radios[1].setLocation(100,30);
//		radios[1].pack();
//		radios[2] = new Button(parent, SWT.RADIO);
//		radios[2].setText("Choice 3");
//		radios[2].setLocation(100,55);
//		radios[2].pack();
//		for (int i=0; i<radios.length; i++)
//		if (radios[i].getSelection()) {
//			System.out.println(i);
//		}
		Button button = new Button(parent, SWT.CENTER);
		button.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
		String string = "";
		if ((e.stateMask & SWT.ALT) != 0) string += "ALT-";
		if ((e.stateMask & SWT.CTRL) != 0) string += "CTRL-";
		if ((e.stateMask & SWT.COMMAND) != 0) string += "COMMAND-";
		if ((e.stateMask & SWT.SHIFT) != 0) string += "SHIFT-";
		switch (e.keyCode) {
		case SWT.BS: string += "BACKSPACE"; break;
		case SWT.CR: string += "CARRIAGE RETURN"; break;
		case SWT.DEL: string += "DELETE"; break;
		case SWT.ESC: string += "ESCAPE"; break;
		case SWT.LF: string += "LINE FEED"; break;
		case SWT.TAB: string += "TAB"; break;
		default: string += e.character; break;
		}
		System.out.println (string);
		}
		});	
		
		
		return parent;
	}
}
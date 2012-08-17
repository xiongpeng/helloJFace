package cn.com.test1;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

//import org.eclipse.jface.window.ApplicationWindow;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Control;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Text;
//
//public class HelloSWT_JFace extends ApplicationWindow {
//	public static void main(String[] args) {
//		HelloSWT_JFace awin = new HelloSWT_JFace();
//		awin.setBlockOnOpen(true);
//		awin.open();
//		Display.getCurrent().dispose();
//	}
//
//	public HelloSWT_JFace() {
//		super(null);
//	}
//
//	protected Control createContents(Composite parent) {
//		Text helloText = new Text(parent, SWT.CENTER);
//		helloText.setText("Hello SWT and JFace!");
//		parent.pack();
//		return parent;
//	}
//}
public class HelloSWT_JFace extends ApplicationWindow{
	public HelloSWT_JFace() {
		super(null);
	}

	public static void main(String[] args) {
		HelloSWT_JFace awin = new HelloSWT_JFace();
		awin.setBlockOnOpen(true);
		awin.open();
		Display.getCurrent().dispose();
	}
	
	protected Control createContents(Composite parent){
		Text helloText = new Text(parent, SWT.CENTER);
		helloText.setText("Hello SWT and JFace!");
		parent.pack();
		return parent;
	}
}

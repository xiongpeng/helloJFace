package cn.com.test1;

import org.eclipse.jface.window.*;
import org.eclipse.swt.widgets.*;

public class CompViewer extends ApplicationWindow {
	public CompViewer() {
		super(null);
	}

	protected Control createContents(Composite parent) {
		TestDemo1 cc1 = new TestDemo1(parent);
		return parent;
	}

	public static void main(String[] args) {
		CompViewer cv = new CompViewer();
		cv.setBlockOnOpen(true);
		cv.open();
		Display.getCurrent().dispose();
	}
}

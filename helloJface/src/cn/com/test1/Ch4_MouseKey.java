package cn.com.test1;

import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;

public class Ch4_MouseKey extends Composite {
	Label output;

	Listener UntypedListener = new Listener() {
		public void handleEvent(Event event) {
			switch (event.type) {
			case SWT.MouseEnter:
				output.setText("Mouse Enter");
				break;
			case SWT.MouseExit:
				output.setText("Mouse Exit");
				break;
			}
		}
	};

	Ch4_MouseKey(Composite parent) {
		super(parent, SWT.NULL);
		Button typed = new Button(this, SWT.PUSH);
		typed.setText("Typed");
		typed.setLocation(2, 10);
		typed.pack();
		typed.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				keyHandler();
			}
		});
		Button untyped = new Button(this, SWT.PUSH);
		untyped.setText("Untyped");
		untyped.setLocation(80, 10);
		untyped.pack();
		untyped.addListener(SWT.MouseEnter, UntypedListener);
		untyped.addListener(SWT.MouseExit, UntypedListener);
		output = new Label(this, SWT.SHADOW_OUT);
		output.setBounds(40, 70, 90, 40);
		output.setText("No Event");
		pack();
	}

	void keyHandler() {
		output.setText("Key Event");
	}
}
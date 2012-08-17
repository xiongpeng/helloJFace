package com.swtjface.Ch4;

import org.eclipse.jface.action.*;
import org.eclipse.jface.resource.*;

public class Ch4_StatusAction extends Action {
	StatusLineManager statman;
	short triggercount = 0;
	public Ch4_StatusAction(StatusLineManager sm) {
		super("&Trigger@Ctrl+T", AS_PUSH_BUTTON);
		statman = sm;
		setToolTipText("Trigger the Action");
		setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(),
				"a.gif"));
	}

	public void run() {
		triggercount++;
		statman.setMessage("The status action has fired. Count: "
				+ triggercount);
	}
}

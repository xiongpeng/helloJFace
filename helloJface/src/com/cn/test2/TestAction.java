package com.cn.test2;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.events.HelpEvent;
import org.eclipse.swt.events.HelpListener;

public class TestAction extends Action{

	
//	StatusLineManager statman;
//	short triggercount = 0;
//	public Ch4_StatusAction(StatusLineManager sm) {
//		super("&Trigger@Ctrl+T", AS_PUSH_BUTTON);
//		statman = sm;
//		setToolTipText("Trigger the Action");
//		setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(),
//				"a.gif"));
//	}
//
//	public void run() {
//		triggercount++;
//		statman.setMessage("The status action has fired. Count: "
//				+ triggercount);
//	}
	short temp = 0;
	StatusLineManager statman;
	public TestAction(StatusLineManager sm){
		super("aaa", AS_PUSH_BUTTON);
		statman = sm;
		this.setToolTipText("Hello ereryone!!!");
		this.setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(),"a.gif"));
		this.setHelpListener(new HelpListener() {
			
			public void helpRequested(HelpEvent e) {
				
			}
		});
	}
	@Override
	public void run() {
		temp++;
		statman.setMessage("The status action has fired. Count£º"+temp);
		super.run();
	}

	
}

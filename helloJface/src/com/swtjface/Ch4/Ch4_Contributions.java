package com.swtjface.Ch4;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.window.*;
import org.eclipse.jface.action.*;

public class Ch4_Contributions extends ApplicationWindow {
	StatusLineManager slm = new StatusLineManager();
	Ch4_StatusAction status_action = new Ch4_StatusAction(slm);
	ActionContributionItem aci = new ActionContributionItem(status_action);

	public Ch4_Contributions() {
		super(null);
		addStatusLine();
		addMenuBar();
		addToolBar(SWT.FLAT | SWT.WRAP);
	}

	protected Control createContents(Composite parent) {
		getShell().setText("Action/Contribution Example");
		parent.setSize(290, 150);
		aci.fill(parent);
		return parent;
	}   

	public static void main(String[] args) {
		Ch4_Contributions swin = new Ch4_Contributions();
		swin.setBlockOnOpen(true);
		swin.open();
		Display.getCurrent().dispose();
	}

	protected MenuManager createMenuManager() {
		MenuManager main_menu = new MenuManager(null);
		MenuManager action_menu = new MenuManager("Menu");
		main_menu.add(action_menu);
		action_menu.add(status_action);
		return main_menu;
	}

	protected ToolBarManager createToolBarManager(int style) {
		ToolBarManager tool_bar_manager = new ToolBarManager(style);
		tool_bar_manager.add(status_action);
		return tool_bar_manager;
	}

	protected StatusLineManager createStatusLineManager() {
		return slm;
	}
}
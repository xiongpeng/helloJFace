package com.cn.test2;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class TestDemo extends ApplicationWindow{
	StatusLineManager slm = new StatusLineManager();
	TestAction action = new TestAction(slm);
	ActionContributionItem actionItem= new ActionContributionItem(action);
	public TestDemo() {
		super(null);
		addStatusLine();
		addMenuBar();
		addToolBar(SWT.FLAT | SWT.WRAP);
	}

	protected Control createContents(Composite parent){
		getShell().setText("My Test Jface Action");
		parent.setSize(300, 200);
		actionItem.fill(parent);
		return parent;
	}
	
	protected MenuManager createMenuManager() {
		MenuManager mainMenu = new MenuManager(null);
		MenuManager actionMenu = new MenuManager("Menu");
		mainMenu.add(actionMenu);
		actionMenu.add(action);
		return mainMenu;
	}

	
	protected ToolBarManager createToolBarManager(int style) {
		ToolBarManager tool_bar_manager = new ToolBarManager(style);
		tool_bar_manager.add(action);
		return tool_bar_manager;
	}
	
	public static void main(String[] args) {
		TestDemo demo = new TestDemo();
		demo.setBlockOnOpen(true);
		demo.open();
		Display.getCurrent().dispose();
		
	}
	
	protected StatusLineManager createStatusLineManager() {
		return slm;
	}

}

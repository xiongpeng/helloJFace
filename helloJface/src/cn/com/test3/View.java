package cn.com.test3;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class View extends ApplicationWindow {

	public View() {
		super(null);
	}

	public static void main(String[] args) {
		View view = new View();
		view.setBlockOnOpen(true);
		view.open();
		Display.getCurrent().dispose();
		
	}

	protected Control createContents(Composite parent) {
//		TabFolder tabFold = new TabFolder(parent, SWT.NONE);
//		
//		TabItem tabItem = new TabItem(tabFold,SWT.NONE);
//		tabItem.setText("JFace中的树");
		TreeViewer treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new TodoContentProvider());
		treeViewer.setLabelProvider(new TodoLabelProvider());
		treeViewer.setAutoExpandLevel(2);// 展开树
		treeViewer.setInput(new TodoMockModel());
		parent.pack();
		return parent;
	}
}

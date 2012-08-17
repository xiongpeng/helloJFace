package cn.com.test3;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
/*
 * 创建TodoContentProvider类实现ITreeContentProvider接口：
 */
//public class TodoContentProvider implements ITreeContentProvider {
//	private TodoMockModel model;
//
//	public void dispose() {
//	}
//
//	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
//		this.model = (TodoMockModel) newInput;
//	}
//
//	public Object[] getElements(Object inputElement) {
//		return model.getCategories().toArray();
//	}
//
//	public Object[] getChildren(Object parentElement) {
//		if (parentElement instanceof Category) {
//			Category category = (Category) parentElement;
//			return category.getTodos().toArray();
//		}
//		return null;
//	}
//
//	public Object getParent(Object element) {
//		return null;
//	}
//
//	public boolean hasChildren(Object element) {
//		if (element instanceof Category) {
//			return true;
//		}
//		return false;
//	}
//}

public class TodoContentProvider implements ITreeContentProvider{
private TodoMockModel model;
	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.model=(TodoMockModel) newInput;
	}

	public Object[] getElements(Object inputElement) {
		return model.getCategories().toArray();
	}

	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof Category){
			Category category = (Category) parentElement;
			return category.getTodos().toArray();
		}
		return null;
	}

	public Object getParent(Object element) {
		return null;
	}

	public boolean hasChildren(Object element) {
		if(element instanceof Category){
			return true;
		}
		return false;
	}
	
}

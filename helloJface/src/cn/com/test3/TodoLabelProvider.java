package cn.com.test3;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

//public class TodoLabelProvider extends LabelProvider {
//	public String getText(Object element) {
//		if (element instanceof Category) {
//			Category category = (Category) element;
//			return category.getName();
//		}
//		return ((Todo) element).getSummary();
//	}
//
//	public Image getImage(Object element) {
//		return null;
//	}
//}

public class TodoLabelProvider extends LabelProvider{

	public Image getImage(Object element) {
		return null;
		
	}

	public String getText(Object element) {
		if(element instanceof Category){
			Category category = (Category) element;
			return category.getName();
		}
		return ((Todo) element).getSummary();
	}
	
}
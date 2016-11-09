package com.spring;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.List;

public class ListEditor extends PropertyEditorSupport{
	@SuppressWarnings("unchecked")
	public void setAsText(String txt){
		String str[]=txt.split(",");
		List list=Arrays.asList(str);
		this.setValue(list);
	}
}

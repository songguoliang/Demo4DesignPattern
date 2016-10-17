package com.songguoliang.designpattern.decorator.demo03;

public class Decorator extends Component{
	private Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if(component!=null){
			component.operation();
		}
	}

}


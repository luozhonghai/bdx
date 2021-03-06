package com.nilunder.bdx;

import com.nilunder.bdx.utils.Named;

public class Component implements Named {

	public State state;
	protected GameObject g;
	
	public Component(GameObject g){
		this.g = g;
	}

	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}
}

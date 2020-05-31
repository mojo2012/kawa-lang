package io.spotnext.kawa.lang.nodes;

import com.oracle.truffle.api.nodes.Node;

import io.spotnext.kawa.lang.runtime.MemberVisibility;

public abstract class MemberNode extends Node {

	protected final String name;
	protected MemberVisibility visibility;

	public MemberNode(String memberName) {
		this.name = memberName;
	}

	public String getName() {
		return this.name;
	}

	public MemberVisibility getVisibility() {
		return visibility;
	}
}
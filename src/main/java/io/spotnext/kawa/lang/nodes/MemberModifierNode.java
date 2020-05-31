package io.spotnext.kawa.lang.nodes;

import com.oracle.truffle.api.nodes.Node;

public class MemberModifierNode extends Node {
	protected String name;

	public MemberModifierNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
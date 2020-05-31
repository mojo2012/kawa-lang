package io.spotnext.kawa.lang.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MethodArgumentNode extends ExpressionNode {

	protected final int index;

	public MethodArgumentNode(int index) {
		this.index = index;
	}

	@Override
	public Object executeGeneric(VirtualFrame frame) {
		return frame.getArguments()[index];
	}
}
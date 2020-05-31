package io.spotnext.kawa.lang.nodes;

import java.util.List;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MethodInvocationNode extends StatementNode {

	private String methodName;
	@Children private MethodArgumentNode[] arguments;

	public MethodInvocationNode(String methodName, List<MethodArgumentNode> arguments) {
		this.methodName = methodName;
		this.arguments = arguments.toArray(new MethodArgumentNode[0]);
	}

	@Override
	public boolean isInstrumentable() {
		return true;
	}

	@Override
	public void executeVoid(VirtualFrame frame) {
		final var arg = arguments[0].executeGeneric(frame);
		System.out.println("TEST");
	}
	
}
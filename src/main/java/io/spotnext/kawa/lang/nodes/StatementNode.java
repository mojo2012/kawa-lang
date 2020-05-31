package io.spotnext.kawa.lang.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.instrumentation.InstrumentableNode;
import com.oracle.truffle.api.instrumentation.ProbeNode;
import com.oracle.truffle.api.nodes.Node;

public abstract class StatementNode extends Node implements InstrumentableNode {

	public StatementNode() {
	}

	// public Object execute(VirtualFrame frame) {
	// 	System.out.println("Method invoked");
	// 	return null;
	// }

	/**
	 * Execute this node as as statement, where no return value is necessary.
	 */
	public abstract void executeVoid(VirtualFrame frame);

	@Override
	public boolean isInstrumentable() {
		return true;
	}

	@Override
	public WrapperNode createWrapper(ProbeNode probe) {
		return null;
	}

}
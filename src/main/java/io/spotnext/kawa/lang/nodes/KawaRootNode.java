package io.spotnext.kawa.lang.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

import io.spotnext.kawa.KawaLanguage;

public class KawaRootNode extends RootNode {

	private MethodNode mainMethod;

	public KawaRootNode(KawaLanguage language, MethodNode mainMethod) {
		super(language);
		this.mainMethod = mainMethod;
	}

	@Override
	public Object execute(VirtualFrame frame) {
		return this.mainMethod.execute(frame);
	}

	@Override
	public String getName() {
		return mainMethod.getName();
	}

	@Override
	public boolean isCloningAllowed() {
		return true;
	}
}
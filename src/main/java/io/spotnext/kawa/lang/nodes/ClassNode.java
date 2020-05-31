package io.spotnext.kawa.lang.nodes;

import java.util.List;

public class ClassNode extends TypeNode {

	public ClassNode(String typeName, String packageName, List<ImportStatementNode> imports, List<MethodNode> methods) {
		super(typeName, packageName, imports, methods);
	}

	// public void execute(VirtualFrame frame) {

	// }

}
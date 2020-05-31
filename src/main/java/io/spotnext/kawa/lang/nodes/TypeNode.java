package io.spotnext.kawa.lang.nodes;

import java.util.List;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class TypeNode extends Node {

	@Children
	private ImportStatementNode[] imports;
	private String packageName;
	private String typeName;

	@Children
	private FieldNode[] fields;

	@Children
	private MethodNode[] methods;

	public TypeNode(String typeName, String packageName, List<ImportStatementNode> imports, List<MethodNode> methods) {
		this.typeName = typeName;
		this.packageName = packageName;
		this.imports = imports.toArray(new ImportStatementNode[0]);
		this.methods = methods.toArray(new MethodNode[0]);
	}

	public void execute(VirtualFrame frame) {

	}

	/**
	 * @return String return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * @return String return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
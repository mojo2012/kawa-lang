package io.spotnext.kawa.lang.nodes;

import com.oracle.truffle.api.nodes.Node;

public class ImportStatementNode extends Node {
	private String fullyQualifiedName;
	private String fullyQualifiedMethodName;
	private String alias;

	public ImportStatementNode(String fullyQualifiedName, String fullyQualifiedMethodName, String alias) {
		this.fullyQualifiedName = fullyQualifiedName;
		this.fullyQualifiedMethodName = fullyQualifiedMethodName;
		this.alias = alias;
	}

	public boolean isTypeImport() {
		return fullyQualifiedMethodName == null;
	}

	public boolean isStaticMethodImport() {
		return fullyQualifiedMethodName != null;
	}

	/**
	 * @return String return the fullyQualifiedName
	 */
	public String getFullyQualifiedName() {
		return fullyQualifiedName;
	}

	/**
	 * @param fullyQualifiedName the fullyQualifiedName to set
	 */
	public void setFullyQualifiedName(String fullyQualifiedName) {
		this.fullyQualifiedName = fullyQualifiedName;
	}

	/**
	 * @return String return the fullyQualifiedMethodName
	 */
	public String getFullyQualifiedMethodName() {
		return fullyQualifiedMethodName;
	}

	/**
	 * @param fullyQualifiedMethodName the fullyQualifiedMethodName to set
	 */
	public void setFullyQualifiedMethodName(String fullyQualifiedMethodName) {
		this.fullyQualifiedMethodName = fullyQualifiedMethodName;
	}

	/**
	 * @return String return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

}
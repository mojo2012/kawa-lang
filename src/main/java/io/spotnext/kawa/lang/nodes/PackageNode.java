package io.spotnext.kawa.lang.nodes;

public class PackageNode {
	private String name;

	public PackageNode(String name) {
		this.name = name;
	}

	/**
	 * @return String return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
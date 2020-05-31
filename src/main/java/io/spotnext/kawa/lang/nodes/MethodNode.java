package io.spotnext.kawa.lang.nodes;

import java.util.List;

import com.oracle.truffle.api.frame.VirtualFrame;

import io.spotnext.kawa.lang.runtime.KawaNull;
import io.spotnext.kawa.lang.runtime.MemberVisibility;

public class MethodNode extends MemberNode {

	@Children
	private MemberModifierNode[] modifiers;

	@Child
	private CodeBlockNode codeBlock;

	private boolean isStatic;

	public MethodNode(String memberName, List<MemberModifierNode> modifiers, CodeBlockNode codeBlock) {
		super(memberName);

		this.modifiers = modifiers.toArray(new MemberModifierNode[0]);
		this.codeBlock = codeBlock;

		for (var modifier : modifiers) {
			if ("@static".equals(modifier.getName())) {
				this.isStatic = true;
				continue;
			}

			if ("@public".equals(modifier.getName())) {
				this.visibility = MemberVisibility.PUBLIC;
			} else if ("@private".equals(modifier.getName())) {
				this.visibility = MemberVisibility.PRIVATE;
			} else {
				this.visibility = MemberVisibility.PROTECTED;
			}
		}
	}

	public Object execute(VirtualFrame frame) {
		this.codeBlock.executeVoid(frame);
		return KawaNull.SINGLETON;
	}

	/**
	 * @return MemberModifierNode[] return the modifiers
	 */
	public MemberModifierNode[] getModifiers() {
		return modifiers;
	}

	public boolean isStatic() {
		return isStatic;
	}

}
package io.spotnext.kawa.lang.nodes;

import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

import io.spotnext.kawa.KawaTypes;
import io.spotnext.kawa.KawaTypesGen;

/**
 * Base class for all SL nodes that produce a value and therefore benefit from
 * type specialization. The annotation {@link TypeSystemReference} specifies the
 * SL types. Specifying it here defines the type system for all subclasses.
 */
@TypeSystemReference(KawaTypes.class)
@NodeInfo(description = "The abstract base node for all expressions")
// @GenerateWrapper
public abstract class ExpressionNode extends StatementNode {

	// private boolean hasExpressionTag;

	/**
	 * The execute method when no specialization is possible. This is the most
	 * general case, therefore it must be provided by all subclasses.
	 */
	public abstract Object executeGeneric(VirtualFrame frame);

	/**
	 * When we use an expression at places where a {@link SLStatementNode statement}
	 * is already sufficient, the return value is just discarded.
	 */
	@Override
	public void executeVoid(VirtualFrame frame) {
		executeGeneric(frame);
	}

	// @Override
	// public WrapperNode createWrapper(ProbeNode probe) {
	// return new SLExpressionNodeWrapper(this, probe);
	// }

	// @Override
	// public boolean hasTag(Class<? extends Tag> tag) {
	// if (tag == StandardTags.ExpressionTag.class) {
	// return hasExpressionTag;
	// }
	// return super.hasTag(tag);
	// }

	// /**
	// * Marks this node as being a {@link StandardTags.ExpressionTag} for
	// instrumentation purposes.
	// */
	// public final void addExpressionTag() {
	// hasExpressionTag = true;
	// }

	/*
	 * Execute methods for specialized types. They all follow the same pattern: they
	 * call the generic execution method and then expect a result of their return
	 * type. Type-specialized subclasses overwrite the appropriate methods.
	 */
	public long executeLong(VirtualFrame frame) throws UnexpectedResultException {
		return KawaTypesGen.expectLong(executeGeneric(frame));
	}

	public boolean executeBoolean(VirtualFrame frame) throws UnexpectedResultException {
		return KawaTypesGen.expectBoolean(executeGeneric(frame));
	}

}

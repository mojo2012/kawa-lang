package io.spotnext.kawa.lang.nodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.BlockNode;
import com.oracle.truffle.api.nodes.BlockNode.ElementExecutor;
import com.oracle.truffle.api.nodes.ControlFlowException;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.Node;

public class CodeBlockNode extends Node implements BlockNode.ElementExecutor<StatementNode> {

	@Child
	private BlockNode<StatementNode> block;

	public CodeBlockNode(List<StatementNode> statements) {
		final var statementArray = statements.toArray(new StatementNode[0]);
		this.block = statements.size() > 0 ? BlockNode.create(statementArray, this) : null;
	}

	/**
	 * Execute all block statements. The block node makes sure that
	 * {@link ExplodeLoop full unrolling} of the loop is triggered during
	 * compilation. This allows the {@link SLStatementNode#executeVoid} method of
	 * all children to be inlined.
	 */
	public void executeVoid(VirtualFrame frame) {
		if (this.block != null) {
			this.block.executeVoid(frame, BlockNode.NO_ARGUMENT);
		}
	}

	public List<StatementNode> getStatements() {
		if (block == null) {
			return Collections.emptyList();
		}
		return Collections.unmodifiableList(Arrays.asList(block.getElements()));
	}

	/**
	 * Truffle nodes don't have a fixed execute signature. The
	 * {@link ElementExecutor} interface tells the framework how block element nodes
	 * should be executed. The executor allows to add a custom exception handler for
	 * each element, e.g. to handle a specific {@link ControlFlowException} or to
	 * pass a customizable argument, that allows implement startsWith semantics if
	 * needed. For SL we don't need to pass any argument as we just have plain block
	 * nodes, therefore we pass {@link BlockNode#NO_ARGUMENT}. In our case the
	 * executor does not need to remember any state so we reuse a singleton
	 * instance.
	 */
	public void executeVoid(VirtualFrame frame, StatementNode node, int index, int argument) {
		node.executeVoid(frame);
	}
}
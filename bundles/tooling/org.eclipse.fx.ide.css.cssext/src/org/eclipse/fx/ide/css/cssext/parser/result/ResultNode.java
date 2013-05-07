package org.eclipse.fx.ide.css.cssext.parser.result;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssext.parser.ParserInputCursor;
import org.eclipse.fx.ide.css.extapi.Proposal;

public class ResultNode {

	public ParserInputCursor remainingInput;
	public State status;
	
	final public NodeType nodeType;
	
	public CssTok matched;
	
	final public List<ResultNode> next = new ArrayList<>();
	
	public Proposal proposal;
	public String message;
	public boolean partial = false;
	
	public ResultNode(NodeType nodeType) {
		this.nodeType = nodeType;
	}
	
	@Override
	public String toString() {
		return status+"|"+remainingInput+"|"+proposal + "|" + partial + " (" + message +")";
	}
	
	public List<ResultNode> findLast() {
		List<ResultNode> last = new ArrayList<>();
		Queue<ResultNode> toCheck = new LinkedList<>();
		toCheck.add(this);
		while (!toCheck.isEmpty()) {
			ResultNode check = toCheck.poll();
			if (check.next.isEmpty()) {
				last.add(check);
			}
			else {
				toCheck.addAll(check.next);
			}
		}
		
//		System.err.println("findLast returns : " + last);
		return last;
	}
	
	public List<ResultNode> findByState(State state) {
		List<ResultNode> found = new ArrayList<>();
		Queue<ResultNode> toCheck = new LinkedList<>();
		toCheck.add(this);
		while (!toCheck.isEmpty()) {
			ResultNode check = toCheck.poll();
			if (!check.next.isEmpty()) {
				toCheck.addAll(check.next);
			}
			
			if (check.status == state) {
				found.add(check);
			}
		}
		
//		System.err.println("findLast returns : " + last);
		return found;
	}
	
	
	public boolean isValid() {
		return status != null && status != State.INVALID && status != State.PROPOSE;
	}
	
	public static ResultNode createSkipNode(ResultNode src) {
		ResultNode r = new ResultNode(src.nodeType);
		r.status = State.SKIP;
		r.remainingInput = src.remainingInput.copy();
		return r;
	}
	
	private static void dbg(ResultNode cur, int depth, StringBuffer s) {
		final String last = "-->";
		boolean lastMode = false;
		if (cur.next.isEmpty()) {
			lastMode = true;
		}
		for (int i = 0; i < depth; i++) {
			if (lastMode) {
				if (i < last.length()) {
					s.append(last.charAt(i));
				}
				else {
					s.append(" ");
				}
			}
			else {
				s.append(" ");
			}
		}
		s.append("(");
		s.append(cur.nodeType);
		s.append(") ");
		s.append(" ");
		s.append(cur.status);
		s.append(" ");
		switch (cur.status) {
		case PROPOSE: s.append(cur.proposal);
		break;
		case INVALID: s.append(cur.message);
		break;
		default: s.append(cur.remainingInput);
		}
		s.append("\n");
		for (ResultNode n : cur.next) {
			dbg(n, depth+1, s);
		}
	}
	
	public static void dbg(ResultNode node) {
		StringBuffer buf = new StringBuffer();
		dbg(node, 0, buf);
		System.err.println(buf.toString());
	}
}

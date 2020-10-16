package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.Or;

/**
 * Or Introduction [∨I]: A, so A∨B OR A, so B∨A
 * Left = True, Right = False
 * @author harper
 *
 */
public class OrIntroduction implements Rule {
	
	private Rule top;
	private Proposition added;
	private Or result;
	private boolean isLeft;

	public OrIntroduction(Rule top, Proposition added, boolean isLeft) {
		this.top = top;
		this.added = added;
		if(isLeft) {
			this.result = new Or(top.getResult(),added);
		}
		else {
			this.result = new Or(added,top.getResult());
		}
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer[{[\\lor I]}]{"+result.LaTeXPrint()+"}{"+top.LaTeXPrint()+"}";
	}

	@Override
	public String JavaPrint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proposition getResult() {
		return result;
	}

}

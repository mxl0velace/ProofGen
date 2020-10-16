/**
 * 
 */
package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.And;

/**
 * And Introduction rule [∧I]: A,B, therefore A∧B
 * @author harper
 *
 */
public class AndIntroduction implements Rule {
	
	private Rule left;
	private Rule right;
	private Proposition result;

	public AndIntroduction(Rule left, Rule right) {
		this.left = left;
		this.right = right;
		this.result = new And(left.getResult(), right.getResult());
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer[{[\\land I]}]{"+result.LaTeXPrint()+"}{"+left.LaTeXPrint()+"&"+right.LaTeXPrint()+"}";
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

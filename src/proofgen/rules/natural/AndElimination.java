package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.And;
import proofgen.rules.InvalidPropositionException;

/**
 * And Elimination [∧E]: A∧B, so A OR A∧B, so B.
 * Left = True, Right = False
 * @author harper
 *
 */
public class AndElimination implements Rule {
	
	private Rule rule;
	private Proposition result;
	private boolean isLeft;

	public AndElimination(Rule rule, boolean isLeft) throws InvalidPropositionException {
		if(!(rule.getResult() instanceof And)) {
			throw new InvalidPropositionException();
		}
		
		And andProp = (And) rule.getResult();
		
		if(isLeft) {
			result = andProp.getLeft();
		} else {
			result = andProp.getRight();
		}
		
		this.isLeft = isLeft;
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer[{[\\land E_"+ (isLeft ? "L" : "R") +"]}]{"+result.LaTeXPrint()+"}{"+rule.LaTeXPrint()+"}";
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

package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.False;
import proofgen.propositions.Not;
import proofgen.rules.InvalidPropositionException;

/**
 * Negation Elimination [¬E]: A, ¬A, therefore ⊥
 * @author harper
 *
 */
public class NegationElimination implements Rule {
	
	public Rule clear;
	public Rule not;
	public False result;

	public NegationElimination(Rule clear, Rule not) throws InvalidPropositionException {
		if(!(new Not(clear.getResult()).equals(not.getResult()))) {
			throw new InvalidPropositionException();
		}
		
		this.clear = clear;
		this.not = not;
		this.result = new False();
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer[{[\\lnot E]}]{"+result.LaTeXPrint()+"}{"+clear.LaTeXPrint()+"&"+not.LaTeXPrint()+"}";
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

package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.False;
import proofgen.rules.InvalidPropositionException;

/**
 * False Elimination: As ⊥ is proven, we are in an impossible state, so anything can be stated as true
 * @author harper
 *
 */
public class FalseElimination implements Rule {
	
	private Rule falseRule;
	private Proposition result;

	public FalseElimination(Rule falseRule, Proposition newProposition) throws InvalidPropositionException {
		if(!(falseRule.getResult() instanceof False)){
			throw new InvalidPropositionException();
		}
		
		this.falseRule = falseRule;
		this.result = newProposition;
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer[{[\\bot E]}]{"+result.LaTeXPrint()+"}{"+falseRule.LaTeXPrint()+"}";

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

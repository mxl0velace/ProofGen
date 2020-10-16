package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.False;
import proofgen.propositions.Not;
import proofgen.rules.InvalidPropositionException;

/**
 * Negation Introduction [¬I]: Assume A, prove ⊥, shows that ¬A
 * @author harper
 *
 */
public class NegationIntroduction implements Rule {
	
	private Rule rule;
	private Assumption assumption;
	private Not result;

	public NegationIntroduction(Assumption assumption, Rule rule) throws InvalidPropositionException {
		if(!(rule.getResult() instanceof False)) {
			throw new InvalidPropositionException();
		}
		
		this.assumption = assumption;
		result = new Not(assumption.getResult());
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer["+assumption.getNumber()+"{[\\lnot I]}]{"+result.LaTeXPrint()+"}{"+rule.LaTeXPrint()+"}";
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

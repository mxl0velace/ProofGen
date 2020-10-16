package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.Implies;
import proofgen.rules.InvalidPropositionException;

/**
 * Implication Elimination rule [→E]: A→B, A, therefore B
 * @author harper
 *
 */
public class ImplicationElimination implements Rule {
	
	private Rule implication;
	private Rule rule;
	private Proposition result;

	public ImplicationElimination(Rule implication, Rule rule) throws InvalidPropositionException {
		if(!(implication.getResult() instanceof Implies)) { //This feels non-java, find a better way
			throw new InvalidPropositionException();
		}
		Implies impProp = (Implies) implication.getResult();
		if(!(impProp.getLeft().equals(rule.getResult()))) {
			throw new InvalidPropositionException();
		}
		this.implication = implication;
		this.rule = rule;
		result = impProp.getRight();
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer[{[\\rightarrow E]}]{"+result.LaTeXPrint()+"}{"+implication.LaTeXPrint()+"&"+rule.LaTeXPrint()+"}";
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

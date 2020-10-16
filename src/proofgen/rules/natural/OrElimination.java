package proofgen.rules.natural;

import proofgen.Proposition;
import proofgen.Rule;
import proofgen.propositions.Implies;
import proofgen.propositions.Or;
import proofgen.rules.InvalidPropositionException;

/**
 * Or Elimination [∨E]: A∨B, A→C, B→C, therefore C
 * @author harper
 *
 */
public class OrElimination implements Rule {
	
	private Rule or;
	private Rule leftImplication;
	private Rule rightImplication;
	private Proposition result;

	public OrElimination(Rule or, Rule leftImplication, Rule rightImplication) throws InvalidPropositionException {
		if(!(or.getResult() instanceof Or)) {
			throw new InvalidPropositionException();
		}
		if(!(leftImplication.getResult() instanceof Implies)) {
			throw new InvalidPropositionException();
		}
		if(!(rightImplication.getResult() instanceof Implies)) {
			throw new InvalidPropositionException();
		}
		
		Or orProp = (Or) or.getResult();
		Implies leftImp = (Implies) leftImplication.getResult();
		Implies rightImp = (Implies) rightImplication.getResult();
		
		if(!(orProp.getLeft().equals(leftImp.getLeft()))) {
			throw new InvalidPropositionException();
		}
		if(!(orProp.getRight().equals(rightImp.getLeft()))) {
			throw new InvalidPropositionException();
		}
		if(!(leftImp.getRight().equals(rightImp.getRight()))) {
			throw new InvalidPropositionException();
		}
		
		this.or = or;
		this.leftImplication = leftImplication;
		this.rightImplication = rightImplication;
		this.result = leftImp.getRight();
				
	}

	@Override
	public String LaTeXPrint() {
		return "\\infer[{[\\lor E]}]{"+result.LaTeXPrint()+"}{"+or.LaTeXPrint()+"&"+leftImplication.LaTeXPrint()+"&"+rightImplication.LaTeXPrint()+"}";
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

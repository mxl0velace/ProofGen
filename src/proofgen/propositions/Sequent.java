package proofgen.propositions;

import java.util.Arrays;

import proofgen.Proposition;

/**
 * Sequent: accepts a list of premises which result in a conclusion. Only used in sequent calculus.
 * @author harper
 *
 */
public class Sequent implements Proposition {
	
	private Proposition[] premises;
	private Proposition conclusion;

	public Sequent(Proposition[] premises, Proposition conclusion) {
		this.premises = premises;
		this.conclusion = conclusion;
	}

	@Override
	public String LaTeXPrint() {
		StringBuilder sb = new StringBuilder();
		for(Proposition p : premises) {
			sb.append(p.LaTeXPrint() + ", ");
		}
		
		sb.deleteCharAt(sb.length()-2);
		sb.append("\\vdash ");
		sb.append(conclusion.LaTeXPrint());
		
		return sb.toString();
		
	}

	@Override
	public String JavaPrint() {
		StringBuilder sb = new StringBuilder();
		for(Proposition p : premises) {
			sb.append(p.JavaPrint() + ", ");
		}
		
		sb.deleteCharAt(sb.length()-2);
		sb.append("⊢ ");
		sb.append(conclusion.JavaPrint());
		
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof Sequent)) {
			return false;
		}
		
		Sequent a = (Sequent) o;
		
		return(Arrays.equals(premises, a.premises) && conclusion.equals(a.conclusion));
		
	}

}

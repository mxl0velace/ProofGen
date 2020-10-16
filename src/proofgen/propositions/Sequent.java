package proofgen.propositions;

import proofgen.Proposition;

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

}

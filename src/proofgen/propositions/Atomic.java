package proofgen.propositions;

import proofgen.Proposition;

public class Atomic implements Proposition {
	
	private String name;
	
	public Atomic(String name) {
		this.name = name;
	}

	@Override
	public String LaTeXPrint() {
		return name;
	}

	@Override
	public String JavaPrint() {
		return name;
	}

}

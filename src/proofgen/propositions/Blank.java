package proofgen.propositions;

import proofgen.Proposition;

/**
 * A blank proposition class, to be used as a placeholder before propositions are added.
 * @author harper
 *
 */
public class Blank implements Proposition {

	public Blank() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String LaTeXPrint() {
		return "";
	}

	@Override
	public String JavaPrint() {
		return "";
	}

}

package proofgen.propositions;

import proofgen.Proposition;

/**
 * Atomic proposition: A
 * @author harper
 *
 */
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
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof Atomic)) {
			return false;
		}
		
		Atomic a = (Atomic) o;
		
		return(name.equals(a.name));
		
	}

}

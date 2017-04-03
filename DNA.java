package dna;

public class DNA {
	private String id;
	private String sequence;
	
	public DNA(String id, String sequence){
		this.id = id;
		this.sequence = sequence;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getsequence() {
		return sequence;
	}

	public void setsequence(String sequence) {
		this.sequence = sequence;
	}

}

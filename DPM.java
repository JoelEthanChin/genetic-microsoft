package dna;

public class DPM {
	private double globalScore;
	private DNA dna1;
	private DNA dna2;
	private Matrix M1;
	
	public DPM(String name1, String name2, String id1, String id2){
		this.dna1 = new DNA(id1, name1);
		this.dna2 = new DNA(id2, name2);
		if(name1.length() > name2.length())
			this.M1 = new Matrix<Integer>(name1.length(), name2.length());
		else
			this.M1 = new Matrix<Integer>(name2.length(), name1.length());
			
	}

}

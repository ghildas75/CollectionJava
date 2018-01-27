package cg.godin.ca;

public class Ex2Word {

	private String word;
	private int numOcc;
	public Ex2Word(String word, int numOcc) {
		super();
		this.word = word;
		this.numOcc = numOcc;
	}
	@Override
	public String toString() {
		return "Ex2Word [word=" + word + ", numOcc=" + numOcc + "]";
	}
	private String getWord() {
		return word;
	}
	private void setWord(String word) {
		this.word = word;
	}
	private int getNumOcc() {
		return numOcc;
	}
	private void setNumOcc(int numOcc) {
		this.numOcc = numOcc;
	}
	
}

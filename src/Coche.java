
public class Coche {
	private String matricula;
	private int kms;

	public Coche(String matricula, int kms) {
		super();
		this.matricula = matricula;
		this.kms = kms;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", kms=" + kms + "]";
	}
}

package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionLineal implements Ecuacion {

	private Double b;
	private Double m;

	public EcuacionLineal(Double m, Double b) throws RuntimeException {
		if (m != null && b != null) {
			this.m = m;
			this.b = b;
		} else {
			throw new RuntimeException("No implementado");
		}
	}

	public Double resolver(Double x) {

		if (x != null) {

			return this.m * x + this.b;

		} else {
			throw new RuntimeException("No implementado");

		}

	}

}

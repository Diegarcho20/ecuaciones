package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionCuadratica implements Ecuacion {

	private Double a;
	private Double b;
	private Double c;

	public EcuacionCuadratica(Double a, Double b, Double c)
			throws RuntimeException {
		if (a != null && b != null && c != null) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			throw new RuntimeException("No implementado");
		}
	}

	public Double resolver(Double x) throws RuntimeException {
		if (x != null) {
			Double y = (this.a.doubleValue() * Math.pow(x.doubleValue(), 2))
					+ this.b.doubleValue() * x.doubleValue()
					+ this.c.doubleValue();
			return y.doubleValue();
		} else {
			throw new RuntimeException("No implementado");
		}
	}
}
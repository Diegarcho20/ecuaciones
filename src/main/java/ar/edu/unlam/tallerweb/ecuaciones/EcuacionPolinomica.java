package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.LinkedList;
import java.util.List;

public class EcuacionPolinomica implements Ecuacion {

	private List<Double> coeficientes = new LinkedList<Double>();

	public EcuacionPolinomica(List<Double> lista) throws RuntimeException {
		if (lista != null) {
			this.coeficientes = lista;
		} else {
			throw new RuntimeException("No implementado");
		}
	}

	public Double resolver(Double x) {
		if (x != null) {
			Double suma = 0.0;
			for (int i = 0; i < this.coeficientes.size(); i++) {
				suma = suma.doubleValue() + (coeficientes.get(i).doubleValue() * Math.pow(x.doubleValue(), i));
			}
			return suma.doubleValue();

		} else {
			throw new RuntimeException("No implementado");
		}
	}

}

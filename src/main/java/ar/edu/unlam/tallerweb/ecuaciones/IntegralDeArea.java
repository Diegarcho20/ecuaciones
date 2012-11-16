package ar.edu.unlam.tallerweb.ecuaciones;

public class IntegralDeArea {

	public Double calcular(Ecuacion ecuacion, Double inicio, Double fin,
			Double incremento) {
		if (ecuacion != null && inicio != null && fin != null && incremento != null) {
			Double resultado = 0.0;
			Double x = 0.0;
			Double medioIncremento = (incremento.doubleValue() / 2);
			Double cantR = (fin.doubleValue() - inicio.doubleValue()) / incremento.doubleValue();
			for (int i = 0; i < cantR.doubleValue(); i++) {
				x = inicio.doubleValue() + (i * incremento.doubleValue());
				resultado = resultado.doubleValue() + (ecuacion.resolver(x + medioIncremento));
			}
			return Math.abs((resultado.doubleValue() * incremento.doubleValue()));
		} else {
			throw new RuntimeException("No implementado");
		}

	}

}
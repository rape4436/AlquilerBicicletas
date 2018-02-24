package com.rances.util;

public enum TipoAlquiler {

	HORA(5), DIA(20), SEMANA(60);

	private final int tipo;

	TipoAlquiler(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}
}


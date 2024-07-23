package com.elias.gerenciador.classes.facetadora;

public abstract class FacetadoraAbstract {
	private Long id;
	private Double cr;
	private Double poly;
	private Double cristal;
	private String nome;
	private Boolean funcionando;

	public Double getTotalMontagemDia() {
		return null;
	}
	public Boolean verificarmanutencao() {
		return false;
	}
}

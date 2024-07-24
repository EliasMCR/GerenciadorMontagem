package com.elias.gerenciador.classes.facetadora;

import java.util.List;

public abstract class FacetadoraAbstract {
	private Long id;
	private Double cr;
	private Double poly;
	private Double cristal;
	private String nome;
	private Boolean funcionando;
	private List<RegistroManutencao> listaManutencao;

	public Double getTotalMontagemDia() {
		return null;
	}
	public Boolean verificarmanutencao() {
		return false;
	}
}

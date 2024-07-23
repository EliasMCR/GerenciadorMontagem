package com.elias.gerenciador.classes;

import java.util.List;

import com.elias.gerenciador.classes.colaborador.ColaboradorAbstract;
import com.elias.gerenciador.classes.facetadora.FacetadoraAbstract;
import com.elias.gerenciador.classes.facetadora.RegistroMontagem;

public class Laboratorio {
	private Long id;
	private String nome;
	private Endereco endereco;
	private List<FacetadoraAbstract> facetatora;
	private List<ColaboradorAbstract> funcionarioMontador;
	private List<RegistroMontagem> registroMontagem;
}

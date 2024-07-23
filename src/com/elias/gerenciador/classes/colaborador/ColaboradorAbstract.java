package com.elias.gerenciador.classes.colaborador;

import com.elias.gerenciador.classes.Laboratorio;

public abstract class ColaboradorAbstract {
	private Long id;
	private String nome;
	private Enum tipo;
	private String senha;
	private Laboratorio laboratorio;
}

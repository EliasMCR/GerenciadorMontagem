package com.elias.gerenciador.classes.facetadora;

import java.time.LocalDateTime;

import com.elias.gerenciador.classes.Laboratorio;
import com.elias.gerenciador.classes.LenteSalva;
import com.elias.gerenciador.classes.colaborador.ColaboradorAbstract;

public class RegistroMontagem {
	private Long id;
	private LocalDateTime dataRegistro;
	private ColaboradorAbstract colaboradorAbstract;
	private Laboratorio laboratorio;
	private Integer quebrasDoDia;
	private ColaboradorAbstract responsavelQuebra;
	private String motivoQuebra;
	private LenteSalva lenteSalva;
	private Boolean quebraMaquina;

	public Boolean calcularTotalMontagemDia() {
		return false;
	}
}

package br.com.alura.livraria.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

	private String nome;
	private String nacionalidade;
	private int anoNascimento;

}

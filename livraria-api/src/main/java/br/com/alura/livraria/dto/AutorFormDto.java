package br.com.alura.livraria.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorFormDto {

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 100)
	private String nome;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String nacionalidade;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 4)
	private int anoNascimento;

}

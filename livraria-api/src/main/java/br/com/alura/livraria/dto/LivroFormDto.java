package br.com.alura.livraria.dto;

import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class LivroFormDto {

	@NotNull
	@NotEmpty
	@Size(min = 10)
	private String titulo;

	@PastOrPresent
	private LocalDate lancamento;

	@Size(min = 100)
	private int paginas;

	private String autor;

}

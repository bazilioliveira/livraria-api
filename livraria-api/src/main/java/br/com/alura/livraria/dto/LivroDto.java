package br.com.alura.livraria.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class LivroDto {

	private String titulo;
	private LocalDate lancamento;
	private int paginas;
	private String autor;

}

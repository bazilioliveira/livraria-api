package br.com.alura.livraria.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
	
	private String titulo;
	private LocalDate lancamento;
	private int paginas;
	private String autor;

}

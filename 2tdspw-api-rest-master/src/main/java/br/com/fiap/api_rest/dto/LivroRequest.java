package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Categoria;
import jakarta.validation.constraints.*;

public class LivroRequest {
    @NotBlank(message = "O título não pode ser nulo ou vazio")
    @Size(min = 3, max = 254, message = "O título deve ter entre 3 e 254 caracteres")
    private String titulo;
    @NotBlank(message = "O nome do autor não pode ser nulo ou vazio")
    @Size(min = 3, max = 254, message = "O título deve ter entre 3 e 254 caracteres")
    private String autor;
    @Min(value = 1, message = "O preço dve ser no mínimo R$1")
    @Max(value = 99, message = "O preço deve ser no máximo R$99")
    private int preco;
    @NotNull(message="A categoria é obrigatória")
    private Categoria categoria;
    @Pattern(regexp = "^970\\d{10}$|^970\\d{7}$", message = "O ISBN deve ter 10 ou 13 dígitos e iniciar com 970")
    private String isbn;


    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

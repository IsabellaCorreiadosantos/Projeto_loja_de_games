package com.generation.lojadegames.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Digite o nome do produto é obrigatorio")
	@Size(min = 1, max = 100, message = "O nome do produto devera ter um minimo de 1 carectere e no maximo 100")
	@Column(length = 100)
	private String nome;
	
	@NotBlank(message = "descrição do produto é obrigatoria")
	@Size(min = 1, max = 200, message = "A descrição do produto devera ter no minimo de 1 carectere e no maximo 200")
	@Column(length = 100)
	private String descricao;
	
	@NotBlank(message = "digite qual console deseja")
	@Size(min = 1, max = 60, message = "O console deve ter no minimo de 1 carectere e no maximo 60")
	@Column(length = 100)
	private String console;
	
	@NotNull(message = "digite a quantidade de produtos que deseja")
	@Positive(message = "A quantidade deve ser maior que zero")
	private int quantidade;
	
	@NotBlank (message = "Insira uma foto para o seu produto!")
    private String foto;
	
	@NotNull (message = "Não é possível criar um produto sem o preço!")
    @Positive (message = "O valor do preço deve ser algo positivo!")
    private float preco;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
	
	
}



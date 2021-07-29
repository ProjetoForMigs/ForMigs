package br.com.generation.projetointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_temas")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "A descrição deve ser obrigatória! Preencha corretamente  ")
	@Size(min = 5, max = 255)
	private String descricao;
	
	@NotNull(message = "A palavra-chave deve ser obrigatória! Preencha corretamente  ")
	@Size(min = 5, max = 255)
	private String palavraChave;
	
	@NotNull(message = "A Hashtag o deve ser obrigatória! Preencha corretamente  ")
	@Size(min = 5, max = 255)
	private String hashtag;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	
	
}

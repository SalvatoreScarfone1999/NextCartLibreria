package it.nextre.nextcart.dto;

public class CategoriaDTO {

    private Long id;
    private String nome;
    private String percorsoImmagine;

    public CategoriaDTO(Long id, String nome, String percorsoImmagine) {
        this.id = id;
        this.nome = nome;
        this.percorsoImmagine = percorsoImmagine;
    }
    
    public CategoriaDTO() {
    	
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

	public String getPercorsoImmagine() {
		return percorsoImmagine;
	}

	public void setPercorsoImmagine(String percorsoImmagine) {
		this.percorsoImmagine = percorsoImmagine;
	}
    

    
    
}
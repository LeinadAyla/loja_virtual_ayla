package jdev.mentoria.lojavirtual.enums;

public enum StatusContaPagar {
	
	COBRANCA("Pagar"),
	VENCIDA("Vencida"),
	ABERTA("Aberta"),
	QUITADA("quitada"),
	NEGOCIADA("Renegociada");
	
	
	private String descricao;
	
	private StatusContaPagar(String descricao) {
		this.descricao = descricao;		
	}	
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {		
		return descricao;
	}
	
}

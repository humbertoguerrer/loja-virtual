package produto.model;

public class Produto {

	private Long id;
	private String descricao;
	private Integer quantidade;
	private Double preco;
	private boolean dispOnLine;

	public Produto() {
	}

	public Produto(String descricao, Integer quantidade, Double preco, boolean dispOnLine) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.dispOnLine = dispOnLine;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public boolean isDispOnLine() {
		return dispOnLine;
	}

	public void setDispOnLine(boolean dispOnLine) {
		this.dispOnLine = dispOnLine;
	}

}

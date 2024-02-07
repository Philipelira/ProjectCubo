package Farmacia;

public class Produtos {
	private String nomeProd, codProd, tipoProd;
	private String vlrProd;
	
	public Produtos(String nomeProd, String codProd, String tipoProd, String vlrProd) {
		this.nomeProd = nomeProd;
		this.codProd = codProd;
		this.tipoProd =tipoProd;
		this.vlrProd = vlrProd;
	}
	
	public void adicionarItem() {
	}
	
	
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public String getCodProd() {
		return codProd;
	}
	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}
	public String getTipoProd() {
		return tipoProd;
	}
	public void setTipoProd(String tipoProd) {
		this.tipoProd = tipoProd;
	}

	public String getVlrProd() {
		return vlrProd;
	}

	public void setVlrProd(String vlrProd) {
		this.vlrProd = vlrProd;
	}
	
	
	
}

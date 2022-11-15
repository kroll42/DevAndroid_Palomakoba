public class Comissionado extends  Empregado{
	private double brutoVendas;
	private double taxaComissao;
	
	public Comissionado() {
		super();
		this.brutoVendas = 0.0;
		this.taxaComissao = 0.0;
	}
	public Comissionado(String nome, String ndepto, double brutoVendas, double taxaComissao) {
		super(nome, ndepto);
		this.brutoVendas = brutoVendas;
		this.taxaComissao = taxaComissao;
	}
	public double getBrutoVendas() {
		return brutoVendas;
	}
	public void setBrutoVendas(double brutoVendas) {
		this.brutoVendas = brutoVendas;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	
	@Override
	public String toString() {
		return "Comissionado [brutoVendas=" + brutoVendas + ", taxaComissao=" + taxaComissao + "]";
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return this.brutoVendas * this.taxaComissao;
	}
	

}

/*Menu case '3'
case '3': nome = JOptionPane.showInputDialog(null, "Entre com o nome:");
					  nomedepto = JOptionPane.showInputDialog(null, "Entre com o nome do depto:");
					  vendasB = JOptionPane.showInputDialog(null, "Entre com o total das vendas:");
					  dvendasB = Double.parseDouble(vendasB);
					  taxaC = JOptionPane.showInputDialog(null, "Entre com a taxa da comissao:");
					  dtaxaC = Double.parseDouble(taxaC);
					  b = new Comissionado(nome, nomedepto, dvendasB, dtaxaC);
					  lista.add(b);
					  saida = b.toString()+String.format("Total da comissao: $ %.2f", b.calculaSalario());
					  JOptionPane.showMessageDialog(null, saida);
				      break;
*/

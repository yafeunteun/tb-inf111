package stock;

import java.util.Iterator;

import produit.Produit;

public class IterExterneTableau implements Iterator<Produit> {
	private int currIndex = 0;
	private StockTableau stockTableau;
	
	public IterExterneTableau(StockTableau stockTableau) {
		this.stockTableau = stockTableau;
	}

	@Override
	public boolean hasNext() {
		if (currIndex < stockTableau.size && stockTableau.content[currIndex] != null) {
			return true;
		}
		return false;
	}

	@Override
	public Produit next() {
		return stockTableau.content[currIndex++];
	}
	
}

package stock;

import java.util.LinkedList;

import produit.Produit;

public class StockListe extends Stock {

	protected LinkedList<Produit> content;
	int nbMax;

	public StockListe(int s) {
		if (s < 0) {
			s = 0;
		}
		content = new LinkedList<Produit>();
		nbMax = s;
	}


	@Override
	public void add(Produit p) throws ProduitNull, StockFull {
		// TODO Auto-generated method stub
		if(p == null)
			throw new ProduitNull();
		if(isFull())
			throw new StockFull();
		content.add(p);
		++size;

	}

	@Override
	public Produit remove() throws StockEmpty {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new StockEmpty();
		}
		--size;
		return content.removeLast();
	}

	@Override
	public boolean remove(Produit p) throws ProduitNull, StockEmpty {
		if(p==null)
            throw new ProduitNull();
         if(isEmpty())
            throw new StockEmpty();
         
         if(content.contains(p)) { /* Oblige à parcourir la liste 2 fois mais c'est plus lisible */
        	 content.remove(p);
        	 --size;
        	 return true;
         }
         return false;
      }

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size == nbMax;
	}

	@Override
	public Produit iemeElement(int i) {
		return content.get(i);
	}

}

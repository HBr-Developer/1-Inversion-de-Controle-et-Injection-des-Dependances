package metier;

import dao.Idao;

public class MetierImpl implements IMetier{
/* coupalge faible */
	private Idao dao = null;

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double d=dao.getData();
		double res=d*23;
		return res;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

}

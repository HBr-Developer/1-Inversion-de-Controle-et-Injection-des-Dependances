package ext;

import dao.Idao;

public class DaoImlV2 implements Idao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("version web service");
		double data=12;
		return data;
	}
	
}

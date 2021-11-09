package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.Idao;
import metier.IMetier;
import metier.MetierImpl;

public class Pres1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*injection des depandance par instanciation statique */
//		DaoImpl dao = new DaoImpl();
//		MetierImpl metier = new MetierImpl();
//		metier.setDao(dao);
//		System.out.print(metier.calcul());
		
		
//		try {
			Scanner scanner =new Scanner(new File("config.txt"));
			
			String daoClassName=scanner.nextLine();
		    Class cDao=Class.forName(daoClassName); //en charge les classes en memoir avecforName 
			Idao dao=(Idao)cDao.newInstance();//creer une instance d'une classe 
		    
			String metierClassName=scanner.nextLine();
			Class cMetier=Class.forName(metierClassName);
			IMetier metier=(IMetier)cMetier.newInstance();
			Method m=cMetier.getMethod("setDao", Idao.class);
			m.invoke(metier, dao);
			
			System.out.println(metier.calcul());
			//System.out.println(dao.getData());
			
			//System.out.println(daoClasssName);
//		}   
//		catch (FileNotFoundException  | ClassNotFoundException | InstantiationException | IllegalAccessException e)
//		{
//			e.printStackTrace();
//		}
		// catch (FileNotFoundException e)
		//		{
		//			e.printStackTrace();
		//		}
		// catch (ClassNotFoundException e)
		//		{
		//			e.printStackTrace();
		//		}
			
			//si vous voulez pas utiliser try catch on ajoute throws Exception 
		}

}

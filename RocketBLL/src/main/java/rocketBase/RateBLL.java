package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		ArrayList<RateDomainModel> R = RateDAL.getAllRates();
		
		
		
			for(int i = 0; i < R.size(); i++){
				if(R.get(i).getiMinCreditScore() <= GivenCreditScore){
					return(R.get(i).getdInterestRate());
				}
				}
			throw new RateException(null);
		}
		
		
		/**
		double r=0;
		for (int RDM = 0; RDM < 10; RDM++) {
			if (GivenCreditScore >= Rate.get(RDM).getiMinCreditScore()) {
				return Rate.get(RDM).getdInterestRate();
			} else		
			{
				return r;

		}
		}
		return r;
	}**/

		
		
		
		
		
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllR... this returns an array of R
		//		write the code that will search the R to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the R...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL

		

	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}

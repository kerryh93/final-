package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RateDomainModel RDM = new RateDomainModel();
	
	public RateException(RateDomainModel RDM){
		this.RDM = RDM;
	}
	
	public RateDomainModel getRDM(){
		return this.RDM;
	}

	
	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}

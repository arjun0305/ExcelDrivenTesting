package basicJava;

import interfaces.CentralTraffic;
import interfaces.ContinentalTraffic;

public class AustralianTrafic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		
		CentralTraffic at = new AustralianTrafic();
		at.redStop();
		at.flashYellow();
		at.greenGo();
		
		AustralianTrafic a =new AustralianTrafic();
		a.walkingSymbol();
		
		ContinentalTraffic c = new AustralianTrafic();
		c.walkSymbol();
		
	}

	public void walkingSymbol()
	{
		System.out.println("Walking sign");
	}
	
	@Override
	public void greenGo() {
		
		System.out.println("Signal is Green");
	}

	@Override
	public void redStop() {
		
		System.out.println("Signal is Red");
	}

	@Override
	public void flashYellow() {
		
		System.out.println("Signal is Yellow");
	}

	@Override
	public void walkSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Green Go Ahead");
	}

}

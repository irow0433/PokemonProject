package pokemon.model;

import pokemon.model.Flying;

public class Crobat extends Pokemon implements Flying
{
	public Crobat(int number, String name)
	{
		super(number, name);
	}
	

	public void Acrobatics() 
	{
		System.out.println("You have used the attack Frenzy Plant!");
	}
	
	public void AirSlash()
	{
		System.out.println("You have used the attack Giga Drain");
	}
	
	public void AirCutter()
	{
		System.out.print("You have choosen to use the attack Solar Beam");
	}
}

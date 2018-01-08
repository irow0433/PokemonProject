package pokemon.model;

import pokemon.model.Water;

public class Totodile extends Pokemon implements Water
{
	
	public Totodile(int number, String name)
	{
		super(number, name);
	}
	
	public void AquaJet()
	{
		System.out.println("You've choosen the attack AquaJet");
	}
	
	public void Dive()
	{
		System.out.println("You've choosen the attack Dive");
	}
	
	public void HydroVortex()
	{
		System.out.println("You've choosen the attack HydroVortex");
	}

}

package pokemon.model;

import pokemon.model.Flying;

public class Rowlet extends Pokemon implements Flying
{
	
	public Rowlet()
	{
		super(347, "Rowlet");
		setup();
	}
	
	public Rowlet(String name)
	{
		super(347, name);
		setup();
	}
	
	public Rowlet(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttacksPoints(245);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(134);
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

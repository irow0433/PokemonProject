package pokemon.model;

//import pokemon.model.Flying;

public class Dartrix extends Rowlet
{
	public Dartrix()
	{
		super(388, "Dartrix");
		setup();
	}
	
	public Dartrix(String name)
	{
		super(388, name);
		setup();
	}
	
	public Dartrix(int number, String name)
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
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(325);
	}

}

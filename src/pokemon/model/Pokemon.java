package pokemon.model;

public abstract class Pokemon 
{
	private int healthPoints;
	private int attacksPoints;
	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getAttacksPoints() {
		return attacksPoints;
	}

	public void setAttacksPoints(int attacksPoints) {
		this.attacksPoints = attacksPoints;
	}

	public double getEnhancementModifier() {
		return enhancementModifier;
	}

	public void setEnhancementModifier(double enhancementModifier) {
		this.enhancementModifier = enhancementModifier;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCanEvolve() {
		return canEvolve;
	}

	public void setCanEvolve(boolean canEvolve) {
		this.canEvolve = canEvolve;
	}

	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon(int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
	public final String[] getePokemonTypes()
	{
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		
		for(int index = 0; index < types.length; index++)
		{
			String currentInterface = types[index].getCanonicalName();
			String temp = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
			pokeTypes[index] = currentInterface;
		}
		
		return pokeTypes;
	}
	
	public String toString()
	{
		String description = "Hi, I am a" + name + ", and my HP is " + healthPoints;
		
		return description;
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
	

}

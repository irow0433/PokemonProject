package pokemon.controller;

import pokemon.model.*;
import java.util.List;
import java.util.ArrayList;
import pokemon.model.Crobat;
import pokemon.model.Dartrix;
import pokemon.model.MagiKarp;
import pokemon.model.Rowlet;
import pokemon.model.Squirtle;
import pokemon.model.Totodile;
import pokemon.view.PokemonFrame;

public class PokemonController 
{
	
	//public void start() {
		
	//}
	
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController() 
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		// "this" was in the () below for PokemonFrame
		appFrame = new PokemonFrame();
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Crobat());
		pokedex.add(new Dartrix());
		pokedex.add(new MagiKarp());
		pokedex.add(new Rowlet());
		pokedex.add(new Squirtle());
		pokedex.add(new Totodile());
		
		return pokedex;
	 
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			valid = false;
		}
		
		return valid;
	}
	
	public boolean isValidDouble(String input)

	{
		boolean valid = false;
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			valid = false;
		}
		
		return valid;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
				
		for (int index = 0; index< pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
			}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
	}
	}

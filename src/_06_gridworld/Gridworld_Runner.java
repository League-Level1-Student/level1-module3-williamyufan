package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld_Runner {
public static void main(String[] args) {
	World j=new World();
	j.show();
	Bug i=new Bug();
	Bug h=new Bug();
	Location p=new Location(9, 9);
	Random r=new Random();
	j.add(p, i);
	j.add(new Location(r.nextInt(9), r.nextInt(9)), h);
	i.setColor(new Color(1,6,8));
	i.turn();
	for (int k = 0; k < 98; k++) {
		j.add(j.getRandomEmptyLocation(), new Flower());
	}
	
	
	
	
	
}
}

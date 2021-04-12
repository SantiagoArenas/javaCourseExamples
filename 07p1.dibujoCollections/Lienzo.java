import java.awt.Canvas;
import java.awt.Graphics;

import java.util.Collection;
import java.util.ArrayList;


public class Lienzo extends Canvas
{
	private Collection<Figura> figuras = new ArrayList<Figura>();

	public void addFigura(Figura figura)
	{
		figuras.add(figura);
	}

	@Override
	public void paint(Graphics g)
	{
		for(Figura figura:figuras)
			figura.pintar(g);
	}
}
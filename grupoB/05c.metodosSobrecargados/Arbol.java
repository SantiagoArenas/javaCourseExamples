public class Arbol
{
	public static final int MADERA_MIN = 0;

	//atributos
	int maderaTotal;
	int maderaPorPico;

	Arbol(int maderaTotal, int maderaPorPico)
	{
		this.maderaTotal = maderaTotal;
		this.maderaPorPico = maderaPorPico;
	}


	//métodos
	int getMaderaTotal()
	{
		return maderaTotal;
	}

	void setMaderaTotal(int unaMadera)
	{
		maderaTotal = unaMadera;
	}

	int getMaderaPorPico()
	{
		return maderaPorPico;
	}

	void setMaderaPorPico(int unaMadera)
	{
		maderaPorPico = unaMadera;
	}	

	int recibirPico()
	{
		int maderaRestada = MADERA_MIN;
		
		if((maderaTotal - maderaPorPico) >= MADERA_MIN)
		{
			maderaTotal -= maderaPorPico;
			maderaRestada = maderaPorPico;
		}
		else
		{
			maderaTotal = MADERA_MIN;
			maderaRestada = maderaTotal;
		}

		return maderaRestada;
	}

	boolean isVivo()
	{
		if(maderaTotal > MADERA_MIN)
			return true;
		else
			return false;

		//return (madera>MADERA_MIN);
	}

	String getInfo()
	{
		return "Madera: " + maderaTotal + " Madera restada por pico: " + maderaPorPico;
	}
}
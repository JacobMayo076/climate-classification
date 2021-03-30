package climateclassification;

//import java.util.ArrayList;

public class Climate
{
	private Precipitation[] precip = new Precipitation[12];
	private Temperature[] temp = new Temperature[12];
	private final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	public Climate()
	{
		this.setYearlyPrecip(precip);
		this.setYearlyTemp(temp);
	}
	
	public Climate(Precipitation[] precip, Temperature[] temp)
	{
		this.setYearlyPrecip(precip);
		this.setYearlyTemp(temp);
	}
	
	public void setYearlyPrecip(Precipitation[] precip)
	{
		for (int i = 0; i < 12; i++)
		{
			this.precip[i].setPrecip(precip[i].getPrecip());
		}
	}
	
	public void setYearlyTemp(Temperature[] temp)
	{
		for (int i = 0; i < 12; i++)
		{
			this.temp[i].setTemp(temp[i].getTemp());
		}
	}
	
	public Precipitation[] getYearlyPrecipitation()
	{
		return this.precip;
	}
	
	public Temperature[] getYearlyTemp()
	{
		return this.temp;
	}
	//Unfinished, don't forget to add temp
	public String toString()
	{
		String toReturn = "";
		Precipitation tempPrecip = new Precipitation();
		
		for (int i = 0; i < 12; i++)
		{
			tempPrecip.setPrecip(this.precip[i].getPrecip());
			toReturn = months[i] + "'s Precipitation: " + tempPrecip.toString();
		}
		
		return toReturn;
	}
}

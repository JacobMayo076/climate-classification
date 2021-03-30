//Temperature is measured
//in degrees Celsius
package climateclassification;

public class Temperature
{
	private double temp;
	
	public Temperature()
	{
		this.temp = 0.0;
	}
	
	public Temperature(double temp)
	{
		this.setTemp(temp);
	}
	
	public void setTemp(double temp)
	{
		if (temp < -29.0)
		{
			temp = -29.0;
		}
		else if (temp > 38)
		{
			temp = 38;
		}
		this.temp = temp;
	}
	
	public double getTemp()
	{
		return this.temp;
	}
	
	public String toString()
	{
		String toReturn = "";
		
		toReturn = temp + "\u00B0" + "C";
		return toReturn;
	}
}

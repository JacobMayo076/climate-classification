//Precipitation is measured
//in millimeters
package climateclassification;

public class Precipitation 
{
	private double precip;
	
	public Precipitation() 
	{
		this.precip = 0.0;
	}
	
	public Precipitation(double precip)
	{
		this.setPrecip(precip);
	}
	
	public void setPrecip(double precip)
	{
		// You can't have negative precipitation
		if (precip < 0.0)
		{
			precip = 0.0;
		}
		//
		else if (precip > 640.0)
		{
			precip = 640.0;
		}
		this.precip = precip;
	}
	
	public double getPrecip()
	{
		return this.precip;
	}
	
	public String toString()
	{
		String toReturn = "";
		
		toReturn = precip + " mm";
		return toReturn;
	}
}

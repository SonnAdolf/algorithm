package cn.data;

/**
* @ClassName: Date 
* @Description: ����
* @author ����
* @date 2016-6-9 ����1:26:25 
* @version 1.0
 */

public class Date implements Comparable<Date>
{   
	/**��*/
	private final int day;
	
	/**��*/
	private final int month;
	
	/**��*/
	private final int year;
	
	public Date(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	public int compareTo(Date that)
	{
		if(this.year > that.year)
		{
			return +1;
		}
		if(this.year < that.year)
		{
			return -1;
		}
		if(this.month > that.month)
		{
			return +1;
		}
		if(this.month < that.month)
		{
			return -1;
		}
		if(this.day > that.day)
		{
			return +1;
		}
		if(this.day < that.day)
		{
			return -1;
		}
		return 0;
	}
	
	public String toString()
	{
		return month + "/" + day + "/" + year;
	}
}

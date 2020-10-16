
public class Date {
	
	private int year;
	private int month;
	private int dateofthemonth;
	Date(int dateofthemonth,int month,int year)
	{
		this.dateofthemonth = dateofthemonth;
		this.month = month;
		this.year = year;
	}
	int getdateofthemonth() {
		return dateofthemonth;
	}
	int getMonth() {
		return month;
	}
	int getYear() {
		return year;
	}
	static Date getDate(String dateString)
	{
		String dateArray[]= dateString.split("/"); 
		Date date1 = new Date(Integer.parseInt(dateArray[0])
				,Integer.parseInt(dateArray[1]),Integer.parseInt(dateArray[2]));
		return date1;
	}
}

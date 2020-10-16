
public class expenseEntry {
	 
	private Date date;
	private int Expense;
	private String Category;
	
	expenseEntry(Date date, int Expense, String Category)
	{
		this.date = date;
		this.Expense = Expense;
		this.Category = Category;
	}
	Date getDate()
	{
		return date;
	}
	int getExpense()
	{
		return Expense;
	}
	String getCategory()
	{
		return Category;
	}
}

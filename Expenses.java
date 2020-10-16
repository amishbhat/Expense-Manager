import java.util.ArrayList;

public class Expenses {
	static ArrayList<expenseEntry> expenses = new ArrayList<expenseEntry>();
	static void addExpense(Date date, int Expense, String Category)
	{
		expenses.add(new expenseEntry(date, Expense, Category));
	}
	static void showExpensesCategoryWise(String category)
	{
		if(!CategoryManager.isACategory(category))
		{
			System.out.println("The mentioned category doesn't exist. Please try again");
		}
		else
		{
			for(expenseEntry e : expenses)
			{
				if(e.getCategory().equals(category)) {
				System.out.println("Date :" + e.getDate().getdateofthemonth() +
						"/" + e.getDate().getMonth() + "/" + e.getDate().getYear());
				System.out.println("Expense :" + e.getExpense());
				System.out.println("Category :" + e.getCategory());
				System.out.println("-------------------------------------");
				}
			}
		}
	}
	static void showAllExpenses()
	{
		for(expenseEntry e : expenses)
		{
			{
				System.out.println("Date :" + e.getDate().getdateofthemonth() +
						"/" + e.getDate().getMonth() + "/" + e.getDate().getYear());
				System.out.println("Expense :" + e.getExpense());
				System.out.println("Category :" + e.getCategory());
				System.out.println("-------------------------------------");
			}
		}
	}
}

import java.util.Scanner;
public class main_file {
	public static void main(String args[])
	{
		
		System.out.println("Welcome to Expense Manager Application !");
		System.out.println("Press 1 to add category");
		System.out.println("Press 2 to delete category");
		System.out.println("Press 3 to show all categories");
		System.out.println("Press 4 to open a category");
		System.out.println("Press 5 to show all expenses");
		System.out.println("Press 0 to exit");
		Scanner myObj = new Scanner(System.in);
		int option = Integer.parseInt(myObj.nextLine());
		while(option!=0)
		{
			switch (option) {
			case 1:
				System.out.println("Name of cateogry you want to add :");
				String string = myObj.nextLine();
				CategoryManager.addCategory(string);
				break;
			case 2:
				System.out.println("Name of category you want to delete :");
				String string1 = myObj.nextLine();
				CategoryManager.deleteCategory(string1);
				break;
			case 3:
				System.out.println("The categories are :");
				CategoryManager.showAllCategories();
				break;
			case 4:
				System.out.println("Name of Category you want to open :");
				String categoryName = myObj.nextLine();
				if(CategoryManager.isACategory(categoryName))
				{
					System.out.println("Welcome to "+ categoryName+" category !");
					System.out.println("Press 1 to add expense");
					System.out.println("Press 2 to show all the expenses of this category");
					System.out.println("Press 0 to exit this category");
					int inside_option = myObj.nextInt(); 
					myObj.nextLine();
					while(inside_option!=0)
					{
						switch (inside_option) {
						case 1:
							System.out.println("Date :");
							String date = myObj.nextLine();// user will input the date in dd/mm/yyyy form
							System.out.println("Expense :");
							Integer expense = myObj.nextInt();
							Expenses.addExpense(Date.getDate(date), expense, categoryName);//getDate spllits the date string
																							//about "/" and parses the individual integers
							break;
						case 2:
							Expenses.showExpensesCategoryWise(categoryName);
							break;
						}
						System.out.println("Press 1 to add expense");
						System.out.println("Press 2 to show all the expenses of this category");
						System.out.println("Press 0 to exit this category");
						inside_option = myObj.nextInt(); 
						myObj.nextLine();
					}

				}
				else {
					System.out.println("This category does not exist. Please try again");
				}
				break;
			case 5:
				Expenses.showAllExpenses();
				break;
			}
			System.out.println("Press 1 to add category");
			System.out.println("Press 2 to delete category");
			System.out.println("Press 3 to show all categories");
			System.out.println("Press 4 to open a category");
			System.out.println("Press 5 to show all expenses");
			System.out.println("Press 0 to exit");
			option = Integer.parseInt(myObj.nextLine());
		}
		myObj.close();
	}
}

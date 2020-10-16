import java.util.ArrayList;
public class CategoryManager {
	 static ArrayList<String> Category = new ArrayList<String>();
	static void addCategory(String string)
	{
		Category.add(string);
	}
	static void deleteCategory(String string)
	{
		int noOfCategories = Category.size();
		if(CategoryManager.isACategory(string)==false)
		{
			System.out.println("The metioned category does not exist.");
		}
		else {
				for(int i=0;i<noOfCategories;i++)
				{
					if(Category.get(i).equals(string))
					{
					Category.remove(i);
					
					}
				}
			}
	}
	static void showAllCategories()
	{
	    for (String str : Category)
	    {
	        System.out.println(str);
	    }
	}
	static boolean isACategory(String string)
	{
	    for (String i : Category)
	    {
	        if(i.equals(string))
	        	return true;
	    }
	    return false;
	}
}

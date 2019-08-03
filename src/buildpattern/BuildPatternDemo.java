/**
 * 
 */
package buildpattern;

/**
 * @author Administrator
 *
 */
public class BuildPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MealBuild mealBuild = new MealBuild();
		Meal vegMeal = mealBuild.prepareVegMeal();
		Meal nonVegMeal = mealBuild.prepareNonVegMeal();
		vegMeal.showItems();
		vegMeal.getCost();
		nonVegMeal.showItems();
		nonVegMeal.getCost();
	}

}

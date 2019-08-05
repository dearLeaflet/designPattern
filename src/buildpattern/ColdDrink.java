/**
 * 
 */
package buildpattern;

/**
 * @author Administrator
 *
 */
abstract class BaseColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}

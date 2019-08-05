package buildpattern;
/**
 * 
 * @author Administrator
 *
 */
abstract class BaseBurger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}

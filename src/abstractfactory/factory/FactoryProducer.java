package abstractfactory.factory;
/**
 * 
 * @author Administrator
 *
 */
public class FactoryProducer {
	public static AbstractFacory getFacory(String factory) {
		if (factory == null) {
			return null;
		}
		if("shape".equalsIgnoreCase(factory)) {
			return new ShapeFactory();
		}
		if ("color".equalsIgnoreCase(factory)) {
			return new ColorFactory();
		}
		
		return null;
		
	}

}

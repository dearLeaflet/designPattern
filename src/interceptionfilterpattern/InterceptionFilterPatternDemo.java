/**
 * 
 */
package interceptionfilterpattern;

/**
 * @author Administrator
 *
 */
public class InterceptionFilterPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Target target = new Target();
		FilterManager filterManager = new FilterManager(target);
		filterManager.addFilter(new AuthentionFilter());
		filterManager.addFilter(new DebugFilter());
		
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("requst sending ...");
	}

}

/**
 * 
 */
package interceptionfilterpattern;

/**
 * @author Administrator
 *
 */
public class FilterManager {
	private FilterChain filterChain;
	
	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}
	
	public void addFilter(Filter filter) {
		filterChain.addFilter(filter);
	}
	
	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}

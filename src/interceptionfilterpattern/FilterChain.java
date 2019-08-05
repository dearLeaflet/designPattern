/**
 * 
 */
package interceptionfilterpattern;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class FilterChain {
	private ArrayList<Filter> filters = new ArrayList<Filter>();
	private Target target;
	
	public void setTarget(Target target) {
		this.target = target;
	}
	
	public void addFilter(Filter filter) {
		filters.add(filter);
	}
	
	public void execute(String request) {
		for(Filter filter : filters) {
			filter.execute(request);
		}
		target.execute(request);
	}
}

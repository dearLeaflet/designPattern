/**
 * 
 */
package interceptionfilterpattern;

/**
 * @author Administrator
 *
 */
public class DebugFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("DebugFilter Executing ...");
	}

}

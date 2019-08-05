/**
 * 
 */
package interceptionfilterpattern;

/**
 * @author Administrator
 *
 */
public class AuthentionFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("AuthentionFilter Executing ...");
	}

}

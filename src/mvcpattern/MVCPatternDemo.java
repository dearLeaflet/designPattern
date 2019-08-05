/**
 * 
 */
package mvcpattern;

/**
 * @author Administrator
 *
 */
public class MVCPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Staff staff = new Staff();
		staff.setId("001");
		staff.setName("ะกร๗");
		
		StaffView staffView = new StaffView();
		
		StaffController staffController = new StaffController(staff, staffView);
		staffController.updateView();
	}

}

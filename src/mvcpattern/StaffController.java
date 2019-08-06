/**
 * 
 */
package mvcpattern;

/**
 * @author Administrator
 *
 */
public class StaffController {

	Staff staff = null;
	StaffView staffView = null;
	
	public StaffController(Staff staff, StaffView staffView) {
		this.staff = staff;
		this.staffView = staffView;
	}
	
	public void updateView() {
		System.out.println("....");
	}
}

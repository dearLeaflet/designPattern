/**
 * 
 */
package mvcpattern;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class StaffController {

	private Staff staff;
	private StaffView staffView;
	
	public StaffController(Staff staff, StaffView staffView) {
		this.staff = staff;
		this.staffView = staffView;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public StaffView getStaffView() {
		return staffView;
	}

	public void setStaffView(StaffView staffView) {
		this.staffView = staffView;
	}
	
	public void updateView() {
		staffView.showStaffInfo(this.staff.getName(), this.staff.getId());
	}
	
}

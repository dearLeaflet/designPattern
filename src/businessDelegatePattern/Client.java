/**
 * 
 */
package businessDelegatePattern;

import buildpattern.BuildPatternDemo;

/**
 * @author Administrator
 *
 */
public class Client {
	private BusinessDelegate businessDelegate;
	public Client(BusinessDelegate businessDelegate) {
		// ���캯��ʹ�õ�Ϊ����
		// this.businessDelegate = (BusinessDelegate) businessDelegate.clone();
		this.businessDelegate = businessDelegate;
	}

	public void doTask() {
		businessDelegate.doTask();
	}
}

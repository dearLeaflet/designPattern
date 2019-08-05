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
		// 构造函数使用的为引用
		// this.businessDelegate = (BusinessDelegate) businessDelegate.clone();
		this.businessDelegate = businessDelegate;
	}

	public void doTask() {
		businessDelegate.doTask();
	}
}

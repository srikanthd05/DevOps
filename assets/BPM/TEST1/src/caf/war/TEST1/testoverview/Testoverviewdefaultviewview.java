/**
 * 
 */
package caf.war.TEST1.testoverview;

/**
 * @author srda
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "Testoverviewdefaultviewview")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Testoverview/default", beanType = BeanType.PAGE)
public class Testoverviewdefaultviewview extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{Testoverview.taskID}" }, };
	private transient caf.war.TEST1.testoverview.Testoverview testoverview = null;
	private caf.war.TEST1.taskclient.Test test = null;
	private static final String[][] TEST_PROPERTY_BINDINGS = new String[][] {
		{"#{Test.taskID}", "#{Testoverview.taskID}"},
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.TEST1.testoverview.Testoverview getTestoverview()  {
		if (testoverview == null) {
		    testoverview = (caf.war.TEST1.testoverview.Testoverview)resolveExpression("#{Testoverview}");
		}
		return testoverview;
	}

	public caf.war.TEST1.taskclient.Test getTest()  {
		if (test == null) {
		    test = (caf.war.TEST1.taskclient.Test)resolveExpression("#{Test}");
		}
	
	    resolveDataBinding(TEST_PROPERTY_BINDINGS, test, "test", false, false);
		return test;
	}

}
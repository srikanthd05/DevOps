/**
 * 
 */
package caf.war.TEST21.taskcreationnewtaskoverview;

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

@ManagedBean(name = "TaskCreationNewTaskOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "TaskCreationNewTaskOverview/default", beanType = BeanType.PAGE)
public class TaskCreationNewTaskOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{TaskCreationNewTaskOverview.taskID}" }, };
	private transient caf.war.TEST21.taskcreationnewtaskoverview.TaskCreationNewTaskOverview taskCreationNewTaskOverview = null;
	private caf.war.TEST21.taskclient.TaskCreationNewTask taskCreationNewTask = null;
	private static final String[][] TASKCREATIONNEWTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{TaskCreationNewTask.taskID}", "#{TaskCreationNewTaskOverview.taskID}"},
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

	public caf.war.TEST21.taskcreationnewtaskoverview.TaskCreationNewTaskOverview getTaskCreationNewTaskOverview()  {
		if (taskCreationNewTaskOverview == null) {
		    taskCreationNewTaskOverview = (caf.war.TEST21.taskcreationnewtaskoverview.TaskCreationNewTaskOverview)resolveExpression("#{TaskCreationNewTaskOverview}");
		}
		return taskCreationNewTaskOverview;
	}

	public caf.war.TEST21.taskclient.TaskCreationNewTask getTaskCreationNewTask()  {
		if (taskCreationNewTask == null) {
		    taskCreationNewTask = (caf.war.TEST21.taskclient.TaskCreationNewTask)resolveExpression("#{TaskCreationNewTask}");
		}
	
	    resolveDataBinding(TASKCREATIONNEWTASK_PROPERTY_BINDINGS, taskCreationNewTask, "taskCreationNewTask", false, false);
		return taskCreationNewTask;
	}

}
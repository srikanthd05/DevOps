package caf.war.TEST21.taskclient;

 

import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'taskCreationNew Task' task.
 */ 
@ManagedBean(name = "TaskCreationNewTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class TaskCreationNewTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 4649189525156864L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "7DB92C46-BD09-C1F6-1F06-F05C8A8C9975";

	/**
	 * Default constructor
	 */
	public TaskCreationNewTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 7834921054374105088L;
		 
			
		public static String[][] FIELD_NAMES = new String[][] {{"taskCreation", "taskCreation"},
		};


		private caf.war.TEST21.taskclient.is.document.MyRestTest_docs_taskCreation taskCreation = null;


		public static final String[] INPUTS = new String[] {"taskCreation", };


		public static final String[] OUTPUTS = new String[] {"taskCreation", };
 
		public TaskData() {
		}

		public caf.war.TEST21.taskclient.is.document.MyRestTest_docs_taskCreation getTaskCreation()  {
			if (taskCreation == null) {
				taskCreation = new caf.war.TEST21.taskclient.is.document.MyRestTest_docs_taskCreation();
			}
			return taskCreation;
		}

		public void setTaskCreation(caf.war.TEST21.taskclient.is.document.MyRestTest_docs_taskCreation taskCreation)  {
			this.taskCreation = taskCreation;
		}
		
		
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}
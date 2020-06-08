package caf.war.TEST1.taskclient;

 

import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'TEST' task.
 */ 
@ManagedBean(name = "Test")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class Test extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 3350177705271239680L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "7070A895-BC5B-730E-75E7-FD950BADE6A4";

	/**
	 * Default constructor
	 */
	public Test() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 6302023248357001216L;
		 
			
		public static final String[] INPUTS = new String[] {};


		public static final String[] OUTPUTS = new String[] {};
 
		public TaskData() {
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
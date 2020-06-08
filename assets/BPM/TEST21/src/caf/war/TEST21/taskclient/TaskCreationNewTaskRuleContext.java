package caf.war.TEST21.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "TaskCreationNewTaskRuleContext")
@SessionScoped
@DTManagedBean(displayName = "taskCreationNew Task Rule Context", beanType = BeanType.DEFAULT)
public class TaskCreationNewTaskRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}
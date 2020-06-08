package caf.war.TEST1.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "Testrulecontext")
@SessionScoped
@DTManagedBean(displayName = "TEST Rule Context", beanType = BeanType.DEFAULT)
public class Testrulecontext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}
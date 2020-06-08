/**
 * 
 */
package caf.war.TEST1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author srda
 *
 */
@ManagedBean(name = "Test1")
@ApplicationScoped
@DTManagedBean(displayName = "TEST1", beanType = BeanType.APPLICATION)
public class Test1 extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Test1()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "TEST1" );
	}
}
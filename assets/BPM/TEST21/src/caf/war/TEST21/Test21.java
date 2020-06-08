/**
 * 
 */
package caf.war.TEST21;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author srda
 *
 */
@ManagedBean(name = "Test21")
@ApplicationScoped
@DTManagedBean(displayName = "TEST21", beanType = BeanType.APPLICATION)
public class Test21 extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Test21()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "TEST21" );
	}
}
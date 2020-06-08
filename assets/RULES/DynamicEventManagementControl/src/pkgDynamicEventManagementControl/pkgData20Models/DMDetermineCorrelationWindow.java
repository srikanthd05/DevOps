package pkgDynamicEventManagementControl.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="DynamicEventManagementControl",DataModelName="DetermineCorrelationWindow",EventTypeName="") public class DMDetermineCorrelationWindow extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotuserTodefinefromConsole;
  private String slotvalue;
  @IDataAnnotation(OriginalFieldName="userTodefinefromConsole",FieldName="slotuserTodefinefromConsole",SlotKey="/userTodefinefromConsole;1;0",Position=0,CameFromFloat=false) public String getSlotuserTodefinefromConsole(){
    return this.slotuserTodefinefromConsole;
  }
  @IDataAnnotation(OriginalFieldName="userTodefinefromConsole",FieldName="slotuserTodefinefromConsole",SlotKey="/userTodefinefromConsole;1;0",Position=0,CameFromFloat=false) public void setSlotuserTodefinefromConsole(  String paramuserTodefinefromConsole){
    this.slotuserTodefinefromConsole=paramuserTodefinefromConsole;
  }
  @IDataAnnotation(OriginalFieldName="value",FieldName="slotvalue",SlotKey="/value;1;0",Position=1,CameFromFloat=false) public String getSlotvalue(){
    return this.slotvalue;
  }
  @IDataAnnotation(OriginalFieldName="value",FieldName="slotvalue",SlotKey="/value;1;0",Position=1,CameFromFloat=false) public void setSlotvalue(  String paramvalue){
    this.slotvalue=paramvalue;
  }
}

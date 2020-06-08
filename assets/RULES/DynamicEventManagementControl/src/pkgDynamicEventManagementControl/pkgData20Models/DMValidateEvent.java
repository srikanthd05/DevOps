package pkgDynamicEventManagementControl.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="DynamicEventManagementControl",DataModelName="ValidateEvent",EventTypeName="") public class DMValidateEvent extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotpercentage;
  private String slotvalue;
  @IDataAnnotation(OriginalFieldName="percentage",FieldName="slotpercentage",SlotKey="/percentage;1;0",Position=0,CameFromFloat=false) public String getSlotpercentage(){
    return this.slotpercentage;
  }
  @IDataAnnotation(OriginalFieldName="percentage",FieldName="slotpercentage",SlotKey="/percentage;1;0",Position=0,CameFromFloat=false) public void setSlotpercentage(  String parampercentage){
    this.slotpercentage=parampercentage;
  }
  @IDataAnnotation(OriginalFieldName="value",FieldName="slotvalue",SlotKey="/value;1;0",Position=1,CameFromFloat=false) public String getSlotvalue(){
    return this.slotvalue;
  }
  @IDataAnnotation(OriginalFieldName="value",FieldName="slotvalue",SlotKey="/value;1;0",Position=1,CameFromFloat=false) public void setSlotvalue(  String paramvalue){
    this.slotvalue=paramvalue;
  }
}

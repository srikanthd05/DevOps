package pkgDynamicEventManagementControl.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="DynamicEventManagementControl",DataModelName="Insite",EventTypeName="") public class DMInsite extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotInsiteRecommendationType;
  private String slotInsiteModelType;
  private String slotEventCategory;
  private String slotRunbookStatus;
  @IDataAnnotation(OriginalFieldName="InsiteRecommendationType",FieldName="slotInsiteRecommendationType",SlotKey="/InsiteRecommendationType;1;0",Position=0,CameFromFloat=false) public String getSlotInsiteRecommendationType(){
    return this.slotInsiteRecommendationType;
  }
  @IDataAnnotation(OriginalFieldName="InsiteRecommendationType",FieldName="slotInsiteRecommendationType",SlotKey="/InsiteRecommendationType;1;0",Position=0,CameFromFloat=false) public void setSlotInsiteRecommendationType(  String paramInsiteRecommendationType){
    this.slotInsiteRecommendationType=paramInsiteRecommendationType;
  }
  @IDataAnnotation(OriginalFieldName="InsiteModelType",FieldName="slotInsiteModelType",SlotKey="/InsiteModelType;1;0",Position=1,CameFromFloat=false) public String getSlotInsiteModelType(){
    return this.slotInsiteModelType;
  }
  @IDataAnnotation(OriginalFieldName="InsiteModelType",FieldName="slotInsiteModelType",SlotKey="/InsiteModelType;1;0",Position=1,CameFromFloat=false) public void setSlotInsiteModelType(  String paramInsiteModelType){
    this.slotInsiteModelType=paramInsiteModelType;
  }
  @IDataAnnotation(OriginalFieldName="EventCategory",FieldName="slotEventCategory",SlotKey="/EventCategory;1;0",Position=2,CameFromFloat=false) public String getSlotEventCategory(){
    return this.slotEventCategory;
  }
  @IDataAnnotation(OriginalFieldName="EventCategory",FieldName="slotEventCategory",SlotKey="/EventCategory;1;0",Position=2,CameFromFloat=false) public void setSlotEventCategory(  String paramEventCategory){
    this.slotEventCategory=paramEventCategory;
  }
  @IDataAnnotation(OriginalFieldName="RunbookStatus",FieldName="slotRunbookStatus",SlotKey="/RunbookStatus;1;0",Position=3,CameFromFloat=false) public String getSlotRunbookStatus(){
    return this.slotRunbookStatus;
  }
  @IDataAnnotation(OriginalFieldName="RunbookStatus",FieldName="slotRunbookStatus",SlotKey="/RunbookStatus;1;0",Position=3,CameFromFloat=false) public void setSlotRunbookStatus(  String paramRunbookStatus){
    this.slotRunbookStatus=paramRunbookStatus;
  }
}

import java.util.ArrayList;


public class Definition {
  private String mDefinition;
  private Integer mId;
  private static ArrayList<Definition> definitionList = new ArrayList<Definition>();

  public Definition(String definition){
    mDefinition = definition;
    definitionList.add(this);
    mId = definitionList.size();
  }
  public String getDefinitionsFromDefinitionClass(){
    return mDefinition;
  }
  public Integer getId(){
  	return mId;
  }
  public static ArrayList<Definition> all(){
  	return definitionList;
  }
  public static void clear(){
  	definitionList.clear();
  }
  public static Definition find(Integer id){
  	try{
  		return definitionList.get(id -1);
  	} catch (IndexOutOfBoundsException exception) {
  		return null;
  	}
  }
}

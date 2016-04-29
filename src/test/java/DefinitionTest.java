import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition definition = new Definition("the way things are");
    assertEquals(true, definition instanceof Definition);
  }
  @Test
  public void Definition_instantiatesWithDefinition_String() {
    Definition definition = new Definition("the way things are");
    assertEquals("the way things are", definition.getDefinition());
  }
  @Test
  public void all_returnsAllInstancesOfDefinition_true(){
   	Definition definitionOne = new Definition("the way things are");
   	Definition definitionTwo = new Definition("the way things are supposed to be");
    assertTrue(Definition.all().contains(definitionOne));
    assertTrue(Definition.all().contains(definitionTwo));
  }
  @Test
  public void clear_emptiesAllDefinitionFromArrayList_0() {
    Definition definition = new Definition("the way things are");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
  @Test
  public void getId_DefinitionInstantiatesWithAnId_1(){
	Definition.clear();
	Definition definition = new Definition("the way things are");
	assertEquals((Integer)1, definition.getId());
  }
  @Test
  public void find_returnsDefinitionWithSameId_definitionTwo() {
  	Definition definitionOne = new Definition("the way things are");
   	Definition definitionTwo = new Definition("the way things are supposed to be");
  	assertEquals(Definition.find(definitionTwo.getId()), definitionTwo);
  }
}

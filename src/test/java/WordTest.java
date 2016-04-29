import java.util.ArrayList;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest{
  @Test 
  public void word_instantiatesCorrectly_true(){
    Word word = new Word("code");
    assertEquals(true, word instanceof Word);
  }
  @Test
  public void getWord_wordInstantiatesWithWord_code() {
   	Word word = new Word("code");
    assertEquals("code", word.getWord());
  }
  @Test
  public void all_returnsAllInstancesOfWord_true() {
  	Word wordOne = new Word("code");
  	Word wordTwo = new Word("review");
    assertTrue(Word.all().contains(wordOne));
    assertTrue(Word.all().contains(wordTwo));
  }
  @Test
  public void clear_emptiesAllWordsFromList_0() {
    Word wordOne = new Word("code");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }
  @Test
  public void getId_wordInstantiateWithAnId_1() {
    Word.clear();
	Word word = new Word("code");
    assertEquals(1, word.getId());
  }
  @Test
  public void find_returnsWordWithSameId_wordTwo() {
   	Word wordOne = new Word("code");
  	Word wordTwo = new Word("review");
    assertEquals(Word.find(wordTwo.getId()), wordTwo);
  }
  @Test
  public void find_returnsNullWhenNoWordFound_null() {
    assertTrue(Word.find(999) == null);
   }
   @Test
   public void getTasks_initiallyReturnsEmptyList_ArrayList() {
     Word word = new Word("code");
     assertEquals(0, word.getDefinitions().size());
   }
   @Test
   public void addDefinition_addsDefinitionToList_true() {
     Word word = new Word("code");
     Definition definition = new Definition("something that you do");
     word.addDefinition(definition);
     assertTrue(word.getDefinitions().contains(definition));
   }
}


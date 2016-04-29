import java.util.ArrayList;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest{
  @Test 
  public void word_instantiatesCorrectly_true(){
    Word word = new Word("code");
  }
}


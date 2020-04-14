import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCase{
  @Test
  public void Testcase1(){
    int [] input = new int[] { 1,2,3};
    boolean expected = true;
    boolean result = MonotomicArray.isMonotomic(input);
    assertEquals(expected, result);
  }
  @Test
  public void Testcase2(){
    int [] input = new int[] {1,1,2,2,2,3,3,3,3};
    boolean expected = true;
    boolean result = MonotomicArray.isMonotomic(input);
    assertEquals(expected, result);
  }
}

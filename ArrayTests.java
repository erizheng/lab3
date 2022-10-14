import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	// @Test 
	// public void testReverseInPlace() {
  //   int[] input1 = { 3 };
   
  //   ArrayExamples.reverseInPlace(input1);
   
  //   assertArrayEquals(new int[]{ 3 }, input1);
	// }
  // @Test 
	// public void testReverseInPlace2() {
  //   int[] input2 = { };
   
  //   ArrayExamples.reverseInPlace(input2);
    
  //   assertArrayEquals(new int[]{ }, input2);
	// }
  // @Test 
	// public void testReverseInPlace3() {
  //   int[] input3 = {1, 2};
    
  //   ArrayExamples.reverseInPlace(input3);
   
  //   assertArrayEquals(new int[]{2, 1},input3);
	// }
  // @Test 
	// public void testReverseInPlace4() {
  //   int[] input4 = {1, 2, 3};

  //   ArrayExamples.reverseInPlace(input4);

  //   assertArrayEquals(new int[]{3, 2, 1}, input4);
	// }

  // @Test
  // public void testReversed() {
  //   int[] input1 = { };
  //   assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  // }
  // @Test
  // public void testReversed2() {
  //   int[] input2 = {1};
   
  //   assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input2));
  // }
  // @Test
  // public void testReversed3() {
  //   int[] input3 = {1, 2};
  
  //   assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input3));
  // }
  // @Test
  // public void testReversed4() {
  //   int[] input4 = {1, 2, 3};

  //   assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input4));
  // }



  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {};
    double[] input2 = {1.1, 1.2, 1.3};
    double[] input3 = {1.1};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
    assertEquals(1.25, ArrayExamples.averageWithoutLowest(input2), 0.01);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input3), 0.01);
  }
  @Test
  public void testAverageWithoutLowestNeg(){
    double[] input2 = {1.1, -1.2, 1.3};

    assertEquals(1.2, ArrayExamples.averageWithoutLowest(input2), 0.01);
  }
  @Test
  public void testAverageWithoutLowestSameNum(){
    double[] input2 = {1.1, 1.1, 1.1};

    assertEquals(1.1, ArrayExamples.averageWithoutLowest(input2), 0.01);
  }

}

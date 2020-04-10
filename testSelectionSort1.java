import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testLargest {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testLargest() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

       SelectionSort t = new SelectionSort();
       t.basicSelectionSort(arr);
       t.basicSelectionSort(Sortedarr);

       assertTrue(2 == arr[0]);
       assertTrue(2 == arr[0]);
       assertTrue(arr[0] > 0);
       assertTrue(Sortedarr[0] > 0);
       assertTrue(Sortedarr[1] > 0);
       assertTrue(Sortedarr[2] > 0);
       assertTrue(Sortedarr[3] > 0);
       assertTrue(Sortedarr[4] > 0);
       assertFalse(10 == arr[0]);
    }

    public void testNegative(){

    	 int[] arr = new int[5];
         arr[0] = -8;
         arr[1] = -9;
         arr[2] = -7;
         arr[3] = -10;
         arr[4] = -2;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = -2;
         Sortedarr[1] = -7;
         Sortedarr[2] = -8;
         Sortedarr[3] = -9;
         Sortedarr[4] = -10;

    	 SelectionSort t = new SelectionSort();
         t.basicSelectionSort(arr);
         t.basicSelectionSort(Sortedarr);

    	  assertTrue(Sortedarr[0] < 0);
          assertTrue(Sortedarr[1] < 0);
          assertTrue(Sortedarr[2] < 0);
          assertTrue(Sortedarr[3] < 0);
          assertTrue(Sortedarr[4] < 0);

          assertFalse(Sortedarr[0] > 0);
          assertFalse(Sortedarr[1] > 0);
          assertFalse(Sortedarr[2] > 0);
          assertFalse(Sortedarr[3] > 0);
          assertFalse(Sortedarr[4] > 0);

    }

    public void testMixed(){

    	 int[] arr = new int[5];
         arr[0] = -8;
         arr[1] = 9;
         arr[2] = -7;
         arr[3] = 10;
         arr[4] = -2;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = -2;
         Sortedarr[1] = 7;
         Sortedarr[2] = -8;
         Sortedarr[3] = 9;
         Sortedarr[4] = -10;

    	 SelectionSort t = new SelectionSort();
         t.basicSelectionSort(arr);
         t.basicSelectionSort(Sortedarr);

         assertTrue(Sortedarr[0] == -10);
         assertTrue(Sortedarr[1] == -8);
         assertTrue(Sortedarr[2] == -2);
         assertTrue(Sortedarr[3] == 7);
         assertTrue(Sortedarr[4] == 9);
    }

    public void testDuplicates(){

    	 int[] arr = new int[5];
         arr[0] = 2;
         arr[1] = 2;
         arr[2] = -8;
         arr[3] = -10;
         arr[4] = -10;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = 2;
         Sortedarr[1] = 2;
         Sortedarr[2] = -8;
         Sortedarr[3] = -10;
         Sortedarr[4] = -10;

    	 SelectionSort t = new SelectionSort();
         t.basicSelectionSort(arr);
         t.basicSelectionSort(Sortedarr);

         assertTrue(Sortedarr[4] == Sortedarr[3]);
         assertTrue(Sortedarr[0] == Sortedarr[1]);
         assertSame(Sortedarr[1], -10);
         assertSame(Sortedarr[0], -10);
         assertSame(Sortedarr[4], 2);
         assertSame(Sortedarr[3], 2);
    }


}

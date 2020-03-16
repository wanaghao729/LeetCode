package test.Array; 

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import src.Array.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/** 
* Topic1 Tester. 
* 
* @author <Authors name> 
* @since <pre>11ÔÂ 25, 2019</pre> 
* @version 1.0 
*/ 
public class Topic1Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: twoSum(int[] nums, int target)
     */
    @Test
    public void testTwoSum() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Topic28
     * Method: strStr(String haystack, String needle)
     */
    @Test
    public void testStrStr() throws Exception {
        Topic28 t = new Topic28();
        System.out.println(t.strStr("hello", "ll"));
    }

    /**
     * Topic33
     * Method: search(int[] nums, int target)
     */
    @Test
    public void testSearch() throws Exception {
        Topic33 t = new Topic33();
        System.out.println(t.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }


    /**
     * Topic34
     * Method: searchRange(int[] nums, int target)
     *
     * @throws Exception
     */
    @Test
    public void testTopic34() throws Exception {
        Topic34 t = new Topic34();
        System.out.println(Arrays.toString(t.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    /**
     * Topic3
     * Method: siValidSudoku(char[][] board)
     *
     * @throws Exception
     */
    @Test
    public void testTopic36() throws Exception {
        Topic36 t = new Topic36();
        char[][] a = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(t.siValidSudoku(a));
    }

    // Topic 29
    @Test
    public void testTopic29() throws Exception {
        Topic29 t = new Topic29();
        System.out.println(t.divide(7, -3));
    }

    // Topic 41
    @Test
    public void testTopic41() throws Exception {
        Topic41 t = new Topic41();
        System.out.println(t.firstMissingPositive(new int[]{1, 2, 0, 4}));
    }

    // Topic 42
    @Test
    public void testTopic42() throws Exception {
        Topic42 t = new Topic42();
        System.out.println(t.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    // Topic 46
    @Test
    public void testTopic46() throws Exception {
//        Topic46 t = new Topic46();
//        t.subsets(new int[] {1, 2, 3});
//        System.out.println(t.subsets(new int[] {1, 2, 3}));
    }

    //Topic 49
    @Test
    public void testTopic49() throws Exception {
        Topic49 t = new Topic49();
        t.groupAnagrams(new String[]{"ate"});
        List<Integer> l = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new IdentityHashMap<>();
        System.out.println(1<<30);
        System.out.println(Math.pow(2, 30));
        Object o = new Object();
        ConcurrentHashMap t1 = new ConcurrentHashMap();
        HashMap ti = new HashMap();
        ClassLoader classLoader = new ClassLoader() {
        };
        int count = 0;
        count = count++;
        System.out.println(count);
    }
}

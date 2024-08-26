
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Spiral_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public int[][] copy(int[][] grid)
    {
        int[][] copy = new int[grid.length][grid[0].length];
        for(int r=0; r< grid.length; r++)
            for(int c=0; c< grid[0].length; c++)
                copy[r][c] = grid[r][c];
        return copy;
    }

    @Test(timeout = 2000)
    public void test1() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 1,1);
            char[][] expected = {{'j'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 1,9);
            char[][] expected = {   {'j'},
                    {'a'},
                    {'v'},
                    {'a'},
                    {'j'},
                    {'a'},
                    {'v'},
                    {'a'},
                    {'j'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 7,1);
            char[][] expected = {{'j', 'a', 'v', 'a', 'j', 'a', 'v'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 2,2);
            char[][] expected = {   {'j', 'a'},
                    {'a', 'v'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 5,5);
            char[][] expected = {   {'j', 'a', 'v', 'a', 'j'},
                    {'a', 'j', 'a', 'v', 'a'},
                    {'v', 'a', 'j', 'a', 'v'},
                    {'a', 'v', 'a', 'j', 'a'},
                    {'j', 'a', 'v', 'a', 'j'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 6,6);
            char[][] expected = {   {'j', 'a', 'v', 'a', 'j', 'a'},
                    {'a', 'j', 'a', 'v', 'a', 'v'},
                    {'v', 'a', 'j', 'a', 'j', 'a'},
                    {'a', 'v', 'a', 'v', 'a', 'j'},
                    {'j', 'a', 'j', 'a', 'v', 'a'},
                    {'a', 'v', 'a', 'j', 'a', 'v'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 14,2);
            char[][] expected = {   {'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a'},
                    {'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 3,6);
            char[][] expected = {   {'j', 'a', 'v'},
                    {'a', 'v', 'a'},
                    {'j', 'a', 'j'},
                    {'a', 'j', 'a'},
                    {'v', 'a', 'v'},
                    {'a', 'j', 'a'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 7,8);
            char[][] expected = {   {'j', 'a', 'v', 'a', 'j', 'a', 'v'},
                    {'a', 'v', 'a', 'j', 'a', 'v', 'a'},
                    {'j', 'a', 'j', 'a', 'v', 'a', 'j'},
                    {'a', 'v', 'a', 'v', 'a', 'j', 'a'},
                    {'v', 'a', 'j', 'a', 'j', 'a', 'v'},
                    {'a', 'j', 'a', 'v', 'a', 'v', 'a'},
                    {'j', 'a', 'v', 'a', 'j', 'a', 'j'},
                    {'a', 'v', 'a', 'j', 'a', 'v', 'a'}};

            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Spiral"));
            Method method = classRef.getMethod("javaSpiral", int.class,int.class);


            char[][] actual = (char[][]) method.invoke(method, 15,5);
            char[][] expected = {   {'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v'},
                    {'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a'},
                    {'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j'},
                    {'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a'},
                    {'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v', 'a', 'j', 'a', 'v'}};
            Assert.assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}

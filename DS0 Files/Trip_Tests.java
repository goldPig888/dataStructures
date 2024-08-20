
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Trip_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    @Test(timeout = 2000)
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {1,1};
        int capacity = 2;
        int expectedResult = 4;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {9};
        int capacity = 2;
        int expectedResult = 10;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {0,0,0,0,0,0,0,0};
        int capacity = 2;
        int expectedResult = 0;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0,0,0,0,0,0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {3,6,8,55,4,3};
        int capacity = 1;
        int expectedResult = 594;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0,0,0,0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {1,2,3,4,5,6,7,8,9,10,11};
        int capacity = 66;
        int expectedResult = 22;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0,0,0,0,0,0,0,0,0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {7,0,0,0,0,0,7};
        int capacity = 5;
        int expectedResult = 30;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0,0,0,0,0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {5,5,5,5,5,5};
        int capacity = 5;
        int expectedResult = 42;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0,0,0,0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {8,5,6,6,7,14,23,35,124};
        int capacity = 23;
        int expectedResult = 158;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0,0,0,0,0,0,0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {8,7,5,6,8,0,0,0,0,4,2,3,1};
        int capacity = 9;
        int expectedResult = 66;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0,0,0,0,0,0,0,0,0,0,0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Trip"));
        Method method = classRef.getMethod("fuelUsed", int[].class, int.class);

        int[] site = {2,0,0,0,0,4};
        int capacity = 3;
        int expectedResult = 24;
        int actualResult;
        try
        {
            actualResult = (Integer) method.invoke(method, site,capacity);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int[] expectedSite = {0,0,0,0,0,0};

        Assert.assertEquals(Arrays.toString(expectedSite),Arrays.toString(site));
        Assert.assertEquals(expectedResult,actualResult);
    }
}

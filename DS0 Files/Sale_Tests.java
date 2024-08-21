
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Sale_Tests {

    Item[] originalItems = {    new Item("Candy Bar",1.99,Item.NORMAL),
            new Item("Shoe",42.99,Item.NORMAL),
            new Item("Dress",55.55,Item.NORMAL),
            new Item("Model Car",23.99,Item.NORMAL),
            new Item("Phone",599.87,Item.NORMAL),
            new Item("Hat",9.87,Item.DISCOUNTED),
            new Item("Computer",1234.56,Item.DISCOUNTED),
            new Item("Chair",15.99,Item.DISCOUNTED),
            new Item("Alarm Clock",6.36,Item.DISCOUNTED),
            new Item("Turtle",20.20,Item.DISCOUNTED),
            new Item("Art Supplies",23.65,Item.CLEARANCE),
            new Item("Board Game",59.09,Item.CLEARANCE),
            new Item("Bat",15.21,Item.CLEARANCE),
            new Item("Soccer Ball",13.42,Item.CLEARANCE),
            new Item("Stapler",5.53,Item.CLEARANCE)};

    Item[] resultingItems = {    new Item("Candy Bar",1.393,Item.DISCOUNTED),
            new Item("Shoe",30.093,Item.DISCOUNTED),
            new Item("Dress",38.885,Item.DISCOUNTED),
            new Item("Model Car",16.793,Item.DISCOUNTED),
            new Item("Phone",419.909,Item.DISCOUNTED),
            new Item("Hat",4.935,Item.CLEARANCE),
            new Item("Computer",617.28,Item.CLEARANCE),
            new Item("Chair",7.995,Item.CLEARANCE),
            new Item("Alarm Clock",3.18,Item.CLEARANCE),
            new Item("Turtle",10.10,Item.CLEARANCE),
            null,
            null,
            null,
            null,
            null};

    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public Item clone(Item i)
    {
        return new Item(i.getName(),i.getPrice(),i.getStatus());
    }


    @Test(timeout = 2000)
    public void test1() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {0};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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
            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {5};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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

            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {10};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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

            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {1,3,6,13,14};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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

            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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

            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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

            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {0,1,5,6,7,8,11,12};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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

            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {0,2,4,6,8,10,12,14};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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

            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {3,6,9,13};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
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

            Class<?> classRef = Class.forName(generateClassName("Sale"));
            Method method = classRef.getMethod("sale", ArrayList.class);

            ArrayList<Item> actual = new ArrayList<>();
            ArrayList<Item> expected = new ArrayList<>();
            int[] itemIndexes = {7,8,9};

            for(int i: itemIndexes) {
                actual.add(clone(originalItems[i]));
                if(resultingItems[i]!=null)
                    expected.add(resultingItems[i]);
            }

            method.invoke(method, actual);

            Assert.assertEquals(expected.size(), actual.size());
            for(int i=0; i < expected.size(); i++) {
                Assert.assertEquals(expected.get(i).getName(), actual.get(i).getName());
                Assert.assertEquals(expected.get(i).getPrice(), actual.get(i).getPrice(),.00011);
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}

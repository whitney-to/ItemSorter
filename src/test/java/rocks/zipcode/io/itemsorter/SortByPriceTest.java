package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        Item item3 = new Item(null, null, 1.0);
        Item item2 = new Item(null, null, 1.5);
        Item item1 = new Item(null, null, 2.0);

        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Item item3 = new Item(0L, "Razor", 3.0);
        Item item2 = new Item(1L, "Sharp", 1.5);
        Item item1 = new Item(2L, "Tapestry", 2.0);
        Item[] itemsToSort = {item1, item2, item3};
        Item[] expected = {item2, item1, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Item item3 = new Item(0L, "Leon", 5.0);
        Item item2 = new Item(1L, "Nhu", 3.5);
        Item item1 = new Item(2L, "Wilhem", 2.0);
        Item[] itemsToSort = {item3, item2, item1};
        Item[] expected = {item1, item2, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}

package fr.gwenrspl;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PartitionUtilTest {


    @Test
    public void should_return_empty_list_given_empty_list() {
        final List<Integer> listArgument = new ArrayList<>();
        final List<List<Integer>> expectedList = new ArrayList<>();
        final List<List<Integer>> actualList = PartitionUtil.partition(listArgument, 1);
        Assert.assertEquals(expectedList, actualList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_given_size_of_zero() {
        final List<Integer> listArgument = Arrays.asList(1, 2, 3, 4, 5);
        final int sizeArgument = 0;
        PartitionUtil.partition(listArgument, sizeArgument);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_given_null_list() {
        final List<Integer> listArgument = null;
        final int sizeArgument = 1;
        PartitionUtil.partition(listArgument, sizeArgument);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_given_negative_size() {
        final List<Integer> listArgument = Arrays.asList(1, 2, 3, 4, 5);
        final int sizeArgument = -5;
        PartitionUtil.partition(listArgument, sizeArgument);
    }

    @Test
    public void should_return_correct_partioned_list_given_correct_arguments() {
        final List<Integer> listArgument = Arrays.asList(1, 2, 3, 4, 5);
        int sizeArgument = 2;
        final List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Collections.singletonList(5));
        List<List<Integer>> actualList = PartitionUtil.partition(listArgument, sizeArgument);
        Assert.assertEquals(expectedList, actualList);

        final List<List<Integer>> expectedList2 = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        sizeArgument = 3;
        actualList = PartitionUtil.partition(listArgument, sizeArgument);
        Assert.assertEquals(expectedList2, actualList);

        final List<List<Integer>> expectedList3 = Arrays.asList(Collections.singletonList(1), Collections.singletonList(2), Collections.singletonList(3), Collections.singletonList(4), Collections.singletonList(5));
        sizeArgument = 1;
        actualList = PartitionUtil.partition(listArgument, sizeArgument);
        Assert.assertEquals(expectedList3, actualList);
    }
}

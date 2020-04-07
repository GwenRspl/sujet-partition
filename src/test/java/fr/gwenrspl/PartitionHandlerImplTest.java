package fr.gwenrspl;

import fr.gwenrspl.exceptions.InvalidSizeParameterException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PartitionHandlerImplTest {

    PartitionHandlerImpl partitionHandler;

    @Before
    public void setUp() {
        this.partitionHandler = new PartitionHandlerImpl();
    }

    @Test
    public void should_return_empty_list_given_empty_list() throws InvalidSizeParameterException {
        final List<Integer> listParameter = new ArrayList<>();
        final List<List<Integer>> expectedList = new ArrayList<>();
        final List<List<Integer>> actualList = this.partitionHandler.partition(listParameter, 1);
        Assert.assertEquals(expectedList, actualList);
    }

    @Test(expected = InvalidSizeParameterException.class)
    public void should_throw_exception_given_size_parameter_of_zero() throws InvalidSizeParameterException {
        final List<Integer> listParameter = Arrays.asList(1, 2, 3, 4, 5);
        final int sizeParameter = 0;
        this.partitionHandler.partition(listParameter, sizeParameter);
    }

    @Test(expected = InvalidSizeParameterException.class)
    public void should_throw_exception_given_negative_size_parameter() throws InvalidSizeParameterException {
        final List<Integer> listParameter = Arrays.asList(1, 2, 3, 4, 5);
        final int sizeParameter = -5;
        this.partitionHandler.partition(listParameter, sizeParameter);
    }

    @Test
    public void should_return_correct_partioned_list_given_correct_parameters() throws InvalidSizeParameterException {
        final List<Integer> listParameter = Arrays.asList(1, 2, 3, 4, 5);
        int sizeParameter = 2;
        final List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Collections.singletonList(5));
        List<List<Integer>> actualList = this.partitionHandler.partition(listParameter, sizeParameter);
        Assert.assertEquals(expectedList, actualList);

        final List<List<Integer>> expectedList2 = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        sizeParameter = 3;
        actualList = this.partitionHandler.partition(listParameter, sizeParameter);
        Assert.assertEquals(expectedList2, actualList);

        final List<List<Integer>> expectedList3 = Arrays.asList(Collections.singletonList(1), Collections.singletonList(2), Collections.singletonList(3), Collections.singletonList(4), Collections.singletonList(5));
        sizeParameter = 1;
        actualList = this.partitionHandler.partition(listParameter, sizeParameter);
        Assert.assertEquals(expectedList3, actualList);
    }
}

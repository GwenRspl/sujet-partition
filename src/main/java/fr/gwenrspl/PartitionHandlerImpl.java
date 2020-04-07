package fr.gwenrspl;

import fr.gwenrspl.exceptions.InvalidSizeParameterException;

import java.util.ArrayList;
import java.util.List;

public class PartitionHandlerImpl implements PartitionHandler {
    @Override
    public List<List<Integer>> partition(final List<Integer> list, final int size) throws InvalidSizeParameterException {
        if (size < 1) {
            throw new InvalidSizeParameterException("The size parameter cannot be less than 1");
        }
        final List<List<Integer>> partitionedList = new ArrayList<>();
        if (list.isEmpty()) {
            return partitionedList;
        }
        return null;
    }
}

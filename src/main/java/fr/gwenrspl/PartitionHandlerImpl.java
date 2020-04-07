package fr.gwenrspl;

import fr.gwenrspl.exceptions.InvalidSizeArgumentException;

import java.util.ArrayList;
import java.util.List;

public class PartitionHandlerImpl implements PartitionHandler {
    @Override
    public List<List<Integer>> partition(final List<Integer> list, final int size) throws InvalidSizeArgumentException {
        if (size < 1) {
            throw new InvalidSizeArgumentException("The size parameter cannot be less than 1");
        }

        final List<List<Integer>> partitionedList = new ArrayList<>();
        if (list.isEmpty()) {
            return partitionedList;
        }

        final int numberOfFullLists = list.size() / size;
        int index = 0;
        for (int i = 0; i < numberOfFullLists; i++) {
            final List<Integer> secondDimensionList = new ArrayList<>();
            for (int j = index; j < index + size; j++) {
                secondDimensionList.add(list.get(j));
            }
            index += size;
            partitionedList.add(secondDimensionList);
        }

        if (list.size() % size != 0) {
            final List<Integer> finalSecondDimensionList = new ArrayList<>();
            for (int i = index; i < list.size(); i++) {
                finalSecondDimensionList.add(list.get(i));
            }
            partitionedList.add(finalSecondDimensionList);
        }
        return partitionedList;
    }
}

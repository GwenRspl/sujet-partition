package fr.gwenrspl;


import java.util.ArrayList;
import java.util.List;

public final class PartitionUtil {

    private PartitionUtil() {
    }

    public static List<List<Integer>> partition(final List<Integer> list, final int size) {
        if (list == null) {
            throw new IllegalArgumentException("The list parameter cannot be null.");
        }
        if (size < 1) {
            throw new IllegalArgumentException("The size parameter cannot be less than 1.");
        }

        final List<List<Integer>> partitionedList = new ArrayList<>();
        if (list.isEmpty()) {
            return partitionedList;
        }

        final int numberOfFullLists = list.size() / size;
        int index = 0;
        for (int i = 0; i < numberOfFullLists; i++) {
            final List<Integer> secondDimensionList = generateSecondDimensionList(index, index + size, list);
            partitionedList.add(secondDimensionList);
            index += size;
        }

        if (list.size() % size != 0) {
            final List<Integer> finalSecondDimensionList = generateSecondDimensionList(index, list.size(), list);
            partitionedList.add(finalSecondDimensionList);
        }
        return partitionedList;
    }

    private static List<Integer> generateSecondDimensionList(final int startIndex, final int endIndex, final List<Integer> list) {
        final List<Integer> secondDimensionList = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            secondDimensionList.add(list.get(i));
        }
        return secondDimensionList;
    }
}

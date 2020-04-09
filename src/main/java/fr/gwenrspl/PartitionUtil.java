package fr.gwenrspl;


import java.util.ArrayList;
import java.util.List;

/**
 * The class containing the partition method
 *
 * @author Gwen Rspl
 */
public final class PartitionUtil {

    /**
     * Private constructor to prevent from instanciating this class
     */
    private PartitionUtil() {
    }

    /**
     * This method takes a list of Integers and a size as parameters, and partition the list into sublists
     *
     * @param list The list of Integers to partition into sublists
     * @param size The maximum size of the sublists
     * @return A list of appropriately-sized sublists of Integers
     * @throws IllegalArgumentException if the list given is null or if the size is less than 1
     */
    public static List<List<Integer>> partition(final List<Integer> list, final int size) {
        if (list == null) {
            throw new IllegalArgumentException("The list parameter cannot be null.");
        }
        if (size < 1) {
            throw new IllegalArgumentException("The size parameter cannot be less than 1.");
        }

        final List<List<Integer>> partitionedList = new ArrayList<>();

        if (!list.isEmpty()) {

            final int numberOfFullLists = list.size() / size;
            int currentIndex = 0;

            for (int i = 0; i < numberOfFullLists; i++) {
                partitionedList.add(list.subList(currentIndex, currentIndex + size));
                currentIndex += size;
            }

            if (list.size() % size != 0) {
                partitionedList.add(list.subList(currentIndex, list.size()));
            }
        }

        return partitionedList;
    }

}

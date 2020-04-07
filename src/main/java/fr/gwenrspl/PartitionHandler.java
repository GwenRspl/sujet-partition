package fr.gwenrspl;

import fr.gwenrspl.exceptions.InvalidSizeParameterException;

import java.util.List;

public interface PartitionHandler {
    List<List<Integer>> partition(List<Integer> list, int size) throws InvalidSizeParameterException;
}

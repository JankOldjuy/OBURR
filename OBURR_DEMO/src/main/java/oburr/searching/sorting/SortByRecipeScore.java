package oburr.searching.sorting;

import oburr.searching.webSearching.SearchResult;

import java.util.Comparator;

public class SortByRecipeScore implements Comparator<SearchResult> {

    public int compare(SearchResult firstResult, SearchResult secondResult){

        return firstResult.getRecipe().getRecipeScore() - secondResult.getRecipe().getRecipeScore();
    }

}

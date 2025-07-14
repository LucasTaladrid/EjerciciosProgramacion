package paginationHelper;

import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I> {

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    private List<I> collection;
    private int itemsPerPage;
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection=collection;
        this.itemsPerPage=itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if(itemCount()==0){
            return 0;
        }

        int pages=0;
        int items=itemCount();
        do{
            items=items-itemsPerPage;
            pages++;
        }while (items>=1);
        return pages;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        if(pageIndex>=pageCount() || pageIndex<0){
            return -1;
        } else if (pageIndex==pageCount()-1) {
            return itemCount()-((pageCount()-1)*itemsPerPage);
        }else{
            return itemsPerPage;
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex < 0 || itemIndex >= itemCount()) {
            return -1;
        }
        return itemIndex / itemsPerPage;
    }

    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(helper.pageIndex(5));

    }
}
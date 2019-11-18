package WebSitePagination;

import java.util.*;

class Item {
    public String name;
    public String relevance;
    public String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

public class Solution {

    public static void main(String[] args) {

        String[][] a = { { "test", "1", "1" }, { "Nani", "1", "2" }, { "Keerthi", "8", "3" }, { "AB", "4", "3" },
                { "ZY", "6", "3" }, { "MN", "5", "3" } };
        fetchItemsToDisplay(a, 1, 1, 2, 2);

    }

    public static void fetchItemsToDisplay(String[][] items, int sortParameter, int sortOrder, int noOfItemsInPage,
                                           int page) {

        List<Item> itemList = new ArrayList<>();

        for (int i = 0; i < items.length; ++i) {
            Item item = new Item();
            item.setName(items[i][0]);
            item.setRelevance(items[i][1]);
            item.setPrice(items[i][2]);
            itemList.add(item);
        }

        if (sortParameter == 0) {
            sortByName(itemList);
        } else if (sortParameter == 1) {
            sortByRelevance(itemList);
            System.out.println("In");
        } else {
            sortByPrice(itemList);
        }
        if (sortOrder == 1)
            Collections.reverse(itemList);

        List<Item> itemSubList = itemList.subList(page * noOfItemsInPage, (page + 1) * noOfItemsInPage);
        for (Item i : itemSubList) {
            System.out.println(i.getName());
        }
    }

    static void sortByName(List<Item> itemList) {
        Collections.sort(itemList, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return i1.getName().compareTo(i2.getName());
            }
        });

    }

    static void sortByRelevance(List<Item> itemList) {
        Collections.sort(itemList, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return Integer.parseInt(i1.getRelevance()) - Integer.parseInt(i2.getRelevance());
            }
        });

    }

    static void sortByPrice(List<Item> itemList) {
        Collections.sort(itemList, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return Integer.parseInt(i1.getPrice()) - Integer.parseInt(i2.getPrice());
            }
        });

    }
}

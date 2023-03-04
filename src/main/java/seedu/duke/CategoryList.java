package seedu.duke;

import java.util.ArrayList;

public class CategoryList {
    public static ArrayList<Category> categories = new ArrayList<Category>();

    /**
     * Add the category to the list.
     */
    public static void addCategory(String category) {
        Category newCategory = new Category(category);
        categories.add(newCategory);
    }

    /**
     * Find the category with specific keyword in the list.
     *
     * @param name the name of the category
     */
    public static void findCategory(String name) {
        int count = 0;
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getName().contains(name)) {
                count++;
                System.out.println("index " + (i + 1) + ". " + categories.get(i).getName());
            }
            if (count == 0) {
                System.out.println("Category not found!");
            }
        }
        System.out.println("Category not found!");
    }

    /**
     * Gets the category with specific index in the list.
     *
     * @param index the index of the category in the list
     * @return
     */
    public static Category getCategory(int index) {
        return categories.get(index);
    }

    /**
     * Delete the category from the list.
     *
     * @param index the index of the category in the list
     */
    public static void deleteCategory(int index) {
        categories.remove(index);
    }

    public static void viewCategoryList() {
        for (int i = 0; i < categories.size(); i++) {
            System.out.println(i + 1 + ". " + categories.get(i).getName());
        }
    }

    public static void viewEventList(int index) {
        categories.get(index).viewEventList();
    }
}
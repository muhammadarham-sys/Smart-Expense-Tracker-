package service;

import model.Category;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private static final List<Category> categories = new ArrayList<>();

    static {
        // default categories
        categories.add(Category.FOOD);
        categories.add(Category.TRAVEL);
        categories.add(Category.UTILITY);
        categories.add(Category.OTHER);
    }

    public static List<Category> getAllCategories() {
        return categories;
    }

    public static void addCategory(Category category) {
        if (!categories.contains(category)) {
            categories.add(category);
        }
    }

    public static boolean exists(Category category) {
        return categories.contains(category);
    }
}
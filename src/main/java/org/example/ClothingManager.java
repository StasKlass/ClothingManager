package org.example;

import java.util.*;

public class ClothingManager {
    private Set<ClothingItem> clothingItems;

    public ClothingManager() {
        this.clothingItems = new TreeSet<>(Comparator.comparing(ClothingItem::getName));
    }

    public void addClothingItem(ClothingItem item) {
        clothingItems.add(item);
    }

    public void removeClothingItem(ClothingItem item) {
        clothingItems.remove(item);
    }

    public boolean searchClothingItem(ClothingItem item) {
        return clothingItems.contains(item);
    }

    public void printClothingItems() {
        for (ClothingItem item : clothingItems) {
            System.out.println(item.getName() + " - " + item.getSize() + " - " + item.getColor() + " - " + item.getCategory());
        }
    }

    public void printUniqueCategories() {
        Set<String> categories = new HashSet<>();
        for (ClothingItem item : clothingItems) {
            categories.add(item.getCategory());
        }
        System.out.println("Уникальные категории в коллекции>> " + categories);
    }

    public static void main(String[] args) {
        ClothingManager manager = new ClothingManager();

        // Создание элементов одежды
        ClothingItem item1 = new ClothingItem("футболка", "M", "черная", "верхняя одежда");
        ClothingItem item2 = new ClothingItem("джинсы", "L", "синие", "нижняя одежда");
        ClothingItem item3 = new ClothingItem("платье", "S", "красное", "Платье");
        ClothingItem item4 = new ClothingItem("футболка", "M", "черная", "верхняя одежда");

        manager.addClothingItem(item1);
        manager.addClothingItem(item2);
        manager.addClothingItem(item3);
        manager.addClothingItem(item4);

        // Поиск одежды
        System.out.println("item1 в колекции? " + manager.searchClothingItem(item1));
        System.out.println("item2 в колекции? " + manager.searchClothingItem(item2));
        System.out.println("item3 в колекции? " + manager.searchClothingItem(item3));
        System.out.println("item4 в колекции? " + manager.searchClothingItem(item4));

        System.out.println("Вещи которые в колекции>> ");
        manager.printClothingItems();
        manager.printUniqueCategories();

        manager.removeClothingItem(item1);
        System.out.println("После удаления все еще ли находится элемент item1 в коллекции? " + manager.searchClothingItem(item1)); // Нет
    }
}
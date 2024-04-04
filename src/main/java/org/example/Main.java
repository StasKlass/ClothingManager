package org.example;
public class Main {
    public static void main(String[] args) {
        ClothingManager manager = new ClothingManager();

        ClothingItem item1 = new ClothingItem("футболка", "M", "черная", "верхняя одежда");
        ClothingItem item2 = new ClothingItem("джинсы", "L", "синие", "нижняя одежда");
        ClothingItem item3 = new ClothingItem("платье", "S", "красное", "Платье");
        ClothingItem item4 = new ClothingItem("футболка", "M", "черная", "верхняя одежда");

        manager.addClothingItem(item1);
        manager.addClothingItem(item2);
        manager.addClothingItem(item3);
        manager.addClothingItem(item4);

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



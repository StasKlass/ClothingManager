package org.example;

public class ClothingItem {
    private String name;
    private String size;
    private String color;
    private String category;

    public ClothingItem(String name, String size, String color, String category) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ClothingItem other = (ClothingItem) obj;
        return size.equals(other.size) && color.equals(other.color) && category.equals(other.category);
    }

    @Override
    public int hashCode() {
        int result = size.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }
}

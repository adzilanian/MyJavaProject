package chapter_002.src.main.java.ru.myjava.tracker;

public class Tracker {

    private Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                item.setId(item.generateId());
                items[i] = item;
                position++;
                break;
            }
            System.err.println("Array is completely filled!");
        }
        return item;
    }

    public int getIndexById(String id) {

        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public int getIndexByName() {

        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() != null) {
                System.out.println(i);
            }
        }

        return -1;
    }

    public boolean replace(String id, Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean delete(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                Item[] temp = new Item[position == 1 ? 1 : position - 1];
                System.arraycopy(this.items, this.getIndexById(id) + 1, temp, this.getIndexById(id), position);
                this.items = temp;
                break;
            }
            return false;
        }
        return true;
    }

    public Item[] findAll() {
        Item[] temp = new Item[position == 1 ? 1 : position - 1];
        System.arraycopy(this.items, 0, temp, 0, this.getIndexByName());
        System.arraycopy(this.items, this.getIndexByName() + 1, temp, this.getIndexByName(), position);
        this.items = temp;
        return this.items;
    }

    public Item[] findByName(String key) {
        int nameCounter = 0;
        Tracker allTrack = new Tracker();

        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                nameCounter++;
                Item[] temp = new Item[position == 1 ? 1 : position - 1];
                allTrack.add(item);
                System.arraycopy(this.items, 0, temp, 0, nameCounter);
                allTrack.items = temp;
                break;
            }
        }
        return allTrack.items;

    }


    public Item findById(String id) {
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("abcd", "ancd", 1312L);
        tracker.add(item);
        tracker.getIndexByName();
//        tracker.delete(item.getId());
//        tracker.findAll();
        tracker.findByName("abcd");
    }
}
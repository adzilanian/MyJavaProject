package chapter_002.src.main.java.ru.myjava.tracker;

import static org.hamcrest.CoreMatchers.is;


import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        tracker.delete(item.getId());
        assertThat(null, is(tracker.findById(item.getId())));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        tracker.findById(item.getId());
        assertThat(tracker.findById(item.getId()).getId(), is(item.getId()));
    }

    @Test
    public void whenFindByNameThenReturnTrue() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        Item[] items = new Item[1];
        items[0] = item;
        tracker.add(items[0]);
        assertThat(tracker.findByName("test1"),is(items));
    }

    @Test
    public void whenFindAllItems() {
        Tracker tracker = new Tracker();
        Item firstItem = new Item("test1","descriptionFirst",123L);
        tracker.add(firstItem);
        Item secondItem = new Item("test2","descriptionSecond",123243L);
        tracker.add(secondItem);
        Item thirdItem = new Item("test3","descriptionThird",124323L);
        tracker.add(thirdItem);
        Item[] allItems = new Item[3];
        allItems[0] = firstItem;
        allItems[1] = secondItem;
        allItems[2] = thirdItem;
        tracker.findAll();
        assertThat(tracker.findAll(),is(allItems));
    }
}
package chapter_001.src.main.java.ru.myjava.array.homework.tracker;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) throws NoSuchAlgorithmException {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId(){
        //Реализовать метод генерации.
        return UUID.randomUUID().toString();
    }

    public boolean replace(String id, Item item) {
        return true;
    }


}

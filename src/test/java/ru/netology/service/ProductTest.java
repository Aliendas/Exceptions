package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    ShopRepository repo = new ShopRepository();

    Product product1 = new Product(3975, "стиральная машинка", 44_666);
    Product product2 = new Product(3475, "миксер", 1_200);
    Product product3 = new Product(0004, "утюг", 3_500);


    @BeforeEach
    public void add() {
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

    }

    @Test
    public void removeNotExistedProduct() {

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(0010));
    }

    @Test
    public void removeProduct() {
        repo.remove(0004);
        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(0004));
    }


}

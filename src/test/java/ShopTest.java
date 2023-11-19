import org.example.shop.Product;
import org.example.shop.Shop;
import org.junit.contrib.java.lang.system.Assertion;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {
    Shop shop = new Shop();
    @BeforeEach
    void createProductList(){
        List list =  new ArrayList<>();
        list.add(new Product(20,"car"));
        list.add(new Product(10,"book"));
        list.add(new Product(30,"house"));
        shop.setProducts(list);
    }

    @Test
    @DisplayName(" check getMostExpensiveProduct")
    void testGetMostExpensiveProduct(){
        Assertions.assertEquals(new Product(30,"house"),shop.getMostExpensiveProduct());
        shop.setProducts(new ArrayList<>());
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()->shop.getMostExpensiveProduct());
    }

    @Test
    @DisplayName("sort test")
    void testSortByCost(){
        List sortedList =  new ArrayList<>();
        sortedList.add(new Product(10,"book"));
        sortedList.add(new Product(20,"car"));
        sortedList.add(new Product(30,"house"));
        List<Product>shopProductList = shop.sortProductsByPrice();
        for (int i = 0; i < sortedList.size(); i++) {
            Assertions.assertEquals(sortedList.get(i),shopProductList.get(i));
        }
    }


}

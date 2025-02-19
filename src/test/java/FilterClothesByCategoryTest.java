import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.ClothesPage.getClothesPage;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class FilterClothesByCategoryTest extends BaseTestClass {


    TopMenu top = getTopMenu();
    ClothesPage clothes = getClothesPage();
    CartPage cart = getCartPage();
    OrderPage order = getOrderPage();

    @Test
    @Description("As a User i would like to test Filter option in Clothes, so that I can filter women by Category")
    void clickOnFilterWomen() {
        top.act()
                .selectClothes();
        clothes.act()
                .selectWomen();
    }
    @Test
    @Description("As a User i would like to test Filter option in Clothes, so that I can filter Men by Category")
    void clickOnFilterMen() {
        top.act()
                .selectClothes();
        clothes.act()
                .selectMen();
    }
}


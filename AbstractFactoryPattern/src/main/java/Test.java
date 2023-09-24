/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Test
 * @createDate: 2023/9/24 17:42
 */
public class Test {
    public static void main(String[] args) {
        DessertFactory italyDessertFactory = new ItalyDessertFactory();

        // 获取对应的拿铁咖啡
        Dessert dessert = italyDessertFactory.createDessert();
        Coffee coffee = italyDessertFactory.createCoffee();
        System.out.println(coffee.getName());
        dessert.show();
    }
}

/**
 * @author lmh
 * @description: 美式风味的甜品工厂，生产美式咖啡和抹茶莫斯
 * @projectName: DesignPatterns
 * @className: AmericanCoffeeFactory
 * @createDate: 2023/9/24 17:39
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatChaMousse();
    }
}

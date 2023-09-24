/**
 * @author lmh
 * @description: 甜品抽象工厂
 * @projectName: DesignPatterns
 * @className: DessertFactory
 * @createDate: 2023/9/24 17:38
 */
public interface DessertFactory {
    // 生产咖啡的功能
    Coffee createCoffee();
    // 生产甜品的功能
    Dessert createDessert();
}

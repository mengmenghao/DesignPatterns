/**
 * @author lmh
 * @description: 意大利风味甜品，生产提拉米苏和拿铁
 * @projectName: DesignPatterns
 * @className: ItalyDessertFactory
 * @createDate: 2023/9/24 17:40
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new TriMiSu();
    }
}

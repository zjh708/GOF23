package com.zjh.设计模式.设计原则.接口隔离原则;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-11-26 15:03
 * @description:接口隔离原则（Interface Segregation Principle, ISP）是指用多个专门的接口，而不使用单一的 总接口，客户端不应该依赖它不需要的接口。
 * 这个原则指导我们在设计接口时应当注意一下几点：
 * 1、一个类对一类的依赖应该建立在最小的接口之上。
 * 2、建立单一接口，不要建立庞大臃肿的接口。
 * 3、尽量细化接口，接口中的方法尽量少（不是越少越好，一定要适度）。
 * 接口隔离原则符合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性、可扩展性 和可维护性。
 * 我们在设计接口的时候，要多花时间去思考，要考虑业务模型，包括以后有可能发生变更 的地方还要做一些预判。
 * 所以，对于抽象，对业务模型的理解是非常重要的。
 */
public class InterfaceSegregationPrincipleMain {

    public static void main(String[] args) {
        //old可以看出，Bird 的 swim()方法可能只能空着，Dog 的 fly()方法显然不可能的。

        //我们针对 不同动物行为来设计不同的接口，分别设计 IEatAnimal，IFlyAnimal 和 ISwimAnimal 接口 动物再根据特征去实现相应的动作

    }

}

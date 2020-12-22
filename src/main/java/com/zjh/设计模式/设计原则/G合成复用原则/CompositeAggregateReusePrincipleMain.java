package com.zjh.设计模式.设计原则.G合成复用原则;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-14 10:57
 * @description: 指尽量使用对象组合(has - a)/ 聚合(contanis-a)，而不是继承关系达到软件复用的目的。可以使系统更加灵活，降低类与类之间的耦合度，
 * 一个类的变化对其他类造成的影响相对较少。 继承我们叫做白箱复用，相当于把所有的实现细节暴露给子类。组合/聚合也称之为黑箱复用，
 * 对类 以外的对象是无法获取到实现细节的。要根据具体的业务场景来做代码设计，其实也都需要遵循 OOP 模型。
 */
public class CompositeAggregateReusePrincipleMain {
}

/**
 * 以数据库操作为例，先来创建 DBConnection 类：
 */
class DBConnection {
    public String getConnection() {
        return "MySQL 数据库连接";
    }
}

/**
 * 创建 ProductDao 类：
 */

class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}

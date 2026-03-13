package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class MainOrder {

public static void main(String[] args) {

SessionFactory factory = new Configuration()
.configure("hibernate.cfg.xml")
.addAnnotatedClass(OrderAnalysis.class)
.buildSessionFactory();

Session session = factory.openSession();

session.beginTransaction();

OrderAnalysis o1 = new OrderAnalysis("Laptop",50000,101,new Date());
OrderAnalysis o2 = new OrderAnalysis("Mobile",20000,102,new Date());
OrderAnalysis o3 = new OrderAnalysis("Keyboard",1500,103,new Date());
OrderAnalysis o4 = new OrderAnalysis("Mouse",800,104,new Date());
OrderAnalysis o5 = new OrderAnalysis("Monitor",12000,105,new Date());
OrderAnalysis o6 = new OrderAnalysis("Printer",9000,106,new Date());
OrderAnalysis o7 = new OrderAnalysis("Tablet",15000,107,new Date());
OrderAnalysis o8 = new OrderAnalysis("Headphones",3000,108,new Date());

session.save(o1);
session.save(o2);
session.save(o3);
session.save(o4);
session.save(o5);
session.save(o6);
session.save(o7);
session.save(o8);

session.getTransaction().commit();
session = factory.openSession();
session.beginTransaction();

Query<OrderAnalysis> query =
session.createQuery("FROM OrderAnalysis", OrderAnalysis.class);

List<OrderAnalysis> orders = query.getResultList();

System.out.println("All Orders:");

for(OrderAnalysis o : orders)
{
System.out.println(o.getOrderId()+" "+o.getItems()+" "+o.getTotal_cost()+" "+o.getUserId()+" "+o.getDateOfOrder());
}

session.getTransaction().commit();
session = factory.openSession();
session.beginTransaction();

Query<OrderAnalysis> query2 =
session.createQuery("FROM OrderAnalysis ORDER BY Total_cost ASC", OrderAnalysis.class);

List<OrderAnalysis> sorted = query2.getResultList();

System.out.println("\nOrders Sorted by Cost (Ascending):");

for(OrderAnalysis o : sorted)
{
System.out.println(o.getItems()+" "+o.getTotal_cost());
}

session.getTransaction().commit();

session.close();
factory.close();

}
}
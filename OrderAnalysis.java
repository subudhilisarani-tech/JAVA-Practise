package com.example;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="OrderAnalysis")

public class OrderAnalysis {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int OrderId;
private String Items;
private int Total_cost;
private int UserId;

@Temporal(TemporalType.DATE)
private Date DateOfOrder;

public OrderAnalysis(){}

public OrderAnalysis(String Items,int Total_cost,int UserId,Date DateOfOrder)
{
this.Items=Items;
this.Total_cost=Total_cost;
this.UserId=UserId;
this.DateOfOrder=DateOfOrder;
}

public int getOrderId() {
return OrderId;
}

public String getItems() {
return Items;
}

public int getTotal_cost() {
return Total_cost;
}

public int getUserId() {
return UserId;
}

public Date getDateOfOrder() {
return DateOfOrder;
}
}
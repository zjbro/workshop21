package vttp2022.workshop21.respositories;



public interface Queries {
    public static final String SQL_SELECT_ALL_CUSTOMERS = "select * from customers";
    public static final String SQL_SELECT_CUSTOMER = "select * from customers where id=?";
    public static final String SQL_SELECT_ORDERS_FROM_CUSTOMER_ID ="select * from orders where customer_id =?";
}

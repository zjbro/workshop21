package vttp2022.workshop21.respositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp2022.workshop21.model.Customer;

import static vttp2022.workshop21.respositories.Queries.*;

@Repository
public class CustomerRepository {
    

    @Autowired
    private JdbcTemplate template;

    public List<String> getListOfCustomers (){

        final List<String> results = new LinkedList<>();
        final SqlRowSet result = template.queryForRowSet(SQL_SELECT_ALL_CUSTOMERS);

        while (result.next()){
            results.add(result.getString("first_name") + " " + result.getString("last_name"));
        }

        return results;
    }

    public Optional<Customer> getCustomer(Integer id){
        Customer c = new Customer();
        final SqlRowSet result = template.queryForRowSet(SQL_SELECT_CUSTOMER, id);
        
        while (!result.next()){
            return Optional.empty();
        }
        
        return Optional.of(c.create(result));
    }

    public List<String> getCustomerOrders(Integer id){
        final List<String> results = new LinkedList<>();
        final SqlRowSet result = template.queryForRowSet(SQL_SELECT_ORDERS_FROM_CUSTOMER_ID, id);
        while (result.next()){
            results.add(result.getString("id"));
        };

        return results;
    }
}

package vttp2022.workshop21.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import vttp2022.workshop21.model.Customer;
import vttp2022.workshop21.respositories.CustomerRepository;

@RestController
@RequestMapping(path="/api")
public class CustomerRestController {

    @Autowired

    private CustomerRepository cRepo;

    @GetMapping(path="/customers", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCustomerList(){
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (String customer: cRepo.getListOfCustomers())
            arrayBuilder.add(customer);
        return ResponseEntity.ok(arrayBuilder.build().toString());
    }

    @GetMapping(path="/customer/{customerid}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCustomer(@PathVariable Integer customerid){
        Customer c = cRepo.getCustomer(customerid).get();
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", c.getId());
        builder.add("name", c.getLastName()+c.getFirstName());


        return ResponseEntity.ok(builder.build().toString());
    }

    @GetMapping(path="/customer/{customerid}/orders", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCustomerOrder(@PathVariable Integer customerid){
        Customer c = cRepo.getCustomer(customerid).get();
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (String id: cRepo.getCustomerOrders(customerid)){
            arrayBuilder.add(id);
        };
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", c.getId());
        builder.add("name", c.getLastName()+c.getFirstName());
        builder.add("order_id", arrayBuilder.build());


        return ResponseEntity.ok(builder.build().toString());
    }
}

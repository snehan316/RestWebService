
package com.sneha.demo.CustomerManagement;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sneha.demo.model.Customer;
import com.sneha.demo.service.CustomerService;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/customers")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class CustomerResource {
  
   private CustomerService service = new CustomerService();
	
	@GET
	public List<Customer> getCustomers(){
		return service.getAllCustomers(); 
	}
	
	@GET
	@Path("{customerId}")
	public Customer getCustomer(@PathParam("customerId")long id) {
		return service.getCustomer(id);
	}
	
	@POST
	public Customer addCustomer(Customer customer) {
		return service.addCustomer(customer);
	}
	
	@PUT
	@Path("{customerId}")
	public Customer updateCustomer(@PathParam("customerId")long id,Customer customer) {
		customer.setId(id);
		return service.updateCustomer(customer);
	}
	
	@DELETE
	@Path("{customerId}")
	public void deleteCustomer(@PathParam("customerId")long id) {
		 service.removeCustomer(id);
	}
	
	
}

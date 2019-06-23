package br.senaigo.mobile.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;

import com.google.gson.Gson;

import br.senaigo.mobile.entities.Order;
import br.senaigo.mobile.entities.People;
import br.senaigo.mobile.entities.Product;
import br.senaigo.mobile.service.impl.OrderServiceImpl;

public class PostAplicationJson {
	
	public static void main(String[] args) {
		StringBuilder dadosInformados = new StringBuilder();
		dadosInformados.append("\"uuid: 93457e9e-ccf6-4034-aa39-ad04ba8d9242, people:{ name:Matuzalém, surName:da Silva, email:matuzalem@gmail.com }\"");
		
		Gson gson = new Gson();
		
		gson.toJson(dadosInformados);
		List<Gson> list = new ArrayList<Gson>();
		list.add(gson);
		
		OrderServiceImpl order = new OrderServiceImpl();
		order.post((Order) list);
		
		Product product = new Product();
		product.add((Link) list);
		
		People people = new People();
		people.add((Link) list);
		
	}
	
	
}

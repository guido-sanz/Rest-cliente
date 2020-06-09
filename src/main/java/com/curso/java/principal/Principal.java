package com.curso.java.principal;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;

import com.curso.java.entidades.Usuario;

public class Principal {

	public static void main(String[] args) {

		
		URI uri = UriBuilder.fromUri("http://localhost:8080/rest/api").build();
		
		Client cliente = ClientBuilder.newClient(new ClientConfig().register(JacksonJsonProvider.class));
		
		WebTarget wt = cliente.target(uri).path("/usuario");
		
		Response respuesta = wt.path("/listaUsuarios").request(MediaType.APPLICATION_JSON_TYPE).get();
		
		List<Usuario> usuarios = Arrays.asList(respuesta.readEntity(Usuario[].class));
		
		usuarios.forEach(U->System.out.println(U));
		
		

	}

}

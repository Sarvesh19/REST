package com.techtutorial.rest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientJerseyGet {

	public static void main(String[] args) {

		try {

			Client client = Client.create();
			
			String restUrl="http://localhost:8080/RestJerseyClientXML/rest/StudentService/student";
			WebResource webResource = client.resource(restUrl);

			ClientResponse response = webResource.accept("application/xml")
					.get(ClientResponse.class);
			String output = response.getEntity(String.class);

			System.out.println("Server response : " + response.getStatus());
			System.out.println();
			System.out.println(output);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
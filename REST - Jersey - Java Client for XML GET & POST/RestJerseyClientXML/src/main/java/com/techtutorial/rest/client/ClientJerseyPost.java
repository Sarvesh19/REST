package com.techtutorial.rest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.techtutorial.rest.Student;

public class ClientJerseyPost {

	public static void main(String[] args) {

		try {

			Student student = new Student();
			student.setName("JON");
			student.setAddress("Paris");
			student.setId(5);

			String resturl = "http://localhost:8080/RestJerseyClientXML/rest/StudentService/update";
			Client client = Client.create();
			WebResource webResource = client.resource(resturl);

			ClientResponse response = webResource.accept("application/xml")
					.post(ClientResponse.class, student);
			String output = response.getEntity(String.class);

			System.out.println("Server response : " + response.getStatus());
			System.out.println();
			System.out.println(output);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

		} catch (Exception e) {

		}
	}

}

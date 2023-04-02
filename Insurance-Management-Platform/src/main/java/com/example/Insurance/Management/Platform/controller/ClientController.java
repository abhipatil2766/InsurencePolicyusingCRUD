package com.example.Insurance.Management.Platform.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Insurance.Management.Platform.service.ClientService;

import ch.qos.logback.core.net.server.Client;

@RestController
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	
	@PostMapping("/client")
	public Client createClient(@RequestBody Client client) {
		return clientService.createClient(client);
	}
	
	@GetMapping("/client/{id}")
	public Optional<Client> findClientById(@PathVariable Long id) {
		return clientService.findClientById(id);
	}
	
	@DeleteMapping("/client")
	public String deleteClientById(Long id) {
		return clientService.deleteClient(id);
	}
	
	@PutMapping("/client")
	public Client updateClient(@RequestBody Client client, @RequestParam Long id) {
		return clientService.updateClient(client, id);
	}
	

}

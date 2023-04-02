package com.example.Insurance.Management.Platform.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Insurance.Management.Platform.dao.ClientRepository;
import com.example.Insurance.Management.Platform.entity.Claim;

import ch.qos.logback.core.net.server.Client;
@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;

	public Client createClient(Client client) {
		return clientRepository.save(client);
	}

	public Optional<Client> findClientById(Long id) {
		return clientRepository.findById(id);
	}

	public String deleteClient(Long id) {
		clientRepository.deleteById(id);
		return "successfully deleted";
	}

	public Client updateClient(Client client, Long id) {
		Optional<Client> oop=clientRepository.findById(id);
		Client ccl=oop.get();
		return clientRepository.save(ccl);
	}

	

	

	

	

}

package com.example.tsp_projectile.services;

import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class ClientServices {
    @Autowired
    private ClientRepo clientRepo;



    public long addClient(String address,String login,String phone,String client_name,String client_password){
        Client client=new Client();
        client.setAddress(address);
        client.setLogin(login);
        client.setPhone(phone);
        client.setName(client_name);
        client.setClientPassword(client_password);
        clientRepo.save(client);
        return client.getId();
    }

    public void deleteClientbyid(int  id)
    {
        clientRepo.deleteById(id);
    }

}

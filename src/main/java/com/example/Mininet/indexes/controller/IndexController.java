package com.example.Mininet.indexes.controller;

import com.example.Mininet.indexes.model.Create_Topology_Model;
import com.example.Mininet.indexes.service.Create_Topology_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = {"/Mininet"})
@CrossOrigin(origins = {"*"})
public class IndexController {
    public static Process process = null;

    @Autowired
    private Create_Topology_Service createTopologyService;

    @PostMapping(path = {"CreateTopology"})
    public void create_topology(@RequestBody Create_Topology_Model createTopologyModel) {
        this.createTopologyService.create_topology_service_model(createTopologyModel);
    }

    @GetMapping(path = {"Index"})
    public String hello(){
        return "Hello word";
    }

}

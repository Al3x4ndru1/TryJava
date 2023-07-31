package com.example.Mininet.indexes.service;

import com.example.Mininet.indexes.controller.IndexController;
import com.example.Mininet.indexes.model.Create_Topology_Model;
import org.springframework.stereotype.Service;

@Service
public class Create_Topology_Service {

    public void create_topology_service_model(Create_Topology_Model createTopologyModel){

        try {
            String commad = "python " +
                    createTopologyModel.ipBase +
                    " " +
                    createTopologyModel.controller_ip +
                    " " +
                    createTopologyModel.controller_port +
                    createTopologyModel.switches_name_prefix +
                    " " +
                    createTopologyModel.hosts_name_prefix +
                    " " +
                    createTopologyModel.number_of_switches +
                    " " +
                    createTopologyModel.number_of_hosts;

            String[] cmd = {"/bin/bash", "-c", commad};

            IndexController.process = Runtime.getRuntime().exec(cmd);

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}

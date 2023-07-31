package Mininet.indexes.model;


import lombok.Data;

@Data
public class Create_Topology_Model {

    public String ipBase;
    public int number_of_hosts;
    public int number_of_switches;
    public String controller_ip;
    public int controller_port;
    public String switches_name_prefix;
    public String hosts_name_prefix;

    public Create_Topology_Model(){}
    public Create_Topology_Model(String ipBase,
                                 int number_of_hosts,
                                 int number_of_switches,
                                 String controller_ip,
                                 int controller_port,
                                 String switches_name_prefix,
                                 String hosts_name_prefix) {
        this.ipBase = ipBase;
        this.number_of_hosts = number_of_hosts;
        this.number_of_switches = number_of_switches;
        this.controller_ip = controller_ip;
        this.controller_port = controller_port;
        this.switches_name_prefix = switches_name_prefix;
        this.hosts_name_prefix = hosts_name_prefix;
    }
}
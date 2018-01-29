package uebung.guiFX;

import java.util.HashMap;
import java.util.Map;

public class RoadTrafficSimulator {
	
	private Map<Integer, Node> nodes = new HashMap<Integer, Node>();
	private Map<Integer, Link> links = new HashMap<Integer, Link>();
	private int trafficVolume = 0;

	RoadTrafficSimulator(){
		buildBaseNetwork();
	}
	
    private void buildBaseNetwork() {
		nodes.put(1, new Node(1, 100, 100));
		nodes.put(2, new Node(2, 300, 110));
		nodes.put(3, new Node(3, 500, 80));
		nodes.put(4, new Node(4, 700, 140));
		
		links.put(1, new Link(1, nodes.get(1), nodes.get(2), 1000));
		links.put(2, new Link(2, nodes.get(2), nodes.get(3), 2000));
		links.put(3, new Link(3, nodes.get(3), nodes.get(4), 3000));
	}
    
    Map<Integer, Node> getNodes(){
    	return nodes;
    }
    
    Map<Integer, Link> getLinks(){
    	return links;
    }
    
    void increaseTrafficVolume(){
    	trafficVolume += 500;
    	calcLinkOccupation();
    }
    
    void decreaseTrafficVolume(){
    	if(trafficVolume > 500){
        	trafficVolume -= 500;
    	} else {
    		trafficVolume = 0;
    	}
    	calcLinkOccupation();
    }
    
    void calcLinkOccupation(){
    	for(Link link: links.values()){
    		link.calcOccupation(trafficVolume);
    	}
    }

	public int getTrafficVolume() {
		return trafficVolume;
	}
}

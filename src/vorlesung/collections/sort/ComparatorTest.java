package vorlesung.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		List<Agent> agents = new ArrayList<>() ;
	    
	    System.out.println( "generate agents with random id/age ..." ) ;
	    for ( int ii=0 ; ii<10 ; ii++ ) {
	      Agent ag = new Agent( (int)(100000.*Math.random()), 10*Math.random() );
	      agents.add(ag) ;
	    }
	    
	    System.out.println( "\ndemonstrate that id/age are in rnd sequence: " ) ;
	    for ( Agent ag : agents ) {
	      System.out.println( "agentId: "+ag.getId()+" age: "+ag.getAge() ) ;
	    }

	    System.out.println( "\nsort the agents according to comparator ..." ) ;
	    Collections.sort( agents, new MyAgentComparator() ) ; 
//	    Collections.sort(agents); // sortieren nach mehreren Kriterien funktioniert auch!

	    System.out.println( "\nprint out the agents: " ) ;
	    for ( Agent ag : agents ) {
	      System.out.println( " id: "+ag.getId()+" age: "+ag.getAge() ) ;
	    }
	}

}

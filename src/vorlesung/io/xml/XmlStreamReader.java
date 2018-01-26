package vorlesung.io.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

public class XmlStreamReader {

	public static void main(String[] args) {
		try {
			File file = new File("./src/vorlesung/io/xml/plans.xml");
			FileInputStream stream = new FileInputStream(file);
			XMLInputFactory factory = XMLInputFactory.newInstance();
			// factory.setXY(...) ;
			XMLStreamReader in = factory.createXMLStreamReader(stream);
			
			while (in.hasNext()) {
//				 int eventTypeAsInt = in.next();
//				 System.out.println(" eventType: " + eventTypeAsInt);
//				 printEventType(eventTypeAsInt);

				in.next(); // advance one step; we don't need the result
				if (in.isStartElement()) {
					String elementName = in.getLocalName();
					System.out.print(elementName + ": ");
					for (int ii = 0; ii < in.getAttributeCount(); ii++) {
						String name = in.getAttributeLocalName(ii);
						String value = in.getAttributeValue(ii);
						System.out.print(name + "=" + value + " ");
					}
					if ("route".equalsIgnoreCase(elementName)) {
						System.out.print(in.getElementText());
				    }
					System.out.println();
				} 
				else if (in.isEndElement()) {
					System.out.println("end of: " + in.getLocalName());
				}
			}
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the String representation of the given integer constant.
	 *
	 * @param eventType
	 *            Type of event.
	 * @return String representation of the event
	 */
	private final static String getEventTypeString(int eventType) {
		switch (eventType) {
		case XMLEvent.START_ELEMENT:
			return "START_ELEMENT";
		case XMLEvent.END_ELEMENT:
			return "END_ELEMENT";
		case XMLEvent.PROCESSING_INSTRUCTION:
			return "PROCESSING_INSTRUCTION";
		case XMLEvent.CHARACTERS:
			return "CHARACTERS";
		case XMLEvent.COMMENT:
			return "COMMENT";
		case XMLEvent.START_DOCUMENT:
			return "START_DOCUMENT";
		case XMLEvent.END_DOCUMENT:
			return "END_DOCUMENT";
		case XMLEvent.ENTITY_REFERENCE:
			return "ENTITY_REFERENCE";
		case XMLEvent.ATTRIBUTE:
			return "ATTRIBUTE";
		case XMLEvent.DTD:
			return "DTD";
		case XMLEvent.CDATA:
			return "CDATA";
		case XMLEvent.SPACE:
			return "SPACE";
		}
		return "UNKNOWN_EVENT_TYPE , " + eventType;
	}

	private static void printEventType(int eventType) {
		System.out.println("EVENT TYPE(" + eventType + ") = " + getEventTypeString(eventType));
	}
}

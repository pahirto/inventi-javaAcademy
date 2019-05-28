package xml.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import xml.bean.OsobaBean;

public class OsobaJaxB {
	
	public static void main(String[] params) {
		new OsobaJaxB().doUnmarshal();
	}
	
	public void doMarshal() {
		File file;
		JAXBContext jaxbContext;
		Marshaller jaxbMarshaller;
		OsobaBean osoba = new OsobaBean();
		osoba.setId(10);
		osoba.setName("Karel");
		try {
			file = new File("C:\\work\\file.xml");
			jaxbContext = JAXBContext.newInstance(OsobaBean.class);
			jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(osoba, file);
		} catch(JAXBException exception) {
			exception.printStackTrace();
		}
	}
	
	public void doUnmarshal() {
		File file;
		JAXBContext jaxbContext;
		Unmarshaller jaxbUnmarshaller;
		OsobaBean osoba;
		try {
			file = new File("resource/xml/Osoba.xml");
			jaxbContext = JAXBContext.newInstance(OsobaBean.class);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			osoba = (OsobaBean)jaxbUnmarshaller.unmarshal(file);
			System.out.println(osoba.getId() + " - " + osoba.getName());
		} catch(JAXBException exception) {
			System.out.println("JAXBException - " + exception.getMessage());
			exception.printStackTrace();
		}
	}
}

package academy.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Osoba bean
 * @author Rostislav Levy
 */
public class OsobaBean {

	/** Logger */
	private static final Logger LOG = LogManager.getLogger(OsobaBean.class);
	
	/** Id */
	private Long id;
	/** Krestni jmeno */
	private String firstName;
	/** Prijmeni */
	private String surname;
	
	/**
	 * Constructor
	 */
	public OsobaBean() {
		this(null, null, null);
	}
	
	/**
	 * Constructor
	 * @param id - id
	 * @param firstName - krestni jmeno
	 * @param surname - prijmeni
	 */
	public OsobaBean(Long id, String firstName, String surname) {
		LOG.debug("Creating a new instance");
		setId(id);
		setFirstName(firstName);
		setSurname(surname);
		LOG.debug("The new instance was created");
	}

	/**
	 * Read id
	 * @return id
	 */
	public Long getId() {
		LOG.debug("Id was read - " + id);
		return id;
	}

	/**
	 * Read krestni jmeno
	 * @return krestni jmeno
	 */
	public String getFirstName() {
		LOG.debug("First name was read - " + firstName);
		return firstName;
	}

	/**
	 * Read prijmeni
	 * @return prijmeni
	 */
	public String getSurname() {
		LOG.debug("Surname was read - " + surname);
		return surname;
	}

	/**
	 * Set id
	 * @param id - id
	 */
	public void setId(Long id) {
		this.id = id;
		LOG.debug("Id was set to " + id);
	}

	/**
	 * Set krestni jmeno
	 * @param firstName - krestni jmeno
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		LOG.debug("First name was set to " + firstName);
	}

	/**
	 * Set prijmeni
	 * @param surname - prijmeni
	 */
	public void setSurname(String surname) {
		this.surname = surname;
		LOG.debug("Surname was set to " + surname);
	}
}

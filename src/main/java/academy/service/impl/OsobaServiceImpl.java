package academy.service.impl;

import academy.bean.OsobaBean;
import academy.factory.DaoFactory;
import academy.service.OsobaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Osoba service implementation
 * @author Rostislav Levy
 */
public class OsobaServiceImpl implements OsobaService {

	/** Logger */
	private static final Logger LOG = LogManager.getLogger(OsobaService.class);
	
	/** Instance */
	private static OsobaService instance;
	
	/** Sekvence identifikaci osob */
	private Long osobaIdSequence;
	
	/**
	 * COnstructor
	 */
	private OsobaServiceImpl() {
		LOG.debug("Creating a new instance");
		setOsobaIdSequence(1l);
		initOsoby();
		LOG.debug("The new instance was created");
	}

	public void addOsoba(OsobaBean osoba) {
		LOG.debug("Adding osoba " + osoba);
		if(osoba.getId() == null) {
			osoba.setId(getOsobaIdSequence());
		}
		DaoFactory.getOsobaDao().addOsoba(osoba);
		LOG.debug("Osoba was added");
	}

	public void deleteOsoba(Long id) {
		LOG.debug("Deleting osoba " + id);
		DaoFactory.getOsobaDao().deleteOsoba(id);
	}
	
	/**
	 * Nacteni instance
	 * @return instance
	 */
	public static OsobaService getInstance() {
		LOG.debug("Rearing instance - " + instance);
		if(instance == null) {
			setInstance(new OsobaServiceImpl());
		}
		LOG.debug("Instance was read - " + instance);
		return instance;
	}

	public OsobaBean getOsoba(Long id) {
		LOG.debug("Reading osoba " + id);
		return DaoFactory.getOsobaDao().getOsoba(id);
	}
	
	/**
	 * Nacteni identifikace osoby ze sekvence a prechod na dalsi cislo
	 * @return identifikace osoby
	 */
	protected Long getOsobaIdSequence() {
		LOG.debug("Reading osoba id sekvence");
		Long result = osobaIdSequence;
		nextOsobaIdSequence();
		LOG.debug("Osoba id sekvence was read - " + result);
		return result;
	}

	public List<OsobaBean> getOsobaList() {
		LOG.debug("Reading osoba list");
		return DaoFactory.getOsobaDao().getOsobaList();
	}
	
	/**
	 * Inicializace osob
	 */
	protected void initOsoby() {
		LOG.debug("Initializing osoby");
		addOsoba(new OsobaBean(null, "Karel", "�tvrt�"));
		addOsoba(new OsobaBean(null, "V�clav", "Druh�"));
		LOG.debug("Osoby were initialized");
	}
	
	/**
	 * Set next osoba id sequence
	 */
	protected void nextOsobaIdSequence() {
		LOG.debug("Setting next osoba id sequence - " + osobaIdSequence);
		osobaIdSequence++;
		LOG.debug("Next osoba id sequence was set - " + osobaIdSequence);
	}
	
	/**
	 * Nastaveni instance
	 * @param instance - instance
	 */
	public static void setInstance(OsobaService instance) {
		OsobaServiceImpl.instance = instance;
		LOG.debug("Instance was set to " + instance);
	}
	
	/**
	 * Nastaveni sekvence identifikace osob
	 * @param osobaIdSequence - sekvence identifikace osob
	 */
	protected void setOsobaIdSequence(Long osobaIdSequence) {
		this.osobaIdSequence = osobaIdSequence;
		LOG.debug("Osoba id sequence was set to " + osobaIdSequence);
	}
}

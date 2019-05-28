package academy.factory;

import academy.dao.OsobaDao;
import academy.dao.impl.OsobaDaoImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * DAO factory
 * @author Rostislav Levy
 */
public class DaoFactory {

	/** Logger */
	private static final Logger LOG = LogManager.getLogger(DaoFactory.class);
	
	/** Osoba DAO */
	private static OsobaDao osobaDao;

	/**
	 * Constructor
	 */
	private DaoFactory() {
	}
	
	/**
	 * Read osoba DAO
	 * @return osoba DAO
	 */
	public static OsobaDao getOsobaDao() {
		LOG.debug("Reading osoba DAO - " + osobaDao);
		if(osobaDao == null) {
			setOsobaDao(new OsobaDaoImpl());
		}
		LOG.debug("Osoba DAO was read - " + osobaDao);
		return osobaDao;
	}
	
	/**
	 * Set osoba DAO
	 * @param osobaDao - osoba DAO
	 */
	protected static void setOsobaDao(OsobaDao osobaDao) {
		DaoFactory.osobaDao = osobaDao;
		LOG.debug("Osoba DAO was set to " + osobaDao);
	}
}

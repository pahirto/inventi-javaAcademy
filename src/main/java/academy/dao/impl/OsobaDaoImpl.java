package academy.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import academy.bean.OsobaBean;
import academy.dao.OsobaDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Osoba DAO implementation
 * @author Rostislav Levy
 */
public class OsobaDaoImpl implements OsobaDao {

	/** Logger */
	private static final Logger LOG = LogManager.getLogger(OsobaDaoImpl.class);
	
	/** Seznam osob */
	private Map<Long, OsobaBean> osoby;
	
	/**
	 * Constructor
	 */
	public OsobaDaoImpl() {
		LOG.debug("Creating a new instance");
		LOG.debug("The new instance was created");
	}

	public void addOsoba(OsobaBean osoba) {
		LOG.debug("Adding osoba " + osoba);
		getOsoby().put(osoba.getId(), osoba);
		LOG.debug("Osoba was added");
	}

	public void deleteOsoba(Long id) {
		LOG.debug("Deleting osoba " + id);
		getOsoby().remove(id);
		LOG.debug("Osoba was deleted");
	}

	public OsobaBean getOsoba(Long id) {
		LOG.debug("Reading osoba - " + id);
		OsobaBean osoba = getOsoby().get(id);
		LOG.debug("Osoba was read - " + osoba);
		return osoba;
	}

	public List<OsobaBean> getOsobaList() {
		LOG.debug("Reading osoba list");
		Object[] array = getOsoby().values().toArray();
		List<OsobaBean> list = new ArrayList<OsobaBean>();
		for(int i = 0; i < array.length; i++) {
			list.add((OsobaBean)array[i]);
		}
		LOG.debug("Osoba list was read - " + list);
		return list;
	}
	
	/**
	 * Nacteni seznamu osob
	 * @return seznam osob
	 */
	protected Map<Long, OsobaBean> getOsoby() {
		LOG.debug("Reading osoby - " + osoby);
		if(osoby == null) {
			setOsoby(new HashMap<Long, OsobaBean>());
		}
		LOG.debug("Osoby were read - " + osoby);
		return osoby;
	}
	
	/**
	 * Ulozeni seznamu osob
	 * @param osoby - seznam osob
	 */
	protected void setOsoby(Map<Long, OsobaBean> osoby) {
		this.osoby = osoby;
		LOG.debug("Osoby were set to " + osoby);
	}
}

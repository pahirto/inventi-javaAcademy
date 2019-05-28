package academy.service;

import java.util.List;

import academy.bean.OsobaBean;

/**
 * Osoba service
 * @author Rostislav Levy
 */
public interface OsobaService {

	/**
	 * Pridani osoby
	 * @param osoba - osoba
	 */
	public void addOsoba(OsobaBean osoba);
	
	/**
	 * Smazani osoby
	 * @param id - identifikace mazane osoby
	 */
	public void deleteOsoba(Long id);
	
	/**
	 * Nacteni osoby
	 * @param id - id osoby
	 * @return osoba
	 */
	public OsobaBean getOsoba(Long id);
	
	/**
	 * Nacteni seznamu osob
	 * @return seznam osob
	 */
	public List<OsobaBean> getOsobaList();
}

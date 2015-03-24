package com.davo.dbcreviwer.io;

import java.io.IOException;
import java.util.List;

import com.davo.dbcreviwer.domain.DBCRBean;

/**
 * This interface gives the functionality to read files and transform the to beans.
 * @author davo
 *
 */
public interface FileLoader {
	
	/**
	 * Read a single file and return the DBCR representation bean.
	 * @param location
	 * @return
	 * @throws IOException
	 */
	DBCRBean loadFile(String location) throws IOException;
	
	/**
	 * Read a folder and return a list with all the files as a beans.
	 * @param location
	 * @return
	 * @throws IOException
	 */
	List<DBCRBean> loadFolder(String location)throws IOException;

}

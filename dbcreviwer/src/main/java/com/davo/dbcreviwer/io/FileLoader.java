package com.davo.dbcreviwer.io;

import java.io.IOException;
import java.util.List;

import com.davo.dbcreviwer.domain.DBCRbean;

/**
 * 
 * @author davo
 *
 */
public interface FileLoader {
	
	DBCRbean loadFile(String location) throws IOException;
	
	List<DBCRbean> loadFolder(String location)throws IOException;

}

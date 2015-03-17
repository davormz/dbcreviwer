package com.davo.dbcreviwer.io;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 
 * @author davo
 *
 */
public interface FileLoader {
	
	List<String> loadFile(String location) throws IOException;
	
	List<File> loadFolder(String location);

}

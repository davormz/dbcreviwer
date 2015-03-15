package com.davo.dbcreviwer.io;

import java.io.File;
import java.util.List;

public interface FileLoader {
	
	File loadFile(String location);
	
	List<File> loadFolder(String location);

}

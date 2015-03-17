package com.davo.dbcreviwer.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author davo
 *
 */
public class FileLoaderImpl implements FileLoader {

	@Override
	public List<String> loadFile(String location) throws IOException {
		File file = new File(location);
		BufferedReader inputStream = null;
		List<String> lines = null;
		
		if(file.exists() && file.isFile()){
			try{
				lines = new ArrayList<String>();
				String line = new String();
				inputStream = new BufferedReader(new FileReader(file));
				while((line = inputStream.readLine()) != null){
					lines.add(line);
				}
			}finally{
				inputStream.close();
			}
		}
		return lines;
	}

	@Override
	public List<File> loadFolder(String location) {
		// TODO Auto-generated method stub
		return null;
	}


}

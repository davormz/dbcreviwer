package com.davo.dbcreviwer.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.davo.dbcreviwer.domain.DBCRbean;

/**
 * 
 * @author davo
 *
 */
public class FileLoaderImpl implements FileLoader {

	/**
	 * 
	 */
	public DBCRbean loadFile(String location) throws IOException {
		File file = new File(location);
		BufferedReader inputStream = null;
		List<String> lines = null;
		DBCRbean bean = null;
		int nol = 0;
		
		if(file.exists() && file.isFile()){
			try{
				bean = new DBCRbean();
				lines = new ArrayList<String>();
				String line = new String();
				inputStream = new BufferedReader(new FileReader(file));
				
				while((line = inputStream.readLine()) != null){
					nol++;
					lines.add(line);
				}
				bean.setNol(nol);
				bean.setFileName(file.getName());
				bean.setContent(lines);
			}finally{
				inputStream.close();
			}
		}
		return bean;
	}

	public List<DBCRbean> loadFolder(String location) {
		// TODO Auto-generated method stub
		
		
		return null;
	}


}

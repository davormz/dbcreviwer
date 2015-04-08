package com.davo.dbcreviwer.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.davo.dbcreviwer.domain.DBCRBean;



/**
 * Implementation of FileLoader.
 * @author davo
 *
 */
public class FileLoaderImpl implements FileLoader {

	/**
	 * 
	 */
	public DBCRBean loadFile(String location) throws IOException {
		
		File file = new File(location);
		BufferedReader inputStream = null;
		List<String> lines = null;
		DBCRBean bean = null;
		int nol = 0;
		
		if(file.exists() && file.isFile()){
			try{
				bean = new DBCRBean();
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
				bean.setFile(file);
			}finally{
				inputStream.close();
			}
		}
		return bean;
	}

	public List<DBCRBean> loadFolder(String location) throws IOException {
		File file = new File(location);
		List<DBCRBean> dbcrBeans = null;
		DBCRBean dbcrBean = null;
		File files[];
		
		if(file.exists() && file.isDirectory()){
			dbcrBeans = new ArrayList<DBCRBean>();
			files = file.listFiles();
			for(File f : files){
				if(f.isFile()){
					dbcrBean = loadFile(f.getPath());
					dbcrBeans.add(dbcrBean);
				}
			}
		}
		
		return dbcrBeans;
	}


}

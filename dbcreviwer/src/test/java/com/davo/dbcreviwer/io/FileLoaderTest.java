package com.davo.dbcreviwer.io;

import java.io.File;
import java.io.IOException;




import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.davo.dbcreviwer.domain.DBCRBean;
import com.davo.dbcreviwer.reviwer.DocumentAnalyzerImpl;

public class FileLoaderTest {
	
	private FileLoader fileLoader;
	
	private static String RESOURCES_FOLDER = "src" + File.separator + "test" + File.separator + "resources";
	private static String WORKING_DIR = System.getProperty("user.dir");
	private static String FILE_NAME = "ABMS_TPL_BATCH_INBOUND.sql";
	
	
	@Test
	public void loadFileTest(){
		fileLoader = new FileLoaderImpl();
		DBCRBean bean = null;
		
		String location = WORKING_DIR + File.separator + RESOURCES_FOLDER + File.separator + FILE_NAME;
		
		try {
			bean = fileLoader.loadFile(location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertNotNull(bean);
		
	}
	
	@Test
	public void loadFolderTest(){
		fileLoader = new FileLoaderImpl();
		List<DBCRBean> beans = null;
		
		String location = WORKING_DIR + File.separator + RESOURCES_FOLDER;
		
		try {
			beans = fileLoader.loadFolder(location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertNotNull(beans);
		
		Assert.assertTrue(beans.size() > 0);
		
	}
	
	@Test
	public void firstLexerTest(){
		DocumentAnalyzerImpl analyzer = new DocumentAnalyzerImpl();
		String location = WORKING_DIR + File.separator + RESOURCES_FOLDER + File.separator + FILE_NAME;
		File document = new File(location);
		
		analyzer.analyze(document);
	}

}
